// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters of a Capacity Reservation Profile. */
@Fluent
public final class CapacityReservationProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationProfile.class);

    /*
     * Describes the parameter of capacity Reservation resource id that can be
     * used for allocating the virtual machine. <br><br> NOTE:Please refer
     * https://aka.ms/CapacityReservation for more details.
     */
    @JsonProperty(value = "capacityReservationGroup")
    private SubResource capacityReservationGroup;

    /**
     * Get the capacityReservationGroup property: Describes the parameter of capacity Reservation resource id that can
     * be used for allocating the virtual machine. &lt;br&gt;&lt;br&gt; NOTE:Please refer
     * https://aka.ms/CapacityReservation for more details.
     *
     * @return the capacityReservationGroup value.
     */
    public SubResource capacityReservationGroup() {
        return this.capacityReservationGroup;
    }

    /**
     * Set the capacityReservationGroup property: Describes the parameter of capacity Reservation resource id that can
     * be used for allocating the virtual machine. &lt;br&gt;&lt;br&gt; NOTE:Please refer
     * https://aka.ms/CapacityReservation for more details.
     *
     * @param capacityReservationGroup the capacityReservationGroup value to set.
     * @return the CapacityReservationProfile object itself.
     */
    public CapacityReservationProfile withCapacityReservationGroup(SubResource capacityReservationGroup) {
        this.capacityReservationGroup = capacityReservationGroup;
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
