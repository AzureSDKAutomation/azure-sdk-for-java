// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterSkuName. */
public final class ClusterSkuName extends ExpandableStringEnum<ClusterSkuName> {
    /** Static value Dedicated for ClusterSkuName. */
    public static final ClusterSkuName DEDICATED = fromString("Dedicated");

    /**
     * Creates or finds a ClusterSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterSkuName.
     */
    @JsonCreator
    public static ClusterSkuName fromString(String name) {
        return fromString(name, ClusterSkuName.class);
    }

    /** @return known ClusterSkuName values. */
    public static Collection<ClusterSkuName> values() {
        return values(ClusterSkuName.class);
    }
}
