// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.OperationsClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.OperationDefinitionInner;
import com.azure.resourcemanager.containerregistry.generated.models.OperationDefinition;
import com.azure.resourcemanager.containerregistry.generated.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final ContainerRegistryManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationDefinition> list() {
        PagedIterable<OperationDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationDefinition> list(Context context) {
        PagedIterable<OperationDefinitionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationDefinitionImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }
}
