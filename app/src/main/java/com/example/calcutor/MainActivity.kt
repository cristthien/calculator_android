package com.example.calcutor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp
import com.example.calcutor.ui.theme.CalcutorTheme
import androidx.compose.ui.Modifier
import com.example.calcutor.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcutorTheme {
                val viewModel= viewModel<CalculatorViewModel>()
                val state= viewModel.state
                val buttonSpacing = 8.dp
                Calculator (
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier.fillMaxSize().background(MediumGray).padding(16.dp)

                )
            }
        }
    }
}
