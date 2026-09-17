package com.example.fnch_storybook.Component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uikit.UI.Dimensions
import com.example.uikit.UI.FNCHTheme


@Composable
fun TitleString(text: String, modifier: Modifier = Modifier.padding(Dimensions.ZeroSize)){

    Text(text,
        style = FNCHTheme.typography.displayLarge ,
        color = FNCHTheme.colors.primary,
        modifier = modifier
    )
}
