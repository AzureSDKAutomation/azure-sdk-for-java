/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataProtection.
 * DataProtection type volumes include an object containing details of the
 * replication.
 */
public class VolumePatchPropertiesDataProtection {
    /**
     * Backup.
     * Backup Properties.
     */
    @JsonProperty(value = "backup")
    private VolumeBackupProperties backup;

    /**
     * Get backup Properties.
     *
     * @return the backup value
     */
    public VolumeBackupProperties backup() {
        return this.backup;
    }

    /**
     * Set backup Properties.
     *
     * @param backup the backup value to set
     * @return the VolumePatchPropertiesDataProtection object itself.
     */
    public VolumePatchPropertiesDataProtection withBackup(VolumeBackupProperties backup) {
        this.backup = backup;
        return this;
    }

}
