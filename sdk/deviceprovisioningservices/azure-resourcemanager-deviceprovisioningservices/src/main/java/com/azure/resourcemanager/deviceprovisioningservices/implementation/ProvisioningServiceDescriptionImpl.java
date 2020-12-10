// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.ProvisioningServiceDescriptionInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.ArmIdentity;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsPropertiesDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSkuInfo;
import com.azure.resourcemanager.deviceprovisioningservices.models.ProvisioningServiceDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.TagsResource;
import java.util.Collections;
import java.util.Map;

public final class ProvisioningServiceDescriptionImpl
    implements ProvisioningServiceDescription,
        ProvisioningServiceDescription.Definition,
        ProvisioningServiceDescription.Update {
    private ProvisioningServiceDescriptionInner innerObject;

    private final IotDpsManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public IotDpsPropertiesDescription properties() {
        return this.innerModel().properties();
    }

    public IotDpsSkuInfo sku() {
        return this.innerModel().sku();
    }

    public ArmIdentity identity() {
        return this.innerModel().identity();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ProvisioningServiceDescriptionInner innerModel() {
        return this.innerObject;
    }

    private IotDpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String provisioningServiceName;

    private TagsResource updateProvisioningServiceTags;

    public ProvisioningServiceDescriptionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ProvisioningServiceDescription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .createOrUpdate(resourceGroupName, provisioningServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ProvisioningServiceDescription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .createOrUpdate(resourceGroupName, provisioningServiceName, this.innerModel(), context);
        return this;
    }

    public ProvisioningServiceDescriptionImpl(String name, IotDpsManager serviceManager) {
        this.innerObject = new ProvisioningServiceDescriptionInner();
        this.serviceManager = serviceManager;
        this.provisioningServiceName = name;
    }

    public ProvisioningServiceDescriptionImpl update() {
        this.updateProvisioningServiceTags = new TagsResource();
        return this;
    }

    public ProvisioningServiceDescription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .update(resourceGroupName, provisioningServiceName, updateProvisioningServiceTags, Context.NONE);
        return this;
    }

    public ProvisioningServiceDescription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .update(resourceGroupName, provisioningServiceName, updateProvisioningServiceTags, context);
        return this;
    }

    public ProvisioningServiceDescriptionImpl(
        ProvisioningServiceDescriptionInner innerObject, IotDpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.provisioningServiceName = Utils.getValueFromIdByName(innerObject.id(), "provisioningServices");
    }

    public ProvisioningServiceDescription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .getByResourceGroupWithResponse(resourceGroupName, provisioningServiceName, Context.NONE)
                .getValue();
        return this;
    }

    public ProvisioningServiceDescription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotDpsResources()
                .getByResourceGroupWithResponse(resourceGroupName, provisioningServiceName, context)
                .getValue();
        return this;
    }

    public ProvisioningServiceDescriptionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProvisioningServiceDescriptionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProvisioningServiceDescriptionImpl withProperties(IotDpsPropertiesDescription properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ProvisioningServiceDescriptionImpl withSku(IotDpsSkuInfo sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ProvisioningServiceDescriptionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProvisioningServiceTags.withTags(tags);
            return this;
        }
    }

    public ProvisioningServiceDescriptionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ProvisioningServiceDescriptionImpl withIdentity(ArmIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
