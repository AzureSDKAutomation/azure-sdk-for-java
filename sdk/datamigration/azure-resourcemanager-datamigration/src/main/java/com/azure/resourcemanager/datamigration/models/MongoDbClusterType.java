// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MongoDbClusterType. */
public final class MongoDbClusterType extends ExpandableStringEnum<MongoDbClusterType> {
    /** Static value BlobContainer for MongoDbClusterType. */
    public static final MongoDbClusterType BLOB_CONTAINER = fromString("BlobContainer");

    /** Static value CosmosDb for MongoDbClusterType. */
    public static final MongoDbClusterType COSMOS_DB = fromString("CosmosDb");

    /** Static value MongoDb for MongoDbClusterType. */
    public static final MongoDbClusterType MONGO_DB = fromString("MongoDb");

    /**
     * Creates or finds a MongoDbClusterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MongoDbClusterType.
     */
    @JsonCreator
    public static MongoDbClusterType fromString(String name) {
        return fromString(name, MongoDbClusterType.class);
    }

    /** @return known MongoDbClusterType values. */
    public static Collection<MongoDbClusterType> values() {
        return values(MongoDbClusterType.class);
    }
}
