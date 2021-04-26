// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a baseline metadata value. */
@Fluent
public final class BaselineMetadataValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BaselineMetadataValue.class);

    /*
     * the name of the metadata.
     */
    @JsonProperty(value = "name")
    private LocalizableStringAutoGenerated2 name;

    /*
     * the value of the metadata.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: the name of the metadata.
     *
     * @return the name value.
     */
    public LocalizableStringAutoGenerated2 name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the metadata.
     *
     * @param name the name value to set.
     * @return the BaselineMetadataValue object itself.
     */
    public BaselineMetadataValue withName(LocalizableStringAutoGenerated2 name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: the value of the metadata.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: the value of the metadata.
     *
     * @param value the value value to set.
     * @return the BaselineMetadataValue object itself.
     */
    public BaselineMetadataValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
