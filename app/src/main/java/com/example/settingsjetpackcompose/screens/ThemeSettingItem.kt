package com.example.settingsjetpackcompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.example.settingsjetpackcompose.R
import com.example.settingsjetpackcompose.colors.Theme
import com.example.settingsjetpackcompose.utils.Tags.TAG_SELECT_THEME
import com.example.settingsjetpackcompose.utils.Tags.TAG_THEME
import com.example.settingsjetpackcompose.utils.Tags.TAG_THEME_OPTION

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ThemeSettingItem(
    modifier: Modifier = Modifier,
    selectedTheme: Theme,
    onOptionSelected: (option: Theme) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    SettingItem(modifier =  modifier) {
        Row(modifier = Modifier
            .clickable(
                onClick = { expanded = !expanded },
                onClickLabel = stringResource(id = R.string.cd_select_theme)
            )
            .padding(16.dp)
            .testTag(TAG_SELECT_THEME)
        ) {

            Text(
                modifier = Modifier.weight(1f),
                text = stringResource(
                    id =
                    R.string.setting_option_theme
                )
            )
            Text(modifier = Modifier.testTag(TAG_THEME),
                text = stringResource(id = selectedTheme.label))
        }
        DropdownMenu(expanded = expanded, onDismissRequest = {
            expanded = false },
            offset = DpOffset(16.dp, 0.dp),
            properties = PopupProperties(
                usePlatformDefaultWidth = true
            )
        ){
            Theme.values().forEach { theme ->
                DropdownMenuItem(onClick = {
                    onOptionSelected(theme)
                    expanded = false
                },
                modifier =  Modifier.testTag(TAG_THEME_OPTION + theme.label)
                    ) {
                    Text(text = stringResource(id = theme.label))
                }


            }

        }
    }
}


