/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OperatingSystemTypes.
 */
public enum OperatingSystemTypes {
    /** Enum value Windows. */
    WINDOWS("Windows"),

    /** Enum value Linux. */
    LINUX("Linux");

    /** The actual serialized value for a OperatingSystemTypes instance. */
    private String value;

    OperatingSystemTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperatingSystemTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperatingSystemTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static OperatingSystemTypes fromString(String value) {
        OperatingSystemTypes[] items = OperatingSystemTypes.values();
        for (OperatingSystemTypes item : items) {
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
