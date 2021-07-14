// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The retention details of the MT. */
@Fluent
public final class RetentionVolume {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RetentionVolume.class);

    /*
     * The volume name.
     */
    @JsonProperty(value = "volumeName")
    private String volumeName;

    /*
     * The volume capacity.
     */
    @JsonProperty(value = "capacityInBytes")
    private Long capacityInBytes;

    /*
     * The free space available in this volume.
     */
    @JsonProperty(value = "freeSpaceInBytes")
    private Long freeSpaceInBytes;

    /*
     * The threshold percentage.
     */
    @JsonProperty(value = "thresholdPercentage")
    private Integer thresholdPercentage;

    /**
     * Get the volumeName property: The volume name.
     *
     * @return the volumeName value.
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Set the volumeName property: The volume name.
     *
     * @param volumeName the volumeName value to set.
     * @return the RetentionVolume object itself.
     */
    public RetentionVolume withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    /**
     * Get the capacityInBytes property: The volume capacity.
     *
     * @return the capacityInBytes value.
     */
    public Long capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * Set the capacityInBytes property: The volume capacity.
     *
     * @param capacityInBytes the capacityInBytes value to set.
     * @return the RetentionVolume object itself.
     */
    public RetentionVolume withCapacityInBytes(Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
        return this;
    }

    /**
     * Get the freeSpaceInBytes property: The free space available in this volume.
     *
     * @return the freeSpaceInBytes value.
     */
    public Long freeSpaceInBytes() {
        return this.freeSpaceInBytes;
    }

    /**
     * Set the freeSpaceInBytes property: The free space available in this volume.
     *
     * @param freeSpaceInBytes the freeSpaceInBytes value to set.
     * @return the RetentionVolume object itself.
     */
    public RetentionVolume withFreeSpaceInBytes(Long freeSpaceInBytes) {
        this.freeSpaceInBytes = freeSpaceInBytes;
        return this;
    }

    /**
     * Get the thresholdPercentage property: The threshold percentage.
     *
     * @return the thresholdPercentage value.
     */
    public Integer thresholdPercentage() {
        return this.thresholdPercentage;
    }

    /**
     * Set the thresholdPercentage property: The threshold percentage.
     *
     * @param thresholdPercentage the thresholdPercentage value to set.
     * @return the RetentionVolume object itself.
     */
    public RetentionVolume withThresholdPercentage(Integer thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
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
