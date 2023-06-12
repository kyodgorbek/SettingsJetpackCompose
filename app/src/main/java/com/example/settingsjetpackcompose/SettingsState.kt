package com.example.settingsjetpackcompose

import com.example.settingsjetpackcompose.colors.Theme

data class SettingsState(
    val notificationsEnabled: Boolean = false,
    val hintsEnabled: Boolean = false,
    val marketingOption: MarketingOption =
        MarketingOption.ALLOWED,
    val themeOption: Theme = Theme.SYSTEM
) {
}