/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.TaskRuns;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.TaskRun;

class TaskRunsImpl extends WrapperImpl<TaskRunsInner> implements TaskRuns {
    private final ContainerRegistryManager manager;

    TaskRunsImpl(ContainerRegistryManager manager) {
        super(manager.inner().taskRuns());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public TaskRunImpl define(String name) {
        return wrapModel(name);
    }

    private TaskRunImpl wrapModel(TaskRunInner inner) {
        return  new TaskRunImpl(inner, manager());
    }

    private TaskRunImpl wrapModel(String name) {
        return new TaskRunImpl(name, this.manager());
    }

    @Override
    public Observable<TaskRun> getDetailsAsync(String resourceGroupName, String registryName, String taskRunName) {
        TaskRunsInner client = this.inner();
        return client.getDetailsAsync(resourceGroupName, registryName, taskRunName)
        .map(new Func1<TaskRunInner, TaskRun>() {
            @Override
            public TaskRun call(TaskRunInner inner) {
                return new TaskRunImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TaskRun> listAsync(final String resourceGroupName, final String registryName) {
        TaskRunsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<TaskRunInner>, Iterable<TaskRunInner>>() {
            @Override
            public Iterable<TaskRunInner> call(Page<TaskRunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TaskRunInner, TaskRun>() {
            @Override
            public TaskRun call(TaskRunInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<TaskRun> getAsync(String resourceGroupName, String registryName, String taskRunName) {
        TaskRunsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, taskRunName)
        .flatMap(new Func1<TaskRunInner, Observable<TaskRun>>() {
            @Override
            public Observable<TaskRun> call(TaskRunInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TaskRun)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String taskRunName) {
        TaskRunsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, taskRunName).toCompletable();
    }

}
