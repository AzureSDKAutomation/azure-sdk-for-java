// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeepCreatedOrigin model. */
@JsonFlatten
@Fluent
public class DeepCreatedOrigin {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeepCreatedOrigin.class);

    /*
     * Origin name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The address of the origin. It can be a domain name, IPv4 address, or
     * IPv6 address.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * The value of the HTTP port. Must be between 1 and 65535
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /*
     * The value of the HTTPS port. Must be between 1 and 65535
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /**
     * Get the name property: Origin name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Origin name.
     *
     * @param name the name value to set.
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the hostname property: The address of the origin. It can be a domain name, IPv4 address, or IPv6 address.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The address of the origin. It can be a domain name, IPv4 address, or IPv6 address.
     *
     * @param hostname the hostname value to set.
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set.
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set.
     * @return the DeepCreatedOrigin object itself.
     */
    public DeepCreatedOrigin withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DeepCreatedOrigin"));
        }
    }
}
