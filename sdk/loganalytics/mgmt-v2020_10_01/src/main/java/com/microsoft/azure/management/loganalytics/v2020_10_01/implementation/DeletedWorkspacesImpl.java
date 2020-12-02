/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.loganalytics.v2020_10_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.loganalytics.v2020_10_01.DeletedWorkspaces;
import com.microsoft.azure.management.loganalytics.v2020_10_01.WorkspaceModel;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class DeletedWorkspacesImpl extends GroupableResourcesCoreImpl<WorkspaceModel, WorkspaceModelImpl, WorkspaceInner, DeletedWorkspacesInner, LogAnalyticsManager>  implements DeletedWorkspaces {
    protected DeletedWorkspacesImpl(LogAnalyticsManager manager) {
        super(manager.inner().deletedWorkspaces(), manager);
    }

    @Override
    protected Observable<WorkspaceInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DeletedWorkspacesInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<WorkspaceModel> listByResourceGroup(String resourceGroupName) {
        DeletedWorkspacesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<WorkspaceModel> listByResourceGroupAsync(String resourceGroupName) {
        DeletedWorkspacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<WorkspaceInner>, Observable<WorkspaceInner>>() {
            @Override
            public Observable<WorkspaceInner> call(Page<WorkspaceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceInner, WorkspaceModel>() {
            @Override
            public WorkspaceModel call(WorkspaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<WorkspaceModel> list() {
        DeletedWorkspacesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<WorkspaceModel> listAsync() {
        DeletedWorkspacesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<WorkspaceInner>, Observable<WorkspaceInner>>() {
            @Override
            public Observable<WorkspaceInner> call(Page<WorkspaceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceInner, WorkspaceModel>() {
            @Override
            public WorkspaceModel call(WorkspaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected WorkspaceModelImpl wrapModel(WorkspaceInner inner) {
        return  new WorkspaceModelImpl(inner.name(), inner, manager());
    }

    @Override
    protected WorkspaceModelImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
