// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualHubRouteTableV2 route. */
@Fluent
public final class VirtualHubRouteV2 {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubRouteV2.class);

    /*
     * The type of destinations.
     */
    @JsonProperty(value = "destinationType")
    private String destinationType;

    /*
     * List of all destinations.
     */
    @JsonProperty(value = "destinations")
    private List<String> destinations;

    /*
     * The type of next hops.
     */
    @JsonProperty(value = "nextHopType")
    private String nextHopType;

    /*
     * NextHops ip address.
     */
    @JsonProperty(value = "nextHops")
    private List<String> nextHops;

    /**
     * Get the destinationType property: The type of destinations.
     *
     * @return the destinationType value.
     */
    public String destinationType() {
        return this.destinationType;
    }

    /**
     * Set the destinationType property: The type of destinations.
     *
     * @param destinationType the destinationType value to set.
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * Get the destinations property: List of all destinations.
     *
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of all destinations.
     *
     * @param destinations the destinations value to set.
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the nextHopType property: The type of next hops.
     *
     * @return the nextHopType value.
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType property: The type of next hops.
     *
     * @param nextHopType the nextHopType value to set.
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get the nextHops property: NextHops ip address.
     *
     * @return the nextHops value.
     */
    public List<String> nextHops() {
        return this.nextHops;
    }

    /**
     * Set the nextHops property: NextHops ip address.
     *
     * @param nextHops the nextHops value to set.
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withNextHops(List<String> nextHops) {
        this.nextHops = nextHops;
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
