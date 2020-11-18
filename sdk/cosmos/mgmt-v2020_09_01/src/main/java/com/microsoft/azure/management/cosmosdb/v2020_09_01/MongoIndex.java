/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB MongoDB collection index key.
 */
public class MongoIndex {
    /**
     * Cosmos DB MongoDB collection index keys.
     */
    @JsonProperty(value = "key")
    private MongoIndexKeys key;

    /**
     * Cosmos DB MongoDB collection index key options.
     */
    @JsonProperty(value = "options")
    private MongoIndexOptions options;

    /**
     * Get cosmos DB MongoDB collection index keys.
     *
     * @return the key value
     */
    public MongoIndexKeys key() {
        return this.key;
    }

    /**
     * Set cosmos DB MongoDB collection index keys.
     *
     * @param key the key value to set
     * @return the MongoIndex object itself.
     */
    public MongoIndex withKey(MongoIndexKeys key) {
        this.key = key;
        return this;
    }

    /**
     * Get cosmos DB MongoDB collection index key options.
     *
     * @return the options value
     */
    public MongoIndexOptions options() {
        return this.options;
    }

    /**
     * Set cosmos DB MongoDB collection index key options.
     *
     * @param options the options value to set
     * @return the MongoIndex object itself.
     */
    public MongoIndex withOptions(MongoIndexOptions options) {
        this.options = options;
        return this;
    }

}
