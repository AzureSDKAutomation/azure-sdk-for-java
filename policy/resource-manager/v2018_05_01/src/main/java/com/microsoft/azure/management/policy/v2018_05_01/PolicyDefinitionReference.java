/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The policy definition reference.
 */
public class PolicyDefinitionReference {
    /**
     * The ID of the policy definition or policy set definition.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /**
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * Get the ID of the policy definition or policy set definition.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the ID of the policy definition or policy set definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get required if a parameter is used in policy rule.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

}
