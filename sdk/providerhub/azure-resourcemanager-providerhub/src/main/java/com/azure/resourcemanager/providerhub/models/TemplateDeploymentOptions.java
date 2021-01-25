// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TemplateDeploymentOptions model. */
@Fluent
public class TemplateDeploymentOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TemplateDeploymentOptions.class);

    /*
     * The preflightSupported property.
     */
    @JsonProperty(value = "preflightSupported")
    private Boolean preflightSupported;

    /*
     * The preflightOptions property.
     */
    @JsonProperty(value = "preflightOptions")
    private List<PreflightOption> preflightOptions;

    /**
     * Get the preflightSupported property: The preflightSupported property.
     *
     * @return the preflightSupported value.
     */
    public Boolean preflightSupported() {
        return this.preflightSupported;
    }

    /**
     * Set the preflightSupported property: The preflightSupported property.
     *
     * @param preflightSupported the preflightSupported value to set.
     * @return the TemplateDeploymentOptions object itself.
     */
    public TemplateDeploymentOptions withPreflightSupported(Boolean preflightSupported) {
        this.preflightSupported = preflightSupported;
        return this;
    }

    /**
     * Get the preflightOptions property: The preflightOptions property.
     *
     * @return the preflightOptions value.
     */
    public List<PreflightOption> preflightOptions() {
        return this.preflightOptions;
    }

    /**
     * Set the preflightOptions property: The preflightOptions property.
     *
     * @param preflightOptions the preflightOptions value to set.
     * @return the TemplateDeploymentOptions object itself.
     */
    public TemplateDeploymentOptions withPreflightOptions(List<PreflightOption> preflightOptions) {
        this.preflightOptions = preflightOptions;
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
