// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of App Insights. */
@Fluent
public final class AppInsightsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppInsightsProperties.class);

    /*
     * ARM resource ID of the App Insights.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the resourceId property: ARM resource ID of the App Insights.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource ID of the App Insights.
     *
     * @param resourceId the resourceId value to set.
     * @return the AppInsightsProperties object itself.
     */
    public AppInsightsProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
