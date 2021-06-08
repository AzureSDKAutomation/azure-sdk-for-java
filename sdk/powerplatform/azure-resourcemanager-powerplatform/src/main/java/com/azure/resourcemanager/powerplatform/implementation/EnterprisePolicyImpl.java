// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.powerplatform.fluent.models.EnterprisePolicyInner;
import com.azure.resourcemanager.powerplatform.models.EnterprisePolicy;
import com.azure.resourcemanager.powerplatform.models.EnterprisePolicyIdentity;
import com.azure.resourcemanager.powerplatform.models.EnterprisePolicyKind;
import com.azure.resourcemanager.powerplatform.models.PatchEnterprisePolicy;
import com.azure.resourcemanager.powerplatform.models.PropertiesEncryption;
import com.azure.resourcemanager.powerplatform.models.PropertiesLockbox;
import com.azure.resourcemanager.powerplatform.models.PropertiesNetworkInjection;
import java.util.Collections;
import java.util.Map;

public final class EnterprisePolicyImpl
    implements EnterprisePolicy, EnterprisePolicy.Definition, EnterprisePolicy.Update {
    private EnterprisePolicyInner innerObject;

    private final com.azure.resourcemanager.powerplatform.PowerPlatformManager serviceManager;

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

    public EnterprisePolicyIdentity identity() {
        return this.innerModel().identity();
    }

    public EnterprisePolicyKind kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PropertiesLockbox lockbox() {
        return this.innerModel().lockbox();
    }

    public PropertiesEncryption encryption() {
        return this.innerModel().encryption();
    }

    public PropertiesNetworkInjection networkInjection() {
        return this.innerModel().networkInjection();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public EnterprisePolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.powerplatform.PowerPlatformManager manager() {
        return this.serviceManager;
    }

    private String enterprisePolicyName;

    private String resourceGroupName;

    private PatchEnterprisePolicy updateParameters;

    public EnterprisePolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public EnterprisePolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .createOrUpdateWithResponse(enterprisePolicyName, resourceGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnterprisePolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .createOrUpdateWithResponse(enterprisePolicyName, resourceGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnterprisePolicyImpl(String name, com.azure.resourcemanager.powerplatform.PowerPlatformManager serviceManager) {
        this.innerObject = new EnterprisePolicyInner();
        this.serviceManager = serviceManager;
        this.enterprisePolicyName = name;
    }

    public EnterprisePolicyImpl update() {
        this.updateParameters = new PatchEnterprisePolicy();
        return this;
    }

    public EnterprisePolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .updateWithResponse(enterprisePolicyName, resourceGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public EnterprisePolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .updateWithResponse(enterprisePolicyName, resourceGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    EnterprisePolicyImpl(
        EnterprisePolicyInner innerObject,
        com.azure.resourcemanager.powerplatform.PowerPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.enterprisePolicyName = Utils.getValueFromIdByName(innerObject.id(), "enterprisePolicies");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public EnterprisePolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .getByResourceGroupWithResponse(resourceGroupName, enterprisePolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public EnterprisePolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnterprisePolicies()
                .getByResourceGroupWithResponse(resourceGroupName, enterprisePolicyName, context)
                .getValue();
        return this;
    }

    public EnterprisePolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public EnterprisePolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public EnterprisePolicyImpl withKind(EnterprisePolicyKind kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateParameters.withKind(kind);
            return this;
        }
    }

    public EnterprisePolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public EnterprisePolicyImpl withIdentity(EnterprisePolicyIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public EnterprisePolicyImpl withLockbox(PropertiesLockbox lockbox) {
        if (isInCreateMode()) {
            this.innerModel().withLockbox(lockbox);
            return this;
        } else {
            this.updateParameters.withLockbox(lockbox);
            return this;
        }
    }

    public EnterprisePolicyImpl withEncryption(PropertiesEncryption encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateParameters.withEncryption(encryption);
            return this;
        }
    }

    public EnterprisePolicyImpl withNetworkInjection(PropertiesNetworkInjection networkInjection) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkInjection(networkInjection);
            return this;
        } else {
            this.updateParameters.withNetworkInjection(networkInjection);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
