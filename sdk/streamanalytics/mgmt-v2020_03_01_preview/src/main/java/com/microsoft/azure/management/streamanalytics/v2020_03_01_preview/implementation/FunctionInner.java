/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.FunctionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * A function object, containing all information associated with the named
 * function. All functions are contained under a streaming job.
 */
public class FunctionInner extends SubResource {
    /**
     * The properties that are associated with a function.
     */
    @JsonProperty(value = "properties")
    private FunctionProperties properties;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the properties that are associated with a function.
     *
     * @return the properties value
     */
    public FunctionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties that are associated with a function.
     *
     * @param properties the properties value to set
     * @return the FunctionInner object itself.
     */
    public FunctionInner withProperties(FunctionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the FunctionInner object itself.
     */
    public FunctionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}