/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_08_01.NotebookWorkspace;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class NotebookWorkspaceImpl extends CreatableUpdatableImpl<NotebookWorkspace, NotebookWorkspaceInner, NotebookWorkspaceImpl> implements NotebookWorkspace, NotebookWorkspace.Definition, NotebookWorkspace.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;

    NotebookWorkspaceImpl(String name, CosmosDBManager manager) {
        super(name, new NotebookWorkspaceInner());
        this.manager = manager;
        // Set resource name
        this.accountName = name;
        //
    }

    NotebookWorkspaceImpl(NotebookWorkspaceInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accountName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        //
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NotebookWorkspace> createResourceAsync() {
        NotebookWorkspacesInner client = this.manager().inner().notebookWorkspaces();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NotebookWorkspace> updateResourceAsync() {
        NotebookWorkspacesInner client = this.manager().inner().notebookWorkspaces();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NotebookWorkspaceInner> getInnerAsync() {
        NotebookWorkspacesInner client = this.manager().inner().notebookWorkspaces();
        return client.getAsync(this.resourceGroupName, this.accountName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String notebookServerEndpoint() {
        return this.inner().notebookServerEndpoint();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public NotebookWorkspaceImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

}
