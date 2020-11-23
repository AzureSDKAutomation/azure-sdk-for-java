/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ViewChargesPolicy.
 */
public final class ViewChargesPolicy extends ExpandableStringEnum<ViewChargesPolicy> {
    /** Static value Allowed for ViewChargesPolicy. */
    public static final ViewChargesPolicy ALLOWED = fromString("Allowed");

    /** Static value NotAllowed for ViewChargesPolicy. */
    public static final ViewChargesPolicy NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates or finds a ViewChargesPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding ViewChargesPolicy
     */
    @JsonCreator
    public static ViewChargesPolicy fromString(String name) {
        return fromString(name, ViewChargesPolicy.class);
    }

    /**
     * @return known ViewChargesPolicy values
     */
    public static Collection<ViewChargesPolicy> values() {
        return values(ViewChargesPolicy.class);
    }
}
