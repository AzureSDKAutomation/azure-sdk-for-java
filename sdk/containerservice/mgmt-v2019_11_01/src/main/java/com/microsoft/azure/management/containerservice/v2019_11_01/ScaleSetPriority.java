/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScaleSetPriority.
 */
public final class ScaleSetPriority extends ExpandableStringEnum<ScaleSetPriority> {
    /** Static value Low for ScaleSetPriority. */
    public static final ScaleSetPriority LOW = fromString("Low");

    /** Static value Regular for ScaleSetPriority. */
    public static final ScaleSetPriority REGULAR = fromString("Regular");

    /**
     * Creates or finds a ScaleSetPriority from its string representation.
     * @param name a name to look for
     * @return the corresponding ScaleSetPriority
     */
    @JsonCreator
    public static ScaleSetPriority fromString(String name) {
        return fromString(name, ScaleSetPriority.class);
    }

    /**
     * @return known ScaleSetPriority values
     */
    public static Collection<ScaleSetPriority> values() {
        return values(ScaleSetPriority.class);
    }
}
