// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BmsPrepareDataMoveOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.VaultStorageConfigOperationResultResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BmsPrepareDataMoveOperationResults;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultStorageConfigOperationResultResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BmsPrepareDataMoveOperationResultsImpl implements BmsPrepareDataMoveOperationResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BmsPrepareDataMoveOperationResultsImpl.class);

    private final BmsPrepareDataMoveOperationResultsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public BmsPrepareDataMoveOperationResultsImpl(
        BmsPrepareDataMoveOperationResultsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VaultStorageConfigOperationResultResponse get(
        String vaultName, String resourceGroupName, String operationId) {
        VaultStorageConfigOperationResultResponseInner inner =
            this.serviceClient().get(vaultName, resourceGroupName, operationId);
        if (inner != null) {
            return new VaultStorageConfigOperationResultResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VaultStorageConfigOperationResultResponse> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context) {
        Response<VaultStorageConfigOperationResultResponseInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VaultStorageConfigOperationResultResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private BmsPrepareDataMoveOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
