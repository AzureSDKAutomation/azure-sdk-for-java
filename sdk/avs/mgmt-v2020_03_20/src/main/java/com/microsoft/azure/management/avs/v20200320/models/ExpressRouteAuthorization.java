/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * ExpressRoute Circuit Authorization.
 */
@JsonFlatten
public class ExpressRouteAuthorization extends ProxyResource {
    /**
     * The state of the  ExpressRoute Circuit Authorization provisioning.
     * Possible values include: 'Succeeded', 'Failed', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ExpressRouteAuthorizationProvisioningState provisioningState;

    /**
     * The ID of the ExpressRoute Circuit Authorization.
     */
    @JsonProperty(value = "properties.expressRouteAuthorizationId", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRouteAuthorizationId;

    /**
     * The key of the ExpressRoute Circuit Authorization.
     */
    @JsonProperty(value = "properties.expressRouteAuthorizationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String expressRouteAuthorizationKey;

    /**
     * Get the state of the  ExpressRoute Circuit Authorization provisioning. Possible values include: 'Succeeded', 'Failed', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ExpressRouteAuthorizationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ID of the ExpressRoute Circuit Authorization.
     *
     * @return the expressRouteAuthorizationId value
     */
    public String expressRouteAuthorizationId() {
        return this.expressRouteAuthorizationId;
    }

    /**
     * Get the key of the ExpressRoute Circuit Authorization.
     *
     * @return the expressRouteAuthorizationKey value
     */
    public String expressRouteAuthorizationKey() {
        return this.expressRouteAuthorizationKey;
    }

}
