/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * What is this?.
 */
public class OperationMetaLogSpecification {
    /**
     * Log display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Time range the log covers.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Log unique name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get log display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set log display name.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get time range the log covers.
     *
     * @return the blobDuration value
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set time range the log covers.
     *
     * @param blobDuration the blobDuration value to set
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

    /**
     * Get log unique name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set log unique name.
     *
     * @param name the name value to set
     * @return the OperationMetaLogSpecification object itself.
     */
    public OperationMetaLogSpecification withName(String name) {
        this.name = name;
        return this;
    }

}
