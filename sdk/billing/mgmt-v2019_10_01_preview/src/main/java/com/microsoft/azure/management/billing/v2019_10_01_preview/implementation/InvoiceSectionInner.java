/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An invoice section.
 */
@JsonFlatten
public class InvoiceSectionInner extends ProxyResource {
    /**
     * The name of the invoice section.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get the name of the invoice section.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the invoice section.
     *
     * @param displayName the displayName value to set
     * @return the InvoiceSectionInner object itself.
     */
    public InvoiceSectionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
