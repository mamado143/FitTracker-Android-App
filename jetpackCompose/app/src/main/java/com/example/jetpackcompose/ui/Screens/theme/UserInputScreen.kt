package com.example.jetpackcompose.ui.Screens.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun UserInputScreen() {
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ){
            TopBar("HI there \uD83D\uDE0A")

            TextComponent(textValue = "\nLets learn about You !" , textSize = 24.sp )
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue = "This app will perpare details page based on input provided by you !", textSize = 18.sp)
            Spacer(modifier = Modifier.size(16.dp))

        }
    }
}
 @Preview
@Composable
fun UserInputScreenPrev(){
    UserInputScreen()
}

@Composable
fun TextComponent(textValue: String, textSize: TextUnit, colorValue: Color = Color.Black) {
    Text(text = textValue,
        fontSize = textSize,
        color = colorValue,
        fontWeight = FontWeight.Light
    )
}

@Preview(showBackground = true)
@Composable
private fun TextComponentPrev() {
    TextComponent(textValue = "Native app", textSize = 24.sp )

}

@Composable
fun TextFieldComponent() {
//    OutlinedTextField(value =   , onValueChange = )
}

@Preview(showBackground = true)
@Composable
private fun TextFieldComponentPrev() {
    TextFieldComponent()
}