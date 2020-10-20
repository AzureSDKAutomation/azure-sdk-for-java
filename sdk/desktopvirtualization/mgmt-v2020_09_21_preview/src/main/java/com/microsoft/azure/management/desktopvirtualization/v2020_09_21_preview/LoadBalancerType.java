/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LoadBalancerType.
 */
public final class LoadBalancerType extends ExpandableStringEnum<LoadBalancerType> {
    /** Static value BreadthFirst for LoadBalancerType. */
    public static final LoadBalancerType BREADTH_FIRST = fromString("BreadthFirst");

    /** Static value DepthFirst for LoadBalancerType. */
    public static final LoadBalancerType DEPTH_FIRST = fromString("DepthFirst");

    /** Static value Persistent for LoadBalancerType. */
    public static final LoadBalancerType PERSISTENT = fromString("Persistent");

    /**
     * Creates or finds a LoadBalancerType from its string representation.
     * @param name a name to look for
     * @return the corresponding LoadBalancerType
     */
    @JsonCreator
    public static LoadBalancerType fromString(String name) {
        return fromString(name, LoadBalancerType.class);
    }

    /**
     * @return known LoadBalancerType values
     */
    public static Collection<LoadBalancerType> values() {
        return values(LoadBalancerType.class);
    }
}
