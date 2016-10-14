/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website;

import org.joda.time.DateTime;
import java.util.List;

/**
 * Class containing metric information.
 */
public class PerfMonSet {
    /**
     * Unique key name of the counter.
     */
    private String name;

    /**
     * Start time of the period.
     */
    private DateTime startTime;

    /**
     * End time of the period.
     */
    private DateTime endTime;

    /**
     * Presented time grain.
     */
    private String timeGrain;

    /**
     * Collection of workers that are active during this time.
     */
    private List<PerfMonSample> values;

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
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<PerfMonSample> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withValues(List<PerfMonSample> values) {
        this.values = values;
        return this;
    }

}
