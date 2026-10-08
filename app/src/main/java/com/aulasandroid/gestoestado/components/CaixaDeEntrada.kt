package com.aulasandroid.gestoestado.components

import android.R
import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    value: String,
    atualizarValor: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier,
        label = {
            Text(text = label)
                },
        placeholder =
            { Text(text = placeholder)
            },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        value = value,
        onValueChange = { atualizarValor(it) }
        )

}