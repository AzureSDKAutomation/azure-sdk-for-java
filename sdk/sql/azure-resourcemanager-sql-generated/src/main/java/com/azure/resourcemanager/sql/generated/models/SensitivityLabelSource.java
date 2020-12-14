// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SensitivityLabelSource. */
public enum SensitivityLabelSource {
    /** Enum value current. */
    CURRENT("current"),

    /** Enum value recommended. */
    RECOMMENDED("recommended");

    /** The actual serialized value for a SensitivityLabelSource instance. */
    private final String value;

    SensitivityLabelSource(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SensitivityLabelSource instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SensitivityLabelSource object, or null if unable to parse.
     */
    @JsonCreator
    public static SensitivityLabelSource fromString(String value) {
        SensitivityLabelSource[] items = SensitivityLabelSource.values();
        for (SensitivityLabelSource item : items) {
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
