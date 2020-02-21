/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of new failover policies for the failover priority change.
 */
public class FailoverPolicies {
    /**
     * List of failover policies.
     */
    @JsonProperty(value = "failoverPolicies", required = true)
    private List<FailoverPolicy> failoverPolicies;

    /**
     * Get list of failover policies.
     *
     * @return the failoverPolicies value
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Set list of failover policies.
     *
     * @param failoverPolicies the failoverPolicies value to set
     * @return the FailoverPolicies object itself.
     */
    public FailoverPolicies withFailoverPolicies(List<FailoverPolicy> failoverPolicies) {
        this.failoverPolicies = failoverPolicies;
        return this;
    }

}
