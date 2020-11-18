/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.EnableStatus;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.TaskType;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.WeekDetails;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.DayDetails;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.HourDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A schedule.
 */
@JsonFlatten
public class ScheduleInner extends Resource {
    /**
     * The status of the schedule. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private EnableStatus status;

    /**
     * The task type of the schedule. Possible values include:
     * 'LabVmsShutdownTask', 'LabVmsStartupTask', 'LabBillingTask'.
     */
    @JsonProperty(value = "properties.taskType")
    private TaskType taskType;

    /**
     * The weekly recurrence of the schedule.
     */
    @JsonProperty(value = "properties.weeklyRecurrence")
    private WeekDetails weeklyRecurrence;

    /**
     * The daily recurrence of the schedule.
     */
    @JsonProperty(value = "properties.dailyRecurrence")
    private DayDetails dailyRecurrence;

    /**
     * The hourly recurrence of the schedule.
     */
    @JsonProperty(value = "properties.hourlyRecurrence")
    private HourDetails hourlyRecurrence;

    /**
     * The time zone id.
     */
    @JsonProperty(value = "properties.timeZoneId")
    private String timeZoneId;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the status of the schedule. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set the status of the schedule. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the task type of the schedule. Possible values include: 'LabVmsShutdownTask', 'LabVmsStartupTask', 'LabBillingTask'.
     *
     * @return the taskType value
     */
    public TaskType taskType() {
        return this.taskType;
    }

    /**
     * Set the task type of the schedule. Possible values include: 'LabVmsShutdownTask', 'LabVmsStartupTask', 'LabBillingTask'.
     *
     * @param taskType the taskType value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTaskType(TaskType taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get the weekly recurrence of the schedule.
     *
     * @return the weeklyRecurrence value
     */
    public WeekDetails weeklyRecurrence() {
        return this.weeklyRecurrence;
    }

    /**
     * Set the weekly recurrence of the schedule.
     *
     * @param weeklyRecurrence the weeklyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.weeklyRecurrence = weeklyRecurrence;
        return this;
    }

    /**
     * Get the daily recurrence of the schedule.
     *
     * @return the dailyRecurrence value
     */
    public DayDetails dailyRecurrence() {
        return this.dailyRecurrence;
    }

    /**
     * Set the daily recurrence of the schedule.
     *
     * @param dailyRecurrence the dailyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withDailyRecurrence(DayDetails dailyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        return this;
    }

    /**
     * Get the hourly recurrence of the schedule.
     *
     * @return the hourlyRecurrence value
     */
    public HourDetails hourlyRecurrence() {
        return this.hourlyRecurrence;
    }

    /**
     * Set the hourly recurrence of the schedule.
     *
     * @param hourlyRecurrence the hourlyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withHourlyRecurrence(HourDetails hourlyRecurrence) {
        this.hourlyRecurrence = hourlyRecurrence;
        return this;
    }

    /**
     * Get the time zone id.
     *
     * @return the timeZoneId value
     */
    public String timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the time zone id.
     *
     * @param timeZoneId the timeZoneId value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
