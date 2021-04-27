// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeliveryRuleAction;
import com.azure.resourcemanager.cdn.generated.models.DeliveryRuleCondition;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.MatchProcessingBehavior;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Friendly Rules name mapping to the any Rules or secret related information. */
@JsonFlatten
@Fluent
public class RuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleInner.class);

    /*
     * The order in which the rules are applied for the endpoint. Possible
     * values {0,1,2,3,………}. A rule with a lesser order will be applied before
     * a rule with a greater order. Rule with order 0 is a special rule. It
     * does not require any condition and actions listed in it will always be
     * applied.
     */
    @JsonProperty(value = "properties.order")
    private Integer order;

    /*
     * A list of conditions that must be matched for the actions to be executed
     */
    @JsonProperty(value = "properties.conditions")
    private List<DeliveryRuleCondition> conditions;

    /*
     * A list of actions that are executed when all the conditions of a rule
     * are satisfied.
     */
    @JsonProperty(value = "properties.actions")
    private List<DeliveryRuleAction> actions;

    /*
     * If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     */
    @JsonProperty(value = "properties.matchProcessingBehavior")
    private MatchProcessingBehavior matchProcessingBehavior;

    /*
     * Provisioning status
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @param order the order value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @return the conditions value.
     */
    public List<DeliveryRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @param conditions the conditions value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withConditions(List<DeliveryRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @return the actions value.
     */
    public List<DeliveryRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @param actions the actions value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withActions(List<DeliveryRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @return the matchProcessingBehavior value.
     */
    public MatchProcessingBehavior matchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }

    /**
     * Set the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @param matchProcessingBehavior the matchProcessingBehavior value to set.
     * @return the RuleInner object itself.
     */
    public RuleInner withMatchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
        this.matchProcessingBehavior = matchProcessingBehavior;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (conditions() != null) {
            conditions().forEach(e -> e.validate());
        }
        if (actions() != null) {
            actions().forEach(e -> e.validate());
        }
    }
}
