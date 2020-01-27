/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.Roles;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.databoxedge.Role;

class RolesImpl extends WrapperImpl<RolesInner> implements Roles {
    private final DataBoxEdgeManager manager;

    RolesImpl(DataBoxEdgeManager manager) {
        super(manager.inner().roles());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public RoleImpl define(String name) {
        return wrapModel(name);
    }

    private RoleImpl wrapModel(RoleInner inner) {
        return  new RoleImpl(inner, manager());
    }

    private RoleImpl wrapModel(String name) {
        return new RoleImpl(name, this.manager());
    }

    @Override
    public Observable<Role> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        RolesInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<RoleInner>, Iterable<RoleInner>>() {
            @Override
            public Iterable<RoleInner> call(Page<RoleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RoleInner, Role>() {
            @Override
            public Role call(RoleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Role> getAsync(String deviceName, String name, String resourceGroupName) {
        RolesInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .flatMap(new Func1<RoleInner, Observable<Role>>() {
            @Override
            public Observable<Role> call(RoleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Role)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String deviceName, String name, String resourceGroupName) {
        RolesInner client = this.inner();
        return client.deleteAsync(deviceName, name, resourceGroupName).toCompletable();
    }

}
