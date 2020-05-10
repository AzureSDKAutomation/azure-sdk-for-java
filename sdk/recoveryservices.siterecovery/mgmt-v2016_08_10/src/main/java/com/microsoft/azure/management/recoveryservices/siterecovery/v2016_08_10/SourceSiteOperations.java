/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SourceSiteOperations.
 */
public enum SourceSiteOperations {
    /** Enum value Required. */
    REQUIRED("Required"),

    /** Enum value NotRequired. */
    NOT_REQUIRED("NotRequired");

    /** The actual serialized value for a SourceSiteOperations instance. */
    private String value;

    SourceSiteOperations(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SourceSiteOperations instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SourceSiteOperations object, or null if unable to parse.
     */
    @JsonCreator
    public static SourceSiteOperations fromString(String value) {
        SourceSiteOperations[] items = SourceSiteOperations.values();
        for (SourceSiteOperations item : items) {
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
