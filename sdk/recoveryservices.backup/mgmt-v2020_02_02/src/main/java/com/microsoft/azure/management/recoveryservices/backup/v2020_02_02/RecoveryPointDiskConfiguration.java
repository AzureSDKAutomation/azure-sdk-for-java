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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disk configuration.
 */
public class RecoveryPointDiskConfiguration {
    /**
     * Number of disks included in backup.
     */
    @JsonProperty(value = "numberOfDisksIncludedInBackup")
    private Integer numberOfDisksIncludedInBackup;

    /**
     * Number of disks attached to the VM.
     */
    @JsonProperty(value = "numberOfDisksAttachedToVm")
    private Integer numberOfDisksAttachedToVm;

    /**
     * Information of disks included in backup.
     */
    @JsonProperty(value = "includedDiskList")
    private List<DiskInformation> includedDiskList;

    /**
     * Information of disks excluded from backup.
     */
    @JsonProperty(value = "excludedDiskList")
    private List<DiskInformation> excludedDiskList;

    /**
     * Get number of disks included in backup.
     *
     * @return the numberOfDisksIncludedInBackup value
     */
    public Integer numberOfDisksIncludedInBackup() {
        return this.numberOfDisksIncludedInBackup;
    }

    /**
     * Set number of disks included in backup.
     *
     * @param numberOfDisksIncludedInBackup the numberOfDisksIncludedInBackup value to set
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withNumberOfDisksIncludedInBackup(Integer numberOfDisksIncludedInBackup) {
        this.numberOfDisksIncludedInBackup = numberOfDisksIncludedInBackup;
        return this;
    }

    /**
     * Get number of disks attached to the VM.
     *
     * @return the numberOfDisksAttachedToVm value
     */
    public Integer numberOfDisksAttachedToVm() {
        return this.numberOfDisksAttachedToVm;
    }

    /**
     * Set number of disks attached to the VM.
     *
     * @param numberOfDisksAttachedToVm the numberOfDisksAttachedToVm value to set
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withNumberOfDisksAttachedToVm(Integer numberOfDisksAttachedToVm) {
        this.numberOfDisksAttachedToVm = numberOfDisksAttachedToVm;
        return this;
    }

    /**
     * Get information of disks included in backup.
     *
     * @return the includedDiskList value
     */
    public List<DiskInformation> includedDiskList() {
        return this.includedDiskList;
    }

    /**
     * Set information of disks included in backup.
     *
     * @param includedDiskList the includedDiskList value to set
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withIncludedDiskList(List<DiskInformation> includedDiskList) {
        this.includedDiskList = includedDiskList;
        return this;
    }

    /**
     * Get information of disks excluded from backup.
     *
     * @return the excludedDiskList value
     */
    public List<DiskInformation> excludedDiskList() {
        return this.excludedDiskList;
    }

    /**
     * Set information of disks excluded from backup.
     *
     * @param excludedDiskList the excludedDiskList value to set
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withExcludedDiskList(List<DiskInformation> excludedDiskList) {
        this.excludedDiskList = excludedDiskList;
        return this;
    }

}
