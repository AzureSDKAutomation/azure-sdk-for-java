// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.datadog.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Capture logs and metrics of Azure resources based on ARM tags. */
@Fluent
public final class MonitoringTagRulesInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitoringTagRulesInner.class);

    /*
     * Definition of the properties for a TagRules resource.
     */
    @JsonProperty(value = "properties")
    private MonitoringTagRulesProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Definition of the properties for a TagRules resource.
     *
     * @return the properties value.
     */
    public MonitoringTagRulesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Definition of the properties for a TagRules resource.
     *
     * @param properties the properties value to set.
     * @return the MonitoringTagRulesInner object itself.
     */
    public MonitoringTagRulesInner withProperties(MonitoringTagRulesProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
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
        if (properties() != null) {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
