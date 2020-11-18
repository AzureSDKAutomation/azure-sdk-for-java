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
import com.microsoft.azure.management.synapse.v2020-12-01.SqlPoolMetadataSyncConfigs;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.MetadataSyncConfig;

class SqlPoolMetadataSyncConfigsImpl extends WrapperImpl<SqlPoolMetadataSyncConfigsInner> implements SqlPoolMetadataSyncConfigs {
    private final SynapseManager manager;

    SqlPoolMetadataSyncConfigsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolMetadataSyncConfigs());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MetadataSyncConfig> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolMetadataSyncConfigsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName)
        .map(new Func1<MetadataSyncConfigInner, MetadataSyncConfig>() {
            @Override
            public MetadataSyncConfig call(MetadataSyncConfigInner inner) {
                return new MetadataSyncConfigImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MetadataSyncConfig> createAsync(String resourceGroupName, String workspaceName, String sqlPoolName, MetadataSyncConfigInner metadataSyncConfiguration) {
        SqlPoolMetadataSyncConfigsInner client = this.inner();
        return client.createAsync(resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration)
        .map(new Func1<MetadataSyncConfigInner, MetadataSyncConfig>() {
            @Override
            public MetadataSyncConfig call(MetadataSyncConfigInner inner) {
                return new MetadataSyncConfigImpl(inner, manager());
            }
        });
    }

}
