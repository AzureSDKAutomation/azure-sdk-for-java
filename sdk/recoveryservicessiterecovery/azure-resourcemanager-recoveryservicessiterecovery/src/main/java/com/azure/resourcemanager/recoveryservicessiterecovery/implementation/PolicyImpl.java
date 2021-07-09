// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.PolicyInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreatePolicyInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreatePolicyInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Policy;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PolicyProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdatePolicyInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdatePolicyInputProperties;

public final class PolicyImpl implements Policy, Policy.Definition, Policy.Update {
    private PolicyInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PolicyProperties properties() {
        return this.innerModel().properties();
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

    public PolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String resourceGroupName;

    private String policyName;

    private CreatePolicyInput createInput;

    private UpdatePolicyInput updateInput;

    public PolicyImpl withExistingVault(String resourceName, String resourceGroupName) {
        this.resourceName = resourceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Policy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .create(resourceName, resourceGroupName, policyName, createInput, Context.NONE);
        return this;
    }

    public Policy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .create(resourceName, resourceGroupName, policyName, createInput, context);
        return this;
    }

    PolicyImpl(String name, com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new PolicyInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
        this.createInput = new CreatePolicyInput();
    }

    public PolicyImpl update() {
        this.updateInput = new UpdatePolicyInput();
        return this;
    }

    public Policy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .update(resourceName, resourceGroupName, policyName, updateInput, Context.NONE);
        return this;
    }

    public Policy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .update(resourceName, resourceGroupName, policyName, updateInput, context);
        return this;
    }

    PolicyImpl(
        PolicyInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.policyName = Utils.getValueFromIdByName(innerObject.id(), "replicationPolicies");
    }

    public Policy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .getWithResponse(resourceName, resourceGroupName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public Policy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationPolicies()
                .getWithResponse(resourceName, resourceGroupName, policyName, context)
                .getValue();
        return this;
    }

    public PolicyImpl withProperties(CreatePolicyInputProperties properties) {
        this.createInput.withProperties(properties);
        return this;
    }

    public PolicyImpl withProperties(UpdatePolicyInputProperties properties) {
        this.updateInput.withProperties(properties);
        return this;
    }
}
