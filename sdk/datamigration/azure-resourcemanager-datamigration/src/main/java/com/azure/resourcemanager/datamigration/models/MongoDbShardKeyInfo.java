// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a MongoDB shard key. */
@Fluent
public final class MongoDbShardKeyInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDbShardKeyInfo.class);

    /*
     * The fields within the shard key
     */
    @JsonProperty(value = "fields", required = true)
    private List<MongoDbShardKeyField> fields;

    /*
     * Whether the shard key is unique
     */
    @JsonProperty(value = "isUnique", required = true)
    private boolean isUnique;

    /**
     * Get the fields property: The fields within the shard key.
     *
     * @return the fields value.
     */
    public List<MongoDbShardKeyField> fields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields within the shard key.
     *
     * @param fields the fields value to set.
     * @return the MongoDbShardKeyInfo object itself.
     */
    public MongoDbShardKeyInfo withFields(List<MongoDbShardKeyField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the isUnique property: Whether the shard key is unique.
     *
     * @return the isUnique value.
     */
    public boolean isUnique() {
        return this.isUnique;
    }

    /**
     * Set the isUnique property: Whether the shard key is unique.
     *
     * @param isUnique the isUnique value to set.
     * @return the MongoDbShardKeyInfo object itself.
     */
    public MongoDbShardKeyInfo withIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fields() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property fields in model MongoDbShardKeyInfo"));
        } else {
            fields().forEach(e -> e.validate());
        }
    }
}
