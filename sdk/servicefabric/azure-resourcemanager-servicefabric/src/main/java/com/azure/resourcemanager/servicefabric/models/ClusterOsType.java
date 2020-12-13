// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterOsType. */
public final class ClusterOsType extends ExpandableStringEnum<ClusterOsType> {
    /** Static value Windows for ClusterOsType. */
    public static final ClusterOsType WINDOWS = fromString("Windows");

    /** Static value Ubuntu for ClusterOsType. */
    public static final ClusterOsType UBUNTU = fromString("Ubuntu");

    /** Static value RedHat for ClusterOsType. */
    public static final ClusterOsType RED_HAT = fromString("RedHat");

    /** Static value Ubuntu18_04 for ClusterOsType. */
    public static final ClusterOsType UBUNTU18_04 = fromString("Ubuntu18_04");

    /**
     * Creates or finds a ClusterOsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterOsType.
     */
    @JsonCreator
    public static ClusterOsType fromString(String name) {
        return fromString(name, ClusterOsType.class);
    }

    /** @return known ClusterOsType values. */
    public static Collection<ClusterOsType> values() {
        return values(ClusterOsType.class);
    }
}
