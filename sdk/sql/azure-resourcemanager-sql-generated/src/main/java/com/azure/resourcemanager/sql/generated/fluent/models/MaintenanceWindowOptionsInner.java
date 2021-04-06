// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindowTimeRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Maintenance window options. */
@JsonFlatten
@Fluent
public class MaintenanceWindowOptionsInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceWindowOptionsInner.class);

    /*
     * Whether maintenance windows are enabled for the database.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /*
     * Available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0,
     * 24*60}.
     */
    @JsonProperty(value = "properties.maintenanceWindowCycles")
    private List<MaintenanceWindowTimeRange> maintenanceWindowCycles;

    /*
     * Minimum duration of maintenance window.
     */
    @JsonProperty(value = "properties.minDurationInMinutes")
    private Integer minDurationInMinutes;

    /*
     * Default duration for maintenance window.
     */
    @JsonProperty(value = "properties.defaultDurationInMinutes")
    private Integer defaultDurationInMinutes;

    /*
     * Minimum number of maintenance windows cycles to be set on the database.
     */
    @JsonProperty(value = "properties.minCycles")
    private Integer minCycles;

    /*
     * Time granularity in minutes for maintenance windows.
     */
    @JsonProperty(value = "properties.timeGranularityInMinutes")
    private Integer timeGranularityInMinutes;

    /*
     * Whether we allow multiple maintenance windows per cycle.
     */
    @JsonProperty(value = "properties.allowMultipleMaintenanceWindowsPerCycle")
    private Boolean allowMultipleMaintenanceWindowsPerCycle;

    /**
     * Get the isEnabled property: Whether maintenance windows are enabled for the database.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether maintenance windows are enabled for the database.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the maintenanceWindowCycles property: Available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0,
     * 24*60}.
     *
     * @return the maintenanceWindowCycles value.
     */
    public List<MaintenanceWindowTimeRange> maintenanceWindowCycles() {
        return this.maintenanceWindowCycles;
    }

    /**
     * Set the maintenanceWindowCycles property: Available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0,
     * 24*60}.
     *
     * @param maintenanceWindowCycles the maintenanceWindowCycles value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMaintenanceWindowCycles(
        List<MaintenanceWindowTimeRange> maintenanceWindowCycles) {
        this.maintenanceWindowCycles = maintenanceWindowCycles;
        return this;
    }

    /**
     * Get the minDurationInMinutes property: Minimum duration of maintenance window.
     *
     * @return the minDurationInMinutes value.
     */
    public Integer minDurationInMinutes() {
        return this.minDurationInMinutes;
    }

    /**
     * Set the minDurationInMinutes property: Minimum duration of maintenance window.
     *
     * @param minDurationInMinutes the minDurationInMinutes value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMinDurationInMinutes(Integer minDurationInMinutes) {
        this.minDurationInMinutes = minDurationInMinutes;
        return this;
    }

    /**
     * Get the defaultDurationInMinutes property: Default duration for maintenance window.
     *
     * @return the defaultDurationInMinutes value.
     */
    public Integer defaultDurationInMinutes() {
        return this.defaultDurationInMinutes;
    }

    /**
     * Set the defaultDurationInMinutes property: Default duration for maintenance window.
     *
     * @param defaultDurationInMinutes the defaultDurationInMinutes value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withDefaultDurationInMinutes(Integer defaultDurationInMinutes) {
        this.defaultDurationInMinutes = defaultDurationInMinutes;
        return this;
    }

    /**
     * Get the minCycles property: Minimum number of maintenance windows cycles to be set on the database.
     *
     * @return the minCycles value.
     */
    public Integer minCycles() {
        return this.minCycles;
    }

    /**
     * Set the minCycles property: Minimum number of maintenance windows cycles to be set on the database.
     *
     * @param minCycles the minCycles value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMinCycles(Integer minCycles) {
        this.minCycles = minCycles;
        return this;
    }

    /**
     * Get the timeGranularityInMinutes property: Time granularity in minutes for maintenance windows.
     *
     * @return the timeGranularityInMinutes value.
     */
    public Integer timeGranularityInMinutes() {
        return this.timeGranularityInMinutes;
    }

    /**
     * Set the timeGranularityInMinutes property: Time granularity in minutes for maintenance windows.
     *
     * @param timeGranularityInMinutes the timeGranularityInMinutes value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withTimeGranularityInMinutes(Integer timeGranularityInMinutes) {
        this.timeGranularityInMinutes = timeGranularityInMinutes;
        return this;
    }

    /**
     * Get the allowMultipleMaintenanceWindowsPerCycle property: Whether we allow multiple maintenance windows per
     * cycle.
     *
     * @return the allowMultipleMaintenanceWindowsPerCycle value.
     */
    public Boolean allowMultipleMaintenanceWindowsPerCycle() {
        return this.allowMultipleMaintenanceWindowsPerCycle;
    }

    /**
     * Set the allowMultipleMaintenanceWindowsPerCycle property: Whether we allow multiple maintenance windows per
     * cycle.
     *
     * @param allowMultipleMaintenanceWindowsPerCycle the allowMultipleMaintenanceWindowsPerCycle value to set.
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withAllowMultipleMaintenanceWindowsPerCycle(
        Boolean allowMultipleMaintenanceWindowsPerCycle) {
        this.allowMultipleMaintenanceWindowsPerCycle = allowMultipleMaintenanceWindowsPerCycle;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (maintenanceWindowCycles() != null) {
            maintenanceWindowCycles().forEach(e -> e.validate());
        }
    }
}
