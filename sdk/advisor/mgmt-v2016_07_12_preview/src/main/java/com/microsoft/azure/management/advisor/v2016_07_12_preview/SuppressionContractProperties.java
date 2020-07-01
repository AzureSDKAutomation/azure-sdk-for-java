/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SuppressionContractProperties model.
 */
public class SuppressionContractProperties {
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
     * @return the SuppressionContractProperties object itself.
     */
    public SuppressionContractProperties withSuppressionId(String suppressionId) {
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
     * @return the SuppressionContractProperties object itself.
     */
    public SuppressionContractProperties withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

}
