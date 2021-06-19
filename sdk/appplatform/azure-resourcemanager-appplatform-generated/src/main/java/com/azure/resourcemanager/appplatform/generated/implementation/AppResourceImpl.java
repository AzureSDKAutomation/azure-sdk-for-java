// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.AppResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.AppResource;
import com.azure.resourcemanager.appplatform.generated.models.AppResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainValidatePayload;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainValidateResult;
import com.azure.resourcemanager.appplatform.generated.models.ManagedIdentityProperties;
import com.azure.resourcemanager.appplatform.generated.models.ResourceUploadDefinition;

public final class AppResourceImpl implements AppResource, AppResource.Definition, AppResource.Update {
    private AppResourceInner innerObject;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AppResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ManagedIdentityProperties identity() {
        return this.innerModel().identity();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AppResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String appName;

    public AppResourceImpl withExistingSpring(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public AppResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .createOrUpdate(resourceGroupName, serviceName, appName, this.innerModel(), Context.NONE);
        return this;
    }

    public AppResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .createOrUpdate(resourceGroupName, serviceName, appName, this.innerModel(), context);
        return this;
    }

    AppResourceImpl(String name, com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerObject = new AppResourceInner();
        this.serviceManager = serviceManager;
        this.appName = name;
    }

    public AppResourceImpl update() {
        return this;
    }

    public AppResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .update(resourceGroupName, serviceName, appName, this.innerModel(), Context.NONE);
        return this;
    }

    public AppResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .update(resourceGroupName, serviceName, appName, this.innerModel(), context);
        return this;
    }

    AppResourceImpl(
        AppResourceInner innerObject,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "Spring");
        this.appName = Utils.getValueFromIdByName(innerObject.id(), "apps");
    }

    public AppResource refresh() {
        String localSyncStatus = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .getWithResponse(resourceGroupName, serviceName, appName, localSyncStatus, Context.NONE)
                .getValue();
        return this;
    }

    public AppResource refresh(Context context) {
        String localSyncStatus = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApps()
                .getWithResponse(resourceGroupName, serviceName, appName, localSyncStatus, context)
                .getValue();
        return this;
    }

    public ResourceUploadDefinition getResourceUploadUrl() {
        return serviceManager.apps().getResourceUploadUrl(resourceGroupName, serviceName, appName);
    }

    public Response<ResourceUploadDefinition> getResourceUploadUrlWithResponse(Context context) {
        return serviceManager.apps().getResourceUploadUrlWithResponse(resourceGroupName, serviceName, appName, context);
    }

    public CustomDomainValidateResult validateDomain(CustomDomainValidatePayload validatePayload) {
        return serviceManager.apps().validateDomain(resourceGroupName, serviceName, appName, validatePayload);
    }

    public Response<CustomDomainValidateResult> validateDomainWithResponse(
        CustomDomainValidatePayload validatePayload, Context context) {
        return serviceManager
            .apps()
            .validateDomainWithResponse(resourceGroupName, serviceName, appName, validatePayload, context);
    }

    public AppResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppResourceImpl withProperties(AppResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public AppResourceImpl withIdentity(ManagedIdentityProperties identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }
}
