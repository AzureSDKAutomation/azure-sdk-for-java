/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Factory's git repo information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = FactoryRepoConfiguration.class)
@JsonTypeName("FactoryRepoConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FactoryVSTSConfiguration", value = FactoryVSTSConfiguration.class),
    @JsonSubTypes.Type(name = "FactoryGitHubConfiguration", value = FactoryGitHubConfiguration.class)
})
public class FactoryRepoConfiguration {
    /**
     * Account name.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /**
     * Repository name.
     */
    @JsonProperty(value = "repositoryName", required = true)
    private String repositoryName;

    /**
     * Collaboration branch.
     */
    @JsonProperty(value = "collaborationBranch", required = true)
    private String collaborationBranch;

    /**
     * Root folder.
     */
    @JsonProperty(value = "rootFolder", required = true)
    private String rootFolder;

    /**
     * Last commit id.
     */
    @JsonProperty(value = "lastCommitId")
    private String lastCommitId;

    /**
     * Get account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set account name.
     *
     * @param accountName the accountName value to set
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get repository name.
     *
     * @return the repositoryName value
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Set repository name.
     *
     * @param repositoryName the repositoryName value to set
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get collaboration branch.
     *
     * @return the collaborationBranch value
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Set collaboration branch.
     *
     * @param collaborationBranch the collaborationBranch value to set
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withCollaborationBranch(String collaborationBranch) {
        this.collaborationBranch = collaborationBranch;
        return this;
    }

    /**
     * Get root folder.
     *
     * @return the rootFolder value
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * Set root folder.
     *
     * @param rootFolder the rootFolder value to set
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
        return this;
    }

    /**
     * Get last commit id.
     *
     * @return the lastCommitId value
     */
    public String lastCommitId() {
        return this.lastCommitId;
    }

    /**
     * Set last commit id.
     *
     * @param lastCommitId the lastCommitId value to set
     * @return the FactoryRepoConfiguration object itself.
     */
    public FactoryRepoConfiguration withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

}
