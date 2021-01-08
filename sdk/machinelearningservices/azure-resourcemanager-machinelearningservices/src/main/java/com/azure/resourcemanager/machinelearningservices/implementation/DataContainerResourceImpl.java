// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.MachinelearningservicesManager;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DataContainerResourceInner;
import com.azure.resourcemanager.machinelearningservices.models.DataContainer;
import com.azure.resourcemanager.machinelearningservices.models.DataContainerResource;
import com.azure.resourcemanager.machinelearningservices.models.SystemData;

public final class DataContainerResourceImpl
    implements DataContainerResource, DataContainerResource.Definition, DataContainerResource.Update {
    private DataContainerResourceInner innerObject;

    private final MachinelearningservicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataContainer properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DataContainerResourceInner innerModel() {
        return this.innerObject;
    }

    private MachinelearningservicesManager manager() {
        return this.serviceManager;
    }

    private String name;

    private String resourceGroupName;

    private String workspaceName;

    public DataContainerResourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public DataContainerResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(name, resourceGroupName, workspaceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(name, resourceGroupName, workspaceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataContainerResourceImpl(String name, MachinelearningservicesManager serviceManager) {
        this.innerObject = new DataContainerResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DataContainerResourceImpl update() {
        return this;
    }

    public DataContainerResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(name, resourceGroupName, workspaceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(name, resourceGroupName, workspaceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataContainerResourceImpl(DataContainerResourceInner innerObject, MachinelearningservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.name = Utils.getValueFromIdByName(innerObject.id(), "data");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public DataContainerResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .getWithResponse(name, resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .getWithResponse(name, resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public DataContainerResourceImpl withProperties(DataContainer properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
