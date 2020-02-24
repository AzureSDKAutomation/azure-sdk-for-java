/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB MongoDB collection index options.
 */
public class MongoIndexOptions {
    /**
     * Expire after seconds.
     */
    @JsonProperty(value = "expireAfterSeconds")
    private Integer expireAfterSeconds;

    /**
     * Is unique or not.
     */
    @JsonProperty(value = "unique")
    private Boolean unique;

    /**
     * Get expire after seconds.
     *
     * @return the expireAfterSeconds value
     */
    public Integer expireAfterSeconds() {
        return this.expireAfterSeconds;
    }

    /**
     * Set expire after seconds.
     *
     * @param expireAfterSeconds the expireAfterSeconds value to set
     * @return the MongoIndexOptions object itself.
     */
    public MongoIndexOptions withExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
        return this;
    }

    /**
     * Get is unique or not.
     *
     * @return the unique value
     */
    public Boolean unique() {
        return this.unique;
    }

    /**
     * Set is unique or not.
     *
     * @param unique the unique value to set
     * @return the MongoIndexOptions object itself.
     */
    public MongoIndexOptions withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

}
