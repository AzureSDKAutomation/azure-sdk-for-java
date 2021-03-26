// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource management error additional info. */
@Immutable
public final class ErrorAdditionalInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorAdditionalInfo.class);

    /*
     * The additional info type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The additional info.
     */
    @JsonProperty(value = "info", access = JsonProperty.Access.WRITE_ONLY)
    private Object info;

    /**
     * Get the type property: The additional info type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the info property: The additional info.
     *
     * @return the info value.
     */
    public Object info() {
        return this.info;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
