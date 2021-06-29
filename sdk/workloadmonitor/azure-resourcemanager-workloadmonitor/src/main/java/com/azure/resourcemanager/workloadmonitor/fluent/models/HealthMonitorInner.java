// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloadmonitor.models.HealthState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the monitor’s current health status. */
@JsonFlatten
@Fluent
public class HealthMonitorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthMonitorInner.class);

    /*
     * Human-readable name of the monitor.
     */
    @JsonProperty(value = "properties.monitorName")
    private String monitorName;

    /*
     * Type of the monitor.
     */
    @JsonProperty(value = "properties.monitorType")
    private String monitorType;

    /*
     * Dynamic monitored object of the monitor.
     */
    @JsonProperty(value = "properties.monitoredObject")
    private String monitoredObject;

    /*
     * Name of the parent monitor.
     */
    @JsonProperty(value = "properties.parentMonitorName")
    private String parentMonitorName;

    /*
     * Previous health state of the monitor.
     */
    @JsonProperty(value = "properties.previousMonitorState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState previousMonitorState;

    /*
     * Current health state of the monitor.
     */
    @JsonProperty(value = "properties.currentMonitorState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState currentMonitorState;

    /*
     * Timestamp of the monitor's last health evaluation.
     */
    @JsonProperty(value = "properties.evaluationTimestamp")
    private String evaluationTimestamp;

    /*
     * Timestamp of the monitor's last health state change.
     */
    @JsonProperty(value = "properties.currentStateFirstObservedTimestamp")
    private String currentStateFirstObservedTimestamp;

    /*
     * Timestamp of the monitor's last reported health state.
     */
    @JsonProperty(value = "properties.lastReportedTimestamp")
    private String lastReportedTimestamp;

    /*
     * Evidence validating the monitor's current health state.
     */
    @JsonProperty(value = "properties.evidence")
    private Object evidence;

    /*
     * The configuration settings at the time of the monitor's health
     * evaluation.
     */
    @JsonProperty(value = "properties.monitorConfiguration")
    private Object monitorConfiguration;

    /**
     * Get the monitorName property: Human-readable name of the monitor.
     *
     * @return the monitorName value.
     */
    public String monitorName() {
        return this.monitorName;
    }

    /**
     * Set the monitorName property: Human-readable name of the monitor.
     *
     * @param monitorName the monitorName value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }

    /**
     * Get the monitorType property: Type of the monitor.
     *
     * @return the monitorType value.
     */
    public String monitorType() {
        return this.monitorType;
    }

    /**
     * Set the monitorType property: Type of the monitor.
     *
     * @param monitorType the monitorType value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }

    /**
     * Get the monitoredObject property: Dynamic monitored object of the monitor.
     *
     * @return the monitoredObject value.
     */
    public String monitoredObject() {
        return this.monitoredObject;
    }

    /**
     * Set the monitoredObject property: Dynamic monitored object of the monitor.
     *
     * @param monitoredObject the monitoredObject value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitoredObject(String monitoredObject) {
        this.monitoredObject = monitoredObject;
        return this;
    }

    /**
     * Get the parentMonitorName property: Name of the parent monitor.
     *
     * @return the parentMonitorName value.
     */
    public String parentMonitorName() {
        return this.parentMonitorName;
    }

    /**
     * Set the parentMonitorName property: Name of the parent monitor.
     *
     * @param parentMonitorName the parentMonitorName value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withParentMonitorName(String parentMonitorName) {
        this.parentMonitorName = parentMonitorName;
        return this;
    }

    /**
     * Get the previousMonitorState property: Previous health state of the monitor.
     *
     * @return the previousMonitorState value.
     */
    public HealthState previousMonitorState() {
        return this.previousMonitorState;
    }

    /**
     * Get the currentMonitorState property: Current health state of the monitor.
     *
     * @return the currentMonitorState value.
     */
    public HealthState currentMonitorState() {
        return this.currentMonitorState;
    }

    /**
     * Get the evaluationTimestamp property: Timestamp of the monitor's last health evaluation.
     *
     * @return the evaluationTimestamp value.
     */
    public String evaluationTimestamp() {
        return this.evaluationTimestamp;
    }

    /**
     * Set the evaluationTimestamp property: Timestamp of the monitor's last health evaluation.
     *
     * @param evaluationTimestamp the evaluationTimestamp value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withEvaluationTimestamp(String evaluationTimestamp) {
        this.evaluationTimestamp = evaluationTimestamp;
        return this;
    }

    /**
     * Get the currentStateFirstObservedTimestamp property: Timestamp of the monitor's last health state change.
     *
     * @return the currentStateFirstObservedTimestamp value.
     */
    public String currentStateFirstObservedTimestamp() {
        return this.currentStateFirstObservedTimestamp;
    }

    /**
     * Set the currentStateFirstObservedTimestamp property: Timestamp of the monitor's last health state change.
     *
     * @param currentStateFirstObservedTimestamp the currentStateFirstObservedTimestamp value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withCurrentStateFirstObservedTimestamp(String currentStateFirstObservedTimestamp) {
        this.currentStateFirstObservedTimestamp = currentStateFirstObservedTimestamp;
        return this;
    }

    /**
     * Get the lastReportedTimestamp property: Timestamp of the monitor's last reported health state.
     *
     * @return the lastReportedTimestamp value.
     */
    public String lastReportedTimestamp() {
        return this.lastReportedTimestamp;
    }

    /**
     * Set the lastReportedTimestamp property: Timestamp of the monitor's last reported health state.
     *
     * @param lastReportedTimestamp the lastReportedTimestamp value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withLastReportedTimestamp(String lastReportedTimestamp) {
        this.lastReportedTimestamp = lastReportedTimestamp;
        return this;
    }

    /**
     * Get the evidence property: Evidence validating the monitor's current health state.
     *
     * @return the evidence value.
     */
    public Object evidence() {
        return this.evidence;
    }

    /**
     * Set the evidence property: Evidence validating the monitor's current health state.
     *
     * @param evidence the evidence value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withEvidence(Object evidence) {
        this.evidence = evidence;
        return this;
    }

    /**
     * Get the monitorConfiguration property: The configuration settings at the time of the monitor's health evaluation.
     *
     * @return the monitorConfiguration value.
     */
    public Object monitorConfiguration() {
        return this.monitorConfiguration;
    }

    /**
     * Set the monitorConfiguration property: The configuration settings at the time of the monitor's health evaluation.
     *
     * @param monitorConfiguration the monitorConfiguration value to set.
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorConfiguration(Object monitorConfiguration) {
        this.monitorConfiguration = monitorConfiguration;
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
