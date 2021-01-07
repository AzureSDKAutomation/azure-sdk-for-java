// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.windowsiot.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input values. */
@Fluent
public final class DeviceServiceCheckNameAvailabilityParameters {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(DeviceServiceCheckNameAvailabilityParameters.class);

    /*
     * The name of the Windows IoT Device Service to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: The name of the Windows IoT Device Service to check.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Windows IoT Device Service to check.
     *
     * @param name the name value to set.
     * @return the DeviceServiceCheckNameAvailabilityParameters object itself.
     */
    public DeviceServiceCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model DeviceServiceCheckNameAvailabilityParameters"));
        }
    }
}
