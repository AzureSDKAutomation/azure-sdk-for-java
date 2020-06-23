/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body to get the configuration for the region.
 */
public class RegionConfigurationRequest {
    /**
     * Request body to get the availability for scheduling orders.
     */
    @JsonProperty(value = "scheduleAvailabilityRequest", required = true)
    private ScheduleAvailabilityRequest scheduleAvailabilityRequest;

    /**
     * Request body to get the transport availability for given sku.
     */
    @JsonProperty(value = "transportAvailabilityRequest")
    private TransportAvailabilityRequest transportAvailabilityRequest;

    /**
     * Get request body to get the availability for scheduling orders.
     *
     * @return the scheduleAvailabilityRequest value
     */
    public ScheduleAvailabilityRequest scheduleAvailabilityRequest() {
        return this.scheduleAvailabilityRequest;
    }

    /**
     * Set request body to get the availability for scheduling orders.
     *
     * @param scheduleAvailabilityRequest the scheduleAvailabilityRequest value to set
     * @return the RegionConfigurationRequest object itself.
     */
    public RegionConfigurationRequest withScheduleAvailabilityRequest(ScheduleAvailabilityRequest scheduleAvailabilityRequest) {
        this.scheduleAvailabilityRequest = scheduleAvailabilityRequest;
        return this;
    }

    /**
     * Get request body to get the transport availability for given sku.
     *
     * @return the transportAvailabilityRequest value
     */
    public TransportAvailabilityRequest transportAvailabilityRequest() {
        return this.transportAvailabilityRequest;
    }

    /**
     * Set request body to get the transport availability for given sku.
     *
     * @param transportAvailabilityRequest the transportAvailabilityRequest value to set
     * @return the RegionConfigurationRequest object itself.
     */
    public RegionConfigurationRequest withTransportAvailabilityRequest(TransportAvailabilityRequest transportAvailabilityRequest) {
        this.transportAvailabilityRequest = transportAvailabilityRequest;
        return this;
    }

}
