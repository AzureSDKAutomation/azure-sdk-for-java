// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IpAllocationMethod. */
public final class IpAllocationMethod extends ExpandableStringEnum<IpAllocationMethod> {
    /** Static value Static for IpAllocationMethod. */
    public static final IpAllocationMethod STATIC = fromString("Static");

    /** Static value Dynamic for IpAllocationMethod. */
    public static final IpAllocationMethod DYNAMIC = fromString("Dynamic");

    /**
     * Creates or finds a IpAllocationMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpAllocationMethod.
     */
    @JsonCreator
    public static IpAllocationMethod fromString(String name) {
        return fromString(name, IpAllocationMethod.class);
    }

    /** @return known IpAllocationMethod values. */
    public static Collection<IpAllocationMethod> values() {
        return values(IpAllocationMethod.class);
    }
}
