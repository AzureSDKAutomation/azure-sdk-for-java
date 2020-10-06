/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DefaultAction.
 */
public enum DefaultAction {
    /** Enum value Allow. */
    ALLOW("Allow"),

    /** Enum value Deny. */
    DENY("Deny");

    /** The actual serialized value for a DefaultAction instance. */
    private String value;

    DefaultAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DefaultAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DefaultAction object, or null if unable to parse.
     */
    @JsonCreator
    public static DefaultAction fromString(String value) {
        DefaultAction[] items = DefaultAction.values();
        for (DefaultAction item : items) {
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
