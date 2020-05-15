/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The access control configuration policy.
 */
public class FlowAccessControlConfigurationPolicy {
    /**
     * The allowed caller IP address ranges.
     */
    @JsonProperty(value = "allowedCallerIpAddresses")
    private List<IpAddressRange> allowedCallerIpAddresses;

    /**
     * The authentication policies for workflow.
     */
    @JsonProperty(value = "openAuthenticationPolicies")
    private OpenAuthenticationAccessPolicies openAuthenticationPolicies;

    /**
     * Get the allowed caller IP address ranges.
     *
     * @return the allowedCallerIpAddresses value
     */
    public List<IpAddressRange> allowedCallerIpAddresses() {
        return this.allowedCallerIpAddresses;
    }

    /**
     * Set the allowed caller IP address ranges.
     *
     * @param allowedCallerIpAddresses the allowedCallerIpAddresses value to set
     * @return the FlowAccessControlConfigurationPolicy object itself.
     */
    public FlowAccessControlConfigurationPolicy withAllowedCallerIpAddresses(List<IpAddressRange> allowedCallerIpAddresses) {
        this.allowedCallerIpAddresses = allowedCallerIpAddresses;
        return this;
    }

    /**
     * Get the authentication policies for workflow.
     *
     * @return the openAuthenticationPolicies value
     */
    public OpenAuthenticationAccessPolicies openAuthenticationPolicies() {
        return this.openAuthenticationPolicies;
    }

    /**
     * Set the authentication policies for workflow.
     *
     * @param openAuthenticationPolicies the openAuthenticationPolicies value to set
     * @return the FlowAccessControlConfigurationPolicy object itself.
     */
    public FlowAccessControlConfigurationPolicy withOpenAuthenticationPolicies(OpenAuthenticationAccessPolicies openAuthenticationPolicies) {
        this.openAuthenticationPolicies = openAuthenticationPolicies;
        return this;
    }

}
