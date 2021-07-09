// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Disable protection input. */
@Fluent
public final class DisableProtectionInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisableProtectionInput.class);

    /*
     * Disable protection input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DisableProtectionInputProperties properties;

    /**
     * Get the properties property: Disable protection input properties.
     *
     * @return the properties value.
     */
    public DisableProtectionInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Disable protection input properties.
     *
     * @param properties the properties value to set.
     * @return the DisableProtectionInput object itself.
     */
    public DisableProtectionInput withProperties(DisableProtectionInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model DisableProtectionInput"));
        } else {
            properties().validate();
        }
    }
}
