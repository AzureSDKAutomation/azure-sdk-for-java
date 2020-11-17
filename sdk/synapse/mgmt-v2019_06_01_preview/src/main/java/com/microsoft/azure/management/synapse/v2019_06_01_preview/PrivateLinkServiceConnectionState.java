/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection state details of the private endpoint.
 */
public class PrivateLinkServiceConnectionState {
    /**
     * The private link service connection status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The private link service connection description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The actions required for private link service connection.
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /**
     * Get the private link service connection status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the private link service connection status.
     *
     * @param status the status value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the private link service connection description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the private link service connection description.
     *
     * @param description the description value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actions required for private link service connection.
     *
     * @return the actionsRequired value
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

}
