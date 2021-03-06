// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CostType. */
public final class CostType extends ExpandableStringEnum<CostType> {
    /** Static value Unavailable for CostType. */
    public static final CostType UNAVAILABLE = fromString("Unavailable");

    /** Static value Reported for CostType. */
    public static final CostType REPORTED = fromString("Reported");

    /** Static value Projected for CostType. */
    public static final CostType PROJECTED = fromString("Projected");

    /**
     * Creates or finds a CostType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CostType.
     */
    @JsonCreator
    public static CostType fromString(String name) {
        return fromString(name, CostType.class);
    }

    /** @return known CostType values. */
    public static Collection<CostType> values() {
        return values(CostType.class);
    }
}
