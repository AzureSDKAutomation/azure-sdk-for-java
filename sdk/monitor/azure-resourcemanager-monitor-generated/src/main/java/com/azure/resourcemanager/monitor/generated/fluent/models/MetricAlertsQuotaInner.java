// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The metric alerts quota. */
@Fluent
public final class MetricAlertsQuotaInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricAlertsQuotaInner.class);

    /*
     * The maximum number of alert rules allowed per subscription.
     */
    @JsonProperty(value = "maxAlertRulesPerSubscription", required = true)
    private float maxAlertRulesPerSubscription;

    /*
     * The maximum number of time series allowed per alert rule.
     */
    @JsonProperty(value = "maxTimeSeriesPerAlertRule", required = true)
    private float maxTimeSeriesPerAlertRule;

    /**
     * Get the maxAlertRulesPerSubscription property: The maximum number of alert rules allowed per subscription.
     *
     * @return the maxAlertRulesPerSubscription value.
     */
    public float maxAlertRulesPerSubscription() {
        return this.maxAlertRulesPerSubscription;
    }

    /**
     * Set the maxAlertRulesPerSubscription property: The maximum number of alert rules allowed per subscription.
     *
     * @param maxAlertRulesPerSubscription the maxAlertRulesPerSubscription value to set.
     * @return the MetricAlertsQuotaInner object itself.
     */
    public MetricAlertsQuotaInner withMaxAlertRulesPerSubscription(float maxAlertRulesPerSubscription) {
        this.maxAlertRulesPerSubscription = maxAlertRulesPerSubscription;
        return this;
    }

    /**
     * Get the maxTimeSeriesPerAlertRule property: The maximum number of time series allowed per alert rule.
     *
     * @return the maxTimeSeriesPerAlertRule value.
     */
    public float maxTimeSeriesPerAlertRule() {
        return this.maxTimeSeriesPerAlertRule;
    }

    /**
     * Set the maxTimeSeriesPerAlertRule property: The maximum number of time series allowed per alert rule.
     *
     * @param maxTimeSeriesPerAlertRule the maxTimeSeriesPerAlertRule value to set.
     * @return the MetricAlertsQuotaInner object itself.
     */
    public MetricAlertsQuotaInner withMaxTimeSeriesPerAlertRule(float maxTimeSeriesPerAlertRule) {
        this.maxTimeSeriesPerAlertRule = maxTimeSeriesPerAlertRule;
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
