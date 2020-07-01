/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation;

import com.microsoft.azure.management.advisor.v2016_07_12_preview.SuppressionContractProperties;
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
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private SuppressionContractProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public SuppressionContractProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the SuppressionContractInner object itself.
     */
    public SuppressionContractInner withProperties(SuppressionContractProperties properties) {
        this.properties = properties;
        return this;
    }

}
