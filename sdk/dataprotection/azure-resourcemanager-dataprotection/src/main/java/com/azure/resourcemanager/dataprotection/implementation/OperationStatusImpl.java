// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.OperationStatusClient;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.dataprotection.models.OperationResource;
import com.azure.resourcemanager.dataprotection.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationStatusImpl implements OperationStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusImpl.class);

    private final OperationStatusClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public OperationStatusImpl(
        OperationStatusClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationResource get(String location, String operationId) {
        OperationResourceInner inner = this.serviceClient().get(location, operationId);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationResource> getWithResponse(String location, String operationId, Context context) {
        Response<OperationResourceInner> inner = this.serviceClient().getWithResponse(location, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
