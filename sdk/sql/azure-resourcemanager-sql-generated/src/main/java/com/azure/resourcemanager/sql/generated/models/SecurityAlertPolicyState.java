// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SecurityAlertPolicyState. */
public enum SecurityAlertPolicyState {
    /** Enum value New. */
    NEW("New"),

    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a SecurityAlertPolicyState instance. */
    private final String value;

    SecurityAlertPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SecurityAlertPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SecurityAlertPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static SecurityAlertPolicyState fromString(String value) {
        SecurityAlertPolicyState[] items = SecurityAlertPolicyState.values();
        for (SecurityAlertPolicyState item : items) {
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
