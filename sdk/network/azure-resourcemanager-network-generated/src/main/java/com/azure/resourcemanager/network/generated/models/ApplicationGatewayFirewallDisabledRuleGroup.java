// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Allows to disable rules within a rule group or an entire rule group. */
@Fluent
public final class ApplicationGatewayFirewallDisabledRuleGroup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayFirewallDisabledRuleGroup.class);

    /*
     * The name of the rule group that will be disabled.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /*
     * The list of rules that will be disabled. If null, all rules of the rule
     * group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<Integer> rules;

    /**
     * Get the ruleGroupName property: The name of the rule group that will be disabled.
     *
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: The name of the rule group that will be disabled.
     *
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ApplicationGatewayFirewallDisabledRuleGroup object itself.
     */
    public ApplicationGatewayFirewallDisabledRuleGroup withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the rules property: The list of rules that will be disabled. If null, all rules of the rule group will be
     * disabled.
     *
     * @return the rules value.
     */
    public List<Integer> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The list of rules that will be disabled. If null, all rules of the rule group will be
     * disabled.
     *
     * @param rules the rules value to set.
     * @return the ApplicationGatewayFirewallDisabledRuleGroup object itself.
     */
    public ApplicationGatewayFirewallDisabledRuleGroup withRules(List<Integer> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleGroupName in model"
                            + " ApplicationGatewayFirewallDisabledRuleGroup"));
        }
    }
}
