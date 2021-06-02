// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Worker App scaling configurations. */
@Fluent
public final class WorkerAppScale {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkerAppScale.class);

    /*
     * Minimum number of container replicas.
     */
    @JsonProperty(value = "minReplicas")
    private Integer minReplicas;

    /*
     * Maximum number of container replicas.
     */
    @JsonProperty(value = "maxReplicas")
    private Integer maxReplicas;

    /*
     * Scaling rules.
     */
    @JsonProperty(value = "rules")
    private List<WorkerAppScaleRule> rules;

    /**
     * Get the minReplicas property: Minimum number of container replicas.
     *
     * @return the minReplicas value.
     */
    public Integer minReplicas() {
        return this.minReplicas;
    }

    /**
     * Set the minReplicas property: Minimum number of container replicas.
     *
     * @param minReplicas the minReplicas value to set.
     * @return the WorkerAppScale object itself.
     */
    public WorkerAppScale withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * Get the maxReplicas property: Maximum number of container replicas.
     *
     * @return the maxReplicas value.
     */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }

    /**
     * Set the maxReplicas property: Maximum number of container replicas.
     *
     * @param maxReplicas the maxReplicas value to set.
     * @return the WorkerAppScale object itself.
     */
    public WorkerAppScale withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * Get the rules property: Scaling rules.
     *
     * @return the rules value.
     */
    public List<WorkerAppScaleRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Scaling rules.
     *
     * @param rules the rules value to set.
     * @return the WorkerAppScale object itself.
     */
    public WorkerAppScale withRules(List<WorkerAppScaleRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
