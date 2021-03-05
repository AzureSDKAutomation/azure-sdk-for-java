// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the connection monitor endpoint. */
@Fluent
public final class ConnectionMonitorEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorEndpoint.class);

    /*
     * The name of the connection monitor endpoint.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The endpoint type.
     */
    @JsonProperty(value = "type")
    private EndpointType type;

    /*
     * Resource ID of the connection monitor endpoint.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Address of the connection monitor endpoint (IP or domain name).
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * Filter for sub-items within the endpoint.
     */
    @JsonProperty(value = "filter")
    private ConnectionMonitorEndpointFilter filter;

    /*
     * Endpoint scope.
     */
    @JsonProperty(value = "scope")
    private ConnectionMonitorEndpointScope scope;

    /*
     * Test coverage for the endpoint.
     */
    @JsonProperty(value = "coverageLevel")
    private CoverageLevel coverageLevel;

    /**
     * Get the name property: The name of the connection monitor endpoint.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the connection monitor endpoint.
     *
     * @param name the name value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The endpoint type.
     *
     * @return the type value.
     */
    public EndpointType type() {
        return this.type;
    }

    /**
     * Set the type property: The endpoint type.
     *
     * @param type the type value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withType(EndpointType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceId property: Resource ID of the connection monitor endpoint.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource ID of the connection monitor endpoint.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address property: Address of the connection monitor endpoint (IP or domain name).
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: Address of the connection monitor endpoint (IP or domain name).
     *
     * @param address the address value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the filter property: Filter for sub-items within the endpoint.
     *
     * @return the filter value.
     */
    public ConnectionMonitorEndpointFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Filter for sub-items within the endpoint.
     *
     * @param filter the filter value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withFilter(ConnectionMonitorEndpointFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the scope property: Endpoint scope.
     *
     * @return the scope value.
     */
    public ConnectionMonitorEndpointScope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Endpoint scope.
     *
     * @param scope the scope value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withScope(ConnectionMonitorEndpointScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the coverageLevel property: Test coverage for the endpoint.
     *
     * @return the coverageLevel value.
     */
    public CoverageLevel coverageLevel() {
        return this.coverageLevel;
    }

    /**
     * Set the coverageLevel property: Test coverage for the endpoint.
     *
     * @param coverageLevel the coverageLevel value to set.
     * @return the ConnectionMonitorEndpoint object itself.
     */
    public ConnectionMonitorEndpoint withCoverageLevel(CoverageLevel coverageLevel) {
        this.coverageLevel = coverageLevel;
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
                    new IllegalArgumentException("Missing required property name in model ConnectionMonitorEndpoint"));
        }
        if (filter() != null) {
            filter().validate();
        }
        if (scope() != null) {
            scope().validate();
        }
    }
}
