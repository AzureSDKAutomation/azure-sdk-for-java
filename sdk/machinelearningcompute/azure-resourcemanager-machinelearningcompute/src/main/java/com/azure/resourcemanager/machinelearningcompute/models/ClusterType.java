// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterType. */
public final class ClusterType extends ExpandableStringEnum<ClusterType> {
    /** Static value ACS for ClusterType. */
    public static final ClusterType ACS = fromString("ACS");

    /** Static value Local for ClusterType. */
    public static final ClusterType LOCAL = fromString("Local");

    /**
     * Creates or finds a ClusterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterType.
     */
    @JsonCreator
    public static ClusterType fromString(String name) {
        return fromString(name, ClusterType.class);
    }

    /** @return known ClusterType values. */
    public static Collection<ClusterType> values() {
        return values(ClusterType.class);
    }
}
