/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ssis Package.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SsisPackage.class)
@JsonTypeName("Package")
public class SsisPackage extends SsisObjectMetadata {
    /**
     * Folder id which contains package.
     */
    @JsonProperty(value = "folderId")
    private Long folderId;

    /**
     * Project version which contains package.
     */
    @JsonProperty(value = "projectVersion")
    private Long projectVersion;

    /**
     * Project id which contains package.
     */
    @JsonProperty(value = "projectId")
    private Long projectId;

    /**
     * Parameters in package.
     */
    @JsonProperty(value = "parameters")
    private List<SsisParameter> parameters;

    /**
     * Get folder id which contains package.
     *
     * @return the folderId value
     */
    public Long folderId() {
        return this.folderId;
    }

    /**
     * Set folder id which contains package.
     *
     * @param folderId the folderId value to set
     * @return the SsisPackage object itself.
     */
    public SsisPackage withFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * Get project version which contains package.
     *
     * @return the projectVersion value
     */
    public Long projectVersion() {
        return this.projectVersion;
    }

    /**
     * Set project version which contains package.
     *
     * @param projectVersion the projectVersion value to set
     * @return the SsisPackage object itself.
     */
    public SsisPackage withProjectVersion(Long projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }

    /**
     * Get project id which contains package.
     *
     * @return the projectId value
     */
    public Long projectId() {
        return this.projectId;
    }

    /**
     * Set project id which contains package.
     *
     * @param projectId the projectId value to set
     * @return the SsisPackage object itself.
     */
    public SsisPackage withProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get parameters in package.
     *
     * @return the parameters value
     */
    public List<SsisParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set parameters in package.
     *
     * @param parameters the parameters value to set
     * @return the SsisPackage object itself.
     */
    public SsisPackage withParameters(List<SsisParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

}
