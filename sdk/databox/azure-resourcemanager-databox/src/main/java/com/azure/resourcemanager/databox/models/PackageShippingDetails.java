// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Shipping details. */
@Immutable
public final class PackageShippingDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PackageShippingDetails.class);

    /*
     * Name of the carrier.
     */
    @JsonProperty(value = "carrierName", access = JsonProperty.Access.WRITE_ONLY)
    private String carrierName;

    /*
     * Tracking Id of shipment.
     */
    @JsonProperty(value = "trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /*
     * Url where shipment can be tracked.
     */
    @JsonProperty(value = "trackingUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingUrl;

    /**
     * Get the carrierName property: Name of the carrier.
     *
     * @return the carrierName value.
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Get the trackingId property: Tracking Id of shipment.
     *
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get the trackingUrl property: Url where shipment can be tracked.
     *
     * @return the trackingUrl value.
     */
    public String trackingUrl() {
        return this.trackingUrl;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
