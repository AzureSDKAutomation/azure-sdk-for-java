// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition of which syslog data will be collected and how it will be collected. Only collected from Linux machines.
 */
@Fluent
public final class SyslogDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyslogDataSource.class);

    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually
     * what table in Log Analytics the data will be sent to.
     */
    @JsonProperty(value = "streams")
    private List<KnownSyslogDataSourceStreams> streams;

    /*
     * The list of facility names.
     */
    @JsonProperty(value = "facilityNames")
    private List<KnownSyslogDataSourceFacilityNames> facilityNames;

    /*
     * The log levels to collect.
     */
    @JsonProperty(value = "logLevels")
    private List<KnownSyslogDataSourceLogLevels> logLevels;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type)
     * within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @return the streams value.
     */
    public List<KnownSyslogDataSourceStreams> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @param streams the streams value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withStreams(List<KnownSyslogDataSourceStreams> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the facilityNames property: The list of facility names.
     *
     * @return the facilityNames value.
     */
    public List<KnownSyslogDataSourceFacilityNames> facilityNames() {
        return this.facilityNames;
    }

    /**
     * Set the facilityNames property: The list of facility names.
     *
     * @param facilityNames the facilityNames value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withFacilityNames(List<KnownSyslogDataSourceFacilityNames> facilityNames) {
        this.facilityNames = facilityNames;
        return this;
    }

    /**
     * Get the logLevels property: The log levels to collect.
     *
     * @return the logLevels value.
     */
    public List<KnownSyslogDataSourceLogLevels> logLevels() {
        return this.logLevels;
    }

    /**
     * Set the logLevels property: The log levels to collect.
     *
     * @param logLevels the logLevels value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withLogLevels(List<KnownSyslogDataSourceLogLevels> logLevels) {
        this.logLevels = logLevels;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the SyslogDataSource object itself.
     */
    public SyslogDataSource withName(String name) {
        this.name = name;
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
