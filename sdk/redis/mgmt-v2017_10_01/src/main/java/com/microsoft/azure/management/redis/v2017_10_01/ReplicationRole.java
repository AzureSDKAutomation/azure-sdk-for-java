/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ReplicationRole.
 */
public enum ReplicationRole {
    /** Enum value Primary. */
    PRIMARY("Primary"),

    /** Enum value Secondary. */
    SECONDARY("Secondary");

    /** The actual serialized value for a ReplicationRole instance. */
    private String value;

    ReplicationRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReplicationRole instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ReplicationRole object, or null if unable to parse.
     */
    @JsonCreator
    public static ReplicationRole fromString(String value) {
        ReplicationRole[] items = ReplicationRole.values();
        for (ReplicationRole item : items) {
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
