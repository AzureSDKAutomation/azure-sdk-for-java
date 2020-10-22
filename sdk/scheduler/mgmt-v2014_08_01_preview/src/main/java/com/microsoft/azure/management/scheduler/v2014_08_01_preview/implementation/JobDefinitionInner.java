/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2014_08_01_preview.implementation;

import com.microsoft.azure.management.scheduler.v2014_08_01_preview.JobProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobDefinitionInner model.
 */
public class JobDefinitionInner {
    /**
     * Gets the job resource identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Gets the job resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Gets the job resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets or sets the job properties.
     */
    @JsonProperty(value = "properties")
    private JobProperties properties;

    /**
     * Get gets the job resource identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get gets the job resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get gets the job resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets or sets the job properties.
     *
     * @return the properties value
     */
    public JobProperties properties() {
        return this.properties;
    }

    /**
     * Set gets or sets the job properties.
     *
     * @param properties the properties value to set
     * @return the JobDefinitionInner object itself.
     */
    public JobDefinitionInner withProperties(JobProperties properties) {
        this.properties = properties;
        return this;
    }

}
