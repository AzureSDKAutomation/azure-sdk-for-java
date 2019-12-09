/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Default value.
 */
public class DWCopyCommandDefaultValue {
    /**
     * Column name. Type: object (or Expression with resultType string).
     */
    @JsonProperty(value = "columnName")
    private Object columnName;

    /**
     * The default value of the column. Type: object (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get column name. Type: object (or Expression with resultType string).
     *
     * @return the columnName value
     */
    public Object columnName() {
        return this.columnName;
    }

    /**
     * Set column name. Type: object (or Expression with resultType string).
     *
     * @param columnName the columnName value to set
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue withColumnName(Object columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the default value of the column. Type: object (or Expression with resultType string).
     *
     * @return the defaultValue value
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the default value of the column. Type: object (or Expression with resultType string).
     *
     * @param defaultValue the defaultValue value to set
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

}
