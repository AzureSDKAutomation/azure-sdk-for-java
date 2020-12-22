// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.AppPlatformManager;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.ClusterResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.ServiceResource;
import com.azure.resourcemanager.appplatform.generated.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class ServiceResourceImpl implements ServiceResource, ServiceResource.Definition, ServiceResource.Update {
    private ServiceResourceInner innerObject;

    private final AppPlatformManager serviceManager;

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

    public ClusterResourceProperties properties() {
        return this.innerModel().properties();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServiceResourceInner innerModel() {
        return this.innerObject;
    }

    private AppPlatformManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    public ServiceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServiceResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServiceResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), context);
        return this;
    }

    ServiceResourceImpl(String name, AppPlatformManager serviceManager) {
        this.innerObject = new ServiceResourceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public ServiceResourceImpl update() {
        return this;
    }

    public ServiceResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .update(resourceGroupName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServiceResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .update(resourceGroupName, serviceName, this.innerModel(), context);
        return this;
    }

    ServiceResourceImpl(ServiceResourceInner innerObject, AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "Spring");
    }

    public ServiceResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, context)
                .getValue();
        return this;
    }

    public ServiceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ServiceResourceImpl withProperties(ClusterResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ServiceResourceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }
}
