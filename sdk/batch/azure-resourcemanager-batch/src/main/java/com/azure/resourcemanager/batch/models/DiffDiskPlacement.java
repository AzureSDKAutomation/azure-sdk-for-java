// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DiffDiskPlacement. */
public enum DiffDiskPlacement {
    /** Enum value CacheDisk. */
    CACHE_DISK("CacheDisk");

    /** The actual serialized value for a DiffDiskPlacement instance. */
    private final String value;

    DiffDiskPlacement(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DiffDiskPlacement instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DiffDiskPlacement object, or null if unable to parse.
     */
    @JsonCreator
    public static DiffDiskPlacement fromString(String value) {
        DiffDiskPlacement[] items = DiffDiskPlacement.values();
        for (DiffDiskPlacement item : items) {
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
