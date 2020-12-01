/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An enrollment account resource.
 */
@JsonFlatten
public class EnrollmentAccountSummaryInner extends ProxyResource {
    /**
     * The account owner's principal name.
     */
    @JsonProperty(value = "properties.principalName", access = JsonProperty.Access.WRITE_ONLY)
    private String principalName;

    /**
     * Get the account owner's principal name.
     *
     * @return the principalName value
     */
    public String principalName() {
        return this.principalName;
    }

}
