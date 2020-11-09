/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.PrivateLinkScopeOperationStatus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;

class PrivateLinkScopeOperationStatusImpl extends WrapperImpl<PrivateLinkScopeOperationStatusInner> implements PrivateLinkScopeOperationStatus {
    private final MonitorManager manager;

    PrivateLinkScopeOperationStatusImpl(MonitorManager manager) {
        super(manager.inner().privateLinkScopeOperationStatus());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    private OperationStatusImpl wrapModel(OperationStatusInner inner) {
        return  new OperationStatusImpl(inner, manager());
    }

    private Observable<OperationStatusInner> getInnerAsync(String resourceGroupName, String name) {
        PrivateLinkScopeOperationStatusInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public OperationStatus getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<OperationStatus> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).flatMap(new Func1<OperationStatusInner, Observable<OperationStatus>> () {
            @Override
            public Observable<OperationStatus> call(OperationStatusInner innerT) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((OperationStatus)wrapModel(innerT));
                }
            }
        });
    }

    @Override
    public ServiceFuture<OperationStatus> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<OperationStatus> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
    }

}
