// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.OperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.AvailableRpOperationInner;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.synapse.models.AvailableRpOperation;
import com.azure.resourcemanager.synapse.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.synapse.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.synapse.models.OperationResource;
import com.azure.resourcemanager.synapse.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResponse checkNameAvailability(CheckNameAvailabilityRequest request) {
        CheckNameAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(request);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest request, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(request, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public List<AvailableRpOperation> list() {
        List<AvailableRpOperationInner> inner = this.serviceClient().list();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AvailableRpOperationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<AvailableRpOperation>> listWithResponse(Context context) {
        Response<List<AvailableRpOperationInner>> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new AvailableRpOperationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public void getLocationHeaderResult(String resourceGroupName, String workspaceName, String operationId) {
        this.serviceClient().getLocationHeaderResult(resourceGroupName, workspaceName, operationId);
    }

    public Response<Void> getLocationHeaderResultWithResponse(
        String resourceGroupName, String workspaceName, String operationId, Context context) {
        return this
            .serviceClient()
            .getLocationHeaderResultWithResponse(resourceGroupName, workspaceName, operationId, context);
    }

    public OperationResource getAzureAsyncHeaderResult(
        String resourceGroupName, String workspaceName, String operationId) {
        OperationResourceInner inner =
            this.serviceClient().getAzureAsyncHeaderResult(resourceGroupName, workspaceName, operationId);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationResource> getAzureAsyncHeaderResultWithResponse(
        String resourceGroupName, String workspaceName, String operationId, Context context) {
        Response<OperationResourceInner> inner =
            this
                .serviceClient()
                .getAzureAsyncHeaderResultWithResponse(resourceGroupName, workspaceName, operationId, context);
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

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
