/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ProblemClassification resource object.
 */
@JsonFlatten
public class ProblemClassificationInner {
    /**
     * Id of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the resource 'Microsoft.Support/problemClassification'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Localized name of problem classification.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get id of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the resource 'Microsoft.Support/problemClassification'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get localized name of problem classification.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set localized name of problem classification.
     *
     * @param displayName the displayName value to set
     * @return the ProblemClassificationInner object itself.
     */
    public ProblemClassificationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
