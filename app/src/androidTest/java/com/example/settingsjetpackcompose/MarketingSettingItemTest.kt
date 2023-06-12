package com.example.settingsjetpackcompose

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.settingsjetpackcompose.screens.MarketingSettingItem
import com.example.settingsjetpackcompose.utils.Tags.TAG_MARKETING_OPTION
import org.junit.Rule
import org.junit.Test

class MarketingSettingItemTest {
 @get:Rule
 val composeTestRule = createComposeRule()
 @Test
 fun Marketing_Option_Selected() {
  val option = MarketingOption.NOT_ALLOWED
  composeTestRule.setContent {
   MarketingSettingItem(
    selectedOption = option,
    onOptionSelected = { }
   )
  }
  composeTestRule
   .onNodeWithTag(TAG_MARKETING_OPTION + option.id)
   .assertIsSelected()
 }
}