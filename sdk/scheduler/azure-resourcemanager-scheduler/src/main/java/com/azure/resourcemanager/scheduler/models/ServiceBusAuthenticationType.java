// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ServiceBusAuthenticationType. */
public enum ServiceBusAuthenticationType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value SharedAccessKey. */
    SHARED_ACCESS_KEY("SharedAccessKey");

    /** The actual serialized value for a ServiceBusAuthenticationType instance. */
    private final String value;

    ServiceBusAuthenticationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ServiceBusAuthenticationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ServiceBusAuthenticationType object, or null if unable to parse.
     */
    @JsonCreator
    public static ServiceBusAuthenticationType fromString(String value) {
        ServiceBusAuthenticationType[] items = ServiceBusAuthenticationType.values();
        for (ServiceBusAuthenticationType item : items) {
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
