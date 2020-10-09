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
 * Defines values for InvoiceType.
 */
public final class InvoiceType extends ExpandableStringEnum<InvoiceType> {
    /** Static value AzureService for InvoiceType. */
    public static final InvoiceType AZURE_SERVICE = fromString("AzureService");

    /** Static value AzureMarketplace for InvoiceType. */
    public static final InvoiceType AZURE_MARKETPLACE = fromString("AzureMarketplace");

    /** Static value AzureSupport for InvoiceType. */
    public static final InvoiceType AZURE_SUPPORT = fromString("AzureSupport");

    /**
     * Creates or finds a InvoiceType from its string representation.
     * @param name a name to look for
     * @return the corresponding InvoiceType
     */
    @JsonCreator
    public static InvoiceType fromString(String name) {
        return fromString(name, InvoiceType.class);
    }

    /**
     * @return known InvoiceType values
     */
    public static Collection<InvoiceType> values() {
        return values(InvoiceType.class);
    }
}
