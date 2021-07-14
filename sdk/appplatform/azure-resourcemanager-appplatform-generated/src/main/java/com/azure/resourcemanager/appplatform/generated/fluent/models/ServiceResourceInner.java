// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appplatform.generated.models.ClusterResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Service resource. */
@Fluent
public final class ServiceResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceResourceInner.class);

    /*
     * Properties of the Service resource
     */
    @JsonProperty(value = "properties")
    private ClusterResourceProperties properties;

    /*
     * Sku of the Service resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the properties property: Properties of the Service resource.
     *
     * @return the properties value.
     */
    public ClusterResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the Service resource.
     *
     * @param properties the properties value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withProperties(ClusterResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the Service resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the Service resource.
     *
     * @param sku the sku value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (sku() != null) {
            sku().validate();
        }
    }
}
