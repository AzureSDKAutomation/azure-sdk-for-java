/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.Keys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.Key;

class KeysImpl extends WrapperImpl<KeysInner> implements Keys {
    private final SynapseManager manager;

    KeysImpl(SynapseManager manager) {
        super(manager.inner().keys());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public KeyImpl define(String name) {
        return wrapModel(name);
    }

    private KeyImpl wrapModel(KeyInner inner) {
        return  new KeyImpl(inner, manager());
    }

    private KeyImpl wrapModel(String name) {
        return new KeyImpl(name, this.manager());
    }

    @Override
    public Observable<Key> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        KeysInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<KeyInner>, Iterable<KeyInner>>() {
            @Override
            public Iterable<KeyInner> call(Page<KeyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<KeyInner, Key>() {
            @Override
            public Key call(KeyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Key> getAsync(String resourceGroupName, String workspaceName, String keyName) {
        KeysInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, keyName)
        .flatMap(new Func1<KeyInner, Observable<Key>>() {
            @Override
            public Observable<Key> call(KeyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Key)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String keyName) {
        KeysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, keyName).toCompletable();
    }

}
