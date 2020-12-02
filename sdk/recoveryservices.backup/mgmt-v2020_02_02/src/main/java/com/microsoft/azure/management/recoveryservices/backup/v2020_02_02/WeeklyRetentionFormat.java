/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Weekly retention format.
 */
public class WeeklyRetentionFormat {
    /**
     * List of days of the week.
     */
    @JsonProperty(value = "daysOfTheWeek")
    private List<DayOfWeek> daysOfTheWeek;

    /**
     * List of weeks of month.
     */
    @JsonProperty(value = "weeksOfTheMonth")
    private List<WeekOfMonth> weeksOfTheMonth;

    /**
     * Get list of days of the week.
     *
     * @return the daysOfTheWeek value
     */
    public List<DayOfWeek> daysOfTheWeek() {
        return this.daysOfTheWeek;
    }

    /**
     * Set list of days of the week.
     *
     * @param daysOfTheWeek the daysOfTheWeek value to set
     * @return the WeeklyRetentionFormat object itself.
     */
    public WeeklyRetentionFormat withDaysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        return this;
    }

    /**
     * Get list of weeks of month.
     *
     * @return the weeksOfTheMonth value
     */
    public List<WeekOfMonth> weeksOfTheMonth() {
        return this.weeksOfTheMonth;
    }

    /**
     * Set list of weeks of month.
     *
     * @param weeksOfTheMonth the weeksOfTheMonth value to set
     * @return the WeeklyRetentionFormat object itself.
     */
    public WeeklyRetentionFormat withWeeksOfTheMonth(List<WeekOfMonth> weeksOfTheMonth) {
        this.weeksOfTheMonth = weeksOfTheMonth;
        return this;
    }

}
