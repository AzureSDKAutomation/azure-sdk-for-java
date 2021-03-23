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

/** Properties for the container service agent pool profile. */
@Fluent
public class ManagedClusterAgentPoolProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterAgentPoolProfileProperties.class);

    /*
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 0 to 100 (inclusive) for user pools and in the range of
     * 1 to 100 (inclusive) for system pools. The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize")
    private ContainerServiceVMSizeTypes vmSize;

    /*
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /*
     * OS disk type to be used for machines in a given agent pool. Allowed
     * values are 'Ephemeral' and 'Managed'. Defaults to 'Managed'. May not be
     * changed after creation.
     */
    @JsonProperty(value = "osDiskType")
    private OSDiskType osDiskType;

    /*
     * KubeletDiskType determines the placement of emptyDir volumes, container
     * runtime data root, and Kubelet ephemeral storage. Currently allows one
     * value, OS, resulting in Kubelet using the OS disk for data.
     */
    @JsonProperty(value = "kubeletDiskType")
    private KubeletDiskType kubeletDiskType;

    /*
     * VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe
     * pods
     */
    @JsonProperty(value = "vnetSubnetID")
    private String vnetSubnetId;

    /*
     * Pod SubnetID specifies the VNet's subnet identifier for pods.
     */
    @JsonProperty(value = "podSubnetID")
    private String podSubnetId;

    /*
     * Maximum number of pods that can run on a node.
     */
    @JsonProperty(value = "maxPods")
    private Integer maxPods;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /*
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and
     * CBLMariner for Linux OSType. Not applicable to Windows OSType.
     */
    @JsonProperty(value = "osSKU")
    private Ossku osSku;

    /*
     * Maximum number of nodes for auto-scaling
     */
    @JsonProperty(value = "maxCount")
    private Integer maxCount;

    /*
     * Minimum number of nodes for auto-scaling
     */
    @JsonProperty(value = "minCount")
    private Integer minCount;

    /*
     * Whether to enable auto-scaler
     */
    @JsonProperty(value = "enableAutoScaling")
    private Boolean enableAutoScaling;

    /*
     * AgentPoolType represents types of an agent pool
     */
    @JsonProperty(value = "type")
    private AgentPoolType type;

    /*
     * AgentPoolMode represents mode of an agent pool
     */
    @JsonProperty(value = "mode")
    private AgentPoolMode mode;

    /*
     * Version of orchestrator specified when creating the managed cluster.
     */
    @JsonProperty(value = "orchestratorVersion")
    private String orchestratorVersion;

    /*
     * Version of node image
     */
    @JsonProperty(value = "nodeImageVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeImageVersion;

    /*
     * Settings for upgrading the agentpool
     */
    @JsonProperty(value = "upgradeSettings")
    private AgentPoolUpgradeSettings upgradeSettings;

    /*
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Describes whether the Agent Pool is Running or Stopped
     */
    @JsonProperty(value = "powerState", access = JsonProperty.Access.WRITE_ONLY)
    private PowerState powerState;

    /*
     * Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     */
    @JsonProperty(value = "availabilityZones")
    private List<String> availabilityZones;

    /*
     * Enable public IP for nodes
     */
    @JsonProperty(value = "enableNodePublicIP")
    private Boolean enableNodePublicIp;

    /*
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP
     * Prefix.
     */
    @JsonProperty(value = "nodePublicIPPrefixID")
    private String nodePublicIpPrefixId;

    /*
     * ScaleSetPriority to be used to specify virtual machine scale set
     * priority. Default to regular.
     */
    @JsonProperty(value = "scaleSetPriority")
    private ScaleSetPriority scaleSetPriority;

    /*
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     */
    @JsonProperty(value = "scaleSetEvictionPolicy")
    private ScaleSetEvictionPolicy scaleSetEvictionPolicy;

    /*
     * SpotMaxPrice to be used to specify the maximum price you are willing to
     * pay in US Dollars. Possible values are any decimal value greater than
     * zero or -1 which indicates default price to be up-to on-demand.
     */
    @JsonProperty(value = "spotMaxPrice")
    private Float spotMaxPrice;

    /*
     * Agent pool tags to be persisted on the agent pool virtual machine scale
     * set.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Agent pool node labels to be persisted across all nodes in agent pool.
     */
    @JsonProperty(value = "nodeLabels")
    private Map<String, String> nodeLabels;

    /*
     * Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     */
    @JsonProperty(value = "nodeTaints")
    private List<String> nodeTaints;

    /*
     * The ID for Proximity Placement Group.
     */
    @JsonProperty(value = "proximityPlacementGroupID")
    private String proximityPlacementGroupId;

    /*
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     */
    @JsonProperty(value = "kubeletConfig")
    private KubeletConfig kubeletConfig;

    /*
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     */
    @JsonProperty(value = "linuxOSConfig")
    private LinuxOSConfig linuxOSConfig;

    /*
     * Whether to enable EncryptionAtHost
     */
    @JsonProperty(value = "enableEncryptionAtHost")
    private Boolean enableEncryptionAtHost;

    /*
     * Whether to use FIPS enabled OS
     */
    @JsonProperty(value = "enableFIPS")
    private Boolean enableFips;

    /*
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for
     * supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g
     * and MIG7g.
     */
    @JsonProperty(value = "gpuInstanceProfile")
    private GpuInstanceProfile gpuInstanceProfile;

    /**
     * Get the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value
     * is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value
     * is 1.
     *
     * @param count the count value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     *
     * @return the vmSize value.
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @return the osDiskSizeGB value.
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get the osDiskType property: OS disk type to be used for machines in a given agent pool. Allowed values are
     * 'Ephemeral' and 'Managed'. Defaults to 'Managed'. May not be changed after creation.
     *
     * @return the osDiskType value.
     */
    public OSDiskType osDiskType() {
        return this.osDiskType;
    }

    /**
     * Set the osDiskType property: OS disk type to be used for machines in a given agent pool. Allowed values are
     * 'Ephemeral' and 'Managed'. Defaults to 'Managed'. May not be changed after creation.
     *
     * @param osDiskType the osDiskType value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsDiskType(OSDiskType osDiskType) {
        this.osDiskType = osDiskType;
        return this;
    }

    /**
     * Get the kubeletDiskType property: KubeletDiskType determines the placement of emptyDir volumes, container runtime
     * data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk
     * for data.
     *
     * @return the kubeletDiskType value.
     */
    public KubeletDiskType kubeletDiskType() {
        return this.kubeletDiskType;
    }

    /**
     * Set the kubeletDiskType property: KubeletDiskType determines the placement of emptyDir volumes, container runtime
     * data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk
     * for data.
     *
     * @param kubeletDiskType the kubeletDiskType value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withKubeletDiskType(KubeletDiskType kubeletDiskType) {
        this.kubeletDiskType = kubeletDiskType;
        return this;
    }

    /**
     * Get the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods.
     *
     * @return the vnetSubnetId value.
     */
    public String vnetSubnetId() {
        return this.vnetSubnetId;
    }

    /**
     * Set the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods.
     *
     * @param vnetSubnetId the vnetSubnetId value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVnetSubnetId(String vnetSubnetId) {
        this.vnetSubnetId = vnetSubnetId;
        return this;
    }

    /**
     * Get the podSubnetId property: Pod SubnetID specifies the VNet's subnet identifier for pods.
     *
     * @return the podSubnetId value.
     */
    public String podSubnetId() {
        return this.podSubnetId;
    }

    /**
     * Set the podSubnetId property: Pod SubnetID specifies the VNet's subnet identifier for pods.
     *
     * @param podSubnetId the podSubnetId value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withPodSubnetId(String podSubnetId) {
        this.podSubnetId = podSubnetId;
        return this;
    }

    /**
     * Get the maxPods property: Maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    public Integer maxPods() {
        return this.maxPods;
    }

    /**
     * Set the maxPods property: Maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osSku property: OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux
     * OSType. Not applicable to Windows OSType.
     *
     * @return the osSku value.
     */
    public Ossku osSku() {
        return this.osSku;
    }

    /**
     * Set the osSku property: OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux
     * OSType. Not applicable to Windows OSType.
     *
     * @param osSku the osSku value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsSku(Ossku osSku) {
        this.osSku = osSku;
        return this;
    }

    /**
     * Get the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @return the enableAutoScaling value.
     */
    public Boolean enableAutoScaling() {
        return this.enableAutoScaling;
    }

    /**
     * Set the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @param enableAutoScaling the enableAutoScaling value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableAutoScaling(Boolean enableAutoScaling) {
        this.enableAutoScaling = enableAutoScaling;
        return this;
    }

    /**
     * Get the type property: AgentPoolType represents types of an agent pool.
     *
     * @return the type value.
     */
    public AgentPoolType type() {
        return this.type;
    }

    /**
     * Set the type property: AgentPoolType represents types of an agent pool.
     *
     * @param type the type value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withType(AgentPoolType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the mode property: AgentPoolMode represents mode of an agent pool.
     *
     * @return the mode value.
     */
    public AgentPoolMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: AgentPoolMode represents mode of an agent pool.
     *
     * @param mode the mode value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMode(AgentPoolMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @param orchestratorVersion the orchestratorVersion value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the nodeImageVersion property: Version of node image.
     *
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Get the upgradeSettings property: Settings for upgrading the agentpool.
     *
     * @return the upgradeSettings value.
     */
    public AgentPoolUpgradeSettings upgradeSettings() {
        return this.upgradeSettings;
    }

    /**
     * Set the upgradeSettings property: Settings for upgrading the agentpool.
     *
     * @param upgradeSettings the upgradeSettings value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        this.upgradeSettings = upgradeSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the powerState property: Describes whether the Agent Pool is Running or Stopped.
     *
     * @return the powerState value.
     */
    public PowerState powerState() {
        return this.powerState;
    }

    /**
     * Get the availabilityZones property: Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set the availabilityZones property: Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Get the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @return the enableNodePublicIp value.
     */
    public Boolean enableNodePublicIp() {
        return this.enableNodePublicIp;
    }

    /**
     * Set the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @param enableNodePublicIp the enableNodePublicIp value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.enableNodePublicIp = enableNodePublicIp;
        return this;
    }

    /**
     * Get the nodePublicIpPrefixId property: Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     *
     * @return the nodePublicIpPrefixId value.
     */
    public String nodePublicIpPrefixId() {
        return this.nodePublicIpPrefixId;
    }

    /**
     * Set the nodePublicIpPrefixId property: Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     *
     * @param nodePublicIpPrefixId the nodePublicIpPrefixId value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodePublicIpPrefixId(String nodePublicIpPrefixId) {
        this.nodePublicIpPrefixId = nodePublicIpPrefixId;
        return this;
    }

    /**
     * Get the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @return the scaleSetPriority value.
     */
    public ScaleSetPriority scaleSetPriority() {
        return this.scaleSetPriority;
    }

    /**
     * Set the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @param scaleSetPriority the scaleSetPriority value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.scaleSetPriority = scaleSetPriority;
        return this;
    }

    /**
     * Get the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     *
     * @return the scaleSetEvictionPolicy value.
     */
    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy;
    }

    /**
     * Set the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     *
     * @param scaleSetEvictionPolicy the scaleSetEvictionPolicy value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetEvictionPolicy(
        ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        return this;
    }

    /**
     * Get the spotMaxPrice property: SpotMaxPrice to be used to specify the maximum price you are willing to pay in US
     * Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to
     * on-demand.
     *
     * @return the spotMaxPrice value.
     */
    public Float spotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * Set the spotMaxPrice property: SpotMaxPrice to be used to specify the maximum price you are willing to pay in US
     * Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to
     * on-demand.
     *
     * @param spotMaxPrice the spotMaxPrice value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withSpotMaxPrice(Float spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
        return this;
    }

    /**
     * Get the tags property: Agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @param tags the tags value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the nodeLabels property: Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value.
     */
    public Map<String, String> nodeLabels() {
        return this.nodeLabels;
    }

    /**
     * Set the nodeLabels property: Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @param nodeLabels the nodeLabels value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodeLabels(Map<String, String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    /**
     * Get the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    public List<String> nodeTaints() {
        return this.nodeTaints;
    }

    /**
     * Set the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodeTaints(List<String> nodeTaints) {
        this.nodeTaints = nodeTaints;
        return this;
    }

    /**
     * Get the proximityPlacementGroupId property: The ID for Proximity Placement Group.
     *
     * @return the proximityPlacementGroupId value.
     */
    public String proximityPlacementGroupId() {
        return this.proximityPlacementGroupId;
    }

    /**
     * Set the proximityPlacementGroupId property: The ID for Proximity Placement Group.
     *
     * @param proximityPlacementGroupId the proximityPlacementGroupId value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withProximityPlacementGroupId(String proximityPlacementGroupId) {
        this.proximityPlacementGroupId = proximityPlacementGroupId;
        return this;
    }

    /**
     * Get the kubeletConfig property: KubeletConfig specifies the configuration of kubelet on agent nodes.
     *
     * @return the kubeletConfig value.
     */
    public KubeletConfig kubeletConfig() {
        return this.kubeletConfig;
    }

    /**
     * Set the kubeletConfig property: KubeletConfig specifies the configuration of kubelet on agent nodes.
     *
     * @param kubeletConfig the kubeletConfig value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withKubeletConfig(KubeletConfig kubeletConfig) {
        this.kubeletConfig = kubeletConfig;
        return this;
    }

    /**
     * Get the linuxOSConfig property: LinuxOSConfig specifies the OS configuration of linux agent nodes.
     *
     * @return the linuxOSConfig value.
     */
    public LinuxOSConfig linuxOSConfig() {
        return this.linuxOSConfig;
    }

    /**
     * Set the linuxOSConfig property: LinuxOSConfig specifies the OS configuration of linux agent nodes.
     *
     * @param linuxOSConfig the linuxOSConfig value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withLinuxOSConfig(LinuxOSConfig linuxOSConfig) {
        this.linuxOSConfig = linuxOSConfig;
        return this;
    }

    /**
     * Get the enableEncryptionAtHost property: Whether to enable EncryptionAtHost.
     *
     * @return the enableEncryptionAtHost value.
     */
    public Boolean enableEncryptionAtHost() {
        return this.enableEncryptionAtHost;
    }

    /**
     * Set the enableEncryptionAtHost property: Whether to enable EncryptionAtHost.
     *
     * @param enableEncryptionAtHost the enableEncryptionAtHost value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableEncryptionAtHost(Boolean enableEncryptionAtHost) {
        this.enableEncryptionAtHost = enableEncryptionAtHost;
        return this;
    }

    /**
     * Get the enableFips property: Whether to use FIPS enabled OS.
     *
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Set the enableFips property: Whether to use FIPS enabled OS.
     *
     * @param enableFips the enableFips value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableFips(Boolean enableFips) {
        this.enableFips = enableFips;
        return this;
    }

    /**
     * Get the gpuInstanceProfile property: GPUInstanceProfile to be used to specify GPU MIG instance profile for
     * supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     *
     * @return the gpuInstanceProfile value.
     */
    public GpuInstanceProfile gpuInstanceProfile() {
        return this.gpuInstanceProfile;
    }

    /**
     * Set the gpuInstanceProfile property: GPUInstanceProfile to be used to specify GPU MIG instance profile for
     * supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     *
     * @param gpuInstanceProfile the gpuInstanceProfile value to set.
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withGpuInstanceProfile(GpuInstanceProfile gpuInstanceProfile) {
        this.gpuInstanceProfile = gpuInstanceProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradeSettings() != null) {
            upgradeSettings().validate();
        }
        if (powerState() != null) {
            powerState().validate();
        }
        if (kubeletConfig() != null) {
            kubeletConfig().validate();
        }
        if (linuxOSConfig() != null) {
            linuxOSConfig().validate();
        }
    }
}
