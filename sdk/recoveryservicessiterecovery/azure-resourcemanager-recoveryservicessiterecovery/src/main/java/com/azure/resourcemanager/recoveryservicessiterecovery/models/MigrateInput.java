// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for migrate. */
@Fluent
public final class MigrateInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateInput.class);

    /*
     * Migrate input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private MigrateInputProperties properties;

    /**
     * Get the properties property: Migrate input properties.
     *
     * @return the properties value.
     */
    public MigrateInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Migrate input properties.
     *
     * @param properties the properties value to set.
     * @return the MigrateInput object itself.
     */
    public MigrateInput withProperties(MigrateInputProperties properties) {
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
                    new IllegalArgumentException("Missing required property properties in model MigrateInput"));
        } else {
            properties().validate();
        }
    }
}
