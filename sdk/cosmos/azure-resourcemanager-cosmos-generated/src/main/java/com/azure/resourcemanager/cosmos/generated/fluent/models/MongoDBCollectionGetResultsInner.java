// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB MongoDB collection. */
@JsonFlatten
@Fluent
public class MongoDBCollectionGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBCollectionGetResultsInner.class);

    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private MongoDBCollectionGetPropertiesResource resource;

    /*
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private MongoDBCollectionGetPropertiesOptions options;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public MongoDBCollectionGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withResource(MongoDBCollectionGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public MongoDBCollectionGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withOptions(MongoDBCollectionGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (resource() != null) {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
