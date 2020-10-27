/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RoleDisasterRecovery.
 */
public enum RoleDisasterRecovery {
    /** Enum value Primary. */
    PRIMARY("Primary"),

    /** Enum value PrimaryNotReplicating. */
    PRIMARY_NOT_REPLICATING("PrimaryNotReplicating"),

    /** Enum value Secondary. */
    SECONDARY("Secondary");

    /** The actual serialized value for a RoleDisasterRecovery instance. */
    private String value;

    RoleDisasterRecovery(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RoleDisasterRecovery instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RoleDisasterRecovery object, or null if unable to parse.
     */
    @JsonCreator
    public static RoleDisasterRecovery fromString(String value) {
        RoleDisasterRecovery[] items = RoleDisasterRecovery.values();
        for (RoleDisasterRecovery item : items) {
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
