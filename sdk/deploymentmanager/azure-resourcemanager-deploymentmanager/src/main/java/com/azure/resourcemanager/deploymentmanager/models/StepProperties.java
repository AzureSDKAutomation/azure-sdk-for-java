// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of a step resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "stepType",
    defaultImpl = StepProperties.class)
@JsonTypeName("StepProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HealthCheck", value = HealthCheckStepProperties.class),
    @JsonSubTypes.Type(name = "Wait", value = WaitStepProperties.class)
})
@Immutable
public class StepProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StepProperties.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
