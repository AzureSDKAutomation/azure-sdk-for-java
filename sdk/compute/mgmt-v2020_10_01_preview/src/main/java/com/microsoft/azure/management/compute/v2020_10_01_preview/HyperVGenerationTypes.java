/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HyperVGenerationTypes.
 */
public final class HyperVGenerationTypes extends ExpandableStringEnum<HyperVGenerationTypes> {
    /** Static value V1 for HyperVGenerationTypes. */
    public static final HyperVGenerationTypes V1 = fromString("V1");

    /** Static value V2 for HyperVGenerationTypes. */
    public static final HyperVGenerationTypes V2 = fromString("V2");

    /**
     * Creates or finds a HyperVGenerationTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding HyperVGenerationTypes
     */
    @JsonCreator
    public static HyperVGenerationTypes fromString(String name) {
        return fromString(name, HyperVGenerationTypes.class);
    }

    /**
     * @return known HyperVGenerationTypes values
     */
    public static Collection<HyperVGenerationTypes> values() {
        return values(HyperVGenerationTypes.class);
    }
}