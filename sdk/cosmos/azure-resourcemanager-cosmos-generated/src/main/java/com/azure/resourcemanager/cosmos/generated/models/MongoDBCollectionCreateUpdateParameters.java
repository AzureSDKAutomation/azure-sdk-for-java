// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB MongoDB collection. */
@JsonFlatten
@Fluent
public class MongoDBCollectionCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBCollectionCreateUpdateParameters.class);

    /*
     * The standard JSON format of a MongoDB collection
     */
    @JsonProperty(value = "properties.resource", required = true)
    private MongoDBCollectionResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options")
    private CreateUpdateOptions options;

    /**
     * Get the resource property: The standard JSON format of a MongoDB collection.
     *
     * @return the resource value.
     */
    public MongoDBCollectionResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a MongoDB collection.
     *
     * @param resource the resource value to set.
     * @return the MongoDBCollectionCreateUpdateParameters object itself.
     */
    public MongoDBCollectionCreateUpdateParameters withResource(MongoDBCollectionResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the MongoDBCollectionCreateUpdateParameters object itself.
     */
    public MongoDBCollectionCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBCollectionCreateUpdateParameters withTags(Map<String, String> tags) {
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
        if (resource() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resource in model MongoDBCollectionCreateUpdateParameters"));
        } else {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
