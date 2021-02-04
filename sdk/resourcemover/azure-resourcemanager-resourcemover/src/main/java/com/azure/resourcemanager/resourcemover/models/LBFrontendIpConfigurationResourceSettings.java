// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines load balancer frontend IP configuration properties. */
@Fluent
public final class LBFrontendIpConfigurationResourceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LBFrontendIpConfigurationResourceSettings.class);

    /*
     * Gets or sets the frontend IP configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the IP address of the Load Balancer.This is only specified
     * if a specific
     * private IP address shall be allocated from the subnet specified in
     * subnetRef.
     */
    @JsonProperty(value = "privateIpAddress")
    private String privateIpAddress;

    /*
     * Gets or sets PrivateIP allocation method (Static/Dynamic).
     */
    @JsonProperty(value = "privateIpAllocationMethod")
    private String privateIpAllocationMethod;

    /*
     * Defines reference to a proxy resource.
     */
    @JsonProperty(value = "subnet")
    private ProxyResourceReference subnet;

    /*
     * Gets or sets the csv list of zones.
     */
    @JsonProperty(value = "zones")
    private String zones;

    /**
     * Get the name property: Gets or sets the frontend IP configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the frontend IP configuration name.
     *
     * @param name the name value to set.
     * @return the LBFrontendIpConfigurationResourceSettings object itself.
     */
    public LBFrontendIpConfigurationResourceSettings withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the privateIpAddress property: Gets or sets the IP address of the Load Balancer.This is only specified if a
     * specific private IP address shall be allocated from the subnet specified in subnetRef.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Gets or sets the IP address of the Load Balancer.This is only specified if a
     * specific private IP address shall be allocated from the subnet specified in subnetRef.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the LBFrontendIpConfigurationResourceSettings object itself.
     */
    public LBFrontendIpConfigurationResourceSettings withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: Gets or sets PrivateIP allocation method (Static/Dynamic).
     *
     * @return the privateIpAllocationMethod value.
     */
    public String privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: Gets or sets PrivateIP allocation method (Static/Dynamic).
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the LBFrontendIpConfigurationResourceSettings object itself.
     */
    public LBFrontendIpConfigurationResourceSettings withPrivateIpAllocationMethod(String privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Defines reference to a proxy resource.
     *
     * @return the subnet value.
     */
    public ProxyResourceReference subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Defines reference to a proxy resource.
     *
     * @param subnet the subnet value to set.
     * @return the LBFrontendIpConfigurationResourceSettings object itself.
     */
    public LBFrontendIpConfigurationResourceSettings withSubnet(ProxyResourceReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the zones property: Gets or sets the csv list of zones.
     *
     * @return the zones value.
     */
    public String zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Gets or sets the csv list of zones.
     *
     * @param zones the zones value to set.
     * @return the LBFrontendIpConfigurationResourceSettings object itself.
     */
    public LBFrontendIpConfigurationResourceSettings withZones(String zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
    }
}
