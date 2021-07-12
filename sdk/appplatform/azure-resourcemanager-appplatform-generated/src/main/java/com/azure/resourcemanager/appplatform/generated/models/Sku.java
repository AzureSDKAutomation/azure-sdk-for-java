// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sku of Azure Spring Cloud. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * Name of the Sku
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Tier of the Sku
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Current capacity of the target resource
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: Name of the Sku.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Sku.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of the Sku.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of the Sku.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Current capacity of the target resource.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Current capacity of the target resource.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
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
