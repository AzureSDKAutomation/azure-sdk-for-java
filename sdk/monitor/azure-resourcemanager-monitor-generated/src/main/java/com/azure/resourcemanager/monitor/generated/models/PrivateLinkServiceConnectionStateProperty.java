// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** State of the private endpoint connection. */
@Fluent
public final class PrivateLinkServiceConnectionStateProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionStateProperty.class);

    /*
     * The private link service connection status.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * The private link service connection description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * The actions required for private link service connection.
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /**
     * Get the status property: The private link service connection status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionStateProperty object itself.
     */
    public PrivateLinkServiceConnectionStateProperty withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The private link service connection description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The private link service connection description.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionStateProperty object itself.
     */
    public PrivateLinkServiceConnectionStateProperty withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: The actions required for private link service connection.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model PrivateLinkServiceConnectionStateProperty"));
        }
        if (description() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property description in model PrivateLinkServiceConnectionStateProperty"));
        }
    }
}
