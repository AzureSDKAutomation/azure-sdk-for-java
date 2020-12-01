/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Weekly Schedule properties, make a snapshot every week at a specific day or
 * days.
 */
public class WeeklySchedule {
    /**
     * Weekly snapshot count to keep.
     */
    @JsonProperty(value = "snapshotsToKeep")
    private Integer snapshotsToKeep;

    /**
     * Indicates which weekdays snapshot should be taken, accepts a comma
     * separated list of week day names in english.
     */
    @JsonProperty(value = "day")
    private String day;

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken.
     */
    @JsonProperty(value = "hour")
    private Integer hour;

    /**
     * Indicates which minute snapshot should be taken.
     */
    @JsonProperty(value = "minute")
    private Integer minute;

    /**
     * Resource size in bytes, current storage usage for the volume in bytes.
     */
    @JsonProperty(value = "usedBytes")
    private Long usedBytes;

    /**
     * Get weekly snapshot count to keep.
     *
     * @return the snapshotsToKeep value
     */
    public Integer snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    /**
     * Set weekly snapshot count to keep.
     *
     * @param snapshotsToKeep the snapshotsToKeep value to set
     * @return the WeeklySchedule object itself.
     */
    public WeeklySchedule withSnapshotsToKeep(Integer snapshotsToKeep) {
        this.snapshotsToKeep = snapshotsToKeep;
        return this;
    }

    /**
     * Get indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english.
     *
     * @return the day value
     */
    public String day() {
        return this.day;
    }

    /**
     * Set indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english.
     *
     * @param day the day value to set
     * @return the WeeklySchedule object itself.
     */
    public WeeklySchedule withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * Get indicates which hour in UTC timezone a snapshot should be taken.
     *
     * @return the hour value
     */
    public Integer hour() {
        return this.hour;
    }

    /**
     * Set indicates which hour in UTC timezone a snapshot should be taken.
     *
     * @param hour the hour value to set
     * @return the WeeklySchedule object itself.
     */
    public WeeklySchedule withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get indicates which minute snapshot should be taken.
     *
     * @return the minute value
     */
    public Integer minute() {
        return this.minute;
    }

    /**
     * Set indicates which minute snapshot should be taken.
     *
     * @param minute the minute value to set
     * @return the WeeklySchedule object itself.
     */
    public WeeklySchedule withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Get resource size in bytes, current storage usage for the volume in bytes.
     *
     * @return the usedBytes value
     */
    public Long usedBytes() {
        return this.usedBytes;
    }

    /**
     * Set resource size in bytes, current storage usage for the volume in bytes.
     *
     * @param usedBytes the usedBytes value to set
     * @return the WeeklySchedule object itself.
     */
    public WeeklySchedule withUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
        return this;
    }

}
