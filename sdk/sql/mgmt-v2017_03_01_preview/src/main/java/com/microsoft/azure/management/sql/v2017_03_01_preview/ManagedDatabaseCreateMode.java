/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedDatabaseCreateMode.
 */
public final class ManagedDatabaseCreateMode extends ExpandableStringEnum<ManagedDatabaseCreateMode> {
    /** Static value Default for ManagedDatabaseCreateMode. */
    public static final ManagedDatabaseCreateMode DEFAULT = fromString("Default");

    /** Static value RestoreExternalBackup for ManagedDatabaseCreateMode. */
    public static final ManagedDatabaseCreateMode RESTORE_EXTERNAL_BACKUP = fromString("RestoreExternalBackup");

    /** Static value PointInTimeRestore for ManagedDatabaseCreateMode. */
    public static final ManagedDatabaseCreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /** Static value Recovery for ManagedDatabaseCreateMode. */
    public static final ManagedDatabaseCreateMode RECOVERY = fromString("Recovery");

    /** Static value RestoreLongTermRetentionBackup for ManagedDatabaseCreateMode. */
    public static final ManagedDatabaseCreateMode RESTORE_LONG_TERM_RETENTION_BACKUP = fromString("RestoreLongTermRetentionBackup");

    /**
     * Creates or finds a ManagedDatabaseCreateMode from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedDatabaseCreateMode
     */
    @JsonCreator
    public static ManagedDatabaseCreateMode fromString(String name) {
        return fromString(name, ManagedDatabaseCreateMode.class);
    }

    /**
     * @return known ManagedDatabaseCreateMode values
     */
    public static Collection<ManagedDatabaseCreateMode> values() {
        return values(ManagedDatabaseCreateMode.class);
    }
}
