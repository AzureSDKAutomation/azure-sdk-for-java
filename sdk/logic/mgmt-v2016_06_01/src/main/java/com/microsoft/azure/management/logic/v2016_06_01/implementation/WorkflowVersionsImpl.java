/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowVersions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowVersion;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;

class WorkflowVersionsImpl extends WrapperImpl<WorkflowVersionsInner> implements WorkflowVersions {
    private final LogicManager manager;

    WorkflowVersionsImpl(LogicManager manager) {
        super(manager.inner().workflowVersions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowVersionImpl wrapWorkflowVersionModel(WorkflowVersionInner inner) {
        return  new WorkflowVersionImpl(inner, manager());
    }

    private Observable<WorkflowVersionInner> getWorkflowVersionInnerUsingWorkflowVersionsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String workflowName = IdParsingUtils.getValueFromIdByName(id, "workflows");
        String versionId = IdParsingUtils.getValueFromIdByName(id, "versions");
        WorkflowVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, versionId);
    }

    @Override
    public Observable<WorkflowVersion> getAsync(String resourceGroupName, String workflowName, String versionId) {
        WorkflowVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, versionId)
        .flatMap(new Func1<WorkflowVersionInner, Observable<WorkflowVersion>>() {
            @Override
            public Observable<WorkflowVersion> call(WorkflowVersionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((WorkflowVersion)wrapWorkflowVersionModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<WorkflowVersion> listAsync(final String resourceGroupName, final String workflowName) {
        WorkflowVersionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName)
        .flatMapIterable(new Func1<Page<WorkflowVersionInner>, Iterable<WorkflowVersionInner>>() {
            @Override
            public Iterable<WorkflowVersionInner> call(Page<WorkflowVersionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowVersionInner, WorkflowVersion>() {
            @Override
            public WorkflowVersion call(WorkflowVersionInner inner) {
                return wrapWorkflowVersionModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, String versionId, String triggerName) {
        WorkflowVersionsInner client = this.inner();
        return client.listCallbackUrlAsync(resourceGroupName, workflowName, versionId, triggerName)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

}
