// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Hyper V VM network input details. */
@Fluent
public final class VMNicInputDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMNicInputDetails.class);

    /*
     * The nic Id.
     */
    @JsonProperty(value = "nicId")
    private String nicId;

    /*
     * Recovery VM subnet name.
     */
    @JsonProperty(value = "recoveryVMSubnetName")
    private String recoveryVMSubnetName;

    /*
     * Replica nic static IP address.
     */
    @JsonProperty(value = "replicaNicStaticIPAddress")
    private String replicaNicStaticIpAddress;

    /*
     * Selection type for failover.
     */
    @JsonProperty(value = "selectionType")
    private String selectionType;

    /*
     * The id of the public IP address resource associated with the NIC.
     */
    @JsonProperty(value = "recoveryPublicIpAddressId")
    private String recoveryPublicIpAddressId;

    /*
     * The id of the NSG associated with the NIC.
     */
    @JsonProperty(value = "recoveryNetworkSecurityGroupId")
    private String recoveryNetworkSecurityGroupId;

    /*
     * The target backend address pools for the NIC.
     */
    @JsonProperty(value = "recoveryLBBackendAddressPoolIds")
    private List<String> recoveryLBBackendAddressPoolIds;

    /*
     * Whether the NIC has accelerated networking enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworkingOnRecovery")
    private Boolean enableAcceleratedNetworkingOnRecovery;

    /*
     * The subnet to be used by NIC during test failover.
     */
    @JsonProperty(value = "tfoVMSubnetName")
    private String tfoVMSubnetName;

    /*
     * The NSG to be used by NIC during test failover.
     */
    @JsonProperty(value = "tfoNetworkSecurityGroupId")
    private String tfoNetworkSecurityGroupId;

    /*
     * Whether the test NIC has accelerated networking enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworkingOnTfo")
    private Boolean enableAcceleratedNetworkingOnTfo;

    /*
     * The IP configurations to be used by NIC during test failover.
     */
    @JsonProperty(value = "tfoIPConfigs")
    private List<IpConfig> tfoIpConfigs;

    /*
     * The name of the NIC to be used when creating target NICs.
     */
    @JsonProperty(value = "recoveryNicName")
    private String recoveryNicName;

    /*
     * The resource group of the NIC to be used when creating target NICs.
     */
    @JsonProperty(value = "recoveryNicResourceGroupName")
    private String recoveryNicResourceGroupName;

    /*
     * A value indicating whether an existing NIC is allowed to be reused
     * during failover subject to availability.
     */
    @JsonProperty(value = "reuseExistingNic")
    private Boolean reuseExistingNic;

    /*
     * The name of the NIC to be used when creating target NICs in TFO.
     */
    @JsonProperty(value = "tfoNicName")
    private String tfoNicName;

    /*
     * The resource group of the NIC to be used when creating target NICs in
     * TFO.
     */
    @JsonProperty(value = "tfoNicResourceGroupName")
    private String tfoNicResourceGroupName;

    /*
     * A value indicating whether an existing NIC is allowed to be reused
     * during test failover subject to availability.
     */
    @JsonProperty(value = "tfoReuseExistingNic")
    private Boolean tfoReuseExistingNic;

    /**
     * Get the nicId property: The nic Id.
     *
     * @return the nicId value.
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Set the nicId property: The nic Id.
     *
     * @param nicId the nicId value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * Get the recoveryVMSubnetName property: Recovery VM subnet name.
     *
     * @return the recoveryVMSubnetName value.
     */
    public String recoveryVMSubnetName() {
        return this.recoveryVMSubnetName;
    }

    /**
     * Set the recoveryVMSubnetName property: Recovery VM subnet name.
     *
     * @param recoveryVMSubnetName the recoveryVMSubnetName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryVMSubnetName(String recoveryVMSubnetName) {
        this.recoveryVMSubnetName = recoveryVMSubnetName;
        return this;
    }

    /**
     * Get the replicaNicStaticIpAddress property: Replica nic static IP address.
     *
     * @return the replicaNicStaticIpAddress value.
     */
    public String replicaNicStaticIpAddress() {
        return this.replicaNicStaticIpAddress;
    }

    /**
     * Set the replicaNicStaticIpAddress property: Replica nic static IP address.
     *
     * @param replicaNicStaticIpAddress the replicaNicStaticIpAddress value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withReplicaNicStaticIpAddress(String replicaNicStaticIpAddress) {
        this.replicaNicStaticIpAddress = replicaNicStaticIpAddress;
        return this;
    }

    /**
     * Get the selectionType property: Selection type for failover.
     *
     * @return the selectionType value.
     */
    public String selectionType() {
        return this.selectionType;
    }

    /**
     * Set the selectionType property: Selection type for failover.
     *
     * @param selectionType the selectionType value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withSelectionType(String selectionType) {
        this.selectionType = selectionType;
        return this;
    }

    /**
     * Get the recoveryPublicIpAddressId property: The id of the public IP address resource associated with the NIC.
     *
     * @return the recoveryPublicIpAddressId value.
     */
    public String recoveryPublicIpAddressId() {
        return this.recoveryPublicIpAddressId;
    }

    /**
     * Set the recoveryPublicIpAddressId property: The id of the public IP address resource associated with the NIC.
     *
     * @param recoveryPublicIpAddressId the recoveryPublicIpAddressId value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryPublicIpAddressId(String recoveryPublicIpAddressId) {
        this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
        return this;
    }

    /**
     * Get the recoveryNetworkSecurityGroupId property: The id of the NSG associated with the NIC.
     *
     * @return the recoveryNetworkSecurityGroupId value.
     */
    public String recoveryNetworkSecurityGroupId() {
        return this.recoveryNetworkSecurityGroupId;
    }

    /**
     * Set the recoveryNetworkSecurityGroupId property: The id of the NSG associated with the NIC.
     *
     * @param recoveryNetworkSecurityGroupId the recoveryNetworkSecurityGroupId value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryNetworkSecurityGroupId(String recoveryNetworkSecurityGroupId) {
        this.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
        return this;
    }

    /**
     * Get the recoveryLBBackendAddressPoolIds property: The target backend address pools for the NIC.
     *
     * @return the recoveryLBBackendAddressPoolIds value.
     */
    public List<String> recoveryLBBackendAddressPoolIds() {
        return this.recoveryLBBackendAddressPoolIds;
    }

    /**
     * Set the recoveryLBBackendAddressPoolIds property: The target backend address pools for the NIC.
     *
     * @param recoveryLBBackendAddressPoolIds the recoveryLBBackendAddressPoolIds value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryLBBackendAddressPoolIds(List<String> recoveryLBBackendAddressPoolIds) {
        this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworkingOnRecovery property: Whether the NIC has accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworkingOnRecovery value.
     */
    public Boolean enableAcceleratedNetworkingOnRecovery() {
        return this.enableAcceleratedNetworkingOnRecovery;
    }

    /**
     * Set the enableAcceleratedNetworkingOnRecovery property: Whether the NIC has accelerated networking enabled.
     *
     * @param enableAcceleratedNetworkingOnRecovery the enableAcceleratedNetworkingOnRecovery value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withEnableAcceleratedNetworkingOnRecovery(Boolean enableAcceleratedNetworkingOnRecovery) {
        this.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
        return this;
    }

    /**
     * Get the tfoVMSubnetName property: The subnet to be used by NIC during test failover.
     *
     * @return the tfoVMSubnetName value.
     */
    public String tfoVMSubnetName() {
        return this.tfoVMSubnetName;
    }

    /**
     * Set the tfoVMSubnetName property: The subnet to be used by NIC during test failover.
     *
     * @param tfoVMSubnetName the tfoVMSubnetName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoVMSubnetName(String tfoVMSubnetName) {
        this.tfoVMSubnetName = tfoVMSubnetName;
        return this;
    }

    /**
     * Get the tfoNetworkSecurityGroupId property: The NSG to be used by NIC during test failover.
     *
     * @return the tfoNetworkSecurityGroupId value.
     */
    public String tfoNetworkSecurityGroupId() {
        return this.tfoNetworkSecurityGroupId;
    }

    /**
     * Set the tfoNetworkSecurityGroupId property: The NSG to be used by NIC during test failover.
     *
     * @param tfoNetworkSecurityGroupId the tfoNetworkSecurityGroupId value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoNetworkSecurityGroupId(String tfoNetworkSecurityGroupId) {
        this.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworkingOnTfo property: Whether the test NIC has accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworkingOnTfo value.
     */
    public Boolean enableAcceleratedNetworkingOnTfo() {
        return this.enableAcceleratedNetworkingOnTfo;
    }

    /**
     * Set the enableAcceleratedNetworkingOnTfo property: Whether the test NIC has accelerated networking enabled.
     *
     * @param enableAcceleratedNetworkingOnTfo the enableAcceleratedNetworkingOnTfo value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withEnableAcceleratedNetworkingOnTfo(Boolean enableAcceleratedNetworkingOnTfo) {
        this.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
        return this;
    }

    /**
     * Get the tfoIpConfigs property: The IP configurations to be used by NIC during test failover.
     *
     * @return the tfoIpConfigs value.
     */
    public List<IpConfig> tfoIpConfigs() {
        return this.tfoIpConfigs;
    }

    /**
     * Set the tfoIpConfigs property: The IP configurations to be used by NIC during test failover.
     *
     * @param tfoIpConfigs the tfoIpConfigs value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoIpConfigs(List<IpConfig> tfoIpConfigs) {
        this.tfoIpConfigs = tfoIpConfigs;
        return this;
    }

    /**
     * Get the recoveryNicName property: The name of the NIC to be used when creating target NICs.
     *
     * @return the recoveryNicName value.
     */
    public String recoveryNicName() {
        return this.recoveryNicName;
    }

    /**
     * Set the recoveryNicName property: The name of the NIC to be used when creating target NICs.
     *
     * @param recoveryNicName the recoveryNicName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryNicName(String recoveryNicName) {
        this.recoveryNicName = recoveryNicName;
        return this;
    }

    /**
     * Get the recoveryNicResourceGroupName property: The resource group of the NIC to be used when creating target
     * NICs.
     *
     * @return the recoveryNicResourceGroupName value.
     */
    public String recoveryNicResourceGroupName() {
        return this.recoveryNicResourceGroupName;
    }

    /**
     * Set the recoveryNicResourceGroupName property: The resource group of the NIC to be used when creating target
     * NICs.
     *
     * @param recoveryNicResourceGroupName the recoveryNicResourceGroupName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withRecoveryNicResourceGroupName(String recoveryNicResourceGroupName) {
        this.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
        return this;
    }

    /**
     * Get the reuseExistingNic property: A value indicating whether an existing NIC is allowed to be reused during
     * failover subject to availability.
     *
     * @return the reuseExistingNic value.
     */
    public Boolean reuseExistingNic() {
        return this.reuseExistingNic;
    }

    /**
     * Set the reuseExistingNic property: A value indicating whether an existing NIC is allowed to be reused during
     * failover subject to availability.
     *
     * @param reuseExistingNic the reuseExistingNic value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withReuseExistingNic(Boolean reuseExistingNic) {
        this.reuseExistingNic = reuseExistingNic;
        return this;
    }

    /**
     * Get the tfoNicName property: The name of the NIC to be used when creating target NICs in TFO.
     *
     * @return the tfoNicName value.
     */
    public String tfoNicName() {
        return this.tfoNicName;
    }

    /**
     * Set the tfoNicName property: The name of the NIC to be used when creating target NICs in TFO.
     *
     * @param tfoNicName the tfoNicName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoNicName(String tfoNicName) {
        this.tfoNicName = tfoNicName;
        return this;
    }

    /**
     * Get the tfoNicResourceGroupName property: The resource group of the NIC to be used when creating target NICs in
     * TFO.
     *
     * @return the tfoNicResourceGroupName value.
     */
    public String tfoNicResourceGroupName() {
        return this.tfoNicResourceGroupName;
    }

    /**
     * Set the tfoNicResourceGroupName property: The resource group of the NIC to be used when creating target NICs in
     * TFO.
     *
     * @param tfoNicResourceGroupName the tfoNicResourceGroupName value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoNicResourceGroupName(String tfoNicResourceGroupName) {
        this.tfoNicResourceGroupName = tfoNicResourceGroupName;
        return this;
    }

    /**
     * Get the tfoReuseExistingNic property: A value indicating whether an existing NIC is allowed to be reused during
     * test failover subject to availability.
     *
     * @return the tfoReuseExistingNic value.
     */
    public Boolean tfoReuseExistingNic() {
        return this.tfoReuseExistingNic;
    }

    /**
     * Set the tfoReuseExistingNic property: A value indicating whether an existing NIC is allowed to be reused during
     * test failover subject to availability.
     *
     * @param tfoReuseExistingNic the tfoReuseExistingNic value to set.
     * @return the VMNicInputDetails object itself.
     */
    public VMNicInputDetails withTfoReuseExistingNic(Boolean tfoReuseExistingNic) {
        this.tfoReuseExistingNic = tfoReuseExistingNic;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tfoIpConfigs() != null) {
            tfoIpConfigs().forEach(e -> e.validate());
        }
    }
}
