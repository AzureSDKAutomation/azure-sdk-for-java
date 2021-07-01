// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Profile for the container service agent pool. */
@Fluent
public final class ManagedClusterAgentPoolProfile extends ManagedClusterAgentPoolProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterAgentPoolProfile.class);

    /*
     * Windows agent pool names must be 6 characters or less.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: Windows agent pool names must be 6 characters or less.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Windows agent pool names must be 6 characters or less.
     *
     * @param name the name value to set.
     * @return the ManagedClusterAgentPoolProfile object itself.
     */
    public ManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withCount(Integer count) {
        super.withCount(count);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withVmSize(String vmSize) {
        super.withVmSize(vmSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withOsDiskSizeGB(Integer osDiskSizeGB) {
        super.withOsDiskSizeGB(osDiskSizeGB);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withOsDiskType(OSDiskType osDiskType) {
        super.withOsDiskType(osDiskType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withKubeletDiskType(KubeletDiskType kubeletDiskType) {
        super.withKubeletDiskType(kubeletDiskType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withVnetSubnetId(String vnetSubnetId) {
        super.withVnetSubnetId(vnetSubnetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withPodSubnetId(String podSubnetId) {
        super.withPodSubnetId(podSubnetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withMaxPods(Integer maxPods) {
        super.withMaxPods(maxPods);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withOsType(OSType osType) {
        super.withOsType(osType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withOsSku(Ossku osSku) {
        super.withOsSku(osSku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withMaxCount(Integer maxCount) {
        super.withMaxCount(maxCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withMinCount(Integer minCount) {
        super.withMinCount(minCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withEnableAutoScaling(Boolean enableAutoScaling) {
        super.withEnableAutoScaling(enableAutoScaling);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withType(AgentPoolType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withMode(AgentPoolMode mode) {
        super.withMode(mode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withOrchestratorVersion(String orchestratorVersion) {
        super.withOrchestratorVersion(orchestratorVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        super.withUpgradeSettings(upgradeSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withAvailabilityZones(List<String> availabilityZones) {
        super.withAvailabilityZones(availabilityZones);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withEnableNodePublicIp(Boolean enableNodePublicIp) {
        super.withEnableNodePublicIp(enableNodePublicIp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withNodePublicIpPrefixId(String nodePublicIpPrefixId) {
        super.withNodePublicIpPrefixId(nodePublicIpPrefixId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        super.withScaleSetPriority(scaleSetPriority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        super.withScaleSetEvictionPolicy(scaleSetEvictionPolicy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withSpotMaxPrice(Float spotMaxPrice) {
        super.withSpotMaxPrice(spotMaxPrice);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withNodeLabels(Map<String, String> nodeLabels) {
        super.withNodeLabels(nodeLabels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withNodeTaints(List<String> nodeTaints) {
        super.withNodeTaints(nodeTaints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withProximityPlacementGroupId(String proximityPlacementGroupId) {
        super.withProximityPlacementGroupId(proximityPlacementGroupId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withKubeletConfig(KubeletConfig kubeletConfig) {
        super.withKubeletConfig(kubeletConfig);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withLinuxOSConfig(LinuxOSConfig linuxOSConfig) {
        super.withLinuxOSConfig(linuxOSConfig);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withEnableEncryptionAtHost(Boolean enableEncryptionAtHost) {
        super.withEnableEncryptionAtHost(enableEncryptionAtHost);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withEnableUltraSsd(Boolean enableUltraSsd) {
        super.withEnableUltraSsd(enableUltraSsd);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withEnableFips(Boolean enableFips) {
        super.withEnableFips(enableFips);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAgentPoolProfile withGpuInstanceProfile(GpuInstanceProfile gpuInstanceProfile) {
        super.withGpuInstanceProfile(gpuInstanceProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ManagedClusterAgentPoolProfile"));
        }
    }
}
