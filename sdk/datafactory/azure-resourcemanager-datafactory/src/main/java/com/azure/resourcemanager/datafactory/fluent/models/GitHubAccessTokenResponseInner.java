// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get GitHub access token response definition. */
@Fluent
public final class GitHubAccessTokenResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GitHubAccessTokenResponseInner.class);

    /*
     * GitHub access token.
     */
    @JsonProperty(value = "gitHubAccessToken")
    private String gitHubAccessToken;

    /**
     * Get the gitHubAccessToken property: GitHub access token.
     *
     * @return the gitHubAccessToken value.
     */
    public String gitHubAccessToken() {
        return this.gitHubAccessToken;
    }

    /**
     * Set the gitHubAccessToken property: GitHub access token.
     *
     * @param gitHubAccessToken the gitHubAccessToken value to set.
     * @return the GitHubAccessTokenResponseInner object itself.
     */
    public GitHubAccessTokenResponseInner withGitHubAccessToken(String gitHubAccessToken) {
        this.gitHubAccessToken = gitHubAccessToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
