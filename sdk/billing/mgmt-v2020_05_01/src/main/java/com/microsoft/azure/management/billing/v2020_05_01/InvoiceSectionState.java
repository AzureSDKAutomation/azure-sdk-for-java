/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InvoiceSectionState.
 */
public final class InvoiceSectionState extends ExpandableStringEnum<InvoiceSectionState> {
    /** Static value Active for InvoiceSectionState. */
    public static final InvoiceSectionState ACTIVE = fromString("Active");

    /** Static value Restricted for InvoiceSectionState. */
    public static final InvoiceSectionState RESTRICTED = fromString("Restricted");

    /**
     * Creates or finds a InvoiceSectionState from its string representation.
     * @param name a name to look for
     * @return the corresponding InvoiceSectionState
     */
    @JsonCreator
    public static InvoiceSectionState fromString(String name) {
        return fromString(name, InvoiceSectionState.class);
    }

    /**
     * @return known InvoiceSectionState values
     */
    public static Collection<InvoiceSectionState> values() {
        return values(InvoiceSectionState.class);
    }
}
