// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB MongoDB collection index options. */
@Fluent
public final class MongoIndexOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoIndexOptions.class);

    /*
     * Expire after seconds
     */
    @JsonProperty(value = "expireAfterSeconds")
    private Integer expireAfterSeconds;

    /*
     * Is unique or not
     */
    @JsonProperty(value = "unique")
    private Boolean unique;

    /**
     * Get the expireAfterSeconds property: Expire after seconds.
     *
     * @return the expireAfterSeconds value.
     */
    public Integer expireAfterSeconds() {
        return this.expireAfterSeconds;
    }

    /**
     * Set the expireAfterSeconds property: Expire after seconds.
     *
     * @param expireAfterSeconds the expireAfterSeconds value to set.
     * @return the MongoIndexOptions object itself.
     */
    public MongoIndexOptions withExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
        return this;
    }

    /**
     * Get the unique property: Is unique or not.
     *
     * @return the unique value.
     */
    public Boolean unique() {
        return this.unique;
    }

    /**
     * Set the unique property: Is unique or not.
     *
     * @param unique the unique value to set.
     * @return the MongoIndexOptions object itself.
     */
    public MongoIndexOptions withUnique(Boolean unique) {
        this.unique = unique;
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
