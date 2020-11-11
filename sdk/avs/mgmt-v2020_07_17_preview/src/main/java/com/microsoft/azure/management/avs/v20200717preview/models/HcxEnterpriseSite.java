/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An HCX Enterprise Site resource.
 */
@JsonFlatten
public class HcxEnterpriseSite extends ProxyResource {
    /**
     * The activation key.
     */
    @JsonProperty(value = "properties.activationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String activationKey;

    /**
     * The status of the HCX Enterprise Site. Possible values include:
     * 'Available', 'Consumed', 'Deactivated', 'Deleted'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private HcxEnterpriseSiteStatus status;

    /**
     * Get the activation key.
     *
     * @return the activationKey value
     */
    public String activationKey() {
        return this.activationKey;
    }

    /**
     * Get the status of the HCX Enterprise Site. Possible values include: 'Available', 'Consumed', 'Deactivated', 'Deleted'.
     *
     * @return the status value
     */
    public HcxEnterpriseSiteStatus status() {
        return this.status;
    }

}
