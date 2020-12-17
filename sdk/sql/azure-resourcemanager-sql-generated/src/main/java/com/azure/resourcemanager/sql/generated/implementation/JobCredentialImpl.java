// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.JobCredentialInner;
import com.azure.resourcemanager.sql.generated.models.JobCredential;

public final class JobCredentialImpl implements JobCredential, JobCredential.Definition, JobCredential.Update {
    private JobCredentialInner innerObject;

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

    public String username() {
        return this.innerModel().username();
    }

    public String password() {
        return this.innerModel().password();
    }

    public JobCredentialInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String jobAgentName;

    private String credentialName;

    public JobCredentialImpl withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.jobAgentName = jobAgentName;
        return this;
    }

    public JobCredential create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, credentialName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobCredential create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, credentialName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobCredentialImpl(String name, SqlManager serviceManager) {
        this.innerObject = new JobCredentialInner();
        this.serviceManager = serviceManager;
        this.credentialName = name;
    }

    public JobCredentialImpl update() {
        return this;
    }

    public JobCredential apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, credentialName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobCredential apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, jobAgentName, credentialName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobCredentialImpl(JobCredentialInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.jobAgentName = Utils.getValueFromIdByName(innerObject.id(), "jobAgents");
        this.credentialName = Utils.getValueFromIdByName(innerObject.id(), "credentials");
    }

    public JobCredential refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, credentialName, Context.NONE)
                .getValue();
        return this;
    }

    public JobCredential refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCredentials()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, credentialName, context)
                .getValue();
        return this;
    }

    public JobCredentialImpl withUsername(String username) {
        this.innerModel().withUsername(username);
        return this;
    }

    public JobCredentialImpl withPassword(String password) {
        this.innerModel().withPassword(password);
        return this;
    }
}
