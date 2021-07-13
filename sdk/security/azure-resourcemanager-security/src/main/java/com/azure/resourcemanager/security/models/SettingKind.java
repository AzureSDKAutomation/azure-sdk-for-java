// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SettingKind. */
public final class SettingKind extends ExpandableStringEnum<SettingKind> {
    /** Static value DataExportSettings for SettingKind. */
    public static final SettingKind DATA_EXPORT_SETTINGS = fromString("DataExportSettings");

    /** Static value AlertSuppressionSetting for SettingKind. */
    public static final SettingKind ALERT_SUPPRESSION_SETTING = fromString("AlertSuppressionSetting");

    /** Static value AlertSyncSettings for SettingKind. */
    public static final SettingKind ALERT_SYNC_SETTINGS = fromString("AlertSyncSettings");

    /**
     * Creates or finds a SettingKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SettingKind.
     */
    @JsonCreator
    public static SettingKind fromString(String name) {
        return fromString(name, SettingKind.class);
    }

    /** @return known SettingKind values. */
    public static Collection<SettingKind> values() {
        return values(SettingKind.class);
    }
}
