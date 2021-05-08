// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AdvisorStatus. */
public enum AdvisorStatus {
    /** Enum value GA. */
    GA("GA"),

    /** Enum value PublicPreview. */
    PUBLIC_PREVIEW("PublicPreview"),

    /** Enum value LimitedPublicPreview. */
    LIMITED_PUBLIC_PREVIEW("LimitedPublicPreview"),

    /** Enum value PrivatePreview. */
    PRIVATE_PREVIEW("PrivatePreview");

    /** The actual serialized value for a AdvisorStatus instance. */
    private final String value;

    AdvisorStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AdvisorStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AdvisorStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static AdvisorStatus fromString(String value) {
        AdvisorStatus[] items = AdvisorStatus.values();
        for (AdvisorStatus item : items) {
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
