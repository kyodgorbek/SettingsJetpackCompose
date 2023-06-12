package com.example.settingsjetpackcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.settingsjetpackcompose.AppVersionSettingItem
import com.example.settingsjetpackcompose.HintSettingsItem
import com.example.settingsjetpackcompose.R
import com.example.settingsjetpackcompose.SettingsViewModel

@Preview
@Composable
fun Settings() {
    var viewModel: SettingsViewModel = viewModel()
        val state = viewModel.uiState.collectAsState().value
        Column {
            TopAppBar {
                NotificationSettings(
                    title = stringResource(
                        id = R.string.cd_notifications_enabled
                    ),
                    checked = state.notificationsEnabled,
                    onCheckedChanged = { viewModel::toggleNotificationSetting }
                )
                Divider()
                HintSettingsItem(
                    modifier = Modifier.fillMaxWidth(),
                    title = stringResource(id = R.string.setting_show_hints),
                    checked = state.hintsEnabled,
                    onCheckedChanged = { viewModel::toggleHintSettings },
                )
                Divider()
                ManageSubscriptionSettingItem(
                    modifier = Modifier.fillMaxWidth(),
                    title = stringResource(
                        id =
                        R.string.setting_manage_subscription
                    ),
                    onSettingClicked = {
                        // Handle setting click
                    }
                )
                SectionSpacer(modifier = Modifier.fillMaxWidth())
                MarketingSettingItem(
                    modifier = Modifier.fillMaxWidth(),
                    selectedOption = state.marketingOption,
                    onOptionSelected = viewModel::setMarketingSettings
                )
                Divider()
                ThemeSettingItem(
                    modifier = Modifier.fillMaxWidth(),
                    selectedTheme = state.themeOption, onOptionSelected = viewModel::setTheme
                )
                SectionSpacer(modifier = Modifier.fillMaxWidth())
                AppVersionSettingItem(
                    modifier = Modifier.fillMaxWidth(),
                    appVersion = stringResource(
                        id =
                        R.string.setting_app_version_title
                    )
                )
                Divider()

            }
        }
    }



