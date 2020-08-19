/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume Backup Properties.
 */
public class VolumeBackupProperties {
    /**
     * Backup Policy Resource ID.
     */
    @JsonProperty(value = "backupPolicyId")
    private String backupPolicyId;

    /**
     * Policy Enforced.
     */
    @JsonProperty(value = "policyEnforced")
    private Boolean policyEnforced;

    /**
     * Vault Resource ID.
     */
    @JsonProperty(value = "vaultId")
    private String vaultId;

    /**
     * Backup Enabled.
     */
    @JsonProperty(value = "backupEnabled")
    private Boolean backupEnabled;

    /**
     * Get backup Policy Resource ID.
     *
     * @return the backupPolicyId value
     */
    public String backupPolicyId() {
        return this.backupPolicyId;
    }

    /**
     * Set backup Policy Resource ID.
     *
     * @param backupPolicyId the backupPolicyId value to set
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * Get policy Enforced.
     *
     * @return the policyEnforced value
     */
    public Boolean policyEnforced() {
        return this.policyEnforced;
    }

    /**
     * Set policy Enforced.
     *
     * @param policyEnforced the policyEnforced value to set
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withPolicyEnforced(Boolean policyEnforced) {
        this.policyEnforced = policyEnforced;
        return this;
    }

    /**
     * Get vault Resource ID.
     *
     * @return the vaultId value
     */
    public String vaultId() {
        return this.vaultId;
    }

    /**
     * Set vault Resource ID.
     *
     * @param vaultId the vaultId value to set
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * Get backup Enabled.
     *
     * @return the backupEnabled value
     */
    public Boolean backupEnabled() {
        return this.backupEnabled;
    }

    /**
     * Set backup Enabled.
     *
     * @param backupEnabled the backupEnabled value to set
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupEnabled(Boolean backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }

}
