/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.management.synapse.v2020-12-01.WorkloadGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class WorkloadGroupImpl extends CreatableUpdatableImpl<WorkloadGroup, WorkloadGroupInner, WorkloadGroupImpl> implements WorkloadGroup, WorkloadGroup.Definition, WorkloadGroup.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;
    private String workloadGroupName;

    WorkloadGroupImpl(String name, SynapseManager manager) {
        super(name, new WorkloadGroupInner());
        this.manager = manager;
        // Set resource name
        this.workloadGroupName = name;
        //
    }

    WorkloadGroupImpl(WorkloadGroupInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.workloadGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlPools");
        this.workloadGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "workloadGroups");
        //
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkloadGroup> createResourceAsync() {
        SqlPoolWorkloadGroupsInner client = this.manager().inner().sqlPoolWorkloadGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.workloadGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WorkloadGroup> updateResourceAsync() {
        SqlPoolWorkloadGroupsInner client = this.manager().inner().sqlPoolWorkloadGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.workloadGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WorkloadGroupInner> getInnerAsync() {
        SqlPoolWorkloadGroupsInner client = this.manager().inner().sqlPoolWorkloadGroups();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.workloadGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String importance() {
        return this.inner().importance();
    }

    @Override
    public int maxResourcePercent() {
        return this.inner().maxResourcePercent();
    }

    @Override
    public Double maxResourcePercentPerRequest() {
        return this.inner().maxResourcePercentPerRequest();
    }

    @Override
    public int minResourcePercent() {
        return this.inner().minResourcePercent();
    }

    @Override
    public double minResourcePercentPerRequest() {
        return this.inner().minResourcePercentPerRequest();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer queryExecutionTimeout() {
        return this.inner().queryExecutionTimeout();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public WorkloadGroupImpl withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.sqlPoolName = sqlPoolName;
        return this;
    }

    @Override
    public WorkloadGroupImpl withMaxResourcePercent(int maxResourcePercent) {
        this.inner().withMaxResourcePercent(maxResourcePercent);
        return this;
    }

    @Override
    public WorkloadGroupImpl withMinResourcePercent(int minResourcePercent) {
        this.inner().withMinResourcePercent(minResourcePercent);
        return this;
    }

    @Override
    public WorkloadGroupImpl withMinResourcePercentPerRequest(double minResourcePercentPerRequest) {
        this.inner().withMinResourcePercentPerRequest(minResourcePercentPerRequest);
        return this;
    }

    @Override
    public WorkloadGroupImpl withImportance(String importance) {
        this.inner().withImportance(importance);
        return this;
    }

    @Override
    public WorkloadGroupImpl withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest) {
        this.inner().withMaxResourcePercentPerRequest(maxResourcePercentPerRequest);
        return this;
    }

    @Override
    public WorkloadGroupImpl withQueryExecutionTimeout(Integer queryExecutionTimeout) {
        this.inner().withQueryExecutionTimeout(queryExecutionTimeout);
        return this;
    }

}
