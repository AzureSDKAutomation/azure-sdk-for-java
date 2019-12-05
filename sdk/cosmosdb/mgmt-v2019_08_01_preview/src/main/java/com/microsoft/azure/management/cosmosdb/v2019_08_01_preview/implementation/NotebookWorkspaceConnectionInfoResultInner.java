/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection info for the given notebook workspace.
 */
public class NotebookWorkspaceConnectionInfoResultInner {
    /**
     * Specifies auth token used for connecting to Notebook server (uses
     * token-based auth).
     */
    @JsonProperty(value = "authToken")
    private String authToken;

    /**
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "notebookServerEndpoint")
    private String notebookServerEndpoint;

    /**
     * Get specifies auth token used for connecting to Notebook server (uses token-based auth).
     *
     * @return the authToken value
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Set specifies auth token used for connecting to Notebook server (uses token-based auth).
     *
     * @param authToken the authToken value to set
     * @return the NotebookWorkspaceConnectionInfoResultInner object itself.
     */
    public NotebookWorkspaceConnectionInfoResultInner withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * Get specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Set specifies the endpoint of Notebook server.
     *
     * @param notebookServerEndpoint the notebookServerEndpoint value to set
     * @return the NotebookWorkspaceConnectionInfoResultInner object itself.
     */
    public NotebookWorkspaceConnectionInfoResultInner withNotebookServerEndpoint(String notebookServerEndpoint) {
        this.notebookServerEndpoint = notebookServerEndpoint;
        return this;
    }

}
