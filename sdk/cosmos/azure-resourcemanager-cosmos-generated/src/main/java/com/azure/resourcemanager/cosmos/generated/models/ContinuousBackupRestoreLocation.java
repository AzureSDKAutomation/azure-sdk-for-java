// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the regional restorable account. */
@Fluent
public final class ContinuousBackupRestoreLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContinuousBackupRestoreLocation.class);

    /*
     * The name of the continuous backup restore location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: The name of the continuous backup restore location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The name of the continuous backup restore location.
     *
     * @param location the location value to set.
     * @return the ContinuousBackupRestoreLocation object itself.
     */
    public ContinuousBackupRestoreLocation withLocation(String location) {
        this.location = location;
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
