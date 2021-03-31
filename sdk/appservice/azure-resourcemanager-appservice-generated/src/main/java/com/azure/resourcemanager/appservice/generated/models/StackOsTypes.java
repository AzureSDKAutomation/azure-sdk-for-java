// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for StackOsTypes. */
public enum StackOsTypes {
    /** Enum value windows. */
    WINDOWS("windows"),

    /** Enum value linux. */
    LINUX("linux");

    /** The actual serialized value for a StackOsTypes instance. */
    private final String value;

    StackOsTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StackOsTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StackOsTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static StackOsTypes fromString(String value) {
        StackOsTypes[] items = StackOsTypes.values();
        for (StackOsTypes item : items) {
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
