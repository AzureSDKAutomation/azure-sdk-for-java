// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentLogs model. */
@Fluent
public final class DeploymentLogsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentLogsInner.class);

    /*
     * The content property.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * Get the content property: The content property.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content property.
     *
     * @param content the content value to set.
     * @return the DeploymentLogsInner object itself.
     */
    public DeploymentLogsInner withContent(String content) {
        this.content = content;
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
