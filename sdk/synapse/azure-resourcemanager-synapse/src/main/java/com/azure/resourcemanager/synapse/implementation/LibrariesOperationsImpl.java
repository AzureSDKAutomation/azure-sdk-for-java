// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.LibrariesOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.LibraryResourceInner;
import com.azure.resourcemanager.synapse.models.LibrariesOperations;
import com.azure.resourcemanager.synapse.models.LibraryResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LibrariesOperationsImpl implements LibrariesOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LibrariesOperationsImpl.class);

    private final LibrariesOperationsClient innerClient;

    private final SynapseManager serviceManager;

    public LibrariesOperationsImpl(LibrariesOperationsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LibraryResource> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<LibraryResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new LibraryResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LibraryResource> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<LibraryResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new LibraryResourceImpl(inner1, this.manager()));
    }

    private LibrariesOperationsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
