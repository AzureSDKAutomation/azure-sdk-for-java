// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.containerservice.generated.models.AgentPool;
import com.azure.resourcemanager.containerservice.generated.models.AgentPoolMode;
import com.azure.resourcemanager.containerservice.generated.models.AgentPoolType;
import com.azure.resourcemanager.containerservice.generated.models.AgentPoolUpgradeSettings;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceVMSizeTypes;
import com.azure.resourcemanager.containerservice.generated.models.GpuInstanceProfile;
import com.azure.resourcemanager.containerservice.generated.models.KubeletConfig;
import com.azure.resourcemanager.containerservice.generated.models.KubeletDiskType;
import com.azure.resourcemanager.containerservice.generated.models.LinuxOSConfig;
import com.azure.resourcemanager.containerservice.generated.models.OSDiskType;
import com.azure.resourcemanager.containerservice.generated.models.OSType;
import com.azure.resourcemanager.containerservice.generated.models.Ossku;
import com.azure.resourcemanager.containerservice.generated.models.PowerState;
import com.azure.resourcemanager.containerservice.generated.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerservice.generated.models.ScaleSetPriority;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AgentPoolImpl implements AgentPool, AgentPool.Definition, AgentPool.Update {
    private AgentPoolInner innerObject;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public Integer count() {
        return this.innerModel().count();
    }

    public ContainerServiceVMSizeTypes vmSize() {
        return this.innerModel().vmSize();
    }

    public Integer osDiskSizeGB() {
        return this.innerModel().osDiskSizeGB();
    }

    public OSDiskType osDiskType() {
        return this.innerModel().osDiskType();
    }

    public KubeletDiskType kubeletDiskType() {
        return this.innerModel().kubeletDiskType();
    }

    public String vnetSubnetId() {
        return this.innerModel().vnetSubnetId();
    }

    public String podSubnetId() {
        return this.innerModel().podSubnetId();
    }

    public Integer maxPods() {
        return this.innerModel().maxPods();
    }

    public OSType osType() {
        return this.innerModel().osType();
    }

    public Ossku osSku() {
        return this.innerModel().osSku();
    }

    public Integer maxCount() {
        return this.innerModel().maxCount();
    }

    public Integer minCount() {
        return this.innerModel().minCount();
    }

    public Boolean enableAutoScaling() {
        return this.innerModel().enableAutoScaling();
    }

    public AgentPoolType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public AgentPoolMode mode() {
        return this.innerModel().mode();
    }

    public String orchestratorVersion() {
        return this.innerModel().orchestratorVersion();
    }

    public String nodeImageVersion() {
        return this.innerModel().nodeImageVersion();
    }

    public AgentPoolUpgradeSettings upgradeSettings() {
        return this.innerModel().upgradeSettings();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PowerState powerState() {
        return this.innerModel().powerState();
    }

    public List<String> availabilityZones() {
        List<String> inner = this.innerModel().availabilityZones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableNodePublicIp() {
        return this.innerModel().enableNodePublicIp();
    }

    public String nodePublicIpPrefixId() {
        return this.innerModel().nodePublicIpPrefixId();
    }

    public ScaleSetPriority scaleSetPriority() {
        return this.innerModel().scaleSetPriority();
    }

    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.innerModel().scaleSetEvictionPolicy();
    }

    public Float spotMaxPrice() {
        return this.innerModel().spotMaxPrice();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> nodeLabels() {
        Map<String, String> inner = this.innerModel().nodeLabels();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> nodeTaints() {
        List<String> inner = this.innerModel().nodeTaints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String proximityPlacementGroupId() {
        return this.innerModel().proximityPlacementGroupId();
    }

    public KubeletConfig kubeletConfig() {
        return this.innerModel().kubeletConfig();
    }

    public LinuxOSConfig linuxOSConfig() {
        return this.innerModel().linuxOSConfig();
    }

    public Boolean enableEncryptionAtHost() {
        return this.innerModel().enableEncryptionAtHost();
    }

    public Boolean enableFips() {
        return this.innerModel().enableFips();
    }

    public GpuInstanceProfile gpuInstanceProfile() {
        return this.innerModel().gpuInstanceProfile();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AgentPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String agentPoolName;

    public AgentPoolImpl withExistingManagedCluster(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public AgentPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, resourceName, agentPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public AgentPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, resourceName, agentPoolName, this.innerModel(), context);
        return this;
    }

    AgentPoolImpl(
        String name, com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = new AgentPoolInner();
        this.serviceManager = serviceManager;
        this.agentPoolName = name;
    }

    public AgentPoolImpl update() {
        return this;
    }

    public AgentPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, resourceName, agentPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public AgentPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, resourceName, agentPoolName, this.innerModel(), context);
        return this;
    }

    AgentPoolImpl(
        AgentPoolInner innerObject,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "managedClusters");
        this.agentPoolName = Utils.getValueFromIdByName(innerObject.id(), "agentPools");
    }

    public AgentPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, resourceName, agentPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public AgentPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, resourceName, agentPoolName, context)
                .getValue();
        return this;
    }

    public AgentPool upgradeNodeImageVersion() {
        return serviceManager.agentPools().upgradeNodeImageVersion(resourceGroupName, resourceName, agentPoolName);
    }

    public AgentPool upgradeNodeImageVersion(Context context) {
        return serviceManager
            .agentPools()
            .upgradeNodeImageVersion(resourceGroupName, resourceName, agentPoolName, context);
    }

    public AgentPoolImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AgentPoolImpl withCount(Integer count) {
        this.innerModel().withCount(count);
        return this;
    }

    public AgentPoolImpl withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.innerModel().withVmSize(vmSize);
        return this;
    }

    public AgentPoolImpl withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.innerModel().withOsDiskSizeGB(osDiskSizeGB);
        return this;
    }

    public AgentPoolImpl withOsDiskType(OSDiskType osDiskType) {
        this.innerModel().withOsDiskType(osDiskType);
        return this;
    }

    public AgentPoolImpl withKubeletDiskType(KubeletDiskType kubeletDiskType) {
        this.innerModel().withKubeletDiskType(kubeletDiskType);
        return this;
    }

    public AgentPoolImpl withVnetSubnetId(String vnetSubnetId) {
        this.innerModel().withVnetSubnetId(vnetSubnetId);
        return this;
    }

    public AgentPoolImpl withPodSubnetId(String podSubnetId) {
        this.innerModel().withPodSubnetId(podSubnetId);
        return this;
    }

    public AgentPoolImpl withMaxPods(Integer maxPods) {
        this.innerModel().withMaxPods(maxPods);
        return this;
    }

    public AgentPoolImpl withOsType(OSType osType) {
        this.innerModel().withOsType(osType);
        return this;
    }

    public AgentPoolImpl withOsSku(Ossku osSku) {
        this.innerModel().withOsSku(osSku);
        return this;
    }

    public AgentPoolImpl withMaxCount(Integer maxCount) {
        this.innerModel().withMaxCount(maxCount);
        return this;
    }

    public AgentPoolImpl withMinCount(Integer minCount) {
        this.innerModel().withMinCount(minCount);
        return this;
    }

    public AgentPoolImpl withEnableAutoScaling(Boolean enableAutoScaling) {
        this.innerModel().withEnableAutoScaling(enableAutoScaling);
        return this;
    }

    public AgentPoolImpl withTypePropertiesType(AgentPoolType typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public AgentPoolImpl withMode(AgentPoolMode mode) {
        this.innerModel().withMode(mode);
        return this;
    }

    public AgentPoolImpl withOrchestratorVersion(String orchestratorVersion) {
        this.innerModel().withOrchestratorVersion(orchestratorVersion);
        return this;
    }

    public AgentPoolImpl withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        this.innerModel().withUpgradeSettings(upgradeSettings);
        return this;
    }

    public AgentPoolImpl withAvailabilityZones(List<String> availabilityZones) {
        this.innerModel().withAvailabilityZones(availabilityZones);
        return this;
    }

    public AgentPoolImpl withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.innerModel().withEnableNodePublicIp(enableNodePublicIp);
        return this;
    }

    public AgentPoolImpl withNodePublicIpPrefixId(String nodePublicIpPrefixId) {
        this.innerModel().withNodePublicIpPrefixId(nodePublicIpPrefixId);
        return this;
    }

    public AgentPoolImpl withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.innerModel().withScaleSetPriority(scaleSetPriority);
        return this;
    }

    public AgentPoolImpl withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.innerModel().withScaleSetEvictionPolicy(scaleSetEvictionPolicy);
        return this;
    }

    public AgentPoolImpl withSpotMaxPrice(Float spotMaxPrice) {
        this.innerModel().withSpotMaxPrice(spotMaxPrice);
        return this;
    }

    public AgentPoolImpl withNodeLabels(Map<String, String> nodeLabels) {
        this.innerModel().withNodeLabels(nodeLabels);
        return this;
    }

    public AgentPoolImpl withNodeTaints(List<String> nodeTaints) {
        this.innerModel().withNodeTaints(nodeTaints);
        return this;
    }

    public AgentPoolImpl withProximityPlacementGroupId(String proximityPlacementGroupId) {
        this.innerModel().withProximityPlacementGroupId(proximityPlacementGroupId);
        return this;
    }

    public AgentPoolImpl withKubeletConfig(KubeletConfig kubeletConfig) {
        this.innerModel().withKubeletConfig(kubeletConfig);
        return this;
    }

    public AgentPoolImpl withLinuxOSConfig(LinuxOSConfig linuxOSConfig) {
        this.innerModel().withLinuxOSConfig(linuxOSConfig);
        return this;
    }

    public AgentPoolImpl withEnableEncryptionAtHost(Boolean enableEncryptionAtHost) {
        this.innerModel().withEnableEncryptionAtHost(enableEncryptionAtHost);
        return this;
    }

    public AgentPoolImpl withEnableFips(Boolean enableFips) {
        this.innerModel().withEnableFips(enableFips);
        return this;
    }

    public AgentPoolImpl withGpuInstanceProfile(GpuInstanceProfile gpuInstanceProfile) {
        this.innerModel().withGpuInstanceProfile(gpuInstanceProfile);
        return this;
    }
}
