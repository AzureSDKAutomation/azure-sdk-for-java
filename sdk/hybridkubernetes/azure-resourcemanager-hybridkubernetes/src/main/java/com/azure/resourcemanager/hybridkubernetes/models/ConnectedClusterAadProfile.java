// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AAD profile of the connected cluster. */
@Fluent
public final class ConnectedClusterAadProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedClusterAadProfile.class);

    /*
     * The aad tenant id which is configured on target K8s cluster
     */
    @JsonProperty(value = "tenantId", required = true)
    private String tenantId;

    /*
     * The client app id configured on target K8 cluster
     */
    @JsonProperty(value = "clientAppId", required = true)
    private String clientAppId;

    /*
     * The server app id to access AD server
     */
    @JsonProperty(value = "serverAppId", required = true)
    private String serverAppId;

    /**
     * Get the tenantId property: The aad tenant id which is configured on target K8s cluster.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The aad tenant id which is configured on target K8s cluster.
     *
     * @param tenantId the tenantId value to set.
     * @return the ConnectedClusterAadProfile object itself.
     */
    public ConnectedClusterAadProfile withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientAppId property: The client app id configured on target K8 cluster.
     *
     * @return the clientAppId value.
     */
    public String clientAppId() {
        return this.clientAppId;
    }

    /**
     * Set the clientAppId property: The client app id configured on target K8 cluster.
     *
     * @param clientAppId the clientAppId value to set.
     * @return the ConnectedClusterAadProfile object itself.
     */
    public ConnectedClusterAadProfile withClientAppId(String clientAppId) {
        this.clientAppId = clientAppId;
        return this;
    }

    /**
     * Get the serverAppId property: The server app id to access AD server.
     *
     * @return the serverAppId value.
     */
    public String serverAppId() {
        return this.serverAppId;
    }

    /**
     * Set the serverAppId property: The server app id to access AD server.
     *
     * @param serverAppId the serverAppId value to set.
     * @return the ConnectedClusterAadProfile object itself.
     */
    public ConnectedClusterAadProfile withServerAppId(String serverAppId) {
        this.serverAppId = serverAppId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenantId in model ConnectedClusterAadProfile"));
        }
        if (clientAppId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientAppId in model ConnectedClusterAadProfile"));
        }
        if (serverAppId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverAppId in model ConnectedClusterAadProfile"));
        }
    }
}
