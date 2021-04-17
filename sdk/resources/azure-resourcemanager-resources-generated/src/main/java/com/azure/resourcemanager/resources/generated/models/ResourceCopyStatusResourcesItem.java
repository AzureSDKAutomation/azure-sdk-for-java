// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceCopyStatusResourcesItem model. */
@Fluent
public final class ResourceCopyStatusResourcesItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceCopyStatusResourcesItem.class);

    /*
     * Source resource ARM Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource copy status.
     */
    @JsonProperty(value = "status")
    private CopyState status;

    /**
     * Get the id property: Source resource ARM Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Source resource ARM Id.
     *
     * @param id the id value to set.
     * @return the ResourceCopyStatusResourcesItem object itself.
     */
    public ResourceCopyStatusResourcesItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: Resource copy status.
     *
     * @return the status value.
     */
    public CopyState status() {
        return this.status;
    }

    /**
     * Set the status property: Resource copy status.
     *
     * @param status the status value to set.
     * @return the ResourceCopyStatusResourcesItem object itself.
     */
    public ResourceCopyStatusResourcesItem withStatus(CopyState status) {
        this.status = status;
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
