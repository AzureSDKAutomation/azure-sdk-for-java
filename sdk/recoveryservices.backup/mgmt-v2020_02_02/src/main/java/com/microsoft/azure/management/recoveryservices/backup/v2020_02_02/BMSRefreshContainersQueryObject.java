/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The query filters that can be used with the refresh container API.
 */
public class BMSRefreshContainersQueryObject {
    /**
     * Backup management type for this container. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Get backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSRefreshContainersQueryObject object itself.
     */
    public BMSRefreshContainersQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

}
