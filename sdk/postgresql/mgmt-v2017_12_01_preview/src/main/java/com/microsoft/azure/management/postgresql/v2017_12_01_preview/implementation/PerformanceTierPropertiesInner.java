/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.PerformanceTierServiceLevelObjectives;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Performance tier properties.
 */
public class PerformanceTierPropertiesInner {
    /**
     * ID of the performance tier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Maximum Backup retention in days for the performance tier edition.
     */
    @JsonProperty(value = "maxBackupRetentionDays")
    private Integer maxBackupRetentionDays;

    /**
     * Minimum Backup retention in days for the performance tier edition.
     */
    @JsonProperty(value = "minBackupRetentionDays")
    private Integer minBackupRetentionDays;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "maxStorageMB")
    private Integer maxStorageMB;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "minLargeStorageMB")
    private Integer minLargeStorageMB;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "maxLargeStorageMB")
    private Integer maxLargeStorageMB;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "minStorageMB")
    private Integer minStorageMB;

    /**
     * Service level objectives associated with the performance tier.
     */
    @JsonProperty(value = "serviceLevelObjectives")
    private List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives;

    /**
     * Get iD of the performance tier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set iD of the performance tier.
     *
     * @param id the id value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get maximum Backup retention in days for the performance tier edition.
     *
     * @return the maxBackupRetentionDays value
     */
    public Integer maxBackupRetentionDays() {
        return this.maxBackupRetentionDays;
    }

    /**
     * Set maximum Backup retention in days for the performance tier edition.
     *
     * @param maxBackupRetentionDays the maxBackupRetentionDays value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxBackupRetentionDays(Integer maxBackupRetentionDays) {
        this.maxBackupRetentionDays = maxBackupRetentionDays;
        return this;
    }

    /**
     * Get minimum Backup retention in days for the performance tier edition.
     *
     * @return the minBackupRetentionDays value
     */
    public Integer minBackupRetentionDays() {
        return this.minBackupRetentionDays;
    }

    /**
     * Set minimum Backup retention in days for the performance tier edition.
     *
     * @param minBackupRetentionDays the minBackupRetentionDays value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinBackupRetentionDays(Integer minBackupRetentionDays) {
        this.minBackupRetentionDays = minBackupRetentionDays;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the maxStorageMB value
     */
    public Integer maxStorageMB() {
        return this.maxStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param maxStorageMB the maxStorageMB value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxStorageMB(Integer maxStorageMB) {
        this.maxStorageMB = maxStorageMB;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the minLargeStorageMB value
     */
    public Integer minLargeStorageMB() {
        return this.minLargeStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param minLargeStorageMB the minLargeStorageMB value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinLargeStorageMB(Integer minLargeStorageMB) {
        this.minLargeStorageMB = minLargeStorageMB;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the maxLargeStorageMB value
     */
    public Integer maxLargeStorageMB() {
        return this.maxLargeStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param maxLargeStorageMB the maxLargeStorageMB value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMaxLargeStorageMB(Integer maxLargeStorageMB) {
        this.maxLargeStorageMB = maxLargeStorageMB;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the minStorageMB value
     */
    public Integer minStorageMB() {
        return this.minStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param minStorageMB the minStorageMB value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withMinStorageMB(Integer minStorageMB) {
        this.minStorageMB = minStorageMB;
        return this;
    }

    /**
     * Get service level objectives associated with the performance tier.
     *
     * @return the serviceLevelObjectives value
     */
    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        return this.serviceLevelObjectives;
    }

    /**
     * Set service level objectives associated with the performance tier.
     *
     * @param serviceLevelObjectives the serviceLevelObjectives value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withServiceLevelObjectives(List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives) {
        this.serviceLevelObjectives = serviceLevelObjectives;
        return this;
    }

}
