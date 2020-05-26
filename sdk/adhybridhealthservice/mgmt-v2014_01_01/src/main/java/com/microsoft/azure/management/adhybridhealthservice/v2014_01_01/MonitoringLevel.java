/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MonitoringLevel.
 */
public enum MonitoringLevel {
    /** Enum value Partial. */
    PARTIAL("Partial"),

    /** Enum value Full. */
    FULL("Full"),

    /** Enum value Off. */
    OFF("Off");

    /** The actual serialized value for a MonitoringLevel instance. */
    private String value;

    MonitoringLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MonitoringLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MonitoringLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static MonitoringLevel fromString(String value) {
        MonitoringLevel[] items = MonitoringLevel.values();
        for (MonitoringLevel item : items) {
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
