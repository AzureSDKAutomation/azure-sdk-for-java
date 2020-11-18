/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020-12-01.WorkspaceManagedIdentitySqlControlSettings;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.ManagedIdentitySqlControlSettingsModel;

class WorkspaceManagedIdentitySqlControlSettingsImpl extends WrapperImpl<WorkspaceManagedIdentitySqlControlSettingsInner> implements WorkspaceManagedIdentitySqlControlSettings {
    private final SynapseManager manager;

    WorkspaceManagedIdentitySqlControlSettingsImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedIdentitySqlControlSettings());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedIdentitySqlControlSettingsModel> getAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedIdentitySqlControlSettingsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .map(new Func1<ManagedIdentitySqlControlSettingsModelInner, ManagedIdentitySqlControlSettingsModel>() {
            @Override
            public ManagedIdentitySqlControlSettingsModel call(ManagedIdentitySqlControlSettingsModelInner inner) {
                return new ManagedIdentitySqlControlSettingsModelImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ManagedIdentitySqlControlSettingsModel> createOrUpdateAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedIdentitySqlControlSettingsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, workspaceName)
        .map(new Func1<ManagedIdentitySqlControlSettingsModelInner, ManagedIdentitySqlControlSettingsModel>() {
            @Override
            public ManagedIdentitySqlControlSettingsModel call(ManagedIdentitySqlControlSettingsModelInner inner) {
                return new ManagedIdentitySqlControlSettingsModelImpl(inner, manager());
            }
        });
    }

}
