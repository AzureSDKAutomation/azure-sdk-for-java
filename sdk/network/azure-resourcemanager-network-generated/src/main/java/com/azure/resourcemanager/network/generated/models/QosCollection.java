// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Differentiated Services Code Point configuration for any given network interface. */
@JsonFlatten
@Fluent
public class QosCollection extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QosCollection.class);

    /*
     * List of markings to be used in the configuration.
     */
    @JsonProperty(value = "properties.markings")
    private List<Integer> markings;

    /*
     * Source IP ranges.
     */
    @JsonProperty(value = "properties.sourceIpRanges")
    private List<QosIpRange> sourceIpRanges;

    /*
     * Destination IP ranges.
     */
    @JsonProperty(value = "properties.destinationIpRanges")
    private List<QosIpRange> destinationIpRanges;

    /*
     * Sources port ranges.
     */
    @JsonProperty(value = "properties.sourcePortRanges")
    private List<QosPortRange> sourcePortRanges;

    /*
     * Destination port ranges.
     */
    @JsonProperty(value = "properties.destinationPortRanges")
    private List<QosPortRange> destinationPortRanges;

    /*
     * RNM supported protocol types.
     */
    @JsonProperty(value = "properties.protocol")
    private ProtocolType protocol;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the markings property: List of markings to be used in the configuration.
     *
     * @return the markings value.
     */
    public List<Integer> markings() {
        return this.markings;
    }

    /**
     * Set the markings property: List of markings to be used in the configuration.
     *
     * @param markings the markings value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withMarkings(List<Integer> markings) {
        this.markings = markings;
        return this;
    }

    /**
     * Get the sourceIpRanges property: Source IP ranges.
     *
     * @return the sourceIpRanges value.
     */
    public List<QosIpRange> sourceIpRanges() {
        return this.sourceIpRanges;
    }

    /**
     * Set the sourceIpRanges property: Source IP ranges.
     *
     * @param sourceIpRanges the sourceIpRanges value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withSourceIpRanges(List<QosIpRange> sourceIpRanges) {
        this.sourceIpRanges = sourceIpRanges;
        return this;
    }

    /**
     * Get the destinationIpRanges property: Destination IP ranges.
     *
     * @return the destinationIpRanges value.
     */
    public List<QosIpRange> destinationIpRanges() {
        return this.destinationIpRanges;
    }

    /**
     * Set the destinationIpRanges property: Destination IP ranges.
     *
     * @param destinationIpRanges the destinationIpRanges value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withDestinationIpRanges(List<QosIpRange> destinationIpRanges) {
        this.destinationIpRanges = destinationIpRanges;
        return this;
    }

    /**
     * Get the sourcePortRanges property: Sources port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<QosPortRange> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: Sources port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withSourcePortRanges(List<QosPortRange> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: Destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<QosPortRange> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: Destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withDestinationPortRanges(List<QosPortRange> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the protocol property: RNM supported protocol types.
     *
     * @return the protocol value.
     */
    public ProtocolType protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: RNM supported protocol types.
     *
     * @param protocol the protocol value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withProtocol(ProtocolType protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the QosCollection object itself.
     */
    public QosCollection withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QosCollection withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QosCollection withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceIpRanges() != null) {
            sourceIpRanges().forEach(e -> e.validate());
        }
        if (destinationIpRanges() != null) {
            destinationIpRanges().forEach(e -> e.validate());
        }
        if (sourcePortRanges() != null) {
            sourcePortRanges().forEach(e -> e.validate());
        }
        if (destinationPortRanges() != null) {
            destinationPortRanges().forEach(e -> e.validate());
        }
    }
}
