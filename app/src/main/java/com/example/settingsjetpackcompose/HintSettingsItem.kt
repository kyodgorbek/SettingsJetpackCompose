package com.example.settingsjetpackcompose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.unit.dp
import com.example.settingsjetpackcompose.screens.SettingItem
import com.example.settingsjetpackcompose.utils.Tags.TAG_CHECK_ITEM

@Composable
fun HintSettingsItem(
    modifier: Modifier = Modifier,
    title: String,
    checked: Boolean,
    onCheckedChanged: (checked: Boolean) -> Unit
) {
    val hintsEnabledState = if (checked) {
        stringResource(id = R.string.cd_hints_enabled)
    } else stringResource(id = R.string.cd_hints_disabled)
    SettingItem(modifier = modifier) {
        Row(
            modifier = Modifier
                .testTag(TAG_CHECK_ITEM)
                .toggleable(
                    value = checked,
                    onValueChange = onCheckedChanged,
                    role = Role.Switch
                )
                .semantics {
                    stateDescription = hintsEnabledState
                }
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, modifier = Modifier.weight(1f))
            Checkbox(
                checked = checked,
                onCheckedChange = null
            )
        }
    }
}
