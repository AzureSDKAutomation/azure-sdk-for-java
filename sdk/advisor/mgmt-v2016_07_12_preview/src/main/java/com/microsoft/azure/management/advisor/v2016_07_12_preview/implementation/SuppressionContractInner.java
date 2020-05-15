/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The details of the snoozed or dismissed rule; for example, the duration,
 * name, and GUID associated with the rule.
 */
@SkipParentValidation
public class SuppressionContractInner extends Resource {
    /**
     * The GUID of the suppression.
     */
    @JsonProperty(value = "suppressionId")
    private String suppressionId;

    /**
     * The duration for which the suppression is valid.
     */
    @JsonProperty(value = "ttl")
    private String ttl;

    /**
     * Get the GUID of the suppression.
     *
     * @return the suppressionId value
     */
    public String suppressionId() {
        return this.suppressionId;
    }

    /**
     * Set the GUID of the suppression.
     *
     * @param suppressionId the suppressionId value to set
     * @return the SuppressionContractInner object itself.
     */
    public SuppressionContractInner withSuppressionId(String suppressionId) {
        this.suppressionId = suppressionId;
        return this;
    }

    /**
     * Get the duration for which the suppression is valid.
     *
     * @return the ttl value
     */
    public String ttl() {
        return this.ttl;
    }

    /**
     * Set the duration for which the suppression is valid.
     *
     * @param ttl the ttl value to set
     * @return the SuppressionContractInner object itself.
     */
    public SuppressionContractInner withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

}
