// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.fluent.models.NodeTypeInner;
import com.azure.resourcemanager.servicefabric.models.EndpointRangeDescription;
import com.azure.resourcemanager.servicefabric.models.ManagedResourceProvisioningState;
import com.azure.resourcemanager.servicefabric.models.NodeType;
import com.azure.resourcemanager.servicefabric.models.NodeTypeUpdateParameters;
import com.azure.resourcemanager.servicefabric.models.VaultSecretGroup;
import com.azure.resourcemanager.servicefabric.models.VmssExtension;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NodeTypeImpl implements NodeType, NodeType.Definition, NodeType.Update {
    private NodeTypeInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Boolean isPrimary() {
        return this.innerModel().isPrimary();
    }

    public Integer vmInstanceCount() {
        return this.innerModel().vmInstanceCount();
    }

    public Integer dataDiskSizeGB() {
        return this.innerModel().dataDiskSizeGB();
    }

    public Map<String, String> placementProperties() {
        Map<String, String> inner = this.innerModel().placementProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> capacities() {
        Map<String, String> inner = this.innerModel().capacities();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public EndpointRangeDescription applicationPorts() {
        return this.innerModel().applicationPorts();
    }

    public EndpointRangeDescription ephemeralPorts() {
        return this.innerModel().ephemeralPorts();
    }

    public String vmSize() {
        return this.innerModel().vmSize();
    }

    public String vmImagePublisher() {
        return this.innerModel().vmImagePublisher();
    }

    public String vmImageOffer() {
        return this.innerModel().vmImageOffer();
    }

    public String vmImageSku() {
        return this.innerModel().vmImageSku();
    }

    public String vmImageVersion() {
        return this.innerModel().vmImageVersion();
    }

    public List<VaultSecretGroup> vmSecrets() {
        List<VaultSecretGroup> inner = this.innerModel().vmSecrets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VmssExtension> vmExtensions() {
        List<VmssExtension> inner = this.innerModel().vmExtensions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ManagedResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NodeTypeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String nodeTypeName;

    private NodeTypeUpdateParameters updateParameters;

    public NodeTypeImpl withExistingManagedCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public NodeType create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .createOrUpdate(resourceGroupName, clusterName, nodeTypeName, this.innerModel(), Context.NONE);
        return this;
    }

    public NodeType create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .createOrUpdate(resourceGroupName, clusterName, nodeTypeName, this.innerModel(), context);
        return this;
    }

    NodeTypeImpl(String name, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = new NodeTypeInner();
        this.serviceManager = serviceManager;
        this.nodeTypeName = name;
    }

    public NodeTypeImpl update() {
        this.updateParameters = new NodeTypeUpdateParameters();
        return this;
    }

    public NodeType apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .update(resourceGroupName, clusterName, nodeTypeName, updateParameters, Context.NONE);
        return this;
    }

    public NodeType apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .update(resourceGroupName, clusterName, nodeTypeName, updateParameters, context);
        return this;
    }

    NodeTypeImpl(
        NodeTypeInner innerObject, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "managedClusters");
        this.nodeTypeName = Utils.getValueFromIdByName(innerObject.id(), "nodeTypes");
    }

    public NodeType refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .getWithResponse(resourceGroupName, clusterName, nodeTypeName, Context.NONE)
                .getValue();
        return this;
    }

    public NodeType refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNodeTypes()
                .getWithResponse(resourceGroupName, clusterName, nodeTypeName, context)
                .getValue();
        return this;
    }

    public NodeTypeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NodeTypeImpl withIsPrimary(Boolean isPrimary) {
        this.innerModel().withIsPrimary(isPrimary);
        return this;
    }

    public NodeTypeImpl withVmInstanceCount(Integer vmInstanceCount) {
        if (isInCreateMode()) {
            this.innerModel().withVmInstanceCount(vmInstanceCount);
            return this;
        } else {
            this.updateParameters.withVmInstanceCount(vmInstanceCount);
            return this;
        }
    }

    public NodeTypeImpl withDataDiskSizeGB(Integer dataDiskSizeGB) {
        this.innerModel().withDataDiskSizeGB(dataDiskSizeGB);
        return this;
    }

    public NodeTypeImpl withPlacementProperties(Map<String, String> placementProperties) {
        if (isInCreateMode()) {
            this.innerModel().withPlacementProperties(placementProperties);
            return this;
        } else {
            this.updateParameters.withPlacementProperties(placementProperties);
            return this;
        }
    }

    public NodeTypeImpl withCapacities(Map<String, String> capacities) {
        if (isInCreateMode()) {
            this.innerModel().withCapacities(capacities);
            return this;
        } else {
            this.updateParameters.withCapacities(capacities);
            return this;
        }
    }

    public NodeTypeImpl withApplicationPorts(EndpointRangeDescription applicationPorts) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationPorts(applicationPorts);
            return this;
        } else {
            this.updateParameters.withApplicationPorts(applicationPorts);
            return this;
        }
    }

    public NodeTypeImpl withEphemeralPorts(EndpointRangeDescription ephemeralPorts) {
        if (isInCreateMode()) {
            this.innerModel().withEphemeralPorts(ephemeralPorts);
            return this;
        } else {
            this.updateParameters.withEphemeralPorts(ephemeralPorts);
            return this;
        }
    }

    public NodeTypeImpl withVmSize(String vmSize) {
        this.innerModel().withVmSize(vmSize);
        return this;
    }

    public NodeTypeImpl withVmImagePublisher(String vmImagePublisher) {
        this.innerModel().withVmImagePublisher(vmImagePublisher);
        return this;
    }

    public NodeTypeImpl withVmImageOffer(String vmImageOffer) {
        this.innerModel().withVmImageOffer(vmImageOffer);
        return this;
    }

    public NodeTypeImpl withVmImageSku(String vmImageSku) {
        this.innerModel().withVmImageSku(vmImageSku);
        return this;
    }

    public NodeTypeImpl withVmImageVersion(String vmImageVersion) {
        this.innerModel().withVmImageVersion(vmImageVersion);
        return this;
    }

    public NodeTypeImpl withVmSecrets(List<VaultSecretGroup> vmSecrets) {
        if (isInCreateMode()) {
            this.innerModel().withVmSecrets(vmSecrets);
            return this;
        } else {
            this.updateParameters.withVmSecrets(vmSecrets);
            return this;
        }
    }

    public NodeTypeImpl withVmExtensions(List<VmssExtension> vmExtensions) {
        if (isInCreateMode()) {
            this.innerModel().withVmExtensions(vmExtensions);
            return this;
        } else {
            this.updateParameters.withVmExtensions(vmExtensions);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
