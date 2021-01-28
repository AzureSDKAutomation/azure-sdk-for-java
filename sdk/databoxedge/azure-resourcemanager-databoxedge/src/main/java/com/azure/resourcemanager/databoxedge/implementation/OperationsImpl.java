// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.OperationsClient;
import com.azure.resourcemanager.databoxedge.fluent.models.OperationInner;
import com.azure.resourcemanager.databoxedge.models.Operation;
import com.azure.resourcemanager.databoxedge.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> list() {
        PagedIterable<OperationInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> list(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
