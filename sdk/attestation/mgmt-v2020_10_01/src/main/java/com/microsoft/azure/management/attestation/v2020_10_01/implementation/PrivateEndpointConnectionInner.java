/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01.implementation;

import com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnectionProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The Private Endpoint Connection resource.
 */
@JsonFlatten
public class PrivateEndpointConnectionInner extends ProxyResource {
    /**
     * Provisioning state of the private endpoint connection. Possible values
     * include: 'Succeeded', 'Creating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /**
     * Get provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}