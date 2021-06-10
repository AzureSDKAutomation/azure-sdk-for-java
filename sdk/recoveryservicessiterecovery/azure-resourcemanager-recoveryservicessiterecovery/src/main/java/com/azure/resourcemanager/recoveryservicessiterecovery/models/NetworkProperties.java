// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Properties. */
@Fluent
public final class NetworkProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProperties.class);

    /*
     * The Fabric Type.
     */
    @JsonProperty(value = "fabricType")
    private String fabricType;

    /*
     * The List of subnets.
     */
    @JsonProperty(value = "subnets")
    private List<Subnet> subnets;

    /*
     * The Friendly Name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The Network Type.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * Get the fabricType property: The Fabric Type.
     *
     * @return the fabricType value.
     */
    public String fabricType() {
        return this.fabricType;
    }

    /**
     * Set the fabricType property: The Fabric Type.
     *
     * @param fabricType the fabricType value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withFabricType(String fabricType) {
        this.fabricType = fabricType;
        return this;
    }

    /**
     * Get the subnets property: The List of subnets.
     *
     * @return the subnets value.
     */
    public List<Subnet> subnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: The List of subnets.
     *
     * @param subnets the subnets value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Get the friendlyName property: The Friendly Name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The Friendly Name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the networkType property: The Network Type.
     *
     * @return the networkType value.
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The Network Type.
     *
     * @param networkType the networkType value to set.
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
