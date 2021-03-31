// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.PrivateLinkPolicyInner;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateLinkPolicy;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateLinkPolicyUpdateParameter;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PrivateLinkPolicyImpl
    implements PrivateLinkPolicy, PrivateLinkPolicy.Definition, PrivateLinkPolicy.Update {
    private PrivateLinkPolicyInner innerObject;

    private final com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String ownerTenantId() {
        return this.innerModel().ownerTenantId();
    }

    public Boolean allTenants() {
        return this.innerModel().allTenants();
    }

    public List<String> tenants() {
        List<String> inner = this.innerModel().tenants();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceName() {
        return this.innerModel().resourceName();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PrivateLinkPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String policyName;

    private PrivateLinkPolicyUpdateParameter updatePrivateLinkPolicy;

    public PrivateLinkPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PrivateLinkPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .create(resourceGroupName, policyName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateLinkPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .create(resourceGroupName, policyName, this.innerModel(), context);
        return this;
    }

    PrivateLinkPolicyImpl(
        String name, com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerObject = new PrivateLinkPolicyInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
    }

    public PrivateLinkPolicyImpl update() {
        this.updatePrivateLinkPolicy = new PrivateLinkPolicyUpdateParameter();
        return this;
    }

    public PrivateLinkPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .updateWithResponse(resourceGroupName, policyName, updatePrivateLinkPolicy, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateLinkPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .updateWithResponse(resourceGroupName, policyName, updatePrivateLinkPolicy, context)
                .getValue();
        return this;
    }

    PrivateLinkPolicyImpl(
        PrivateLinkPolicyInner innerObject,
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.policyName = Utils.getValueFromIdByName(innerObject.id(), "privateLinkForAzureAd");
    }

    public PrivateLinkPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .getByResourceGroupWithResponse(resourceGroupName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateLinkPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkForAzureAds()
                .getByResourceGroupWithResponse(resourceGroupName, policyName, context)
                .getValue();
        return this;
    }

    public PrivateLinkPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePrivateLinkPolicy.withTags(tags);
            return this;
        }
    }

    public PrivateLinkPolicyImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public PrivateLinkPolicyImpl withOwnerTenantId(String ownerTenantId) {
        this.innerModel().withOwnerTenantId(ownerTenantId);
        return this;
    }

    public PrivateLinkPolicyImpl withAllTenants(Boolean allTenants) {
        this.innerModel().withAllTenants(allTenants);
        return this;
    }

    public PrivateLinkPolicyImpl withTenants(List<String> tenants) {
        this.innerModel().withTenants(tenants);
        return this;
    }

    public PrivateLinkPolicyImpl withResourceName(String resourceName) {
        this.innerModel().withResourceName(resourceName);
        return this;
    }

    public PrivateLinkPolicyImpl withSubscriptionId(String subscriptionId) {
        this.innerModel().withSubscriptionId(subscriptionId);
        return this;
    }

    public PrivateLinkPolicyImpl withResourceGroup(String resourceGroup) {
        this.innerModel().withResourceGroup(resourceGroup);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
