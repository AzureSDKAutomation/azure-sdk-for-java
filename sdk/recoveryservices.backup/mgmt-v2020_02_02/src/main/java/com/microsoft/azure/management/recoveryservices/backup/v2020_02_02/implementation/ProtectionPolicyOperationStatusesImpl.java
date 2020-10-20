/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionPolicyOperationStatuses;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupPolicyVaultOperationStatus;

class ProtectionPolicyOperationStatusesImpl extends WrapperImpl<ProtectionPolicyOperationStatusesInner> implements ProtectionPolicyOperationStatuses {
    private final RecoveryServicesManager manager;

    ProtectionPolicyOperationStatusesImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionPolicyOperationStatuses());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupPolicyVaultOperationStatusImpl wrapModel(OperationStatusInner inner) {
        return  new BackupPolicyVaultOperationStatusImpl(inner, manager());
    }

    @Override
    public Observable<BackupPolicyVaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        ProtectionPolicyOperationStatusesInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, policyName, operationId)
        .flatMap(new Func1<OperationStatusInner, Observable<BackupPolicyVaultOperationStatus>>() {
            @Override
            public Observable<BackupPolicyVaultOperationStatus> call(OperationStatusInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BackupPolicyVaultOperationStatus)wrapModel(inner));
                }
            }
       });
    }

}
