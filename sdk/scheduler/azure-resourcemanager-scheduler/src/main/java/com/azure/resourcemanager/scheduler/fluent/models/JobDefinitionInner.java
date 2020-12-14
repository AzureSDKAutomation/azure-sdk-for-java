// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scheduler.models.JobProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDefinition model. */
@Fluent
public final class JobDefinitionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobDefinitionInner.class);

    /*
     * Gets the job resource identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Gets the job resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Gets the job resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Gets or sets the job properties.
     */
    @JsonProperty(value = "properties")
    private JobProperties properties;

    /**
     * Get the id property: Gets the job resource identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: Gets the job resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: Gets the job resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: Gets or sets the job properties.
     *
     * @return the properties value.
     */
    public JobProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Gets or sets the job properties.
     *
     * @param properties the properties value to set.
     * @return the JobDefinitionInner object itself.
     */
    public JobDefinitionInner withProperties(JobProperties properties) {
        this.properties = properties;
        return this;
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
    }
}
