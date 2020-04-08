/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ContainerInfo model.
 */
public class ContainerInfo {
    /**
     * The currentTimeStamp property.
     */
    @JsonProperty(value = "currentTimeStamp")
    private DateTime currentTimeStamp;

    /**
     * The previousTimeStamp property.
     */
    @JsonProperty(value = "previousTimeStamp")
    private DateTime previousTimeStamp;

    /**
     * The currentCpuStats property.
     */
    @JsonProperty(value = "currentCpuStats")
    private ContainerCpuStatistics currentCpuStats;

    /**
     * The previousCpuStats property.
     */
    @JsonProperty(value = "previousCpuStats")
    private ContainerCpuStatistics previousCpuStats;

    /**
     * The memoryStats property.
     */
    @JsonProperty(value = "memoryStats")
    private ContainerMemoryStatistics memoryStats;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The eth0 property.
     */
    @JsonProperty(value = "eth0")
    private ContainerNetworkInterfaceStatistics eth0;

    /**
     * Get the currentTimeStamp value.
     *
     * @return the currentTimeStamp value
     */
    public DateTime currentTimeStamp() {
        return this.currentTimeStamp;
    }

    /**
     * Set the currentTimeStamp value.
     *
     * @param currentTimeStamp the currentTimeStamp value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withCurrentTimeStamp(DateTime currentTimeStamp) {
        this.currentTimeStamp = currentTimeStamp;
        return this;
    }

    /**
     * Get the previousTimeStamp value.
     *
     * @return the previousTimeStamp value
     */
    public DateTime previousTimeStamp() {
        return this.previousTimeStamp;
    }

    /**
     * Set the previousTimeStamp value.
     *
     * @param previousTimeStamp the previousTimeStamp value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withPreviousTimeStamp(DateTime previousTimeStamp) {
        this.previousTimeStamp = previousTimeStamp;
        return this;
    }

    /**
     * Get the currentCpuStats value.
     *
     * @return the currentCpuStats value
     */
    public ContainerCpuStatistics currentCpuStats() {
        return this.currentCpuStats;
    }

    /**
     * Set the currentCpuStats value.
     *
     * @param currentCpuStats the currentCpuStats value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withCurrentCpuStats(ContainerCpuStatistics currentCpuStats) {
        this.currentCpuStats = currentCpuStats;
        return this;
    }

    /**
     * Get the previousCpuStats value.
     *
     * @return the previousCpuStats value
     */
    public ContainerCpuStatistics previousCpuStats() {
        return this.previousCpuStats;
    }

    /**
     * Set the previousCpuStats value.
     *
     * @param previousCpuStats the previousCpuStats value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withPreviousCpuStats(ContainerCpuStatistics previousCpuStats) {
        this.previousCpuStats = previousCpuStats;
        return this;
    }

    /**
     * Get the memoryStats value.
     *
     * @return the memoryStats value
     */
    public ContainerMemoryStatistics memoryStats() {
        return this.memoryStats;
    }

    /**
     * Set the memoryStats value.
     *
     * @param memoryStats the memoryStats value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withMemoryStats(ContainerMemoryStatistics memoryStats) {
        this.memoryStats = memoryStats;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the eth0 value.
     *
     * @return the eth0 value
     */
    public ContainerNetworkInterfaceStatistics eth0() {
        return this.eth0;
    }

    /**
     * Set the eth0 value.
     *
     * @param eth0 the eth0 value to set
     * @return the ContainerInfo object itself.
     */
    public ContainerInfo withEth0(ContainerNetworkInterfaceStatistics eth0) {
        this.eth0 = eth0;
        return this;
    }

}
