// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DimensionScope. */
public final class DimensionScope extends ExpandableStringEnum<DimensionScope> {
    /** Static value Workspace for DimensionScope. */
    public static final DimensionScope WORKSPACE = fromString("Workspace");

    /** Static value Subscription for DimensionScope. */
    public static final DimensionScope SUBSCRIPTION = fromString("Subscription");

    /**
     * Creates or finds a DimensionScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DimensionScope.
     */
    @JsonCreator
    public static DimensionScope fromString(String name) {
        return fromString(name, DimensionScope.class);
    }

    /** @return known DimensionScope values. */
    public static Collection<DimensionScope> values() {
        return values(DimensionScope.class);
    }
}
