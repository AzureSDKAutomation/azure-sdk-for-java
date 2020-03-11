/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMware Azure specific enable protection input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = InMageEnableProtectionInput.class)
@JsonTypeName("InMage")
public class InMageEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /**
     * The Vm Name.
     */
    @JsonProperty(value = "vmFriendlyName")
    private String vmFriendlyName;

    /**
     * The Master Target Id.
     */
    @JsonProperty(value = "masterTargetId", required = true)
    private String masterTargetId;

    /**
     * The Process Server Id.
     */
    @JsonProperty(value = "processServerId", required = true)
    private String processServerId;

    /**
     * The retention drive to use on the MT.
     */
    @JsonProperty(value = "retentionDrive", required = true)
    private String retentionDrive;

    /**
     * The CS account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /**
     * The multi vm group Id.
     */
    @JsonProperty(value = "multiVmGroupId", required = true)
    private String multiVmGroupId;

    /**
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName", required = true)
    private String multiVmGroupName;

    /**
     * The target data store name.
     */
    @JsonProperty(value = "datastoreName")
    private String datastoreName;

    /**
     * The enable disk exclusion input.
     */
    @JsonProperty(value = "diskExclusionInput")
    private InMageDiskExclusionInput diskExclusionInput;

    /**
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude")
    private List<String> disksToInclude;

    /**
     * Get the Vm Name.
     *
     * @return the vmFriendlyName value
     */
    public String vmFriendlyName() {
        return this.vmFriendlyName;
    }

    /**
     * Set the Vm Name.
     *
     * @param vmFriendlyName the vmFriendlyName value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withVmFriendlyName(String vmFriendlyName) {
        this.vmFriendlyName = vmFriendlyName;
        return this;
    }

    /**
     * Get the Master Target Id.
     *
     * @return the masterTargetId value
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the Master Target Id.
     *
     * @param masterTargetId the masterTargetId value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the Process Server Id.
     *
     * @return the processServerId value
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the Process Server Id.
     *
     * @param processServerId the processServerId value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the retention drive to use on the MT.
     *
     * @return the retentionDrive value
     */
    public String retentionDrive() {
        return this.retentionDrive;
    }

    /**
     * Set the retention drive to use on the MT.
     *
     * @param retentionDrive the retentionDrive value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withRetentionDrive(String retentionDrive) {
        this.retentionDrive = retentionDrive;
        return this;
    }

    /**
     * Get the CS account Id.
     *
     * @return the runAsAccountId value
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the CS account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the multi vm group Id.
     *
     * @return the multiVmGroupId value
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multi vm group Id.
     *
     * @param multiVmGroupId the multiVmGroupId value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multi vm group name.
     *
     * @return the multiVmGroupName value
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multi vm group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the target data store name.
     *
     * @return the datastoreName value
     */
    public String datastoreName() {
        return this.datastoreName;
    }

    /**
     * Set the target data store name.
     *
     * @param datastoreName the datastoreName value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * Get the enable disk exclusion input.
     *
     * @return the diskExclusionInput value
     */
    public InMageDiskExclusionInput diskExclusionInput() {
        return this.diskExclusionInput;
    }

    /**
     * Set the enable disk exclusion input.
     *
     * @param diskExclusionInput the diskExclusionInput value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDiskExclusionInput(InMageDiskExclusionInput diskExclusionInput) {
        this.diskExclusionInput = diskExclusionInput;
        return this;
    }

    /**
     * Get the disks to include list.
     *
     * @return the disksToInclude value
     */
    public List<String> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDisksToInclude(List<String> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

}
