/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateLinkServiceConnectionStateProperty model.
 */
public class PrivateLinkServiceConnectionStateProperty {
    /**
     * The private link service connection status.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * The private link service connection description.
     */
    @JsonProperty(value = "description", required = true)
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
     * @return the PrivateLinkServiceConnectionStateProperty object itself.
     */
    public PrivateLinkServiceConnectionStateProperty withStatus(String status) {
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
     * @return the PrivateLinkServiceConnectionStateProperty object itself.
     */
    public PrivateLinkServiceConnectionStateProperty withDescription(String description) {
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
