/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Operation.
 */
public enum Operation {
    /** The 'replace' option replaces the entire set of existing tags with a new set. */
    REPLACE("Replace"),

    /** The 'merge' option allows adding tags with new names and updating the values of tags with existing names. */
    MERGE("Merge"),

    /** The 'delete' option allows selectively deleting tags based on given names or name/value pairs. */
    DELETE("Delete");

    /** The actual serialized value for a Operation instance. */
    private String value;

    Operation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Operation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Operation object, or null if unable to parse.
     */
    @JsonCreator
    public static Operation fromString(String value) {
        Operation[] items = Operation.values();
        for (Operation item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
