// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the threshold for declaring a test successful. */
@Fluent
public final class ConnectionMonitorSuccessThreshold {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorSuccessThreshold.class);

    /*
     * The maximum percentage of failed checks permitted for a test to evaluate
     * as successful.
     */
    @JsonProperty(value = "checksFailedPercent")
    private Integer checksFailedPercent;

    /*
     * The maximum round-trip time in milliseconds permitted for a test to
     * evaluate as successful.
     */
    @JsonProperty(value = "roundTripTimeMs")
    private Float roundTripTimeMs;

    /**
     * Get the checksFailedPercent property: The maximum percentage of failed checks permitted for a test to evaluate as
     * successful.
     *
     * @return the checksFailedPercent value.
     */
    public Integer checksFailedPercent() {
        return this.checksFailedPercent;
    }

    /**
     * Set the checksFailedPercent property: The maximum percentage of failed checks permitted for a test to evaluate as
     * successful.
     *
     * @param checksFailedPercent the checksFailedPercent value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withChecksFailedPercent(Integer checksFailedPercent) {
        this.checksFailedPercent = checksFailedPercent;
        return this;
    }

    /**
     * Get the roundTripTimeMs property: The maximum round-trip time in milliseconds permitted for a test to evaluate as
     * successful.
     *
     * @return the roundTripTimeMs value.
     */
    public Float roundTripTimeMs() {
        return this.roundTripTimeMs;
    }

    /**
     * Set the roundTripTimeMs property: The maximum round-trip time in milliseconds permitted for a test to evaluate as
     * successful.
     *
     * @param roundTripTimeMs the roundTripTimeMs value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withRoundTripTimeMs(Float roundTripTimeMs) {
        this.roundTripTimeMs = roundTripTimeMs;
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
