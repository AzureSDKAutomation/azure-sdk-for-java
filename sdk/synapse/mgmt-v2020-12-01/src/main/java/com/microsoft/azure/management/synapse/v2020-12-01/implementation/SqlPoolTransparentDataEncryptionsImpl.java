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
import com.microsoft.azure.management.synapse.v2020-12-01.SqlPoolTransparentDataEncryptions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020-12-01.TransparentDataEncryption;

class SqlPoolTransparentDataEncryptionsImpl extends WrapperImpl<SqlPoolTransparentDataEncryptionsInner> implements SqlPoolTransparentDataEncryptions {
    private final SynapseManager manager;

    SqlPoolTransparentDataEncryptionsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolTransparentDataEncryptions());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TransparentDataEncryption> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolTransparentDataEncryptionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName)
        .map(new Func1<TransparentDataEncryptionInner, TransparentDataEncryption>() {
            @Override
            public TransparentDataEncryption call(TransparentDataEncryptionInner inner) {
                return new TransparentDataEncryptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransparentDataEncryption> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolTransparentDataEncryptionsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, workspaceName, sqlPoolName)
        .map(new Func1<TransparentDataEncryptionInner, TransparentDataEncryption>() {
            @Override
            public TransparentDataEncryption call(TransparentDataEncryptionInner inner) {
                return new TransparentDataEncryptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransparentDataEncryption> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolTransparentDataEncryptionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<TransparentDataEncryptionInner>, Iterable<TransparentDataEncryptionInner>>() {
            @Override
            public Iterable<TransparentDataEncryptionInner> call(Page<TransparentDataEncryptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransparentDataEncryptionInner, TransparentDataEncryption>() {
            @Override
            public TransparentDataEncryption call(TransparentDataEncryptionInner inner) {
                return new TransparentDataEncryptionImpl(inner, manager());
            }
        });
    }

}
