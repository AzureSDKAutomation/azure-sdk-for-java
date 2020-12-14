// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolActivityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a list elastic pool activity request. */
@Fluent
public final class ElasticPoolActivityListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolActivityListResult.class);

    /*
     * The list of elastic pool activities.
     */
    @JsonProperty(value = "value", required = true)
    private List<ElasticPoolActivityInner> value;

    /**
     * Get the value property: The list of elastic pool activities.
     *
     * @return the value value.
     */
    public List<ElasticPoolActivityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of elastic pool activities.
     *
     * @param value the value value to set.
     * @return the ElasticPoolActivityListResult object itself.
     */
    public ElasticPoolActivityListResult withValue(List<ElasticPoolActivityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ElasticPoolActivityListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
