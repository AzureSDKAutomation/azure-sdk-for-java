/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.FirewallPolicy;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_03_01.AzureFirewallThreatIntelMode;
import com.microsoft.azure.management.network.v2020_03_01.FirewallPolicyThreatIntelWhitelist;
import com.microsoft.azure.management.network.v2020_03_01.FirewallPolicyIntrusionSystemMode;

class FirewallPolicyImpl extends GroupableResourceCoreImpl<FirewallPolicy, FirewallPolicyInner, FirewallPolicyImpl, NetworkManager> implements FirewallPolicy, FirewallPolicy.Definition, FirewallPolicy.Update {
    FirewallPolicyImpl(String name, FirewallPolicyInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<FirewallPolicy> createResourceAsync() {
        FirewallPoliciesInner client = this.manager().inner().firewallPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FirewallPolicy> updateResourceAsync() {
        FirewallPoliciesInner client = this.manager().inner().firewallPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FirewallPolicyInner> getInnerAsync() {
        FirewallPoliciesInner client = this.manager().inner().firewallPolicies();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public SubResource basePolicy() {
        return this.inner().basePolicy();
    }

    @Override
    public List<SubResource> childPolicies() {
        return this.inner().childPolicies();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<SubResource> firewalls() {
        return this.inner().firewalls();
    }

    @Override
    public FirewallPolicyIntrusionSystemMode intrusionSystemMode() {
        return this.inner().intrusionSystemMode();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<SubResource> ruleGroups() {
        return this.inner().ruleGroups();
    }

    @Override
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.inner().threatIntelMode();
    }

    @Override
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.inner().threatIntelWhitelist();
    }

    @Override
    public FirewallPolicyImpl withBasePolicy(SubResource basePolicy) {
        this.inner().withBasePolicy(basePolicy);
        return this;
    }

    @Override
    public FirewallPolicyImpl withIntrusionSystemMode(FirewallPolicyIntrusionSystemMode intrusionSystemMode) {
        this.inner().withIntrusionSystemMode(intrusionSystemMode);
        return this;
    }

    @Override
    public FirewallPolicyImpl withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.inner().withThreatIntelMode(threatIntelMode);
        return this;
    }

    @Override
    public FirewallPolicyImpl withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.inner().withThreatIntelWhitelist(threatIntelWhitelist);
        return this;
    }

}
