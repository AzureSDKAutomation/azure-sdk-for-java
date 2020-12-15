// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.WorkloadGroupInner;
import com.azure.resourcemanager.sql.generated.models.WorkloadGroup;

public final class WorkloadGroupImpl implements WorkloadGroup, WorkloadGroup.Definition, WorkloadGroup.Update {
    private WorkloadGroupInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer minResourcePercent() {
        return this.innerModel().minResourcePercent();
    }

    public Integer maxResourcePercent() {
        return this.innerModel().maxResourcePercent();
    }

    public Double minResourcePercentPerRequest() {
        return this.innerModel().minResourcePercentPerRequest();
    }

    public Double maxResourcePercentPerRequest() {
        return this.innerModel().maxResourcePercentPerRequest();
    }

    public String importance() {
        return this.innerModel().importance();
    }

    public Integer queryExecutionTimeout() {
        return this.innerModel().queryExecutionTimeout();
    }

    public WorkloadGroupInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private String workloadGroupName;

    public WorkloadGroupImpl withExistingDatabase(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public WorkloadGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .createOrUpdate(
                    resourceGroupName, serverName, databaseName, workloadGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .createOrUpdate(
                    resourceGroupName, serverName, databaseName, workloadGroupName, this.innerModel(), context);
        return this;
    }

    public WorkloadGroupImpl(String name, SqlManager serviceManager) {
        this.innerObject = new WorkloadGroupInner();
        this.serviceManager = serviceManager;
        this.workloadGroupName = name;
    }

    public WorkloadGroupImpl update() {
        return this;
    }

    public WorkloadGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .createOrUpdate(
                    resourceGroupName, serverName, databaseName, workloadGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .createOrUpdate(
                    resourceGroupName, serverName, databaseName, workloadGroupName, this.innerModel(), context);
        return this;
    }

    public WorkloadGroupImpl(WorkloadGroupInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.workloadGroupName = Utils.getValueFromIdByName(innerObject.id(), "workloadGroups");
    }

    public WorkloadGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public WorkloadGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkloadGroups()
                .getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName, context)
                .getValue();
        return this;
    }

    public WorkloadGroupImpl withMinResourcePercent(Integer minResourcePercent) {
        this.innerModel().withMinResourcePercent(minResourcePercent);
        return this;
    }

    public WorkloadGroupImpl withMaxResourcePercent(Integer maxResourcePercent) {
        this.innerModel().withMaxResourcePercent(maxResourcePercent);
        return this;
    }

    public WorkloadGroupImpl withMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
        this.innerModel().withMinResourcePercentPerRequest(minResourcePercentPerRequest);
        return this;
    }

    public WorkloadGroupImpl withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest) {
        this.innerModel().withMaxResourcePercentPerRequest(maxResourcePercentPerRequest);
        return this;
    }

    public WorkloadGroupImpl withImportance(String importance) {
        this.innerModel().withImportance(importance);
        return this;
    }

    public WorkloadGroupImpl withQueryExecutionTimeout(Integer queryExecutionTimeout) {
        this.innerModel().withQueryExecutionTimeout(queryExecutionTimeout);
        return this;
    }
}
