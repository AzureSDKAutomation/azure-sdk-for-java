// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.ExportJobsOperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.ExportJobsResultInner;
import com.azure.resourcemanager.dataprotection.models.ExportJobsOperationResults;
import com.azure.resourcemanager.dataprotection.models.ExportJobsResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExportJobsOperationResultsImpl implements ExportJobsOperationResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportJobsOperationResultsImpl.class);

    private final ExportJobsOperationResultsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public ExportJobsOperationResultsImpl(
        ExportJobsOperationResultsClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExportJobsResult get(String resourceGroupName, String vaultName, String operationId) {
        ExportJobsResultInner inner = this.serviceClient().get(resourceGroupName, vaultName, operationId);
        if (inner != null) {
            return new ExportJobsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExportJobsResult> getWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        Response<ExportJobsResultInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vaultName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExportJobsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ExportJobsOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
