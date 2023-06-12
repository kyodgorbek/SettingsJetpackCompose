package com.example.settingsjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.settingsjetpackcompose.screens.Settings
import com.example.settingsjetpackcompose.ui.theme.SettingsJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                Settings()
            }
        }       // A surface container using the 'background' color from the theme
    }
