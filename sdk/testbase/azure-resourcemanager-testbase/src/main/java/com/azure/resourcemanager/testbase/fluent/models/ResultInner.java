// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sample result definition. */
@Fluent
public final class ResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResultInner.class);

    /*
     * Sample property of type string
     */
    @JsonProperty(value = "sampleProperty")
    private String sampleProperty;

    /**
     * Get the sampleProperty property: Sample property of type string.
     *
     * @return the sampleProperty value.
     */
    public String sampleProperty() {
        return this.sampleProperty;
    }

    /**
     * Set the sampleProperty property: Sample property of type string.
     *
     * @param sampleProperty the sampleProperty value to set.
     * @return the ResultInner object itself.
     */
    public ResultInner withSampleProperty(String sampleProperty) {
        this.sampleProperty = sampleProperty;
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
