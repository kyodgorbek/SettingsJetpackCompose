package com.example.settingsjetpackcompose

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import com.example.settingsjetpackcompose.colors.Theme
import com.example.settingsjetpackcompose.screens.ThemeSettingItem
import com.example.settingsjetpackcompose.utils.Tags.TAG_SELECT_THEME
import com.example.settingsjetpackcompose.utils.Tags.TAG_THEME
import com.example.settingsjetpackcompose.utils.Tags.TAG_THEME_OPTION
import org.junit.Rule
import org.junit.Test

class ThemeSettingItemTest {
 @get:Rule
 val composeTestRule = createComposeRule()

 @Test
 fun Selected_Theme_Displayed() {
  val option = Theme.DARK
  composeTestRule.setContent {
   ThemeSettingItem(
    selectedTheme = option,
    onOptionSelected = { }
   )
  }
  composeTestRule
   .onNodeWithTag(TAG_THEME, useUnmergedTree = true)
   .assertTextEquals(
    InstrumentationRegistry.getInstrumentation()
     .targetContext.getString(option.label)
   )
 }

 @Test
 fun Theme_Options_Displayed() {
  composeTestRule.setContent {
   ThemeSettingItem(
    selectedTheme = Theme.DARK,
    onOptionSelected = { }
   )
  }
  composeTestRule
   .onNodeWithTag(TAG_SELECT_THEME)
   .performClick()
 }


}