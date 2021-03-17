// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.JobInner;
import com.azure.resourcemanager.sql.generated.models.Job;
import com.azure.resourcemanager.sql.generated.models.JobSchedule;

public final class JobImpl implements Job, Job.Definition, Job.Update {
    private JobInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Integer version() {
        return this.innerModel().version();
    }

    public JobSchedule schedule() {
        return this.innerModel().schedule();
    }

    public JobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String jobAgentName;

    private String jobName;

    public JobImpl withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.jobAgentName = jobAgentName;
        return this;
    }

    public Job create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, jobName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Job create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, jobName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new JobInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
    }

    public JobImpl update() {
        return this;
    }

    public Job apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, jobName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Job apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, jobName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobImpl(JobInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.jobAgentName = Utils.getValueFromIdByName(innerObject.id(), "jobAgents");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "jobs");
    }

    public Job refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, Context.NONE)
                .getValue();
        return this;
    }

    public Job refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, context)
                .getValue();
        return this;
    }

    public JobImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public JobImpl withSchedule(JobSchedule schedule) {
        this.innerModel().withSchedule(schedule);
        return this;
    }
}
