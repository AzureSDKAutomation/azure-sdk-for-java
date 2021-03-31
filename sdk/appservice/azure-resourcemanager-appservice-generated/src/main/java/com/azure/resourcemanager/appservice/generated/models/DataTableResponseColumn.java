// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Column definition. */
@Fluent
public final class DataTableResponseColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataTableResponseColumn.class);

    /*
     * Name of the column
     */
    @JsonProperty(value = "columnName")
    private String columnName;

    /*
     * Data type which looks like 'String' or 'Int32'.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /*
     * Column Type
     */
    @JsonProperty(value = "columnType")
    private String columnType;

    /**
     * Get the columnName property: Name of the column.
     *
     * @return the columnName value.
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: Name of the column.
     *
     * @param columnName the columnName value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the dataType property: Data type which looks like 'String' or 'Int32'.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Data type which looks like 'String' or 'Int32'.
     *
     * @param dataType the dataType value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the columnType property: Column Type.
     *
     * @return the columnType value.
     */
    public String columnType() {
        return this.columnType;
    }

    /**
     * Set the columnType property: Column Type.
     *
     * @param columnType the columnType value to set.
     * @return the DataTableResponseColumn object itself.
     */
    public DataTableResponseColumn withColumnType(String columnType) {
        this.columnType = columnType;
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
