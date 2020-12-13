// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedStorageAccountsResourceInner;
import com.azure.resourcemanager.loganalytics.models.DataSourceType;
import com.azure.resourcemanager.loganalytics.models.LinkedStorageAccountsResource;
import java.util.Collections;
import java.util.List;

public final class LinkedStorageAccountsResourceImpl
    implements LinkedStorageAccountsResource,
        LinkedStorageAccountsResource.Definition,
        LinkedStorageAccountsResource.Update {
    private LinkedStorageAccountsResourceInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataSourceType dataSourceType() {
        return this.innerModel().dataSourceType();
    }

    public List<String> storageAccountIds() {
        List<String> inner = this.innerModel().storageAccountIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LinkedStorageAccountsResourceInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private DataSourceType dataSourceType;

    public LinkedStorageAccountsResourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public LinkedStorageAccountsResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceType, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceType, this.innerModel(), context)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResourceImpl(DataSourceType name, LogAnalyticsManager serviceManager) {
        this.innerObject = new LinkedStorageAccountsResourceInner();
        this.serviceManager = serviceManager;
        this.dataSourceType = name;
    }

    public LinkedStorageAccountsResourceImpl update() {
        return this;
    }

    public LinkedStorageAccountsResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceType, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceType, this.innerModel(), context)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResourceImpl(
        LinkedStorageAccountsResourceInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.dataSourceType =
            DataSourceType.fromString(Utils.getValueFromIdByName(innerObject.id(), "linkedStorageAccounts"));
    }

    public LinkedStorageAccountsResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .getWithResponse(resourceGroupName, workspaceName, dataSourceType, Context.NONE)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLinkedStorageAccounts()
                .getWithResponse(resourceGroupName, workspaceName, dataSourceType, context)
                .getValue();
        return this;
    }

    public LinkedStorageAccountsResourceImpl withStorageAccountIds(List<String> storageAccountIds) {
        this.innerModel().withStorageAccountIds(storageAccountIds);
        return this;
    }
}
