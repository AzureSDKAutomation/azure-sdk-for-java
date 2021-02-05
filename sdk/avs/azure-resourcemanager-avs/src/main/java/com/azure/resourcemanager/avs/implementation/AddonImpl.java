// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.fluent.models.AddonInner;
import com.azure.resourcemanager.avs.models.Addon;
import com.azure.resourcemanager.avs.models.AddonProvisioningState;
import com.azure.resourcemanager.avs.models.AddonType;

public final class AddonImpl implements Addon, Addon.Definition, Addon.Update {
    private AddonInner innerObject;

    private final AvsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String licenseKey() {
        return this.innerModel().licenseKey();
    }

    public AddonType addonType() {
        return this.innerModel().addonType();
    }

    public AddonProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AddonInner innerModel() {
        return this.innerObject;
    }

    private AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String addonName;

    public AddonImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public Addon create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .createOrUpdate(resourceGroupName, privateCloudName, addonName, this.innerModel(), Context.NONE);
        return this;
    }

    public Addon create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .createOrUpdate(resourceGroupName, privateCloudName, addonName, this.innerModel(), context);
        return this;
    }

    AddonImpl(String name, AvsManager serviceManager) {
        this.innerObject = new AddonInner();
        this.serviceManager = serviceManager;
        this.addonName = name;
    }

    public AddonImpl update() {
        return this;
    }

    public Addon apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .createOrUpdate(resourceGroupName, privateCloudName, addonName, this.innerModel(), Context.NONE);
        return this;
    }

    public Addon apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .createOrUpdate(resourceGroupName, privateCloudName, addonName, this.innerModel(), context);
        return this;
    }

    AddonImpl(AddonInner innerObject, AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = Utils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.addonName = Utils.getValueFromIdByName(innerObject.id(), "addons");
    }

    public Addon refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .getWithResponse(resourceGroupName, privateCloudName, addonName, Context.NONE)
                .getValue();
        return this;
    }

    public Addon refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAddons()
                .getWithResponse(resourceGroupName, privateCloudName, addonName, context)
                .getValue();
        return this;
    }

    public AddonImpl withLicenseKey(String licenseKey) {
        this.innerModel().withLicenseKey(licenseKey);
        return this;
    }

    public AddonImpl withAddonType(AddonType addonType) {
        this.innerModel().withAddonType(addonType);
        return this;
    }
}
