// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.OpenShiftManagedClusterInner;
import com.azure.resourcemanager.containerservice.generated.models.NetworkProfile;
import com.azure.resourcemanager.containerservice.generated.models.OpenShiftManagedCluster;
import com.azure.resourcemanager.containerservice.generated.models.OpenShiftManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerservice.generated.models.OpenShiftManagedClusterAuthProfile;
import com.azure.resourcemanager.containerservice.generated.models.OpenShiftManagedClusterMasterPoolProfile;
import com.azure.resourcemanager.containerservice.generated.models.OpenShiftRouterProfile;
import com.azure.resourcemanager.containerservice.generated.models.PurchasePlan;
import com.azure.resourcemanager.containerservice.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class OpenShiftManagedClusterImpl
    implements OpenShiftManagedCluster, OpenShiftManagedCluster.Definition, OpenShiftManagedCluster.Update {
    private OpenShiftManagedClusterInner innerObject;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

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

    public PurchasePlan plan() {
        return this.innerModel().plan();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String openShiftVersion() {
        return this.innerModel().openShiftVersion();
    }

    public String clusterVersion() {
        return this.innerModel().clusterVersion();
    }

    public String publicHostname() {
        return this.innerModel().publicHostname();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public List<OpenShiftRouterProfile> routerProfiles() {
        List<OpenShiftRouterProfile> inner = this.innerModel().routerProfiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OpenShiftManagedClusterMasterPoolProfile masterPoolProfile() {
        return this.innerModel().masterPoolProfile();
    }

    public List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles() {
        List<OpenShiftManagedClusterAgentPoolProfile> inner = this.innerModel().agentPoolProfiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OpenShiftManagedClusterAuthProfile authProfile() {
        return this.innerModel().authProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public OpenShiftManagedClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private TagsObject updateParameters;

    public OpenShiftManagedClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public OpenShiftManagedCluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public OpenShiftManagedCluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    OpenShiftManagedClusterImpl(
        String name, com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = new OpenShiftManagedClusterInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public OpenShiftManagedClusterImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public OpenShiftManagedCluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .updateTags(resourceGroupName, resourceName, updateParameters, Context.NONE);
        return this;
    }

    public OpenShiftManagedCluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .updateTags(resourceGroupName, resourceName, updateParameters, context);
        return this;
    }

    OpenShiftManagedClusterImpl(
        OpenShiftManagedClusterInner innerObject,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "openShiftManagedClusters");
    }

    public OpenShiftManagedCluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public OpenShiftManagedCluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOpenShiftManagedClusters()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public OpenShiftManagedClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public OpenShiftManagedClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public OpenShiftManagedClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public OpenShiftManagedClusterImpl withPlan(PurchasePlan plan) {
        this.innerModel().withPlan(plan);
        return this;
    }

    public OpenShiftManagedClusterImpl withOpenShiftVersion(String openShiftVersion) {
        this.innerModel().withOpenShiftVersion(openShiftVersion);
        return this;
    }

    public OpenShiftManagedClusterImpl withNetworkProfile(NetworkProfile networkProfile) {
        this.innerModel().withNetworkProfile(networkProfile);
        return this;
    }

    public OpenShiftManagedClusterImpl withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles) {
        this.innerModel().withRouterProfiles(routerProfiles);
        return this;
    }

    public OpenShiftManagedClusterImpl withMasterPoolProfile(
        OpenShiftManagedClusterMasterPoolProfile masterPoolProfile) {
        this.innerModel().withMasterPoolProfile(masterPoolProfile);
        return this;
    }

    public OpenShiftManagedClusterImpl withAgentPoolProfiles(
        List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles) {
        this.innerModel().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    public OpenShiftManagedClusterImpl withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile) {
        this.innerModel().withAuthProfile(authProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
