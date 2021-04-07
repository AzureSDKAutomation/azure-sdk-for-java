// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enable migration input. */
@Fluent
public final class EnableMigrationInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnableMigrationInput.class);

    /*
     * Enable migration input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private EnableMigrationInputProperties properties;

    /**
     * Get the properties property: Enable migration input properties.
     *
     * @return the properties value.
     */
    public EnableMigrationInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Enable migration input properties.
     *
     * @param properties the properties value to set.
     * @return the EnableMigrationInput object itself.
     */
    public EnableMigrationInput withProperties(EnableMigrationInputProperties properties) {
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
                    new IllegalArgumentException("Missing required property properties in model EnableMigrationInput"));
        } else {
            properties().validate();
        }
    }
}
