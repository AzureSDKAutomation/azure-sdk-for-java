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
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Daily retention schedule.
 */
public class DailyRetentionSchedule {
    /**
     * Retention times of retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<DateTime> retentionTimes;

    /**
     * Retention duration of retention Policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get retention times of retention policy.
     *
     * @return the retentionTimes value
     */
    public List<DateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set retention times of retention policy.
     *
     * @param retentionTimes the retentionTimes value to set
     * @return the DailyRetentionSchedule object itself.
     */
    public DailyRetentionSchedule withRetentionTimes(List<DateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get retention duration of retention Policy.
     *
     * @return the retentionDuration value
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set retention duration of retention Policy.
     *
     * @param retentionDuration the retentionDuration value to set
     * @return the DailyRetentionSchedule object itself.
     */
    public DailyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

}
