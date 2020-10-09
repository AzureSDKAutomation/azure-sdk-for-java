/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_04_01.AvailablePrivateEndpointTypes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_04_01.AvailablePrivateEndpointType;

class AvailablePrivateEndpointTypesImpl extends WrapperImpl<AvailablePrivateEndpointTypesInner> implements AvailablePrivateEndpointTypes {
    private final NetworkManager manager;

    AvailablePrivateEndpointTypesImpl(NetworkManager manager) {
        super(manager.inner().availablePrivateEndpointTypes());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private AvailablePrivateEndpointTypeImpl wrapModel(AvailablePrivateEndpointTypeInner inner) {
        return  new AvailablePrivateEndpointTypeImpl(inner, manager());
    }

    @Override
    public Observable<AvailablePrivateEndpointType> listByResourceGroupAsync(final String location, final String resourceGroupName) {
        AvailablePrivateEndpointTypesInner client = this.inner();
        return client.listByResourceGroupAsync(location, resourceGroupName)
        .flatMapIterable(new Func1<Page<AvailablePrivateEndpointTypeInner>, Iterable<AvailablePrivateEndpointTypeInner>>() {
            @Override
            public Iterable<AvailablePrivateEndpointTypeInner> call(Page<AvailablePrivateEndpointTypeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailablePrivateEndpointTypeInner, AvailablePrivateEndpointType>() {
            @Override
            public AvailablePrivateEndpointType call(AvailablePrivateEndpointTypeInner inner) {
                return new AvailablePrivateEndpointTypeImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AvailablePrivateEndpointType> listAsync(final String location) {
        AvailablePrivateEndpointTypesInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<AvailablePrivateEndpointTypeInner>, Iterable<AvailablePrivateEndpointTypeInner>>() {
            @Override
            public Iterable<AvailablePrivateEndpointTypeInner> call(Page<AvailablePrivateEndpointTypeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailablePrivateEndpointTypeInner, AvailablePrivateEndpointType>() {
            @Override
            public AvailablePrivateEndpointType call(AvailablePrivateEndpointTypeInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
