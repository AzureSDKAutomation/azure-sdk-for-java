// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Preferences related to the shipment logistics of the sku. */
@Fluent
public final class TransportPreferences {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TransportPreferences.class);

    /*
     * Indicates Shipment Logistics type that the customer preferred.
     */
    @JsonProperty(value = "preferredShipmentType", required = true)
    private TransportShipmentTypes preferredShipmentType;

    /**
     * Get the preferredShipmentType property: Indicates Shipment Logistics type that the customer preferred.
     *
     * @return the preferredShipmentType value.
     */
    public TransportShipmentTypes preferredShipmentType() {
        return this.preferredShipmentType;
    }

    /**
     * Set the preferredShipmentType property: Indicates Shipment Logistics type that the customer preferred.
     *
     * @param preferredShipmentType the preferredShipmentType value to set.
     * @return the TransportPreferences object itself.
     */
    public TransportPreferences withPreferredShipmentType(TransportShipmentTypes preferredShipmentType) {
        this.preferredShipmentType = preferredShipmentType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (preferredShipmentType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property preferredShipmentType in model TransportPreferences"));
        }
    }
}
