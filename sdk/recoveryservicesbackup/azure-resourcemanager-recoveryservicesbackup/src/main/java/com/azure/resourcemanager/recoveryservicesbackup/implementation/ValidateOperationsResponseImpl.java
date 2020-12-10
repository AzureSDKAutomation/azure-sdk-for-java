// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationsResponse;

public final class ValidateOperationsResponseImpl implements ValidateOperationsResponse {
    private ValidateOperationsResponseInner innerObject;

    private final RecoveryServicesBackupManager serviceManager;

    public ValidateOperationsResponseImpl(
        ValidateOperationsResponseInner innerObject, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ValidateOperationResponse validateOperationResponse() {
        return this.innerModel().validateOperationResponse();
    }

    public ValidateOperationsResponseInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
