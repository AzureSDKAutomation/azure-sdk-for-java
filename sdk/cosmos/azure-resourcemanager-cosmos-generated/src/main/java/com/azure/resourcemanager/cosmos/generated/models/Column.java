// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB Cassandra table column. */
@Fluent
public final class Column {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Column.class);

    /*
     * Name of the Cosmos DB Cassandra table column
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Type of the Cosmos DB Cassandra table column
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: Name of the Cosmos DB Cassandra table column.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Cosmos DB Cassandra table column.
     *
     * @param name the name value to set.
     * @return the Column object itself.
     */
    public Column withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the Cosmos DB Cassandra table column.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the Cosmos DB Cassandra table column.
     *
     * @param type the type value to set.
     * @return the Column object itself.
     */
    public Column withType(String type) {
        this.type = type;
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
