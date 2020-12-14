// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.scheduler.SchedulerManager;
import com.azure.resourcemanager.scheduler.fluent.models.JobDefinitionInner;
import com.azure.resourcemanager.scheduler.models.JobDefinition;
import com.azure.resourcemanager.scheduler.models.JobProperties;

public final class JobDefinitionImpl implements JobDefinition, JobDefinition.Definition, JobDefinition.Update {
    private JobDefinitionInner innerObject;

    private final SchedulerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public JobProperties properties() {
        return this.innerModel().properties();
    }

    public JobDefinitionInner innerModel() {
        return this.innerObject;
    }

    private SchedulerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobCollectionName;

    private String jobName;

    public JobDefinitionImpl withExistingJobCollection(String resourceGroupName, String jobCollectionName) {
        this.resourceGroupName = resourceGroupName;
        this.jobCollectionName = jobCollectionName;
        return this;
    }

    public JobDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(
                    resourceGroupName, jobCollectionName, jobName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(resourceGroupName, jobCollectionName, jobName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public JobDefinitionImpl(String name, SchedulerManager serviceManager) {
        this.innerObject = new JobDefinitionInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
    }

    public JobDefinitionImpl update() {
        return this;
    }

    public JobDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .patchWithResponse(resourceGroupName, jobCollectionName, jobName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .patchWithResponse(resourceGroupName, jobCollectionName, jobName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public JobDefinitionImpl(JobDefinitionInner innerObject, SchedulerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.jobCollectionName = Utils.getValueFromIdByName(innerObject.id(), "jobCollections");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "jobs");
    }

    public JobDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, jobCollectionName, jobName, Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, jobCollectionName, jobName, context)
                .getValue();
        return this;
    }

    public JobDefinitionImpl withProperties(JobProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
