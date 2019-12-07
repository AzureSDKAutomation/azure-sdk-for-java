/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service Level Agreement details for a support ticket.
 */
public class ServiceLevelAgreement {
    /**
     * Time in UTC (ISO 8601 format) when SLA started.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Time in UTC (ISO 8601 format) when SLA expires.
     */
    @JsonProperty(value = "expirationTime")
    private DateTime expirationTime;

    /**
     * Service Level Agreement in minutes.
     */
    @JsonProperty(value = "slaMinutes")
    private Integer slaMinutes;

    /**
     * Get time in UTC (ISO 8601 format) when SLA started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set time in UTC (ISO 8601 format) when SLA started.
     *
     * @param startTime the startTime value to set
     * @return the ServiceLevelAgreement object itself.
     */
    public ServiceLevelAgreement withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get time in UTC (ISO 8601 format) when SLA expires.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set time in UTC (ISO 8601 format) when SLA expires.
     *
     * @param expirationTime the expirationTime value to set
     * @return the ServiceLevelAgreement object itself.
     */
    public ServiceLevelAgreement withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get service Level Agreement in minutes.
     *
     * @return the slaMinutes value
     */
    public Integer slaMinutes() {
        return this.slaMinutes;
    }

    /**
     * Set service Level Agreement in minutes.
     *
     * @param slaMinutes the slaMinutes value to set
     * @return the ServiceLevelAgreement object itself.
     */
    public ServiceLevelAgreement withSlaMinutes(Integer slaMinutes) {
        this.slaMinutes = slaMinutes;
        return this;
    }

}
