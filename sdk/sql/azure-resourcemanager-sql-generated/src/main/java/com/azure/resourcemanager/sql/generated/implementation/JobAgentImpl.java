// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.JobAgentInner;
import com.azure.resourcemanager.sql.generated.models.JobAgent;
import com.azure.resourcemanager.sql.generated.models.JobAgentState;
import com.azure.resourcemanager.sql.generated.models.JobAgentUpdate;
import com.azure.resourcemanager.sql.generated.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class JobAgentImpl implements JobAgent, JobAgent.Definition, JobAgent.Update {
    private JobAgentInner innerObject;

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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String databaseId() {
        return this.innerModel().databaseId();
    }

    public JobAgentState state() {
        return this.innerModel().state();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public JobAgentInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String jobAgentName;

    private JobAgentUpdate updateParameters;

    public JobAgentImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public JobAgent create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .createOrUpdate(resourceGroupName, serverName, jobAgentName, this.innerModel(), Context.NONE);
        return this;
    }

    public JobAgent create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .createOrUpdate(resourceGroupName, serverName, jobAgentName, this.innerModel(), context);
        return this;
    }

    public JobAgentImpl(String name, SqlManager serviceManager) {
        this.innerObject = new JobAgentInner();
        this.serviceManager = serviceManager;
        this.jobAgentName = name;
    }

    public JobAgentImpl update() {
        this.updateParameters = new JobAgentUpdate();
        return this;
    }

    public JobAgent apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .update(resourceGroupName, serverName, jobAgentName, updateParameters, Context.NONE);
        return this;
    }

    public JobAgent apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .update(resourceGroupName, serverName, jobAgentName, updateParameters, context);
        return this;
    }

    public JobAgentImpl(JobAgentInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.jobAgentName = Utils.getValueFromIdByName(innerObject.id(), "jobAgents");
    }

    public JobAgent refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, Context.NONE)
                .getValue();
        return this;
    }

    public JobAgent refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobAgents()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, context)
                .getValue();
        return this;
    }

    public JobAgentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public JobAgentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public JobAgentImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public JobAgentImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public JobAgentImpl withDatabaseId(String databaseId) {
        this.innerModel().withDatabaseId(databaseId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
