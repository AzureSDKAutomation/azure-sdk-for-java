// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.models.ShareInner;
import com.azure.resourcemanager.databoxedge.models.AzureContainerInfo;
import com.azure.resourcemanager.databoxedge.models.ClientAccessRight;
import com.azure.resourcemanager.databoxedge.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.models.MonitoringStatus;
import com.azure.resourcemanager.databoxedge.models.MountPointMap;
import com.azure.resourcemanager.databoxedge.models.RefreshDetails;
import com.azure.resourcemanager.databoxedge.models.Share;
import com.azure.resourcemanager.databoxedge.models.ShareAccessProtocol;
import com.azure.resourcemanager.databoxedge.models.ShareStatus;
import com.azure.resourcemanager.databoxedge.models.UserAccessRight;
import java.util.Collections;
import java.util.List;

public final class ShareImpl implements Share, Share.Definition, Share.Update {
    private ShareInner innerObject;

    private final DataBoxEdgeManager serviceManager;

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

    public ShareStatus shareStatus() {
        return this.innerModel().shareStatus();
    }

    public MonitoringStatus monitoringStatus() {
        return this.innerModel().monitoringStatus();
    }

    public AzureContainerInfo azureContainerInfo() {
        return this.innerModel().azureContainerInfo();
    }

    public ShareAccessProtocol accessProtocol() {
        return this.innerModel().accessProtocol();
    }

    public List<UserAccessRight> userAccessRights() {
        List<UserAccessRight> inner = this.innerModel().userAccessRights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ClientAccessRight> clientAccessRights() {
        List<ClientAccessRight> inner = this.innerModel().clientAccessRights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RefreshDetails refreshDetails() {
        return this.innerModel().refreshDetails();
    }

    public List<MountPointMap> shareMappings() {
        List<MountPointMap> inner = this.innerModel().shareMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataPolicy dataPolicy() {
        return this.innerModel().dataPolicy();
    }

    public ShareInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String name;

    private String resourceGroupName;

    public ShareImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Share create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Share create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    ShareImpl(String name, DataBoxEdgeManager serviceManager) {
        this.innerObject = new ShareInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ShareImpl update() {
        return this;
    }

    public Share apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Share apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    ShareImpl(ShareInner innerObject, DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "shares");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public Share refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .getWithResponse(deviceName, name, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public Share refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getShares()
                .getWithResponse(deviceName, name, resourceGroupName, context)
                .getValue();
        return this;
    }

    public ShareImpl withShareStatus(ShareStatus shareStatus) {
        this.innerModel().withShareStatus(shareStatus);
        return this;
    }

    public ShareImpl withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.innerModel().withMonitoringStatus(monitoringStatus);
        return this;
    }

    public ShareImpl withAccessProtocol(ShareAccessProtocol accessProtocol) {
        this.innerModel().withAccessProtocol(accessProtocol);
        return this;
    }

    public ShareImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ShareImpl withAzureContainerInfo(AzureContainerInfo azureContainerInfo) {
        this.innerModel().withAzureContainerInfo(azureContainerInfo);
        return this;
    }

    public ShareImpl withUserAccessRights(List<UserAccessRight> userAccessRights) {
        this.innerModel().withUserAccessRights(userAccessRights);
        return this;
    }

    public ShareImpl withClientAccessRights(List<ClientAccessRight> clientAccessRights) {
        this.innerModel().withClientAccessRights(clientAccessRights);
        return this;
    }

    public ShareImpl withRefreshDetails(RefreshDetails refreshDetails) {
        this.innerModel().withRefreshDetails(refreshDetails);
        return this;
    }

    public ShareImpl withDataPolicy(DataPolicy dataPolicy) {
        this.innerModel().withDataPolicy(dataPolicy);
        return this;
    }
}
