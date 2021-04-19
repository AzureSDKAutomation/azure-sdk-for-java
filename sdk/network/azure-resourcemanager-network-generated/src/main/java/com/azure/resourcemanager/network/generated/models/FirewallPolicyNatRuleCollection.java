// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Firewall Policy NAT Rule Collection. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleCollectionType")
@JsonTypeName("FirewallPolicyNatRuleCollection")
@Fluent
public final class FirewallPolicyNatRuleCollection extends FirewallPolicyRuleCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyNatRuleCollection.class);

    /*
     * The action type of a Nat rule collection.
     */
    @JsonProperty(value = "action")
    private FirewallPolicyNatRuleCollectionAction action;

    /*
     * List of rules included in a rule collection.
     */
    @JsonProperty(value = "rules")
    private List<FirewallPolicyRule> rules;

    /**
     * Get the action property: The action type of a Nat rule collection.
     *
     * @return the action value.
     */
    public FirewallPolicyNatRuleCollectionAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a Nat rule collection.
     *
     * @param action the action value to set.
     * @return the FirewallPolicyNatRuleCollection object itself.
     */
    public FirewallPolicyNatRuleCollection withAction(FirewallPolicyNatRuleCollectionAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: List of rules included in a rule collection.
     *
     * @return the rules value.
     */
    public List<FirewallPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules included in a rule collection.
     *
     * @param rules the rules value to set.
     * @return the FirewallPolicyNatRuleCollection object itself.
     */
    public FirewallPolicyNatRuleCollection withRules(List<FirewallPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyNatRuleCollection withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyNatRuleCollection withPriority(Integer priority) {
        super.withPriority(priority);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
