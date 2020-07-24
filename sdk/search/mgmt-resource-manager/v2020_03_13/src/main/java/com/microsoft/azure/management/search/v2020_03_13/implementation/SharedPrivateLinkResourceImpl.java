/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13.implementation;

import com.microsoft.azure.management.search.v2020_03_13.SharedPrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.search.v2020_03_13.SharedPrivateLinkResourceProperties;
import com.microsoft.azure.management.search.v2020_03_13.SearchManagementRequestOptions;
import java.util.UUID;
import rx.functions.Func1;

class SharedPrivateLinkResourceImpl extends CreatableUpdatableImpl<SharedPrivateLinkResource, SharedPrivateLinkResourceInner, SharedPrivateLinkResourceImpl> implements SharedPrivateLinkResource, SharedPrivateLinkResource.Definition, SharedPrivateLinkResource.Update {
    private final SearchManager manager;
    private String resourceGroupName;
    private String searchServiceName;
    private String sharedPrivateLinkResourceName;
    private SharedPrivateLinkResourceProperties cproperties;
    private SearchManagementRequestOptions csearchManagementRequestOptions;
    private SharedPrivateLinkResourceProperties uproperties;
    private SearchManagementRequestOptions usearchManagementRequestOptions;

    SharedPrivateLinkResourceImpl(String name, SearchManager manager) {
        super(name, new SharedPrivateLinkResourceInner());
        this.manager = manager;
        // Set resource name
        this.sharedPrivateLinkResourceName = name;
        //
        this.cproperties = new SharedPrivateLinkResourceProperties();
        this.csearchManagementRequestOptions = new SearchManagementRequestOptions();
        this.uproperties = new SharedPrivateLinkResourceProperties();
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
    }

    SharedPrivateLinkResourceImpl(SharedPrivateLinkResourceInner inner, SearchManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sharedPrivateLinkResourceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.searchServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "searchServices");
        this.sharedPrivateLinkResourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "sharedPrivateLinkResources");
        //
        this.cproperties = new SharedPrivateLinkResourceProperties();
        this.csearchManagementRequestOptions = new SearchManagementRequestOptions();
        this.uproperties = new SharedPrivateLinkResourceProperties();
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
    }

    @Override
    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SharedPrivateLinkResource> createResourceAsync() {
        SharedPrivateLinkResourcesInner client = this.manager().inner().sharedPrivateLinkResources();
        return client.createOrUpdateAsync(this.resourceGroupName, this.searchServiceName, this.sharedPrivateLinkResourceName, this.cproperties, this.csearchManagementRequestOptions)
            .map(new Func1<SharedPrivateLinkResourceInner, SharedPrivateLinkResourceInner>() {
               @Override
               public SharedPrivateLinkResourceInner call(SharedPrivateLinkResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SharedPrivateLinkResource> updateResourceAsync() {
        SharedPrivateLinkResourcesInner client = this.manager().inner().sharedPrivateLinkResources();
        return client.createOrUpdateAsync(this.resourceGroupName, this.searchServiceName, this.sharedPrivateLinkResourceName, this.uproperties, this.usearchManagementRequestOptions)
            .map(new Func1<SharedPrivateLinkResourceInner, SharedPrivateLinkResourceInner>() {
               @Override
               public SharedPrivateLinkResourceInner call(SharedPrivateLinkResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SharedPrivateLinkResourceInner> getInnerAsync() {
        SharedPrivateLinkResourcesInner client = this.manager().inner().sharedPrivateLinkResources();
        return client.getAsync(this.resourceGroupName, this.searchServiceName, this.sharedPrivateLinkResourceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new SharedPrivateLinkResourceProperties();
        this.csearchManagementRequestOptions = new SearchManagementRequestOptions();
        this.uproperties = new SharedPrivateLinkResourceProperties();
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SharedPrivateLinkResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SharedPrivateLinkResourceImpl withExistingSearchService(String resourceGroupName, String searchServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.searchServiceName = searchServiceName;
        return this;
    }

    @Override
    public SharedPrivateLinkResourceImpl withProperties(SharedPrivateLinkResourceProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

    @Override
    public SharedPrivateLinkResourceImpl withSearchManagementRequestOptions(SearchManagementRequestOptions searchManagementRequestOptions) {
        if (isInCreateMode()) {
            this.csearchManagementRequestOptions = searchManagementRequestOptions;
        } else {
            this.usearchManagementRequestOptions = searchManagementRequestOptions;
        }
        return this;
    }

}
