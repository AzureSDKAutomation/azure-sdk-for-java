// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Resource template details for the resource provider. */
@Fluent
public final class ResourceProviderTemplate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProviderTemplate.class);

    /*
     * Resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Resource query for dimension values.
     */
    @JsonProperty(value = "resourceQuery")
    private ResourceQueryDetails resourceQuery;

    /*
     * Resource usages query.
     */
    @JsonProperty(value = "resourceUsagesQuery")
    private ResourceQueryDetails resourceUsagesQuery;

    /*
     * Resource provider dimensions.
     */
    @JsonProperty(value = "dimensions")
    private List<ResourceProviderDimension> dimensions;

    /**
     * Get the resourceType property: Resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the ResourceProviderTemplate object itself.
     */
    public ResourceProviderTemplate withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceQuery property: Resource query for dimension values.
     *
     * @return the resourceQuery value.
     */
    public ResourceQueryDetails resourceQuery() {
        return this.resourceQuery;
    }

    /**
     * Set the resourceQuery property: Resource query for dimension values.
     *
     * @param resourceQuery the resourceQuery value to set.
     * @return the ResourceProviderTemplate object itself.
     */
    public ResourceProviderTemplate withResourceQuery(ResourceQueryDetails resourceQuery) {
        this.resourceQuery = resourceQuery;
        return this;
    }

    /**
     * Get the resourceUsagesQuery property: Resource usages query.
     *
     * @return the resourceUsagesQuery value.
     */
    public ResourceQueryDetails resourceUsagesQuery() {
        return this.resourceUsagesQuery;
    }

    /**
     * Set the resourceUsagesQuery property: Resource usages query.
     *
     * @param resourceUsagesQuery the resourceUsagesQuery value to set.
     * @return the ResourceProviderTemplate object itself.
     */
    public ResourceProviderTemplate withResourceUsagesQuery(ResourceQueryDetails resourceUsagesQuery) {
        this.resourceUsagesQuery = resourceUsagesQuery;
        return this;
    }

    /**
     * Get the dimensions property: Resource provider dimensions.
     *
     * @return the dimensions value.
     */
    public List<ResourceProviderDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Resource provider dimensions.
     *
     * @param dimensions the dimensions value to set.
     * @return the ResourceProviderTemplate object itself.
     */
    public ResourceProviderTemplate withDimensions(List<ResourceProviderDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceQuery() != null) {
            resourceQuery().validate();
        }
        if (resourceUsagesQuery() != null) {
            resourceUsagesQuery().validate();
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
