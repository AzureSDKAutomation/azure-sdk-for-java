// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.windowsiot.models;

import com.azure.resourcemanager.windowsiot.fluent.models.DeviceServiceNameAvailabilityInfoInner;

/** An immutable client-side representation of DeviceServiceNameAvailabilityInfo. */
public interface DeviceServiceNameAvailabilityInfo {
    /**
     * Gets the nameAvailable property: The value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason for unavailability.
     *
     * @return the reason value.
     */
    ServiceNameUnavailabilityReason reason();

    /**
     * Gets the message property: The detailed reason message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.windowsiot.fluent.models.DeviceServiceNameAvailabilityInfoInner object.
     *
     * @return the inner object.
     */
    DeviceServiceNameAvailabilityInfoInner innerModel();
}
