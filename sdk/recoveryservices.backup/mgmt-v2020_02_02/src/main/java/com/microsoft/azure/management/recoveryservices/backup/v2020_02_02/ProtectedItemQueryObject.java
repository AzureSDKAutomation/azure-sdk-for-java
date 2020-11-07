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
 * Filters to list backup items.
 */
public class ProtectedItemQueryObject {
    /**
     * Health State for the backed up item. Possible values include: 'Passed',
     * 'ActionRequired', 'ActionSuggested', 'Invalid'.
     */
    @JsonProperty(value = "healthState")
    private HealthState healthState;

    /**
     * Backup management type for the backed up item. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Type of workload this item represents. Possible values include:
     * 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange',
     * 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource',
     * 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     */
    @JsonProperty(value = "itemType")
    private DataSourceType itemType;

    /**
     * Backup policy name associated with the backup item.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * Name of the container.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /**
     * Backup Engine name.
     */
    @JsonProperty(value = "backupEngineName")
    private String backupEngineName;

    /**
     * Friendly name of protected item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Name of the fabric.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * Name of the backup set.
     */
    @JsonProperty(value = "backupSetName")
    private String backupSetName;

    /**
     * Get health State for the backed up item. Possible values include: 'Passed', 'ActionRequired', 'ActionSuggested', 'Invalid'.
     *
     * @return the healthState value
     */
    public HealthState healthState() {
        return this.healthState;
    }

    /**
     * Set health State for the backed up item. Possible values include: 'Passed', 'ActionRequired', 'ActionSuggested', 'Invalid'.
     *
     * @param healthState the healthState value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get backup management type for the backed up item. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set backup management type for the backed up item. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get type of workload this item represents. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @return the itemType value
     */
    public DataSourceType itemType() {
        return this.itemType;
    }

    /**
     * Set type of workload this item represents. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @param itemType the itemType value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withItemType(DataSourceType itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Get backup policy name associated with the backup item.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set backup policy name associated with the backup item.
     *
     * @param policyName the policyName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get name of the container.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set name of the container.
     *
     * @param containerName the containerName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get backup Engine name.
     *
     * @return the backupEngineName value
     */
    public String backupEngineName() {
        return this.backupEngineName;
    }

    /**
     * Set backup Engine name.
     *
     * @param backupEngineName the backupEngineName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withBackupEngineName(String backupEngineName) {
        this.backupEngineName = backupEngineName;
        return this;
    }

    /**
     * Get friendly name of protected item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of protected item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get name of the fabric.
     *
     * @return the fabricName value
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set name of the fabric.
     *
     * @param fabricName the fabricName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get name of the backup set.
     *
     * @return the backupSetName value
     */
    public String backupSetName() {
        return this.backupSetName;
    }

    /**
     * Set name of the backup set.
     *
     * @param backupSetName the backupSetName value to set
     * @return the ProtectedItemQueryObject object itself.
     */
    public ProtectedItemQueryObject withBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        return this;
    }

}
