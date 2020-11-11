/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents the approval state of the private link connection.
 */
public class PrivateLinkServiceConnectionState {
    /**
     * Indicates whether the connection has been approved, rejected or removed
     * by the key vault owner. Possible values include: 'Pending', 'Approved',
     * 'Rejected', 'Disconnected'.
     */
    @JsonProperty(value = "status")
    private PrivateEndpointServiceConnectionStatus status;

    /**
     * The reason for approval or rejection.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get indicates whether the connection has been approved, rejected or removed by the key vault owner. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @return the status value
     */
    public PrivateEndpointServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set indicates whether the connection has been approved, rejected or removed by the key vault owner. Possible values include: 'Pending', 'Approved', 'Rejected', 'Disconnected'.
     *
     * @param status the status value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the reason for approval or rejection.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the reason for approval or rejection.
     *
     * @param description the description value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get a message indicating if changes on the service provider require any updates on the consumer.
     *
     * @return the actionsRequired value
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set a message indicating if changes on the service provider require any updates on the consumer.
     *
     * @param actionsRequired the actionsRequired value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

}
