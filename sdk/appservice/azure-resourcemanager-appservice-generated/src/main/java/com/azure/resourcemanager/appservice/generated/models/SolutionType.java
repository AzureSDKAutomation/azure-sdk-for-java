// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SolutionType. */
public enum SolutionType {
    /** Enum value QuickSolution. */
    QUICK_SOLUTION("QuickSolution"),

    /** Enum value DeepInvestigation. */
    DEEP_INVESTIGATION("DeepInvestigation"),

    /** Enum value BestPractices. */
    BEST_PRACTICES("BestPractices");

    /** The actual serialized value for a SolutionType instance. */
    private final String value;

    SolutionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SolutionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SolutionType object, or null if unable to parse.
     */
    @JsonCreator
    public static SolutionType fromString(String value) {
        SolutionType[] items = SolutionType.values();
        for (SolutionType item : items) {
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
