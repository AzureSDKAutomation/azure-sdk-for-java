// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagepool.fluent.models.DiskPoolInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Disk Pools. */
@Fluent
public final class DiskPoolListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskPoolListResult.class);

    /*
     * An array of Disk Pool objects.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiskPoolInner> value;

    /*
     * URI to fetch the next section of the paginated response.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of Disk Pool objects.
     *
     * @return the value value.
     */
    public List<DiskPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of Disk Pool objects.
     *
     * @param value the value value to set.
     * @return the DiskPoolListResult object itself.
     */
    public DiskPoolListResult withValue(List<DiskPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to fetch the next section of the paginated response.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
                    new IllegalArgumentException("Missing required property value in model DiskPoolListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
