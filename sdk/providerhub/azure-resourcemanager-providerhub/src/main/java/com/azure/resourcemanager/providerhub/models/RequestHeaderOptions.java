// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RequestHeaderOptions model. */
@Fluent
public class RequestHeaderOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequestHeaderOptions.class);

    /*
     * The optInHeaders property.
     */
    @JsonProperty(value = "optInHeaders")
    private OptInHeaderType optInHeaders;

    /**
     * Get the optInHeaders property: The optInHeaders property.
     *
     * @return the optInHeaders value.
     */
    public OptInHeaderType optInHeaders() {
        return this.optInHeaders;
    }

    /**
     * Set the optInHeaders property: The optInHeaders property.
     *
     * @param optInHeaders the optInHeaders value to set.
     * @return the RequestHeaderOptions object itself.
     */
    public RequestHeaderOptions withOptInHeaders(OptInHeaderType optInHeaders) {
        this.optInHeaders = optInHeaders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
