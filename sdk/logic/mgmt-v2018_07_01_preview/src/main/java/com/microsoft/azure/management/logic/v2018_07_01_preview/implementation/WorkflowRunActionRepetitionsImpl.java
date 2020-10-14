/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitions;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ExpressionRoot;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ActionRunWorkflowWorkflowRunActionRepetitionDefinition;

class WorkflowRunActionRepetitionsImpl extends WrapperImpl<WorkflowRunActionRepetitionsInner> implements WorkflowRunActionRepetitions {
    private final LogicManager manager;

    WorkflowRunActionRepetitionsImpl(LogicManager manager) {
        super(manager.inner().workflowRunActionRepetitions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private ActionRunWorkflowWorkflowRunActionRepetitionDefinitionImpl wrapModel(WorkflowRunActionRepetitionDefinitionInner inner) {
        return  new ActionRunWorkflowWorkflowRunActionRepetitionDefinitionImpl(inner, manager());
    }

    @Override
    public Observable<ExpressionRoot> listExpressionTracesAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        WorkflowRunActionRepetitionsInner client = this.inner();
        return client.listExpressionTracesAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
        .flatMap(new Func1<List<ExpressionRootInner>, Observable<ExpressionRootInner>>() {
            @Override
            public Observable<ExpressionRootInner> call(List<ExpressionRootInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ExpressionRootInner, ExpressionRoot>() {
            @Override
            public ExpressionRoot call(ExpressionRootInner inner) {
                return new ExpressionRootImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinition> listAsync(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionRepetitionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName, actionName)
        .flatMap(new Func1<List<WorkflowRunActionRepetitionDefinitionInner>, Observable<WorkflowRunActionRepetitionDefinitionInner>>() {
            @Override
            public Observable<WorkflowRunActionRepetitionDefinitionInner> call(List<WorkflowRunActionRepetitionDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<WorkflowRunActionRepetitionDefinitionInner, ActionRunWorkflowWorkflowRunActionRepetitionDefinition>() {
            @Override
            public ActionRunWorkflowWorkflowRunActionRepetitionDefinition call(WorkflowRunActionRepetitionDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinition> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        WorkflowRunActionRepetitionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
        .flatMap(new Func1<WorkflowRunActionRepetitionDefinitionInner, Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinition>>() {
            @Override
            public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinition> call(WorkflowRunActionRepetitionDefinitionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ActionRunWorkflowWorkflowRunActionRepetitionDefinition)wrapModel(inner));
                }
            }
       });
    }

}
