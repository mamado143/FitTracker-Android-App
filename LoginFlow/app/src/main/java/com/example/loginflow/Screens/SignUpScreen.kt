package com.example.loginflow.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import com.example.loginflow.Components.HeadinglTextComponent
import com.example.loginflow.Components.MyTextFieldComponent
import com.example.loginflow.Components.NormalTextComponent
import com.example.loginflow.R

@Composable
fun SignUpScreen() {
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadinglTextComponent(value = stringResource(id = R.string.create_account ))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name ))
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun SignUpScreenPrev() {
    SignUpScreen()
}