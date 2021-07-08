// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties of the Rules to create. */
@Fluent
public final class RuleProperties extends RuleUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleProperties.class);

    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

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

    /** {@inheritDoc} */
    @Override
    public RuleProperties withOrder(Integer order) {
        super.withOrder(order);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleProperties withConditions(List<DeliveryRuleCondition> conditions) {
        super.withConditions(conditions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleProperties withActions(List<DeliveryRuleAction> actions) {
        super.withActions(actions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleProperties withMatchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
        super.withMatchProcessingBehavior(matchProcessingBehavior);
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
    }
}
