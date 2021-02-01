// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExtendedLocationTypes. */
public final class ExtendedLocationTypes extends ExpandableStringEnum<ExtendedLocationTypes> {
    /** Static value EdgeZone for ExtendedLocationTypes. */
    public static final ExtendedLocationTypes EDGE_ZONE = fromString("EdgeZone");

    /**
     * Creates or finds a ExtendedLocationTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExtendedLocationTypes.
     */
    @JsonCreator
    public static ExtendedLocationTypes fromString(String name) {
        return fromString(name, ExtendedLocationTypes.class);
    }

    /** @return known ExtendedLocationTypes values. */
    public static Collection<ExtendedLocationTypes> values() {
        return values(ExtendedLocationTypes.class);
    }
}
