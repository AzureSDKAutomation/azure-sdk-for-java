// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters supplied to the create or update source control operation. */
@JsonFlatten
@Fluent
public class SourceControlCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlCreateOrUpdateParameters.class);

    /*
     * The repo url of the source control.
     */
    @JsonProperty(value = "properties.repoUrl")
    private String repoUrl;

    /*
     * The repo branch of the source control. Include branch as empty string
     * for VsoTfvc.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /*
     * The folder path of the source control. Path must be relative.
     */
    @JsonProperty(value = "properties.folderPath")
    private String folderPath;

    /*
     * The auto async of the source control. Default is false.
     */
    @JsonProperty(value = "properties.autoSync")
    private Boolean autoSync;

    /*
     * The auto publish of the source control. Default is true.
     */
    @JsonProperty(value = "properties.publishRunbook")
    private Boolean publishRunbook;

    /*
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
     */
    @JsonProperty(value = "properties.sourceType")
    private SourceType sourceType;

    /*
     * The authorization token for the repo of the source control.
     */
    @JsonProperty(value = "properties.securityToken")
    private SourceControlSecurityTokenProperties securityToken;

    /*
     * The user description of the source control.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the repoUrl property: The repo url of the source control.
     *
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.repoUrl;
    }

    /**
     * Set the repoUrl property: The repo url of the source control.
     *
     * @param repoUrl the repoUrl value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @param branch the branch value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the folderPath property: The folder path of the source control. Path must be relative.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The folder path of the source control. Path must be relative.
     *
     * @param folderPath the folderPath value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the autoSync property: The auto async of the source control. Default is false.
     *
     * @return the autoSync value.
     */
    public Boolean autoSync() {
        return this.autoSync;
    }

    /**
     * Set the autoSync property: The auto async of the source control. Default is false.
     *
     * @param autoSync the autoSync value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withAutoSync(Boolean autoSync) {
        this.autoSync = autoSync;
        return this;
    }

    /**
     * Get the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @return the publishRunbook value.
     */
    public Boolean publishRunbook() {
        return this.publishRunbook;
    }

    /**
     * Set the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @param publishRunbook the publishRunbook value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withPublishRunbook(Boolean publishRunbook) {
        this.publishRunbook = publishRunbook;
        return this;
    }

    /**
     * Get the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
     *
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
     *
     * @param sourceType the sourceType value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the securityToken property: The authorization token for the repo of the source control.
     *
     * @return the securityToken value.
     */
    public SourceControlSecurityTokenProperties securityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The authorization token for the repo of the source control.
     *
     * @param securityToken the securityToken value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withSecurityToken(SourceControlSecurityTokenProperties securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the description property: The user description of the source control.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The user description of the source control.
     *
     * @param description the description value to set.
     * @return the SourceControlCreateOrUpdateParameters object itself.
     */
    public SourceControlCreateOrUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityToken() != null) {
            securityToken().validate();
        }
    }
}
