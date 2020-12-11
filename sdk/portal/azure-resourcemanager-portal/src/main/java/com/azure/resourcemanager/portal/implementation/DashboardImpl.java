// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.portal.PortalManager;
import com.azure.resourcemanager.portal.fluent.models.DashboardInner;
import com.azure.resourcemanager.portal.models.Dashboard;
import com.azure.resourcemanager.portal.models.DashboardLens;
import com.azure.resourcemanager.portal.models.PatchableDashboard;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DashboardImpl implements Dashboard, Dashboard.Definition, Dashboard.Update {
    private DashboardInner innerObject;

    private final PortalManager serviceManager;

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

    public List<DashboardLens> lenses() {
        List<DashboardLens> inner = this.innerModel().lenses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, Object> metadata() {
        Map<String, Object> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DashboardInner innerModel() {
        return this.innerObject;
    }

    private PortalManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dashboardName;

    private PatchableDashboard updateDashboard;

    public DashboardImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Dashboard create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .createOrUpdateWithResponse(resourceGroupName, dashboardName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Dashboard create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .createOrUpdateWithResponse(resourceGroupName, dashboardName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DashboardImpl(String name, PortalManager serviceManager) {
        this.innerObject = new DashboardInner();
        this.serviceManager = serviceManager;
        this.dashboardName = name;
    }

    public DashboardImpl update() {
        this.updateDashboard = new PatchableDashboard();
        return this;
    }

    public Dashboard apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .updateWithResponse(resourceGroupName, dashboardName, updateDashboard, Context.NONE)
                .getValue();
        return this;
    }

    public Dashboard apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .updateWithResponse(resourceGroupName, dashboardName, updateDashboard, context)
                .getValue();
        return this;
    }

    public DashboardImpl(DashboardInner innerObject, PortalManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dashboardName = Utils.getValueFromIdByName(innerObject.id(), "dashboards");
    }

    public Dashboard refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .getByResourceGroupWithResponse(resourceGroupName, dashboardName, Context.NONE)
                .getValue();
        return this;
    }

    public Dashboard refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDashboards()
                .getByResourceGroupWithResponse(resourceGroupName, dashboardName, context)
                .getValue();
        return this;
    }

    public DashboardImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DashboardImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DashboardImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDashboard.withTags(tags);
            return this;
        }
    }

    public DashboardImpl withLenses(List<DashboardLens> lenses) {
        if (isInCreateMode()) {
            this.innerModel().withLenses(lenses);
            return this;
        } else {
            this.updateDashboard.withLenses(lenses);
            return this;
        }
    }

    public DashboardImpl withMetadata(Map<String, Object> metadata) {
        if (isInCreateMode()) {
            this.innerModel().withMetadata(metadata);
            return this;
        } else {
            this.updateDashboard.withMetadata(metadata);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
