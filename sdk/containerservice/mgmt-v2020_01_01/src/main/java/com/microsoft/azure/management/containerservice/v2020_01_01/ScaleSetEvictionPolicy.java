/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScaleSetEvictionPolicy.
 */
public final class ScaleSetEvictionPolicy extends ExpandableStringEnum<ScaleSetEvictionPolicy> {
    /** Static value Delete for ScaleSetEvictionPolicy. */
    public static final ScaleSetEvictionPolicy DELETE = fromString("Delete");

    /** Static value Deallocate for ScaleSetEvictionPolicy. */
    public static final ScaleSetEvictionPolicy DEALLOCATE = fromString("Deallocate");

    /**
     * Creates or finds a ScaleSetEvictionPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding ScaleSetEvictionPolicy
     */
    @JsonCreator
    public static ScaleSetEvictionPolicy fromString(String name) {
        return fromString(name, ScaleSetEvictionPolicy.class);
    }

    /**
     * @return known ScaleSetEvictionPolicy values
     */
    public static Collection<ScaleSetEvictionPolicy> values() {
        return values(ScaleSetEvictionPolicy.class);
    }
}
