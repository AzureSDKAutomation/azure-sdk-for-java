// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for CustomHostnameDnsRecordType. */
public enum CustomHostnameDnsRecordType {
    /** Enum value CName. */
    CNAME("CName"),

    /** Enum value A. */
    A("A");

    /** The actual serialized value for a CustomHostnameDnsRecordType instance. */
    private final String value;

    CustomHostnameDnsRecordType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CustomHostnameDnsRecordType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CustomHostnameDnsRecordType object, or null if unable to parse.
     */
    @JsonCreator
    public static CustomHostnameDnsRecordType fromString(String value) {
        CustomHostnameDnsRecordType[] items = CustomHostnameDnsRecordType.values();
        for (CustomHostnameDnsRecordType item : items) {
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
