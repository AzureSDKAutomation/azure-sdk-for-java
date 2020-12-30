// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.OperationOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationOperations;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationsResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationOperationsImpl implements OperationOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationOperationsImpl.class);

    private final OperationOperationsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public OperationOperationsImpl(
        OperationOperationsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ValidateOperationsResponse validate(
        String vaultName, String resourceGroupName, ValidateOperationRequest parameters) {
        ValidateOperationsResponseInner inner = this.serviceClient().validate(vaultName, resourceGroupName, parameters);
        if (inner != null) {
            return new ValidateOperationsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateOperationsResponse> validateWithResponse(
        String vaultName, String resourceGroupName, ValidateOperationRequest parameters, Context context) {
        Response<ValidateOperationsResponseInner> inner =
            this.serviceClient().validateWithResponse(vaultName, resourceGroupName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateOperationsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationOperationsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
