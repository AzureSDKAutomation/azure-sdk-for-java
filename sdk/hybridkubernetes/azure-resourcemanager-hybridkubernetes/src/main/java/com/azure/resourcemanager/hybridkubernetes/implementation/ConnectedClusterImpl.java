// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridkubernetes.HybridKubernetesManager;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.ConnectedClusterInner;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedCluster;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterAadProfile;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterIdentity;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterPatch;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectivityStatus;
import com.azure.resourcemanager.hybridkubernetes.models.ProvisioningState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ConnectedClusterImpl
    implements ConnectedCluster, ConnectedCluster.Definition, ConnectedCluster.Update {
    private ConnectedClusterInner innerObject;

    private final HybridKubernetesManager serviceManager;

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

    public ConnectedClusterIdentity identity() {
        return this.innerModel().identity();
    }

    public String agentPublicKeyCertificate() {
        return this.innerModel().agentPublicKeyCertificate();
    }

    public ConnectedClusterAadProfile aadProfile() {
        return this.innerModel().aadProfile();
    }

    public String kubernetesVersion() {
        return this.innerModel().kubernetesVersion();
    }

    public Integer totalNodeCount() {
        return this.innerModel().totalNodeCount();
    }

    public Integer totalCoreCount() {
        return this.innerModel().totalCoreCount();
    }

    public String agentVersion() {
        return this.innerModel().agentVersion();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String distribution() {
        return this.innerModel().distribution();
    }

    public String infrastructure() {
        return this.innerModel().infrastructure();
    }

    public String offering() {
        return this.innerModel().offering();
    }

    public OffsetDateTime managedIdentityCertificateExpirationTime() {
        return this.innerModel().managedIdentityCertificateExpirationTime();
    }

    public OffsetDateTime lastConnectivityTime() {
        return this.innerModel().lastConnectivityTime();
    }

    public ConnectivityStatus connectivityStatus() {
        return this.innerModel().connectivityStatus();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ConnectedClusterInner innerModel() {
        return this.innerObject;
    }

    private HybridKubernetesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private ConnectedClusterPatch updateConnectedClusterPatch;

    public ConnectedClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ConnectedCluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .create(resourceGroupName, clusterName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConnectedCluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .create(resourceGroupName, clusterName, this.innerModel(), context);
        return this;
    }

    public ConnectedClusterImpl(String name, HybridKubernetesManager serviceManager) {
        this.innerObject = new ConnectedClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
    }

    public ConnectedClusterImpl update() {
        this.updateConnectedClusterPatch = new ConnectedClusterPatch();
        return this;
    }

    public ConnectedCluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .updateWithResponse(resourceGroupName, clusterName, updateConnectedClusterPatch, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectedCluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .updateWithResponse(resourceGroupName, clusterName, updateConnectedClusterPatch, context)
                .getValue();
        return this;
    }

    public ConnectedClusterImpl(ConnectedClusterInner innerObject, HybridKubernetesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "connectedClusters");
    }

    public ConnectedCluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectedCluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, context)
                .getValue();
        return this;
    }

    public ConnectedClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConnectedClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConnectedClusterImpl withIdentity(ConnectedClusterIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ConnectedClusterImpl withAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
        if (isInCreateMode()) {
            this.innerModel().withAgentPublicKeyCertificate(agentPublicKeyCertificate);
            return this;
        } else {
            this.updateConnectedClusterPatch.withAgentPublicKeyCertificate(agentPublicKeyCertificate);
            return this;
        }
    }

    public ConnectedClusterImpl withAadProfile(ConnectedClusterAadProfile aadProfile) {
        this.innerModel().withAadProfile(aadProfile);
        return this;
    }

    public ConnectedClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateConnectedClusterPatch.withTags(tags);
            return this;
        }
    }

    public ConnectedClusterImpl withProvisioningState(ProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public ConnectedClusterImpl withDistribution(String distribution) {
        this.innerModel().withDistribution(distribution);
        return this;
    }

    public ConnectedClusterImpl withInfrastructure(String infrastructure) {
        this.innerModel().withInfrastructure(infrastructure);
        return this;
    }

    public ConnectedClusterImpl withConnectivityStatus(ConnectivityStatus connectivityStatus) {
        this.innerModel().withConnectivityStatus(connectivityStatus);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
