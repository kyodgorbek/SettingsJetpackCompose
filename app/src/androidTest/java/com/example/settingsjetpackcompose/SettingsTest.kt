package com.example.settingsjetpackcompose

import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import com.example.settingsjetpackcompose.screens.Settings
import com.example.settingsjetpackcompose.utils.Tags.TAG_CHECK_ITEM
import com.example.settingsjetpackcompose.utils.Tags.TAG_TOGGLE_ITEM
import org.junit.Rule
import org.junit.Test

class SettingsTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun Enable_Notifications_Setting_Is_Displayed() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(
                    R.string.setting_enable_notifications
                )
        )
    }

    @Test
    fun Show_Hints_Setting_Is_Displayed() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(R.string.setting_show_hints)
        )
    }

    @Test
    fun View_Subscription_Setting_Is_Displayed() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(R.string.setting_manage_subscription)
        )
    }

    @Test
    fun App_Version_Setting_Is_Displayed() {

        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(R.string.setting_app_version_title)
        )
    }

    @Test
    fun Theme_Setting_Is_Displayed() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(R.string.setting_option_theme)
        )
    }

    @Test
    fun Marketing_Options_Setting_Is_Displayed() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(R.string.setting_option_marketing)
        )
    }

    @Test
    fun Enable_Notifications_Toggles_Selected_State() {
        composeTestRule.setContent {
            Settings()
        }

        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(
                    R.string.setting_enable_notifications
                )
        )
    }

    @Test
    fun Show_Hints_Toggles_Selected_State() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.getString(
                    R.string.setting_show_hints)
        )
    }

    @Test
    fun Marketing_Options_Toggles_Selected_State() {
        composeTestRule.setContent {
            Settings()
        }
        composeTestRule.onNodeWithText(
            InstrumentationRegistry.getInstrumentation()
                .targetContext.resources.getStringArray(
                    R.array.setting_options_marketing_choice)[1]
        )
    }
}