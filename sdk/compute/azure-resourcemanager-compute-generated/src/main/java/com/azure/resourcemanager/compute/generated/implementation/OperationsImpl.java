// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.OperationsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.ComputeOperationValueInner;
import com.azure.resourcemanager.compute.generated.models.ComputeOperationValue;
import com.azure.resourcemanager.compute.generated.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final ComputeManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ComputeOperationValue> list() {
        PagedIterable<ComputeOperationValueInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ComputeOperationValueImpl(inner1, this.manager()));
    }

    public PagedIterable<ComputeOperationValue> list(Context context) {
        PagedIterable<ComputeOperationValueInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ComputeOperationValueImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
