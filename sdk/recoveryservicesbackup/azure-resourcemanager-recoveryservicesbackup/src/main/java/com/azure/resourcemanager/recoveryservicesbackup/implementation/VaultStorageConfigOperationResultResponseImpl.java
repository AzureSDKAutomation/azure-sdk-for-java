// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.VaultStorageConfigOperationResultResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultStorageConfigOperationResultResponse;

public final class VaultStorageConfigOperationResultResponseImpl implements VaultStorageConfigOperationResultResponse {
    private VaultStorageConfigOperationResultResponseInner innerObject;

    private final RecoveryServicesBackupManager serviceManager;

    public VaultStorageConfigOperationResultResponseImpl(
        VaultStorageConfigOperationResultResponseInner innerObject, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public VaultStorageConfigOperationResultResponseInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
