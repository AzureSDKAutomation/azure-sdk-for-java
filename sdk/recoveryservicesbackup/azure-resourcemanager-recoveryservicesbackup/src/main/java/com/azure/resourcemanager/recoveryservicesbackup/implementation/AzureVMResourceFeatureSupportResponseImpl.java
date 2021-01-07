// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AzureVMResourceFeatureSupportResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVMResourceFeatureSupportResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.SupportStatus;

public final class AzureVMResourceFeatureSupportResponseImpl implements AzureVMResourceFeatureSupportResponse {
    private AzureVMResourceFeatureSupportResponseInner innerObject;

    private final RecoveryServicesBackupManager serviceManager;

    AzureVMResourceFeatureSupportResponseImpl(
        AzureVMResourceFeatureSupportResponseInner innerObject, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SupportStatus supportStatus() {
        return this.innerModel().supportStatus();
    }

    public AzureVMResourceFeatureSupportResponseInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
