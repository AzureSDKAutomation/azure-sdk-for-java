// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration values for periodic mode backup. */
@Fluent
public final class PeriodicModeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeriodicModeProperties.class);

    /*
     * An integer representing the interval in minutes between two backups
     */
    @JsonProperty(value = "backupIntervalInMinutes")
    private Integer backupIntervalInMinutes;

    /*
     * An integer representing the time (in hours) that each backup is retained
     */
    @JsonProperty(value = "backupRetentionIntervalInHours")
    private Integer backupRetentionIntervalInHours;

    /**
     * Get the backupIntervalInMinutes property: An integer representing the interval in minutes between two backups.
     *
     * @return the backupIntervalInMinutes value.
     */
    public Integer backupIntervalInMinutes() {
        return this.backupIntervalInMinutes;
    }

    /**
     * Set the backupIntervalInMinutes property: An integer representing the interval in minutes between two backups.
     *
     * @param backupIntervalInMinutes the backupIntervalInMinutes value to set.
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupIntervalInMinutes(Integer backupIntervalInMinutes) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        return this;
    }

    /**
     * Get the backupRetentionIntervalInHours property: An integer representing the time (in hours) that each backup is
     * retained.
     *
     * @return the backupRetentionIntervalInHours value.
     */
    public Integer backupRetentionIntervalInHours() {
        return this.backupRetentionIntervalInHours;
    }

    /**
     * Set the backupRetentionIntervalInHours property: An integer representing the time (in hours) that each backup is
     * retained.
     *
     * @param backupRetentionIntervalInHours the backupRetentionIntervalInHours value to set.
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupRetentionIntervalInHours(Integer backupRetentionIntervalInHours) {
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
