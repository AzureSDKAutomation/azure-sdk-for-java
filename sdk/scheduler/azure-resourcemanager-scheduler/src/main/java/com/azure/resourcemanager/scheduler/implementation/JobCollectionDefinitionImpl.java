// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scheduler.fluent.models.JobCollectionDefinitionInner;
import com.azure.resourcemanager.scheduler.models.JobCollectionDefinition;
import com.azure.resourcemanager.scheduler.models.JobCollectionProperties;
import java.util.Collections;
import java.util.Map;

public final class JobCollectionDefinitionImpl
    implements JobCollectionDefinition, JobCollectionDefinition.Definition, JobCollectionDefinition.Update {
    private JobCollectionDefinitionInner innerObject;

    private final com.azure.resourcemanager.scheduler.SchedulerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
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

    public JobCollectionProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public JobCollectionDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.scheduler.SchedulerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobCollectionName;

    public JobCollectionDefinitionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public JobCollectionDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .createOrUpdateWithResponse(resourceGroupName, jobCollectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobCollectionDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .createOrUpdateWithResponse(resourceGroupName, jobCollectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobCollectionDefinitionImpl(String name, com.azure.resourcemanager.scheduler.SchedulerManager serviceManager) {
        this.innerObject = new JobCollectionDefinitionInner();
        this.serviceManager = serviceManager;
        this.jobCollectionName = name;
    }

    public JobCollectionDefinitionImpl update() {
        return this;
    }

    public JobCollectionDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .patchWithResponse(resourceGroupName, jobCollectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public JobCollectionDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .patchWithResponse(resourceGroupName, jobCollectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobCollectionDefinitionImpl(
        JobCollectionDefinitionInner innerObject, com.azure.resourcemanager.scheduler.SchedulerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.jobCollectionName = Utils.getValueFromIdByName(innerObject.id(), "jobCollections");
    }

    public JobCollectionDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .getByResourceGroupWithResponse(resourceGroupName, jobCollectionName, Context.NONE)
                .getValue();
        return this;
    }

    public JobCollectionDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobCollections()
                .getByResourceGroupWithResponse(resourceGroupName, jobCollectionName, context)
                .getValue();
        return this;
    }

    public void enable() {
        serviceManager.jobCollections().enable(resourceGroupName, jobCollectionName);
    }

    public void enable(Context context) {
        serviceManager.jobCollections().enable(resourceGroupName, jobCollectionName, context);
    }

    public void disable() {
        serviceManager.jobCollections().disable(resourceGroupName, jobCollectionName);
    }

    public void disable(Context context) {
        serviceManager.jobCollections().disable(resourceGroupName, jobCollectionName, context);
    }

    public JobCollectionDefinitionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public JobCollectionDefinitionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public JobCollectionDefinitionImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public JobCollectionDefinitionImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public JobCollectionDefinitionImpl withProperties(JobCollectionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
