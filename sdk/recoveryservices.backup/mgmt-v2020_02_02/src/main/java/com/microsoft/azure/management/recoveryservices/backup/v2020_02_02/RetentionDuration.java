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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Retention duration.
 */
public class RetentionDuration {
    /**
     * Count of duration types. Retention duration is obtained by the counting
     * the duration type Count times.
     * For example, when Count = 3 and DurationType = Weeks, retention duration
     * will be three weeks.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Retention duration type of retention policy. Possible values include:
     * 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     */
    @JsonProperty(value = "durationType")
    private RetentionDurationType durationType;

    /**
     * Get count of duration types. Retention duration is obtained by the counting the duration type Count times.
     For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set count of duration types. Retention duration is obtained by the counting the duration type Count times.
     For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
     *
     * @param count the count value to set
     * @return the RetentionDuration object itself.
     */
    public RetentionDuration withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get retention duration type of retention policy. Possible values include: 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     *
     * @return the durationType value
     */
    public RetentionDurationType durationType() {
        return this.durationType;
    }

    /**
     * Set retention duration type of retention policy. Possible values include: 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     *
     * @param durationType the durationType value to set
     * @return the RetentionDuration object itself.
     */
    public RetentionDuration withDurationType(RetentionDurationType durationType) {
        this.durationType = durationType;
        return this;
    }

}
