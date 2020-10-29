/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Risk.
 */
public final class Risk extends ExpandableStringEnum<Risk> {
    /** Static value Error for Risk. */
    public static final Risk ERROR = fromString("Error");

    /** Static value Warning for Risk. */
    public static final Risk WARNING = fromString("Warning");

    /** Static value None for Risk. */
    public static final Risk NONE = fromString("None");

    /**
     * Creates or finds a Risk from its string representation.
     * @param name a name to look for
     * @return the corresponding Risk
     */
    @JsonCreator
    public static Risk fromString(String name) {
        return fromString(name, Risk.class);
    }

    /**
     * @return known Risk values
     */
    public static Collection<Risk> values() {
        return values(Risk.class);
    }
}
