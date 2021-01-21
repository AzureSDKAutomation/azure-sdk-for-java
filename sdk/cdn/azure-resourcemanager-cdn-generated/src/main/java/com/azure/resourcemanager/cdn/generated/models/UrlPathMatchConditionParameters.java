// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the parameters for UrlPath match conditions. */
@Fluent
public final class UrlPathMatchConditionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UrlPathMatchConditionParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Describes operator to be matched
     */
    @JsonProperty(value = "operator", required = true)
    private UrlPathOperator operator;

    /*
     * Describes if this is negate condition or not
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /*
     * The match value for the condition of the delivery rule
     */
    @JsonProperty(value = "matchValues")
    private List<String> matchValues;

    /*
     * List of transforms
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /** Creates an instance of UrlPathMatchConditionParameters class. */
    public UrlPathMatchConditionParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.DeliveryRuleUrlPathMatchConditionParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the UrlPathMatchConditionParameters object itself.
     */
    public UrlPathMatchConditionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     *
     * @return the operator value.
     */
    public UrlPathOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     *
     * @param operator the operator value to set.
     * @return the UrlPathMatchConditionParameters object itself.
     */
    public UrlPathMatchConditionParameters withOperator(UrlPathOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if this is negate condition or not.
     *
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set.
     * @return the UrlPathMatchConditionParameters object itself.
     */
    public UrlPathMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValues property: The match value for the condition of the delivery rule.
     *
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: The match value for the condition of the delivery rule.
     *
     * @param matchValues the matchValues value to set.
     * @return the UrlPathMatchConditionParameters object itself.
     */
    public UrlPathMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     *
     * @return the transforms value.
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     *
     * @param transforms the transforms value to set.
     * @return the UrlPathMatchConditionParameters object itself.
     */
    public UrlPathMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operator in model UrlPathMatchConditionParameters"));
        }
    }
}
