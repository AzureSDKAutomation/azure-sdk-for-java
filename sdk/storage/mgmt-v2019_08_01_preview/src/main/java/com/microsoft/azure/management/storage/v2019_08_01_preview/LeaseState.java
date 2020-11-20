/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LeaseState.
 */
public final class LeaseState extends ExpandableStringEnum<LeaseState> {
    /** Static value Available for LeaseState. */
    public static final LeaseState AVAILABLE = fromString("Available");

    /** Static value Leased for LeaseState. */
    public static final LeaseState LEASED = fromString("Leased");

    /** Static value Expired for LeaseState. */
    public static final LeaseState EXPIRED = fromString("Expired");

    /** Static value Breaking for LeaseState. */
    public static final LeaseState BREAKING = fromString("Breaking");

    /** Static value Broken for LeaseState. */
    public static final LeaseState BROKEN = fromString("Broken");

    /**
     * Creates or finds a LeaseState from its string representation.
     * @param name a name to look for
     * @return the corresponding LeaseState
     */
    @JsonCreator
    public static LeaseState fromString(String name) {
        return fromString(name, LeaseState.class);
    }

    /**
     * @return known LeaseState values
     */
    public static Collection<LeaseState> values() {
        return values(LeaseState.class);
    }
}
