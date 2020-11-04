/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2020_04_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_04_01_preview.WorkspaceAadAdmins;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_04_01_preview.WorkspaceAadAdminInfo;

class WorkspaceAadAdminsImpl extends WrapperImpl<WorkspaceAadAdminsInner> implements WorkspaceAadAdmins {
    private final SynapseManager manager;

    WorkspaceAadAdminsImpl(SynapseManager manager) {
        super(manager.inner().workspaceAadAdmins());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkspaceAadAdminInfo> getAsync(String resourceGroupName, String workspaceName) {
        WorkspaceAadAdminsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .map(new Func1<WorkspaceAadAdminInfoInner, WorkspaceAadAdminInfo>() {
            @Override
            public WorkspaceAadAdminInfo call(WorkspaceAadAdminInfoInner inner) {
                return new WorkspaceAadAdminInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WorkspaceAadAdminInfo> createOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        WorkspaceAadAdminsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, workspaceName, aadAdminInfo)
        .map(new Func1<WorkspaceAadAdminInfoInner, WorkspaceAadAdminInfo>() {
            @Override
            public WorkspaceAadAdminInfo call(WorkspaceAadAdminInfoInner inner) {
                return new WorkspaceAadAdminInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName) {
        WorkspaceAadAdminsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName).toCompletable();
    }

}
