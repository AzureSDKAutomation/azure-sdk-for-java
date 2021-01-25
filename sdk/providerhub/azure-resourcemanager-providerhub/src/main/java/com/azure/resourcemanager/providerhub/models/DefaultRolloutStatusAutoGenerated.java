// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The DefaultRolloutStatusAutoGenerated model. */
@Fluent
public class DefaultRolloutStatusAutoGenerated extends RolloutStatusBaseAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DefaultRolloutStatusAutoGenerated.class);

    /*
     * The nextTrafficRegion property.
     */
    @JsonProperty(value = "nextTrafficRegion")
    private TrafficRegionCategory nextTrafficRegion;

    /*
     * The nextTrafficRegionScheduledTime property.
     */
    @JsonProperty(value = "nextTrafficRegionScheduledTime")
    private OffsetDateTime nextTrafficRegionScheduledTime;

    /*
     * The subscriptionReregistrationResult property.
     */
    @JsonProperty(value = "subscriptionReregistrationResult")
    private SubscriptionReregistrationResult subscriptionReregistrationResult;

    /**
     * Get the nextTrafficRegion property: The nextTrafficRegion property.
     *
     * @return the nextTrafficRegion value.
     */
    public TrafficRegionCategory nextTrafficRegion() {
        return this.nextTrafficRegion;
    }

    /**
     * Set the nextTrafficRegion property: The nextTrafficRegion property.
     *
     * @param nextTrafficRegion the nextTrafficRegion value to set.
     * @return the DefaultRolloutStatusAutoGenerated object itself.
     */
    public DefaultRolloutStatusAutoGenerated withNextTrafficRegion(TrafficRegionCategory nextTrafficRegion) {
        this.nextTrafficRegion = nextTrafficRegion;
        return this;
    }

    /**
     * Get the nextTrafficRegionScheduledTime property: The nextTrafficRegionScheduledTime property.
     *
     * @return the nextTrafficRegionScheduledTime value.
     */
    public OffsetDateTime nextTrafficRegionScheduledTime() {
        return this.nextTrafficRegionScheduledTime;
    }

    /**
     * Set the nextTrafficRegionScheduledTime property: The nextTrafficRegionScheduledTime property.
     *
     * @param nextTrafficRegionScheduledTime the nextTrafficRegionScheduledTime value to set.
     * @return the DefaultRolloutStatusAutoGenerated object itself.
     */
    public DefaultRolloutStatusAutoGenerated withNextTrafficRegionScheduledTime(
        OffsetDateTime nextTrafficRegionScheduledTime) {
        this.nextTrafficRegionScheduledTime = nextTrafficRegionScheduledTime;
        return this;
    }

    /**
     * Get the subscriptionReregistrationResult property: The subscriptionReregistrationResult property.
     *
     * @return the subscriptionReregistrationResult value.
     */
    public SubscriptionReregistrationResult subscriptionReregistrationResult() {
        return this.subscriptionReregistrationResult;
    }

    /**
     * Set the subscriptionReregistrationResult property: The subscriptionReregistrationResult property.
     *
     * @param subscriptionReregistrationResult the subscriptionReregistrationResult value to set.
     * @return the DefaultRolloutStatusAutoGenerated object itself.
     */
    public DefaultRolloutStatusAutoGenerated withSubscriptionReregistrationResult(
        SubscriptionReregistrationResult subscriptionReregistrationResult) {
        this.subscriptionReregistrationResult = subscriptionReregistrationResult;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutStatusAutoGenerated withCompletedRegions(List<String> completedRegions) {
        super.withCompletedRegions(completedRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutStatusAutoGenerated withFailedOrSkippedRegions(
        Map<String, ExtendedErrorInfoAutoGenerated> failedOrSkippedRegions) {
        super.withFailedOrSkippedRegions(failedOrSkippedRegions);
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
    }
}
