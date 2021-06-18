// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the Capacity Reservation group that the Capacity Reservation should be assigned to. Only
 * tags can be updated.
 */
@JsonFlatten
@Immutable
public class CapacityReservationGroupUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationGroupUpdate.class);

    /*
     * A list of references to all capacity reservations in the capacity
     * reservation group.
     */
    @JsonProperty(value = "properties.capacityReservations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> capacityReservations;

    /*
     * A list of references to all virtual machines associated to the capacity
     * reservation group.
     */
    @JsonProperty(value = "properties.virtualMachinesAssociated", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachinesAssociated;

    /*
     * The Capacity Reservation group instance view, which has the list of
     * instance view of the Capacity Reservations under the Capacity
     * Reservation group.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private CapacityReservationGroupInstanceView instanceView;

    /**
     * Get the capacityReservations property: A list of references to all capacity reservations in the capacity
     * reservation group.
     *
     * @return the capacityReservations value.
     */
    public List<SubResourceReadOnly> capacityReservations() {
        return this.capacityReservations;
    }

    /**
     * Get the virtualMachinesAssociated property: A list of references to all virtual machines associated to the
     * capacity reservation group.
     *
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }

    /**
     * Get the instanceView property: The Capacity Reservation group instance view, which has the list of instance view
     * of the Capacity Reservations under the Capacity Reservation group.
     *
     * @return the instanceView value.
     */
    public CapacityReservationGroupInstanceView instanceView() {
        return this.instanceView;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (capacityReservations() != null) {
            capacityReservations().forEach(e -> e.validate());
        }
        if (virtualMachinesAssociated() != null) {
            virtualMachinesAssociated().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
