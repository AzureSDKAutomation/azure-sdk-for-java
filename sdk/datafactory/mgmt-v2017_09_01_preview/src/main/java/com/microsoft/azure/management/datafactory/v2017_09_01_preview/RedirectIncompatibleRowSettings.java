/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Redirect incompatible row settings.
 */
public class RedirectIncompatibleRowSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked
     * service used for redirecting incompatible row. Must be specified if
     * redirectIncompatibleRowSettings is specified. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private Object linkedServiceName;

    /**
     * The path for storing the redirect incompatible row data. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     *
     * @return the linkedServiceName value
     */
    public Object linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withLinkedServiceName(Object linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the RedirectIncompatibleRowSettings object itself.
     */
    public RedirectIncompatibleRowSettings withPath(Object path) {
        this.path = path;
        return this;
    }

}
