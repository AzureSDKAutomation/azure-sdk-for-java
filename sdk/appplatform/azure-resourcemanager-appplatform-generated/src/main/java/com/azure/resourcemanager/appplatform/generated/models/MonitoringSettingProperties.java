// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Monitoring Setting properties payload. */
@Fluent
public final class MonitoringSettingProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitoringSettingProperties.class);

    /*
     * State of the Monitoring Setting.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private MonitoringSettingState provisioningState;

    /*
     * Error when apply Monitoring Setting changes.
     */
    @JsonProperty(value = "error")
    private Error error;

    /*
     * Indicates whether enable the trace functionality, which will be
     * deprecated since api version 2020-11-01-preview. Please leverage
     * appInsightsInstrumentationKey to indicate if monitoringSettings enabled
     * or not
     */
    @JsonProperty(value = "traceEnabled")
    private Boolean traceEnabled;

    /*
     * Target application insight instrumentation key, null or whitespace
     * include empty will disable monitoringSettings
     */
    @JsonProperty(value = "appInsightsInstrumentationKey")
    private String appInsightsInstrumentationKey;

    /*
     * Indicates the sampling rate of application insight agent, should be in
     * range [0.0, 100.0]
     */
    @JsonProperty(value = "appInsightsSamplingRate")
    private Double appInsightsSamplingRate;

    /*
     * Indicates the versions of application insight agent
     */
    @JsonProperty(value = "appInsightsAgentVersions")
    private ApplicationInsightsAgentVersions appInsightsAgentVersions;

    /**
     * Get the provisioningState property: State of the Monitoring Setting.
     *
     * @return the provisioningState value.
     */
    public MonitoringSettingState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the error property: Error when apply Monitoring Setting changes.
     *
     * @return the error value.
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set the error property: Error when apply Monitoring Setting changes.
     *
     * @param error the error value to set.
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the traceEnabled property: Indicates whether enable the trace functionality, which will be deprecated since
     * api version 2020-11-01-preview. Please leverage appInsightsInstrumentationKey to indicate if monitoringSettings
     * enabled or not.
     *
     * @return the traceEnabled value.
     */
    public Boolean traceEnabled() {
        return this.traceEnabled;
    }

    /**
     * Set the traceEnabled property: Indicates whether enable the trace functionality, which will be deprecated since
     * api version 2020-11-01-preview. Please leverage appInsightsInstrumentationKey to indicate if monitoringSettings
     * enabled or not.
     *
     * @param traceEnabled the traceEnabled value to set.
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withTraceEnabled(Boolean traceEnabled) {
        this.traceEnabled = traceEnabled;
        return this;
    }

    /**
     * Get the appInsightsInstrumentationKey property: Target application insight instrumentation key, null or
     * whitespace include empty will disable monitoringSettings.
     *
     * @return the appInsightsInstrumentationKey value.
     */
    public String appInsightsInstrumentationKey() {
        return this.appInsightsInstrumentationKey;
    }

    /**
     * Set the appInsightsInstrumentationKey property: Target application insight instrumentation key, null or
     * whitespace include empty will disable monitoringSettings.
     *
     * @param appInsightsInstrumentationKey the appInsightsInstrumentationKey value to set.
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withAppInsightsInstrumentationKey(String appInsightsInstrumentationKey) {
        this.appInsightsInstrumentationKey = appInsightsInstrumentationKey;
        return this;
    }

    /**
     * Get the appInsightsSamplingRate property: Indicates the sampling rate of application insight agent, should be in
     * range [0.0, 100.0].
     *
     * @return the appInsightsSamplingRate value.
     */
    public Double appInsightsSamplingRate() {
        return this.appInsightsSamplingRate;
    }

    /**
     * Set the appInsightsSamplingRate property: Indicates the sampling rate of application insight agent, should be in
     * range [0.0, 100.0].
     *
     * @param appInsightsSamplingRate the appInsightsSamplingRate value to set.
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withAppInsightsSamplingRate(Double appInsightsSamplingRate) {
        this.appInsightsSamplingRate = appInsightsSamplingRate;
        return this;
    }

    /**
     * Get the appInsightsAgentVersions property: Indicates the versions of application insight agent.
     *
     * @return the appInsightsAgentVersions value.
     */
    public ApplicationInsightsAgentVersions appInsightsAgentVersions() {
        return this.appInsightsAgentVersions;
    }

    /**
     * Set the appInsightsAgentVersions property: Indicates the versions of application insight agent.
     *
     * @param appInsightsAgentVersions the appInsightsAgentVersions value to set.
     * @return the MonitoringSettingProperties object itself.
     */
    public MonitoringSettingProperties withAppInsightsAgentVersions(
        ApplicationInsightsAgentVersions appInsightsAgentVersions) {
        this.appInsightsAgentVersions = appInsightsAgentVersions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
        if (appInsightsAgentVersions() != null) {
            appInsightsAgentVersions().validate();
        }
    }
}
