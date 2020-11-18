/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of get log link operation.
 */
public class RunGetLogResultInner {
    /**
     * The link to logs for a run on a azure container registry.
     */
    @JsonProperty(value = "logLink")
    private String logLink;

    /**
     * The link to logs in registry for a run on a azure container registry.
     */
    @JsonProperty(value = "logArtifactLink")
    private String logArtifactLink;

    /**
     * Get the link to logs for a run on a azure container registry.
     *
     * @return the logLink value
     */
    public String logLink() {
        return this.logLink;
    }

    /**
     * Set the link to logs for a run on a azure container registry.
     *
     * @param logLink the logLink value to set
     * @return the RunGetLogResultInner object itself.
     */
    public RunGetLogResultInner withLogLink(String logLink) {
        this.logLink = logLink;
        return this;
    }

    /**
     * Get the link to logs in registry for a run on a azure container registry.
     *
     * @return the logArtifactLink value
     */
    public String logArtifactLink() {
        return this.logArtifactLink;
    }

    /**
     * Set the link to logs in registry for a run on a azure container registry.
     *
     * @param logArtifactLink the logArtifactLink value to set
     * @return the RunGetLogResultInner object itself.
     */
    public RunGetLogResultInner withLogArtifactLink(String logArtifactLink) {
        this.logArtifactLink = logArtifactLink;
        return this;
    }

}
