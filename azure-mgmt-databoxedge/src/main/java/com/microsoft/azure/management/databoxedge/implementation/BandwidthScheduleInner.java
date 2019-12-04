/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.implementation;

import java.util.List;
import com.microsoft.azure.management.databoxedge.DayOfWeek;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.ARMBaseModel;

/**
 * The bandwidth schedule details.
 */
@JsonFlatten
public class BandwidthScheduleInner extends ARMBaseModel {
    /**
     * The start time of the schedule in UTC.
     */
    @JsonProperty(value = "properties.start", required = true)
    private String start;

    /**
     * The stop time of the schedule in UTC.
     */
    @JsonProperty(value = "properties.stop", required = true)
    private String stop;

    /**
     * The bandwidth rate in Mbps.
     */
    @JsonProperty(value = "properties.rateInMbps", required = true)
    private int rateInMbps;

    /**
     * The days of the week when this schedule is applicable.
     */
    @JsonProperty(value = "properties.days", required = true)
    private List<DayOfWeek> days;

    /**
     * Get the start time of the schedule in UTC.
     *
     * @return the start value
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start time of the schedule in UTC.
     *
     * @param start the start value to set
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the stop time of the schedule in UTC.
     *
     * @return the stop value
     */
    public String stop() {
        return this.stop;
    }

    /**
     * Set the stop time of the schedule in UTC.
     *
     * @param stop the stop value to set
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withStop(String stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Get the bandwidth rate in Mbps.
     *
     * @return the rateInMbps value
     */
    public int rateInMbps() {
        return this.rateInMbps;
    }

    /**
     * Set the bandwidth rate in Mbps.
     *
     * @param rateInMbps the rateInMbps value to set
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withRateInMbps(int rateInMbps) {
        this.rateInMbps = rateInMbps;
        return this;
    }

    /**
     * Get the days of the week when this schedule is applicable.
     *
     * @return the days value
     */
    public List<DayOfWeek> days() {
        return this.days;
    }

    /**
     * Set the days of the week when this schedule is applicable.
     *
     * @param days the days value to set
     * @return the BandwidthScheduleInner object itself.
     */
    public BandwidthScheduleInner withDays(List<DayOfWeek> days) {
        this.days = days;
        return this;
    }

}
