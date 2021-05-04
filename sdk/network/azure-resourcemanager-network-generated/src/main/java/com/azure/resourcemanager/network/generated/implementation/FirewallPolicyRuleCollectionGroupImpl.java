// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleCollectionGroupInner;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollection;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollectionGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class FirewallPolicyRuleCollectionGroupImpl
    implements FirewallPolicyRuleCollectionGroup,
        FirewallPolicyRuleCollectionGroup.Definition,
        FirewallPolicyRuleCollectionGroup.Update {
    private FirewallPolicyRuleCollectionGroupInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public List<FirewallPolicyRuleCollection> ruleCollections() {
        List<FirewallPolicyRuleCollection> inner = this.innerModel().ruleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public FirewallPolicyRuleCollectionGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String firewallPolicyName;

    private String ruleCollectionGroupName;

    public FirewallPolicyRuleCollectionGroupImpl withExistingFirewallPolicy(
        String resourceGroupName, String firewallPolicyName) {
        this.resourceGroupName = resourceGroupName;
        this.firewallPolicyName = firewallPolicyName;
        return this;
    }

    public FirewallPolicyRuleCollectionGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .createOrUpdate(
                    resourceGroupName, firewallPolicyName, ruleCollectionGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallPolicyRuleCollectionGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .createOrUpdate(
                    resourceGroupName, firewallPolicyName, ruleCollectionGroupName, this.innerModel(), context);
        return this;
    }

    FirewallPolicyRuleCollectionGroupImpl(
        String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new FirewallPolicyRuleCollectionGroupInner();
        this.serviceManager = serviceManager;
        this.ruleCollectionGroupName = name;
    }

    public FirewallPolicyRuleCollectionGroupImpl update() {
        return this;
    }

    public FirewallPolicyRuleCollectionGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .createOrUpdate(
                    resourceGroupName, firewallPolicyName, ruleCollectionGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallPolicyRuleCollectionGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .createOrUpdate(
                    resourceGroupName, firewallPolicyName, ruleCollectionGroupName, this.innerModel(), context);
        return this;
    }

    FirewallPolicyRuleCollectionGroupImpl(
        FirewallPolicyRuleCollectionGroupInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.firewallPolicyName = Utils.getValueFromIdByName(innerObject.id(), "firewallPolicies");
        this.ruleCollectionGroupName = Utils.getValueFromIdByName(innerObject.id(), "ruleCollectionGroups");
    }

    public FirewallPolicyRuleCollectionGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallPolicyRuleCollectionGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicyRuleCollectionGroups()
                .getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context)
                .getValue();
        return this;
    }

    public FirewallPolicyRuleCollectionGroupImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public FirewallPolicyRuleCollectionGroupImpl withPriority(Integer priority) {
        this.innerModel().withPriority(priority);
        return this;
    }

    public FirewallPolicyRuleCollectionGroupImpl withRuleCollections(
        List<FirewallPolicyRuleCollection> ruleCollections) {
        this.innerModel().withRuleCollections(ruleCollections);
        return this;
    }
}
