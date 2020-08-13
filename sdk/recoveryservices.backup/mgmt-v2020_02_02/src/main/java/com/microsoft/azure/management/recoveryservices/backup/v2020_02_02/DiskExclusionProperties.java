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
 * The DiskExclusionProperties model.
 */
public class DiskExclusionProperties {
    /**
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     */
    @JsonProperty(value = "diskLunList")
    private List<Integer> diskLunList;

    /**
     * Flag to indicate whether DiskLunList is to be included/ excluded from
     * backup.
     */
    @JsonProperty(value = "isInclusionList")
    private Boolean isInclusionList;

    /**
     * Get list of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     *
     * @return the diskLunList value
     */
    public List<Integer> diskLunList() {
        return this.diskLunList;
    }

    /**
     * Set list of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     *
     * @param diskLunList the diskLunList value to set
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withDiskLunList(List<Integer> diskLunList) {
        this.diskLunList = diskLunList;
        return this;
    }

    /**
     * Get flag to indicate whether DiskLunList is to be included/ excluded from backup.
     *
     * @return the isInclusionList value
     */
    public Boolean isInclusionList() {
        return this.isInclusionList;
    }

    /**
     * Set flag to indicate whether DiskLunList is to be included/ excluded from backup.
     *
     * @param isInclusionList the isInclusionList value to set
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withIsInclusionList(Boolean isInclusionList) {
        this.isInclusionList = isInclusionList;
        return this;
    }

}
