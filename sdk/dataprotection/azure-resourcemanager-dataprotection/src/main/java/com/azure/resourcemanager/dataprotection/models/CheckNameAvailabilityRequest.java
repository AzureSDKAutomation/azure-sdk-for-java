// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckNameAvailability Request. */
@Fluent
public final class CheckNameAvailabilityRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityRequest.class);

    /*
     * Resource name for which availability needs to be checked
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes the Resource type: Microsoft.DataProtection/BackupVaults
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: Resource name for which availability needs to be checked.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name for which availability needs to be checked.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Describes the Resource type: Microsoft.DataProtection/BackupVaults.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Describes the Resource type: Microsoft.DataProtection/BackupVaults.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityRequest object itself.
     */
    public CheckNameAvailabilityRequest withType(String type) {
        this.type = type;
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
