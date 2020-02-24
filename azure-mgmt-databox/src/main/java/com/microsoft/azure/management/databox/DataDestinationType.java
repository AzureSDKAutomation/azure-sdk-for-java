/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataDestinationType.
 */
public enum DataDestinationType {
    /** Storage Accounts . */
    STORAGE_ACCOUNT("StorageAccount"),

    /** Azure Managed disk storage. */
    MANAGED_DISK("ManagedDisk");

    /** The actual serialized value for a DataDestinationType instance. */
    private String value;

    DataDestinationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataDestinationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataDestinationType object, or null if unable to parse.
     */
    @JsonCreator
    public static DataDestinationType fromString(String value) {
        DataDestinationType[] items = DataDestinationType.values();
        for (DataDestinationType item : items) {
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
