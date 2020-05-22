/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for a schedule-based autoscale rule, consisting of an array of
 * days + a time and capacity.
 */
public class AutoscaleSchedule {
    /**
     * Days of the week for a schedule-based autoscale rule.
     */
    @JsonProperty(value = "days")
    private List<DaysOfWeek> days;

    /**
     * Time and capacity for a schedule-based autoscale rule.
     */
    @JsonProperty(value = "timeAndCapacity")
    private AutoscaleTimeAndCapacity timeAndCapacity;

    /**
     * Get days of the week for a schedule-based autoscale rule.
     *
     * @return the days value
     */
    public List<DaysOfWeek> days() {
        return this.days;
    }

    /**
     * Set days of the week for a schedule-based autoscale rule.
     *
     * @param days the days value to set
     * @return the AutoscaleSchedule object itself.
     */
    public AutoscaleSchedule withDays(List<DaysOfWeek> days) {
        this.days = days;
        return this;
    }

    /**
     * Get time and capacity for a schedule-based autoscale rule.
     *
     * @return the timeAndCapacity value
     */
    public AutoscaleTimeAndCapacity timeAndCapacity() {
        return this.timeAndCapacity;
    }

    /**
     * Set time and capacity for a schedule-based autoscale rule.
     *
     * @param timeAndCapacity the timeAndCapacity value to set
     * @return the AutoscaleSchedule object itself.
     */
    public AutoscaleSchedule withTimeAndCapacity(AutoscaleTimeAndCapacity timeAndCapacity) {
        this.timeAndCapacity = timeAndCapacity;
        return this;
    }

}
