/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PipelineRunTargetProperties model.
 */
public class PipelineRunTargetProperties {
    /**
     * The type of the target. Possible values include: 'AzureStorageBlob'.
     */
    @JsonProperty(value = "type")
    private PipelineRunTargetType type;

    /**
     * The name of the target.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the type of the target. Possible values include: 'AzureStorageBlob'.
     *
     * @return the type value
     */
    public PipelineRunTargetType type() {
        return this.type;
    }

    /**
     * Set the type of the target. Possible values include: 'AzureStorageBlob'.
     *
     * @param type the type value to set
     * @return the PipelineRunTargetProperties object itself.
     */
    public PipelineRunTargetProperties withType(PipelineRunTargetType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the target.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the target.
     *
     * @param name the name value to set
     * @return the PipelineRunTargetProperties object itself.
     */
    public PipelineRunTargetProperties withName(String name) {
        this.name = name;
        return this;
    }

}
