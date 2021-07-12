// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Duration based custom options to copy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("CustomCopyOption")
@Fluent
public final class CustomCopyOption extends CopyOption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomCopyOption.class);

    /*
     * Data copied after given timespan
     */
    @JsonProperty(value = "duration")
    private String duration;

    /**
     * Get the duration property: Data copied after given timespan.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Data copied after given timespan.
     *
     * @param duration the duration value to set.
     * @return the CustomCopyOption object itself.
     */
    public CustomCopyOption withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
