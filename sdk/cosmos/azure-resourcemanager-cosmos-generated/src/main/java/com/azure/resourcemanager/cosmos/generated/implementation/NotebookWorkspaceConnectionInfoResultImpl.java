// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceConnectionInfoResultInner;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceConnectionInfoResult;

public final class NotebookWorkspaceConnectionInfoResultImpl implements NotebookWorkspaceConnectionInfoResult {
    private NotebookWorkspaceConnectionInfoResultInner innerObject;

    private final CosmosDBManager serviceManager;

    public NotebookWorkspaceConnectionInfoResultImpl(
        NotebookWorkspaceConnectionInfoResultInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String authToken() {
        return this.innerModel().authToken();
    }

    public String notebookServerEndpoint() {
        return this.innerModel().notebookServerEndpoint();
    }

    public NotebookWorkspaceConnectionInfoResultInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
