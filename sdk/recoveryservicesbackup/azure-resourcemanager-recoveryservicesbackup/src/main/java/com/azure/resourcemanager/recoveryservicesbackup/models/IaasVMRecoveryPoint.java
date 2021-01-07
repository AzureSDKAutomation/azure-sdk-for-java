// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** IaaS VM workload specific backup copy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMRecoveryPoint")
@Fluent
public final class IaasVMRecoveryPoint extends RecoveryPoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IaasVMRecoveryPoint.class);

    /*
     * Type of the backup copy.
     */
    @JsonProperty(value = "recoveryPointType", access = JsonProperty.Access.WRITE_ONLY)
    private String recoveryPointType;

    /*
     * Time at which this backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime recoveryPointTime;

    /*
     * Additional information associated with this backup copy.
     */
    @JsonProperty(value = "recoveryPointAdditionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private String recoveryPointAdditionalInfo;

    /*
     * Storage type of the VM whose backup copy is created.
     */
    @JsonProperty(value = "sourceVMStorageType", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceVMStorageType;

    /*
     * Identifies whether the VM was encrypted when the backup copy is created.
     */
    @JsonProperty(value = "isSourceVMEncrypted", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSourceVMEncrypted;

    /*
     * Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     */
    @JsonProperty(value = "keyAndSecret")
    private KeyAndSecretDetails keyAndSecret;

    /*
     * Is the session to recover items from this backup copy still active.
     */
    @JsonProperty(value = "isInstantIlrSessionActive")
    private Boolean isInstantIlrSessionActive;

    /*
     * Recovery point tier information.
     */
    @JsonProperty(value = "recoveryPointTierDetails")
    private List<RecoveryPointTierInformation> recoveryPointTierDetails;

    /*
     * Whether VM is with Managed Disks
     */
    @JsonProperty(value = "isManagedVirtualMachine")
    private Boolean isManagedVirtualMachine;

    /*
     * Virtual Machine Size
     */
    @JsonProperty(value = "virtualMachineSize")
    private String virtualMachineSize;

    /*
     * Original Storage Account Option
     */
    @JsonProperty(value = "originalStorageAccountOption")
    private Boolean originalStorageAccountOption;

    /*
     * OS type
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * Disk configuration
     */
    @JsonProperty(value = "recoveryPointDiskConfiguration")
    private RecoveryPointDiskConfiguration recoveryPointDiskConfiguration;

    /*
     * Identifies the zone of the VM at the time of backup. Applicable only for
     * zone-pinned Vms
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get the recoveryPointType property: Type of the backup copy.
     *
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Get the recoveryPointTime property: Time at which this backup copy was created.
     *
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Get the recoveryPointAdditionalInfo property: Additional information associated with this backup copy.
     *
     * @return the recoveryPointAdditionalInfo value.
     */
    public String recoveryPointAdditionalInfo() {
        return this.recoveryPointAdditionalInfo;
    }

    /**
     * Get the sourceVMStorageType property: Storage type of the VM whose backup copy is created.
     *
     * @return the sourceVMStorageType value.
     */
    public String sourceVMStorageType() {
        return this.sourceVMStorageType;
    }

    /**
     * Get the isSourceVMEncrypted property: Identifies whether the VM was encrypted when the backup copy is created.
     *
     * @return the isSourceVMEncrypted value.
     */
    public Boolean isSourceVMEncrypted() {
        return this.isSourceVMEncrypted;
    }

    /**
     * Get the keyAndSecret property: Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     *
     * @return the keyAndSecret value.
     */
    public KeyAndSecretDetails keyAndSecret() {
        return this.keyAndSecret;
    }

    /**
     * Set the keyAndSecret property: Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     *
     * @param keyAndSecret the keyAndSecret value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withKeyAndSecret(KeyAndSecretDetails keyAndSecret) {
        this.keyAndSecret = keyAndSecret;
        return this;
    }

    /**
     * Get the isInstantIlrSessionActive property: Is the session to recover items from this backup copy still active.
     *
     * @return the isInstantIlrSessionActive value.
     */
    public Boolean isInstantIlrSessionActive() {
        return this.isInstantIlrSessionActive;
    }

    /**
     * Set the isInstantIlrSessionActive property: Is the session to recover items from this backup copy still active.
     *
     * @param isInstantIlrSessionActive the isInstantIlrSessionActive value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsInstantIlrSessionActive(Boolean isInstantIlrSessionActive) {
        this.isInstantIlrSessionActive = isInstantIlrSessionActive;
        return this;
    }

    /**
     * Get the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @return the recoveryPointTierDetails value.
     */
    public List<RecoveryPointTierInformation> recoveryPointTierDetails() {
        return this.recoveryPointTierDetails;
    }

    /**
     * Set the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @param recoveryPointTierDetails the recoveryPointTierDetails value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointTierDetails(
        List<RecoveryPointTierInformation> recoveryPointTierDetails) {
        this.recoveryPointTierDetails = recoveryPointTierDetails;
        return this;
    }

    /**
     * Get the isManagedVirtualMachine property: Whether VM is with Managed Disks.
     *
     * @return the isManagedVirtualMachine value.
     */
    public Boolean isManagedVirtualMachine() {
        return this.isManagedVirtualMachine;
    }

    /**
     * Set the isManagedVirtualMachine property: Whether VM is with Managed Disks.
     *
     * @param isManagedVirtualMachine the isManagedVirtualMachine value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsManagedVirtualMachine(Boolean isManagedVirtualMachine) {
        this.isManagedVirtualMachine = isManagedVirtualMachine;
        return this;
    }

    /**
     * Get the virtualMachineSize property: Virtual Machine Size.
     *
     * @return the virtualMachineSize value.
     */
    public String virtualMachineSize() {
        return this.virtualMachineSize;
    }

    /**
     * Set the virtualMachineSize property: Virtual Machine Size.
     *
     * @param virtualMachineSize the virtualMachineSize value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withVirtualMachineSize(String virtualMachineSize) {
        this.virtualMachineSize = virtualMachineSize;
        return this;
    }

    /**
     * Get the originalStorageAccountOption property: Original Storage Account Option.
     *
     * @return the originalStorageAccountOption value.
     */
    public Boolean originalStorageAccountOption() {
        return this.originalStorageAccountOption;
    }

    /**
     * Set the originalStorageAccountOption property: Original Storage Account Option.
     *
     * @param originalStorageAccountOption the originalStorageAccountOption value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withOriginalStorageAccountOption(Boolean originalStorageAccountOption) {
        this.originalStorageAccountOption = originalStorageAccountOption;
        return this;
    }

    /**
     * Get the osType property: OS type.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OS type.
     *
     * @param osType the osType value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the recoveryPointDiskConfiguration property: Disk configuration.
     *
     * @return the recoveryPointDiskConfiguration value.
     */
    public RecoveryPointDiskConfiguration recoveryPointDiskConfiguration() {
        return this.recoveryPointDiskConfiguration;
    }

    /**
     * Set the recoveryPointDiskConfiguration property: Disk configuration.
     *
     * @param recoveryPointDiskConfiguration the recoveryPointDiskConfiguration value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointDiskConfiguration(
        RecoveryPointDiskConfiguration recoveryPointDiskConfiguration) {
        this.recoveryPointDiskConfiguration = recoveryPointDiskConfiguration;
        return this;
    }

    /**
     * Get the zones property: Identifies the zone of the VM at the time of backup. Applicable only for zone-pinned Vms.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Identifies the zone of the VM at the time of backup. Applicable only for zone-pinned Vms.
     *
     * @param zones the zones value to set.
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withZones(List<String> zones) {
        this.zones = zones;
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
        if (keyAndSecret() != null) {
            keyAndSecret().validate();
        }
        if (recoveryPointTierDetails() != null) {
            recoveryPointTierDetails().forEach(e -> e.validate());
        }
        if (recoveryPointDiskConfiguration() != null) {
            recoveryPointDiskConfiguration().validate();
        }
    }
}
