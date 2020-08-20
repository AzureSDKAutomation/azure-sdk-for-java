/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.Controllers;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.DelegatedController;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.ControllerTypeParameters;

class ControllersImpl extends WrapperImpl<ControllersInner> implements Controllers {
    private final DelegatedNetworkManager manager;

    ControllersImpl(DelegatedNetworkManager manager) {
        super(manager.inner().controllers());
        this.manager = manager;
    }

    public DelegatedNetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DelegatedController> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        ControllersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, resourceName)
        .map(new Func1<DelegatedControllerInner, DelegatedController>() {
            @Override
            public DelegatedController call(DelegatedControllerInner inner) {
                return new DelegatedControllerImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DelegatedController> createAsync(String resourceGroupName, String resourceName, ControllerTypeParameters controllerParameters) {
        ControllersInner client = this.inner();
        return client.createAsync(resourceGroupName, resourceName, controllerParameters)
        .map(new Func1<DelegatedControllerInner, DelegatedController>() {
            @Override
            public DelegatedController call(DelegatedControllerInner inner) {
                return new DelegatedControllerImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName) {
        ControllersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName).toCompletable();
    }

    @Override
    public Observable<DelegatedController> patchAsync(String resourceGroupName, String resourceName, ControllerTypeParameters controllerParameters) {
        ControllersInner client = this.inner();
        return client.patchAsync(resourceGroupName, resourceName, controllerParameters)
        .map(new Func1<DelegatedControllerInner, DelegatedController>() {
            @Override
            public DelegatedController call(DelegatedControllerInner inner) {
                return new DelegatedControllerImpl(inner, manager());
            }
        });
    }

}
