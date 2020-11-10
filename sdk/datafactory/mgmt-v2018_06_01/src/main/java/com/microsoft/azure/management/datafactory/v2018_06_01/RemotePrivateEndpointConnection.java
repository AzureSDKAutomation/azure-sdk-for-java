/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A remote private endpoint connection.
 */
public class RemotePrivateEndpointConnection {
    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * PrivateEndpoint of a remote private endpoint connection.
     */
    @JsonProperty(value = "privateEndpoint")
    private ArmIdWrapper privateEndpoint;

    /**
     * The privateLinkServiceConnectionState property.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateLinkConnectionState privateLinkServiceConnectionState;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get privateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value
     */
    public ArmIdWrapper privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set privateEndpoint of a remote private endpoint connection.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState value.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState value.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateLinkServiceConnectionState(PrivateLinkConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

}
