// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for HostCaching. */
public enum HostCaching {
    /** Enum value None. */
    NONE("None"),

    /** Enum value ReadOnly. */
    READ_ONLY("ReadOnly"),

    /** Enum value ReadWrite. */
    READ_WRITE("ReadWrite");

    /** The actual serialized value for a HostCaching instance. */
    private final String value;

    HostCaching(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostCaching instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostCaching object, or null if unable to parse.
     */
    @JsonCreator
    public static HostCaching fromString(String value) {
        HostCaching[] items = HostCaching.values();
        for (HostCaching item : items) {
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
