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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.JobDetails;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.VaultJobResourceModel;

class JobDetailsImpl extends WrapperImpl<JobDetailsInner> implements JobDetails {
    private final RecoveryServicesManager manager;

    JobDetailsImpl(RecoveryServicesManager manager) {
        super(manager.inner().jobDetails());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private VaultJobResourceModelImpl wrapModel(JobResourceInner inner) {
        return  new VaultJobResourceModelImpl(inner, manager());
    }

    @Override
    public Observable<VaultJobResourceModel> getAsync(String vaultName, String resourceGroupName, String jobName) {
        JobDetailsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, jobName)
        .flatMap(new Func1<JobResourceInner, Observable<VaultJobResourceModel>>() {
            @Override
            public Observable<VaultJobResourceModel> call(JobResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VaultJobResourceModel)wrapModel(inner));
                }
            }
       });
    }

}
