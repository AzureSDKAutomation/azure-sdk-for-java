// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Delegated controller resource. */
@Immutable
public final class DelegatedControllerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DelegatedControllerProperties.class);

    /*
     * Resource guid.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The current state of dnc controller resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ControllerState provisioningState;

    /*
     * dnc application id should be used by customer to authenticate with dnc
     * gateway.
     */
    @JsonProperty(value = "dncAppId", access = JsonProperty.Access.WRITE_ONLY)
    private String dncAppId;

    /*
     * tenant id of dnc application id
     */
    @JsonProperty(value = "dncTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String dncTenantId;

    /*
     * dnc endpoint url that customers can use to connect to
     */
    @JsonProperty(value = "dncEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String dncEndpoint;

    /**
     * Get the resourceGuid property: Resource guid.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The current state of dnc controller resource.
     *
     * @return the provisioningState value.
     */
    public ControllerState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dncAppId property: dnc application id should be used by customer to authenticate with dnc gateway.
     *
     * @return the dncAppId value.
     */
    public String dncAppId() {
        return this.dncAppId;
    }

    /**
     * Get the dncTenantId property: tenant id of dnc application id.
     *
     * @return the dncTenantId value.
     */
    public String dncTenantId() {
        return this.dncTenantId;
    }

    /**
     * Get the dncEndpoint property: dnc endpoint url that customers can use to connect to.
     *
     * @return the dncEndpoint value.
     */
    public String dncEndpoint() {
        return this.dncEndpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
