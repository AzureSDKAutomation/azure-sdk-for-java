/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a script action on role on the cluster.
 */
public class ScriptActionInner {
    /**
     * The name of the script action.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The URI to the script.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * The parameters for the script provided.
     */
    @JsonProperty(value = "parameters", required = true)
    private String parameters;

    /**
     * Get the name of the script action.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the script action.
     *
     * @param name the name value to set
     * @return the ScriptActionInner object itself.
     */
    public ScriptActionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the URI to the script.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI to the script.
     *
     * @param uri the uri value to set
     * @return the ScriptActionInner object itself.
     */
    public ScriptActionInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the parameters for the script provided.
     *
     * @return the parameters value
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters for the script provided.
     *
     * @param parameters the parameters value to set
     * @return the ScriptActionInner object itself.
     */
    public ScriptActionInner withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

}
