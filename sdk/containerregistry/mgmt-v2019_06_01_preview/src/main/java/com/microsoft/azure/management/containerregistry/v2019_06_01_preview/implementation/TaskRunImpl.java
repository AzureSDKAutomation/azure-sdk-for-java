/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.TaskRun;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.TaskRunUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.SystemData;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.RunRequest;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.Run;
import rx.functions.Func1;

class TaskRunImpl extends CreatableUpdatableImpl<TaskRun, TaskRunInner, TaskRunImpl> implements TaskRun, TaskRun.Definition, TaskRun.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String taskRunName;
    private TaskRunUpdateParameters updateParameter;

    TaskRunImpl(String name, ContainerRegistryManager manager) {
        super(name, new TaskRunInner());
        this.manager = manager;
        // Set resource name
        this.taskRunName = name;
        //
        this.updateParameter = new TaskRunUpdateParameters();
    }

    TaskRunImpl(TaskRunInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.taskRunName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.taskRunName = IdParsingUtils.getValueFromIdByName(inner.id(), "taskRuns");
        //
        this.updateParameter = new TaskRunUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TaskRun> createResourceAsync() {
        TaskRunsInner client = this.manager().inner().taskRuns();
        return client.createAsync(this.resourceGroupName, this.registryName, this.taskRunName, this.inner())
            .map(new Func1<TaskRunInner, TaskRunInner>() {
               @Override
               public TaskRunInner call(TaskRunInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TaskRun> updateResourceAsync() {
        TaskRunsInner client = this.manager().inner().taskRuns();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.taskRunName, this.updateParameter)
            .map(new Func1<TaskRunInner, TaskRunInner>() {
               @Override
               public TaskRunInner call(TaskRunInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TaskRunInner> getInnerAsync() {
        TaskRunsInner client = this.manager().inner().taskRuns();
        return client.getAsync(this.resourceGroupName, this.registryName, this.taskRunName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new TaskRunUpdateParameters();
    }

    @Override
    public String forceUpdateTag() {
        return this.inner().forceUpdateTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public IdentityProperties identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RunRequest runRequest() {
        return this.inner().runRequest();
    }

    @Override
    public Run runResult() {
        RunInner inner = this.inner().runResult();
        if (inner != null) {
            return  new RunImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TaskRunImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public TaskRunImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public TaskRunImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.inner().withForceUpdateTag(forceUpdateTag);
        } else {
            this.updateParameter.withForceUpdateTag(forceUpdateTag);
        }
        return this;
    }

    @Override
    public TaskRunImpl withIdentity(IdentityProperties identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public TaskRunImpl withRunRequest(RunRequest runRequest) {
        if (isInCreateMode()) {
            this.inner().withRunRequest(runRequest);
        } else {
            this.updateParameter.withRunRequest(runRequest);
        }
        return this;
    }

    @Override
    public TaskRunImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
