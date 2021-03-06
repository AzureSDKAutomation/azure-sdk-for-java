// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DurabilityLevel. */
public final class DurabilityLevel extends ExpandableStringEnum<DurabilityLevel> {
    /** Static value Bronze for DurabilityLevel. */
    public static final DurabilityLevel BRONZE = fromString("Bronze");

    /** Static value Silver for DurabilityLevel. */
    public static final DurabilityLevel SILVER = fromString("Silver");

    /** Static value Gold for DurabilityLevel. */
    public static final DurabilityLevel GOLD = fromString("Gold");

    /**
     * Creates or finds a DurabilityLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DurabilityLevel.
     */
    @JsonCreator
    public static DurabilityLevel fromString(String name) {
        return fromString(name, DurabilityLevel.class);
    }

    /** @return known DurabilityLevel values. */
    public static Collection<DurabilityLevel> values() {
        return values(DurabilityLevel.class);
    }
}
