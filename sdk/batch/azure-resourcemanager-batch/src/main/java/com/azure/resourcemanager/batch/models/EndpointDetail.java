// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about the connection between the Batch service and the endpoint. */
@Immutable
public final class EndpointDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointDetail.class);

    /*
     * The port an endpoint is connected to.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /**
     * Get the port property: The port an endpoint is connected to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
