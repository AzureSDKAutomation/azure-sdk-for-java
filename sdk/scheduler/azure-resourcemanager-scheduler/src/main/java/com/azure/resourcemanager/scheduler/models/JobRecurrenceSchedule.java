// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobRecurrenceSchedule model. */
@Fluent
public final class JobRecurrenceSchedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobRecurrenceSchedule.class);

    /*
     * Gets or sets the days of the week that the job should execute on.
     */
    @JsonProperty(value = "weekDays")
    private List<DayOfWeek> weekDays;

    /*
     * Gets or sets the hours of the day that the job should execute at.
     */
    @JsonProperty(value = "hours")
    private List<Integer> hours;

    /*
     * Gets or sets the minutes of the hour that the job should execute at.
     */
    @JsonProperty(value = "minutes")
    private List<Integer> minutes;

    /*
     * Gets or sets the days of the month that the job should execute on. Must
     * be between 1 and 31.
     */
    @JsonProperty(value = "monthDays")
    private List<Integer> monthDays;

    /*
     * Gets or sets the occurrences of days within a month.
     */
    @JsonProperty(value = "monthlyOccurrences")
    private List<JobRecurrenceScheduleMonthlyOccurrence> monthlyOccurrences;

    /**
     * Get the weekDays property: Gets or sets the days of the week that the job should execute on.
     *
     * @return the weekDays value.
     */
    public List<DayOfWeek> weekDays() {
        return this.weekDays;
    }

    /**
     * Set the weekDays property: Gets or sets the days of the week that the job should execute on.
     *
     * @param weekDays the weekDays value to set.
     * @return the JobRecurrenceSchedule object itself.
     */
    public JobRecurrenceSchedule withWeekDays(List<DayOfWeek> weekDays) {
        this.weekDays = weekDays;
        return this;
    }

    /**
     * Get the hours property: Gets or sets the hours of the day that the job should execute at.
     *
     * @return the hours value.
     */
    public List<Integer> hours() {
        return this.hours;
    }

    /**
     * Set the hours property: Gets or sets the hours of the day that the job should execute at.
     *
     * @param hours the hours value to set.
     * @return the JobRecurrenceSchedule object itself.
     */
    public JobRecurrenceSchedule withHours(List<Integer> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get the minutes property: Gets or sets the minutes of the hour that the job should execute at.
     *
     * @return the minutes value.
     */
    public List<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Set the minutes property: Gets or sets the minutes of the hour that the job should execute at.
     *
     * @param minutes the minutes value to set.
     * @return the JobRecurrenceSchedule object itself.
     */
    public JobRecurrenceSchedule withMinutes(List<Integer> minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Get the monthDays property: Gets or sets the days of the month that the job should execute on. Must be between 1
     * and 31.
     *
     * @return the monthDays value.
     */
    public List<Integer> monthDays() {
        return this.monthDays;
    }

    /**
     * Set the monthDays property: Gets or sets the days of the month that the job should execute on. Must be between 1
     * and 31.
     *
     * @param monthDays the monthDays value to set.
     * @return the JobRecurrenceSchedule object itself.
     */
    public JobRecurrenceSchedule withMonthDays(List<Integer> monthDays) {
        this.monthDays = monthDays;
        return this;
    }

    /**
     * Get the monthlyOccurrences property: Gets or sets the occurrences of days within a month.
     *
     * @return the monthlyOccurrences value.
     */
    public List<JobRecurrenceScheduleMonthlyOccurrence> monthlyOccurrences() {
        return this.monthlyOccurrences;
    }

    /**
     * Set the monthlyOccurrences property: Gets or sets the occurrences of days within a month.
     *
     * @param monthlyOccurrences the monthlyOccurrences value to set.
     * @return the JobRecurrenceSchedule object itself.
     */
    public JobRecurrenceSchedule withMonthlyOccurrences(
        List<JobRecurrenceScheduleMonthlyOccurrence> monthlyOccurrences) {
        this.monthlyOccurrences = monthlyOccurrences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monthlyOccurrences() != null) {
            monthlyOccurrences().forEach(e -> e.validate());
        }
    }
}
