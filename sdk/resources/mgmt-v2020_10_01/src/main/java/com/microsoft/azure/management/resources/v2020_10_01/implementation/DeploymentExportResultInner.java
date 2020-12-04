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
 * The deployment export result.
 */
public class DeploymentExportResultInner {
    /**
     * The template content.
     */
    @JsonProperty(value = "template")
    private Object template;

    /**
     * Get the template content.
     *
     * @return the template value
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template content.
     *
     * @param template the template value to set
     * @return the DeploymentExportResultInner object itself.
     */
    public DeploymentExportResultInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

}
