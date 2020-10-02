/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PrefixValidationState.
 */
public final class PrefixValidationState extends ExpandableStringEnum<PrefixValidationState> {
    /** Static value None for PrefixValidationState. */
    public static final PrefixValidationState NONE = fromString("None");

    /** Static value Invalid for PrefixValidationState. */
    public static final PrefixValidationState INVALID = fromString("Invalid");

    /** Static value Verified for PrefixValidationState. */
    public static final PrefixValidationState VERIFIED = fromString("Verified");

    /** Static value Failed for PrefixValidationState. */
    public static final PrefixValidationState FAILED = fromString("Failed");

    /** Static value Pending for PrefixValidationState. */
    public static final PrefixValidationState PENDING = fromString("Pending");

    /** Static value Warning for PrefixValidationState. */
    public static final PrefixValidationState WARNING = fromString("Warning");

    /** Static value Unknown for PrefixValidationState. */
    public static final PrefixValidationState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a PrefixValidationState from its string representation.
     * @param name a name to look for
     * @return the corresponding PrefixValidationState
     */
    @JsonCreator
    public static PrefixValidationState fromString(String name) {
        return fromString(name, PrefixValidationState.class);
    }

    /**
     * @return known PrefixValidationState values
     */
    public static Collection<PrefixValidationState> values() {
        return values(PrefixValidationState.class);
    }
}
