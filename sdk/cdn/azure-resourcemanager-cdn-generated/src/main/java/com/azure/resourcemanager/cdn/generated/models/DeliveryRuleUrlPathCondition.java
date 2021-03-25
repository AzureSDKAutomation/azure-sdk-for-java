// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the UrlPath condition for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("UrlPath")
@Fluent
public final class DeliveryRuleUrlPathCondition extends DeliveryRuleCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryRuleUrlPathCondition.class);

    /*
     * Defines the parameters for the condition.
     */
    @JsonProperty(value = "parameters", required = true)
    private UrlPathMatchConditionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the condition.
     *
     * @return the parameters value.
     */
    public UrlPathMatchConditionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the condition.
     *
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleUrlPathCondition object itself.
     */
    public DeliveryRuleUrlPathCondition withParameters(UrlPathMatchConditionParameters parameters) {
        this.parameters = parameters;
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
        if (parameters() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model DeliveryRuleUrlPathCondition"));
        } else {
            parameters().validate();
        }
    }
}
