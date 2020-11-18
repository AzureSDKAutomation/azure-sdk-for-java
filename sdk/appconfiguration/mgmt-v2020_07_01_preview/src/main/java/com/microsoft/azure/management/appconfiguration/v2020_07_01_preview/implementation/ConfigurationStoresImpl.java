/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.ConfigurationStores;
import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.ConfigurationStore;
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
import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.ApiKey;

class ConfigurationStoresImpl extends GroupableResourcesCoreImpl<ConfigurationStore, ConfigurationStoreImpl, ConfigurationStoreInner, ConfigurationStoresInner, AppConfigurationManager>  implements ConfigurationStores {
    protected ConfigurationStoresImpl(AppConfigurationManager manager) {
        super(manager.inner().configurationStores(), manager);
    }

    @Override
    protected Observable<ConfigurationStoreInner> getInnerAsync(String resourceGroupName, String name) {
        ConfigurationStoresInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ConfigurationStoresInner client = this.inner();
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
    public PagedList<ConfigurationStore> listByResourceGroup(String resourceGroupName) {
        ConfigurationStoresInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ConfigurationStore> listByResourceGroupAsync(String resourceGroupName) {
        ConfigurationStoresInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ConfigurationStoreInner>, Iterable<ConfigurationStoreInner>>() {
            @Override
            public Iterable<ConfigurationStoreInner> call(Page<ConfigurationStoreInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConfigurationStoreInner, ConfigurationStore>() {
            @Override
            public ConfigurationStore call(ConfigurationStoreInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ConfigurationStore> list() {
        ConfigurationStoresInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ConfigurationStore> listAsync() {
        ConfigurationStoresInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ConfigurationStoreInner>, Iterable<ConfigurationStoreInner>>() {
            @Override
            public Iterable<ConfigurationStoreInner> call(Page<ConfigurationStoreInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConfigurationStoreInner, ConfigurationStore>() {
            @Override
            public ConfigurationStore call(ConfigurationStoreInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ConfigurationStoreImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<ApiKey> listKeysAsync(final String resourceGroupName, final String configStoreName) {
        ConfigurationStoresInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, configStoreName)
        .flatMapIterable(new Func1<Page<ApiKeyInner>, Iterable<ApiKeyInner>>() {
            @Override
            public Iterable<ApiKeyInner> call(Page<ApiKeyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiKeyInner, ApiKey>() {
            @Override
            public ApiKey call(ApiKeyInner inner) {
                return new ApiKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApiKey> regenerateKeyAsync(String resourceGroupName, String configStoreName) {
        ConfigurationStoresInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, configStoreName)
        .map(new Func1<ApiKeyInner, ApiKey>() {
            @Override
            public ApiKey call(ApiKeyInner inner) {
                return new ApiKeyImpl(inner, manager());
            }
        });
    }

    @Override
    protected ConfigurationStoreImpl wrapModel(ConfigurationStoreInner inner) {
        return  new ConfigurationStoreImpl(inner.name(), inner, manager());
    }

    @Override
    protected ConfigurationStoreImpl wrapModel(String name) {
        return new ConfigurationStoreImpl(name, new ConfigurationStoreInner(), this.manager());
    }

}
