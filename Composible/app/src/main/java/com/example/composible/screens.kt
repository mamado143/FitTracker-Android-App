package com.example.composible

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalContextimport androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
// Add these imports for the composables that were used but not imported
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import com.example.composible.ui.LoginButton
import com.example.composible.ui.LoginDialog
import com.example.composible.ui.RegisterDialog
import com.example.composible.ui.SignInButton

@Composable
fun LoginScreenContent() {
    var showRegisterDialog by remember { mutableStateOf(false) }
    var showLoginDialog by remember { mutableStateOf(false) }

    // Load and resize the background image
    val context = LocalContext.current
    val backgroundImage: ImageBitmap = remember {
        // Use painterResource to load the image
        val drawable: Drawable = painterResource(id = R.drawable.running).intrinsicSize
        // Convert the Drawable to Bitmap
        val bitmap: Bitmap = drawableToBitmap(drawable) // You'll need to implement this function
        // Resize the bitmap as needed
        //...
        bitmap.asImageBitmap()
    }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally // Use Alignment.CenterHorizontally
        ) {
            Image(
                bitmap = backgroundImage,
                contentDescription = "Background",
                modifier = Modifier.fillMaxSize()
            )
            Button(
                onClick = { showRegisterDialog = true },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Register")
            }
            Button(
                onClick = { showLoginDialog = true },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Sign In")
            }
            // Facebook and Google sign-in buttons (replace with actual implementations)
            LoginButton(LocalContext.current)
            SignInButton(LocalContext.current)
        }
    }

    if (showRegisterDialog) {
        RegisterDialog(
            onDismissRequest = { showRegisterDialog = false },
            onConfirm = { /* Handle registration logic */ }
        )
    }

    if (showLoginDialog) {
        LoginDialog(
            onDismissRequest = { showLoginDialog = false },
            onConfirm = { /* Handle login logic */ }
        )
    }
}

// Helper function to convert Drawable to Bitmap (you'll need to implement this)
private fun drawableToBitmap(drawable: Drawable): Bitmap {
    // ... Implementation to convert Drawable to Bitmap ...
}