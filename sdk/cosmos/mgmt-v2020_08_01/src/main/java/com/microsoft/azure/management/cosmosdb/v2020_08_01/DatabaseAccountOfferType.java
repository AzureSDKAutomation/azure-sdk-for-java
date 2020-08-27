/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DatabaseAccountOfferType.
 */
public enum DatabaseAccountOfferType {
    /** Enum value Standard. */
    STANDARD("Standard");

    /** The actual serialized value for a DatabaseAccountOfferType instance. */
    private String value;

    DatabaseAccountOfferType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DatabaseAccountOfferType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DatabaseAccountOfferType object, or null if unable to parse.
     */
    @JsonCreator
    public static DatabaseAccountOfferType fromString(String value) {
        DatabaseAccountOfferType[] items = DatabaseAccountOfferType.values();
        for (DatabaseAccountOfferType item : items) {
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
