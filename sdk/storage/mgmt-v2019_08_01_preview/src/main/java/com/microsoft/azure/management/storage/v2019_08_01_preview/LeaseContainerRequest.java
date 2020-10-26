/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lease Container request schema.
 */
public class LeaseContainerRequest {
    /**
     * Specifies the lease action. Can be one of the available actions.
     * Possible values include: 'Acquire', 'Renew', 'Change', 'Release',
     * 'Break'.
     */
    @JsonProperty(value = "action", required = true)
    private String action;

    /**
     * Identifies the lease. Can be specified in any valid GUID string format.
     */
    @JsonProperty(value = "leaseId")
    private String leaseId;

    /**
     * Optional. For a break action, proposed duration the lease should
     * continue before it is broken, in seconds, between 0 and 60.
     */
    @JsonProperty(value = "breakPeriod")
    private Integer breakPeriod;

    /**
     * Required for acquire. Specifies the duration of the lease, in seconds,
     * or negative one (-1) for a lease that never expires.
     */
    @JsonProperty(value = "leaseDuration")
    private Integer leaseDuration;

    /**
     * Optional for acquire, required for change. Proposed lease ID, in a GUID
     * string format.
     */
    @JsonProperty(value = "proposedLeaseId")
    private String proposedLeaseId;

    /**
     * Get specifies the lease action. Can be one of the available actions. Possible values include: 'Acquire', 'Renew', 'Change', 'Release', 'Break'.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set specifies the lease action. Can be one of the available actions. Possible values include: 'Acquire', 'Renew', 'Change', 'Release', 'Break'.
     *
     * @param action the action value to set
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get identifies the lease. Can be specified in any valid GUID string format.
     *
     * @return the leaseId value
     */
    public String leaseId() {
        return this.leaseId;
    }

    /**
     * Set identifies the lease. Can be specified in any valid GUID string format.
     *
     * @param leaseId the leaseId value to set
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get optional. For a break action, proposed duration the lease should continue before it is broken, in seconds, between 0 and 60.
     *
     * @return the breakPeriod value
     */
    public Integer breakPeriod() {
        return this.breakPeriod;
    }

    /**
     * Set optional. For a break action, proposed duration the lease should continue before it is broken, in seconds, between 0 and 60.
     *
     * @param breakPeriod the breakPeriod value to set
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withBreakPeriod(Integer breakPeriod) {
        this.breakPeriod = breakPeriod;
        return this;
    }

    /**
     * Get required for acquire. Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that never expires.
     *
     * @return the leaseDuration value
     */
    public Integer leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set required for acquire. Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that never expires.
     *
     * @param leaseDuration the leaseDuration value to set
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseDuration(Integer leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get optional for acquire, required for change. Proposed lease ID, in a GUID string format.
     *
     * @return the proposedLeaseId value
     */
    public String proposedLeaseId() {
        return this.proposedLeaseId;
    }

    /**
     * Set optional for acquire, required for change. Proposed lease ID, in a GUID string format.
     *
     * @param proposedLeaseId the proposedLeaseId value to set
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withProposedLeaseId(String proposedLeaseId) {
        this.proposedLeaseId = proposedLeaseId;
        return this;
    }

}
