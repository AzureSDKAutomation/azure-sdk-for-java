/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MongoDBCollectionGetPropertiesResource model.
 */
public class MongoDBCollectionGetPropertiesResource {
    /**
     * Name of the Cosmos DB MongoDB collection.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * A key-value pair of shard keys to be applied for the request.
     */
    @JsonProperty(value = "shardKey")
    private Map<String, String> shardKey;

    /**
     * List of index keys.
     */
    @JsonProperty(value = "indexes")
    private List<MongoIndex> indexes;

    /**
     * Analytical TTL.
     */
    @JsonProperty(value = "analyticalStorageTtl")
    private Integer analyticalStorageTtl;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB MongoDB collection.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB MongoDB collection.
     *
     * @param id the id value to set
     * @return the MongoDBCollectionGetPropertiesResource object itself.
     */
    public MongoDBCollectionGetPropertiesResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get a key-value pair of shard keys to be applied for the request.
     *
     * @return the shardKey value
     */
    public Map<String, String> shardKey() {
        return this.shardKey;
    }

    /**
     * Set a key-value pair of shard keys to be applied for the request.
     *
     * @param shardKey the shardKey value to set
     * @return the MongoDBCollectionGetPropertiesResource object itself.
     */
    public MongoDBCollectionGetPropertiesResource withShardKey(Map<String, String> shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get list of index keys.
     *
     * @return the indexes value
     */
    public List<MongoIndex> indexes() {
        return this.indexes;
    }

    /**
     * Set list of index keys.
     *
     * @param indexes the indexes value to set
     * @return the MongoDBCollectionGetPropertiesResource object itself.
     */
    public MongoDBCollectionGetPropertiesResource withIndexes(List<MongoIndex> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Get analytical TTL.
     *
     * @return the analyticalStorageTtl value
     */
    public Integer analyticalStorageTtl() {
        return this.analyticalStorageTtl;
    }

    /**
     * Set analytical TTL.
     *
     * @param analyticalStorageTtl the analyticalStorageTtl value to set
     * @return the MongoDBCollectionGetPropertiesResource object itself.
     */
    public MongoDBCollectionGetPropertiesResource withAnalyticalStorageTtl(Integer analyticalStorageTtl) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
