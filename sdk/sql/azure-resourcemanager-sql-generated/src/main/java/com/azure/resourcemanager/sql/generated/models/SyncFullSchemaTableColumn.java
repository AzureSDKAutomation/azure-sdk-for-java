// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the column in the table of database full schema. */
@Immutable
public final class SyncFullSchemaTableColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncFullSchemaTableColumn.class);

    /*
     * Data size of the column.
     */
    @JsonProperty(value = "dataSize", access = JsonProperty.Access.WRITE_ONLY)
    private String dataSize;

    /*
     * Data type of the column.
     */
    @JsonProperty(value = "dataType", access = JsonProperty.Access.WRITE_ONLY)
    private String dataType;

    /*
     * Error id of the column.
     */
    @JsonProperty(value = "errorId", access = JsonProperty.Access.WRITE_ONLY)
    private String errorId;

    /*
     * If there is error in the table.
     */
    @JsonProperty(value = "hasError", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasError;

    /*
     * If it is the primary key of the table.
     */
    @JsonProperty(value = "isPrimaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrimaryKey;

    /*
     * Name of the column.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Quoted name of the column.
     */
    @JsonProperty(value = "quotedName", access = JsonProperty.Access.WRITE_ONLY)
    private String quotedName;

    /**
     * Get the dataSize property: Data size of the column.
     *
     * @return the dataSize value.
     */
    public String dataSize() {
        return this.dataSize;
    }

    /**
     * Get the dataType property: Data type of the column.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Get the errorId property: Error id of the column.
     *
     * @return the errorId value.
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Get the hasError property: If there is error in the table.
     *
     * @return the hasError value.
     */
    public Boolean hasError() {
        return this.hasError;
    }

    /**
     * Get the isPrimaryKey property: If it is the primary key of the table.
     *
     * @return the isPrimaryKey value.
     */
    public Boolean isPrimaryKey() {
        return this.isPrimaryKey;
    }

    /**
     * Get the name property: Name of the column.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the quotedName property: Quoted name of the column.
     *
     * @return the quotedName value.
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
