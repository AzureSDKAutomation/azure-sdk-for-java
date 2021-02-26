// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkResourceProperties;
import com.azure.resourcemanager.hybridcompute.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private link resource. */
@Fluent
public final class PrivateLinkResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkResourceProperties properties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Resource properties.
     *
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource properties.
     *
     * @param properties the properties value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withProperties(PrivateLinkResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
