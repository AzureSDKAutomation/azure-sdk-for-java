/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.windowsiot.v2018_02_16_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.windowsiot.v2018_02_16_preview.Services;
import com.microsoft.azure.management.windowsiot.v2018_02_16_preview.DeviceService;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.windowsiot.v2018_02_16_preview.DeviceServiceNameAvailabilityInfo;

class ServicesImpl extends GroupableResourcesCoreImpl<DeviceService, DeviceServiceImpl, DeviceServiceInner, ServicesInner, WindowsIoTManager>  implements Services {
    protected ServicesImpl(WindowsIoTManager manager) {
        super(manager.inner().services(), manager);
    }

    @Override
    protected Observable<DeviceServiceInner> getInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<DeviceService> listByResourceGroup(String resourceGroupName) {
        ServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DeviceService> listByResourceGroupAsync(String resourceGroupName) {
        ServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DeviceServiceInner>, Iterable<DeviceServiceInner>>() {
            @Override
            public Iterable<DeviceServiceInner> call(Page<DeviceServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeviceServiceInner, DeviceService>() {
            @Override
            public DeviceService call(DeviceServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DeviceService> list() {
        ServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DeviceService> listAsync() {
        ServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DeviceServiceInner>, Iterable<DeviceServiceInner>>() {
            @Override
            public Iterable<DeviceServiceInner> call(Page<DeviceServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeviceServiceInner, DeviceService>() {
            @Override
            public DeviceService call(DeviceServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DeviceServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<DeviceServiceNameAvailabilityInfo> checkDeviceServiceNameAvailabilityAsync(String name) {
        ServicesInner client = this.inner();
        return client.checkDeviceServiceNameAvailabilityAsync(name)
        .map(new Func1<DeviceServiceNameAvailabilityInfoInner, DeviceServiceNameAvailabilityInfo>() {
            @Override
            public DeviceServiceNameAvailabilityInfo call(DeviceServiceNameAvailabilityInfoInner inner) {
                return new DeviceServiceNameAvailabilityInfoImpl(inner, manager());
            }
        });
    }

    @Override
    protected DeviceServiceImpl wrapModel(DeviceServiceInner inner) {
        return  new DeviceServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected DeviceServiceImpl wrapModel(String name) {
        return new DeviceServiceImpl(name, new DeviceServiceInner(), this.manager());
    }

}
