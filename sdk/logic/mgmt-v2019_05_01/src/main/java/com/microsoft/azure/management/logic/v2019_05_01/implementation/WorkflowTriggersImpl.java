/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTrigger;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2019_05_01.JsonSchema;

class WorkflowTriggersImpl extends WrapperImpl<WorkflowTriggersInner> implements WorkflowTriggers {
    private final LogicManager manager;

    WorkflowTriggersImpl(LogicManager manager) {
        super(manager.inner().workflowTriggers());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowTriggerImpl wrapWorkflowTriggerModel(WorkflowTriggerInner inner) {
        return  new WorkflowTriggerImpl(inner, manager());
    }

    private Observable<WorkflowTriggerInner> getWorkflowTriggerInnerUsingWorkflowTriggersInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String workflowName = IdParsingUtils.getValueFromIdByName(id, "workflows");
        String triggerName = IdParsingUtils.getValueFromIdByName(id, "triggers");
        WorkflowTriggersInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, triggerName);
    }

    @Override
    public Observable<WorkflowTrigger> getAsync(String resourceGroupName, String workflowName, String triggerName) {
        WorkflowTriggersInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, triggerName)
        .flatMap(new Func1<WorkflowTriggerInner, Observable<WorkflowTrigger>>() {
            @Override
            public Observable<WorkflowTrigger> call(WorkflowTriggerInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((WorkflowTrigger)wrapWorkflowTriggerModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<WorkflowTrigger> listAsync(final String resourceGroupName, final String workflowName) {
        WorkflowTriggersInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName)
        .flatMapIterable(new Func1<Page<WorkflowTriggerInner>, Iterable<WorkflowTriggerInner>>() {
            @Override
            public Iterable<WorkflowTriggerInner> call(Page<WorkflowTriggerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowTriggerInner, WorkflowTrigger>() {
            @Override
            public WorkflowTrigger call(WorkflowTriggerInner inner) {
                return wrapWorkflowTriggerModel(inner);
            }
        });
    }

    @Override
    public Completable resetAsync(String resourceGroupName, String workflowName, String triggerName) {
        WorkflowTriggersInner client = this.inner();
        return client.resetAsync(resourceGroupName, workflowName, triggerName).toCompletable();
    }

    @Override
    public Observable<Object> runAsync(String resourceGroupName, String workflowName, String triggerName) {
        WorkflowTriggersInner client = this.inner();
        return client.runAsync(resourceGroupName, workflowName, triggerName)
    ;}

    @Override
    public Completable setStateAsync(String resourceGroupName, String workflowName, String triggerName, WorkflowTriggerInner source) {
        WorkflowTriggersInner client = this.inner();
        return client.setStateAsync(resourceGroupName, workflowName, triggerName, source).toCompletable();
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, String triggerName) {
        WorkflowTriggersInner client = this.inner();
        return client.listCallbackUrlAsync(resourceGroupName, workflowName, triggerName)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JsonSchema> getSchemaJsonAsync(String resourceGroupName, String workflowName, String triggerName) {
        WorkflowTriggersInner client = this.inner();
        return client.getSchemaJsonAsync(resourceGroupName, workflowName, triggerName)
        .map(new Func1<JsonSchemaInner, JsonSchema>() {
            @Override
            public JsonSchema call(JsonSchemaInner inner) {
                return new JsonSchemaImpl(inner, manager());
            }
        });
    }

}
