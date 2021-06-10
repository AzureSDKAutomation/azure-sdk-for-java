// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update migration item input. */
@Fluent
public final class UpdateMigrationItemInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateMigrationItemInput.class);

    /*
     * Update migration item input properties.
     */
    @JsonProperty(value = "properties")
    private UpdateMigrationItemInputProperties properties;

    /**
     * Get the properties property: Update migration item input properties.
     *
     * @return the properties value.
     */
    public UpdateMigrationItemInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Update migration item input properties.
     *
     * @param properties the properties value to set.
     * @return the UpdateMigrationItemInput object itself.
     */
    public UpdateMigrationItemInput withProperties(UpdateMigrationItemInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
