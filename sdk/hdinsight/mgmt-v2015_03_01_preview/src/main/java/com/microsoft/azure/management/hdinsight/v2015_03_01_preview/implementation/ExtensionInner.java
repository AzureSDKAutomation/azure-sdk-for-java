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
 * Cluster monitoring extensions.
 */
public class ExtensionInner {
    /**
     * The workspace ID for the cluster monitoring extension.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /**
     * The certificate for the cluster monitoring extensions.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Get the workspace ID for the cluster monitoring extension.
     *
     * @return the workspaceId value
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspace ID for the cluster monitoring extension.
     *
     * @param workspaceId the workspaceId value to set
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the certificate for the cluster monitoring extensions.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the certificate for the cluster monitoring extensions.
     *
     * @param primaryKey the primaryKey value to set
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

}
