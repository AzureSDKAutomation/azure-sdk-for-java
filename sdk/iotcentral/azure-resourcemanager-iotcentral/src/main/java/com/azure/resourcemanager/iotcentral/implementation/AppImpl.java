// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iotcentral.fluent.models.AppInner;
import com.azure.resourcemanager.iotcentral.models.App;
import com.azure.resourcemanager.iotcentral.models.AppPatch;
import com.azure.resourcemanager.iotcentral.models.AppSkuInfo;
import com.azure.resourcemanager.iotcentral.models.AppState;
import java.util.Collections;
import java.util.Map;

public final class AppImpl implements App, App.Definition, App.Update {
    private AppInner innerObject;

    private final com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager;

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

    public AppSkuInfo sku() {
        return this.innerModel().sku();
    }

    public String applicationId() {
        return this.innerModel().applicationId();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String subdomain() {
        return this.innerModel().subdomain();
    }

    public String template() {
        return this.innerModel().template();
    }

    public AppState state() {
        return this.innerModel().state();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AppInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotcentral.IotCentralManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private AppPatch updateAppPatch;

    public AppImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public App create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public App create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    AppImpl(String name, com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
        this.innerObject = new AppInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public AppImpl update() {
        this.updateAppPatch = new AppPatch();
        return this;
    }

    public App apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .update(resourceGroupName, resourceName, updateAppPatch, Context.NONE);
        return this;
    }

    public App apply(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getApps().update(resourceGroupName, resourceName, updateAppPatch, context);
        return this;
    }

    AppImpl(AppInner innerObject, com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "iotApps");
    }

    public App refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public App refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public AppImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppImpl withSku(AppSkuInfo sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateAppPatch.withSku(sku);
            return this;
        }
    }

    public AppImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateAppPatch.withTags(tags);
            return this;
        }
    }

    public AppImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.innerModel().withDisplayName(displayName);
            return this;
        } else {
            this.updateAppPatch.withDisplayName(displayName);
            return this;
        }
    }

    public AppImpl withSubdomain(String subdomain) {
        if (isInCreateMode()) {
            this.innerModel().withSubdomain(subdomain);
            return this;
        } else {
            this.updateAppPatch.withSubdomain(subdomain);
            return this;
        }
    }

    public AppImpl withTemplate(String template) {
        if (isInCreateMode()) {
            this.innerModel().withTemplate(template);
            return this;
        } else {
            this.updateAppPatch.withTemplate(template);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
