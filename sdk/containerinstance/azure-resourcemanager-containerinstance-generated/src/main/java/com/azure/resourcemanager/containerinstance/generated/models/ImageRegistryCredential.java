// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Image registry credential. */
@Fluent
public final class ImageRegistryCredential {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageRegistryCredential.class);

    /*
     * The Docker image registry server without a protocol such as "http" and
     * "https".
     */
    @JsonProperty(value = "server", required = true)
    private String server;

    /*
     * The username for the private registry.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The password for the private registry.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the server property: The Docker image registry server without a protocol such as "http" and "https".
     *
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: The Docker image registry server without a protocol such as "http" and "https".
     *
     * @param server the server value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username for the private registry.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username for the private registry.
     *
     * @param username the username value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for the private registry.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for the private registry.
     *
     * @param password the password value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (server() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property server in model ImageRegistryCredential"));
        }
        if (username() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property username in model ImageRegistryCredential"));
        }
    }
}
