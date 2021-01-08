// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Early termination policies enable canceling poor-performing runs before they complete. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "policyType")
@JsonTypeName("EarlyTerminationPolicyConfiguration")
@Fluent
public final class EarlyTerminationPolicyConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EarlyTerminationPolicyConfiguration.class);

    /*
     * The evaluationInterval property.
     */
    @JsonProperty(value = "evaluationInterval")
    private Integer evaluationInterval;

    /*
     * The delayEvaluation property.
     */
    @JsonProperty(value = "delayEvaluation")
    private Integer delayEvaluation;

    /**
     * Get the evaluationInterval property: The evaluationInterval property.
     *
     * @return the evaluationInterval value.
     */
    public Integer evaluationInterval() {
        return this.evaluationInterval;
    }

    /**
     * Set the evaluationInterval property: The evaluationInterval property.
     *
     * @param evaluationInterval the evaluationInterval value to set.
     * @return the EarlyTerminationPolicyConfiguration object itself.
     */
    public EarlyTerminationPolicyConfiguration withEvaluationInterval(Integer evaluationInterval) {
        this.evaluationInterval = evaluationInterval;
        return this;
    }

    /**
     * Get the delayEvaluation property: The delayEvaluation property.
     *
     * @return the delayEvaluation value.
     */
    public Integer delayEvaluation() {
        return this.delayEvaluation;
    }

    /**
     * Set the delayEvaluation property: The delayEvaluation property.
     *
     * @param delayEvaluation the delayEvaluation value to set.
     * @return the EarlyTerminationPolicyConfiguration object itself.
     */
    public EarlyTerminationPolicyConfiguration withDelayEvaluation(Integer delayEvaluation) {
        this.delayEvaluation = delayEvaluation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
