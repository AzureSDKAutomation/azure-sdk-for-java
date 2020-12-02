/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to calculate template hash. It contains a string of
 * minified template and its hash.
 */
public class TemplateHashResultInner {
    /**
     * The minified template string.
     */
    @JsonProperty(value = "minifiedTemplate")
    private String minifiedTemplate;

    /**
     * The template hash.
     */
    @JsonProperty(value = "templateHash")
    private String templateHash;

    /**
     * Get the minified template string.
     *
     * @return the minifiedTemplate value
     */
    public String minifiedTemplate() {
        return this.minifiedTemplate;
    }

    /**
     * Set the minified template string.
     *
     * @param minifiedTemplate the minifiedTemplate value to set
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withMinifiedTemplate(String minifiedTemplate) {
        this.minifiedTemplate = minifiedTemplate;
        return this;
    }

    /**
     * Get the template hash.
     *
     * @return the templateHash value
     */
    public String templateHash() {
        return this.templateHash;
    }

    /**
     * Set the template hash.
     *
     * @param templateHash the templateHash value to set
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withTemplateHash(String templateHash) {
        this.templateHash = templateHash;
        return this;
    }

}
