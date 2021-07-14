// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A2A protected managed disk details. */
@Fluent
public final class A2AProtectedManagedDiskDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(A2AProtectedManagedDiskDetails.class);

    /*
     * The managed disk Arm id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * The recovery disk resource group Arm Id.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /*
     * Recovery target disk Arm Id.
     */
    @JsonProperty(value = "recoveryTargetDiskId")
    private String recoveryTargetDiskId;

    /*
     * Recovery replica disk Arm Id.
     */
    @JsonProperty(value = "recoveryReplicaDiskId")
    private String recoveryReplicaDiskId;

    /*
     * Recovery original target disk Arm Id.
     */
    @JsonProperty(value = "recoveryOrignalTargetDiskId")
    private String recoveryOrignalTargetDiskId;

    /*
     * The replica disk type. Its an optional value and will be same as source
     * disk type if not user provided.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /*
     * The target disk type after failover. Its an optional value and will be
     * same as source disk type if not user provided.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /*
     * The recovery disk encryption set Id.
     */
    @JsonProperty(value = "recoveryDiskEncryptionSetId")
    private String recoveryDiskEncryptionSetId;

    /*
     * The primary disk encryption set Id.
     */
    @JsonProperty(value = "primaryDiskEncryptionSetId")
    private String primaryDiskEncryptionSetId;

    /*
     * The disk name.
     */
    @JsonProperty(value = "diskName")
    private String diskName;

    /*
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "diskCapacityInBytes")
    private Long diskCapacityInBytes;

    /*
     * The primary staging storage account.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId")
    private String primaryStagingAzureStorageAccountId;

    /*
     * The type of disk.
     */
    @JsonProperty(value = "diskType")
    private String diskType;

    /*
     * A value indicating whether resync is required for this disk.
     */
    @JsonProperty(value = "resyncRequired")
    private Boolean resyncRequired;

    /*
     * The percentage of the monitoring job. The type of the monitoring job is
     * defined by MonitoringJobType property.
     */
    @JsonProperty(value = "monitoringPercentageCompletion")
    private Integer monitoringPercentageCompletion;

    /*
     * The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     */
    @JsonProperty(value = "monitoringJobType")
    private String monitoringJobType;

    /*
     * The data pending for replication in MB at staging account.
     */
    @JsonProperty(value = "dataPendingInStagingStorageAccountInMB")
    private Double dataPendingInStagingStorageAccountInMB;

    /*
     * The data pending at source virtual machine in MB.
     */
    @JsonProperty(value = "dataPendingAtSourceAgentInMB")
    private Double dataPendingAtSourceAgentInMB;

    /*
     * The disk state.
     */
    @JsonProperty(value = "diskState")
    private String diskState;

    /*
     * The disk level operations list.
     */
    @JsonProperty(value = "allowedDiskLevelOperation")
    private List<String> allowedDiskLevelOperation;

    /*
     * A value indicating whether vm has encrypted os disk or not.
     */
    @JsonProperty(value = "isDiskEncrypted")
    private Boolean isDiskEncrypted;

    /*
     * The secret URL / identifier (BEK).
     */
    @JsonProperty(value = "secretIdentifier")
    private String secretIdentifier;

    /*
     * The KeyVault resource id for secret (BEK).
     */
    @JsonProperty(value = "dekKeyVaultArmId")
    private String dekKeyVaultArmId;

    /*
     * A value indicating whether disk key got encrypted or not.
     */
    @JsonProperty(value = "isDiskKeyEncrypted")
    private Boolean isDiskKeyEncrypted;

    /*
     * The key URL / identifier (KEK).
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /*
     * The KeyVault resource id for key (KEK).
     */
    @JsonProperty(value = "kekKeyVaultArmId")
    private String kekKeyVaultArmId;

    /*
     * The failover name for the managed disk.
     */
    @JsonProperty(value = "failoverDiskName")
    private String failoverDiskName;

    /*
     * The test failover name for the managed disk.
     */
    @JsonProperty(value = "tfoDiskName")
    private String tfoDiskName;

    /**
     * Get the diskId property: The managed disk Arm id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The managed disk Arm id.
     *
     * @param diskId the diskId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The recovery disk resource group Arm Id.
     *
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The recovery disk resource group Arm Id.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryTargetDiskId property: Recovery target disk Arm Id.
     *
     * @return the recoveryTargetDiskId value.
     */
    public String recoveryTargetDiskId() {
        return this.recoveryTargetDiskId;
    }

    /**
     * Set the recoveryTargetDiskId property: Recovery target disk Arm Id.
     *
     * @param recoveryTargetDiskId the recoveryTargetDiskId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryTargetDiskId(String recoveryTargetDiskId) {
        this.recoveryTargetDiskId = recoveryTargetDiskId;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskId property: Recovery replica disk Arm Id.
     *
     * @return the recoveryReplicaDiskId value.
     */
    public String recoveryReplicaDiskId() {
        return this.recoveryReplicaDiskId;
    }

    /**
     * Set the recoveryReplicaDiskId property: Recovery replica disk Arm Id.
     *
     * @param recoveryReplicaDiskId the recoveryReplicaDiskId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryReplicaDiskId(String recoveryReplicaDiskId) {
        this.recoveryReplicaDiskId = recoveryReplicaDiskId;
        return this;
    }

    /**
     * Get the recoveryOrignalTargetDiskId property: Recovery original target disk Arm Id.
     *
     * @return the recoveryOrignalTargetDiskId value.
     */
    public String recoveryOrignalTargetDiskId() {
        return this.recoveryOrignalTargetDiskId;
    }

    /**
     * Set the recoveryOrignalTargetDiskId property: Recovery original target disk Arm Id.
     *
     * @param recoveryOrignalTargetDiskId the recoveryOrignalTargetDiskId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryOrignalTargetDiskId(String recoveryOrignalTargetDiskId) {
        this.recoveryOrignalTargetDiskId = recoveryOrignalTargetDiskId;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same as
     * source disk type if not user provided.
     *
     * @return the recoveryReplicaDiskAccountType value.
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same as
     * source disk type if not user provided.
     *
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     *
     * @return the recoveryTargetDiskAccountType value.
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     *
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @return the recoveryDiskEncryptionSetId value.
     */
    public String recoveryDiskEncryptionSetId() {
        return this.recoveryDiskEncryptionSetId;
    }

    /**
     * Set the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @param recoveryDiskEncryptionSetId the recoveryDiskEncryptionSetId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withRecoveryDiskEncryptionSetId(String recoveryDiskEncryptionSetId) {
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        return this;
    }

    /**
     * Get the primaryDiskEncryptionSetId property: The primary disk encryption set Id.
     *
     * @return the primaryDiskEncryptionSetId value.
     */
    public String primaryDiskEncryptionSetId() {
        return this.primaryDiskEncryptionSetId;
    }

    /**
     * Set the primaryDiskEncryptionSetId property: The primary disk encryption set Id.
     *
     * @param primaryDiskEncryptionSetId the primaryDiskEncryptionSetId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withPrimaryDiskEncryptionSetId(String primaryDiskEncryptionSetId) {
        this.primaryDiskEncryptionSetId = primaryDiskEncryptionSetId;
        return this;
    }

    /**
     * Get the diskName property: The disk name.
     *
     * @return the diskName value.
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Set the diskName property: The disk name.
     *
     * @param diskName the diskName value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * Get the diskCapacityInBytes property: The disk capacity in bytes.
     *
     * @return the diskCapacityInBytes value.
     */
    public Long diskCapacityInBytes() {
        return this.diskCapacityInBytes;
    }

    /**
     * Set the diskCapacityInBytes property: The disk capacity in bytes.
     *
     * @param diskCapacityInBytes the diskCapacityInBytes value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDiskCapacityInBytes(Long diskCapacityInBytes) {
        this.diskCapacityInBytes = diskCapacityInBytes;
        return this;
    }

    /**
     * Get the primaryStagingAzureStorageAccountId property: The primary staging storage account.
     *
     * @return the primaryStagingAzureStorageAccountId value.
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primaryStagingAzureStorageAccountId property: The primary staging storage account.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withPrimaryStagingAzureStorageAccountId(
        String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Get the diskType property: The type of disk.
     *
     * @return the diskType value.
     */
    public String diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The type of disk.
     *
     * @param diskType the diskType value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the resyncRequired property: A value indicating whether resync is required for this disk.
     *
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Set the resyncRequired property: A value indicating whether resync is required for this disk.
     *
     * @param resyncRequired the resyncRequired value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withResyncRequired(Boolean resyncRequired) {
        this.resyncRequired = resyncRequired;
        return this;
    }

    /**
     * Get the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     *
     * @return the monitoringPercentageCompletion value.
     */
    public Integer monitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion;
    }

    /**
     * Set the monitoringPercentageCompletion property: The percentage of the monitoring job. The type of the monitoring
     * job is defined by MonitoringJobType property.
     *
     * @param monitoringPercentageCompletion the monitoringPercentageCompletion value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withMonitoringPercentageCompletion(Integer monitoringPercentageCompletion) {
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        return this;
    }

    /**
     * Get the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     *
     * @return the monitoringJobType value.
     */
    public String monitoringJobType() {
        return this.monitoringJobType;
    }

    /**
     * Set the monitoringJobType property: The type of the monitoring job. The progress is contained in
     * MonitoringPercentageCompletion property.
     *
     * @param monitoringJobType the monitoringJobType value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withMonitoringJobType(String monitoringJobType) {
        this.monitoringJobType = monitoringJobType;
        return this;
    }

    /**
     * Get the dataPendingInStagingStorageAccountInMB property: The data pending for replication in MB at staging
     * account.
     *
     * @return the dataPendingInStagingStorageAccountInMB value.
     */
    public Double dataPendingInStagingStorageAccountInMB() {
        return this.dataPendingInStagingStorageAccountInMB;
    }

    /**
     * Set the dataPendingInStagingStorageAccountInMB property: The data pending for replication in MB at staging
     * account.
     *
     * @param dataPendingInStagingStorageAccountInMB the dataPendingInStagingStorageAccountInMB value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDataPendingInStagingStorageAccountInMB(
        Double dataPendingInStagingStorageAccountInMB) {
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        return this;
    }

    /**
     * Get the dataPendingAtSourceAgentInMB property: The data pending at source virtual machine in MB.
     *
     * @return the dataPendingAtSourceAgentInMB value.
     */
    public Double dataPendingAtSourceAgentInMB() {
        return this.dataPendingAtSourceAgentInMB;
    }

    /**
     * Set the dataPendingAtSourceAgentInMB property: The data pending at source virtual machine in MB.
     *
     * @param dataPendingAtSourceAgentInMB the dataPendingAtSourceAgentInMB value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDataPendingAtSourceAgentInMB(Double dataPendingAtSourceAgentInMB) {
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        return this;
    }

    /**
     * Get the diskState property: The disk state.
     *
     * @return the diskState value.
     */
    public String diskState() {
        return this.diskState;
    }

    /**
     * Set the diskState property: The disk state.
     *
     * @param diskState the diskState value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDiskState(String diskState) {
        this.diskState = diskState;
        return this;
    }

    /**
     * Get the allowedDiskLevelOperation property: The disk level operations list.
     *
     * @return the allowedDiskLevelOperation value.
     */
    public List<String> allowedDiskLevelOperation() {
        return this.allowedDiskLevelOperation;
    }

    /**
     * Set the allowedDiskLevelOperation property: The disk level operations list.
     *
     * @param allowedDiskLevelOperation the allowedDiskLevelOperation value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withAllowedDiskLevelOperation(List<String> allowedDiskLevelOperation) {
        this.allowedDiskLevelOperation = allowedDiskLevelOperation;
        return this;
    }

    /**
     * Get the isDiskEncrypted property: A value indicating whether vm has encrypted os disk or not.
     *
     * @return the isDiskEncrypted value.
     */
    public Boolean isDiskEncrypted() {
        return this.isDiskEncrypted;
    }

    /**
     * Set the isDiskEncrypted property: A value indicating whether vm has encrypted os disk or not.
     *
     * @param isDiskEncrypted the isDiskEncrypted value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withIsDiskEncrypted(Boolean isDiskEncrypted) {
        this.isDiskEncrypted = isDiskEncrypted;
        return this;
    }

    /**
     * Get the secretIdentifier property: The secret URL / identifier (BEK).
     *
     * @return the secretIdentifier value.
     */
    public String secretIdentifier() {
        return this.secretIdentifier;
    }

    /**
     * Set the secretIdentifier property: The secret URL / identifier (BEK).
     *
     * @param secretIdentifier the secretIdentifier value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withSecretIdentifier(String secretIdentifier) {
        this.secretIdentifier = secretIdentifier;
        return this;
    }

    /**
     * Get the dekKeyVaultArmId property: The KeyVault resource id for secret (BEK).
     *
     * @return the dekKeyVaultArmId value.
     */
    public String dekKeyVaultArmId() {
        return this.dekKeyVaultArmId;
    }

    /**
     * Set the dekKeyVaultArmId property: The KeyVault resource id for secret (BEK).
     *
     * @param dekKeyVaultArmId the dekKeyVaultArmId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withDekKeyVaultArmId(String dekKeyVaultArmId) {
        this.dekKeyVaultArmId = dekKeyVaultArmId;
        return this;
    }

    /**
     * Get the isDiskKeyEncrypted property: A value indicating whether disk key got encrypted or not.
     *
     * @return the isDiskKeyEncrypted value.
     */
    public Boolean isDiskKeyEncrypted() {
        return this.isDiskKeyEncrypted;
    }

    /**
     * Set the isDiskKeyEncrypted property: A value indicating whether disk key got encrypted or not.
     *
     * @param isDiskKeyEncrypted the isDiskKeyEncrypted value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withIsDiskKeyEncrypted(Boolean isDiskKeyEncrypted) {
        this.isDiskKeyEncrypted = isDiskKeyEncrypted;
        return this;
    }

    /**
     * Get the keyIdentifier property: The key URL / identifier (KEK).
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The key URL / identifier (KEK).
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the kekKeyVaultArmId property: The KeyVault resource id for key (KEK).
     *
     * @return the kekKeyVaultArmId value.
     */
    public String kekKeyVaultArmId() {
        return this.kekKeyVaultArmId;
    }

    /**
     * Set the kekKeyVaultArmId property: The KeyVault resource id for key (KEK).
     *
     * @param kekKeyVaultArmId the kekKeyVaultArmId value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withKekKeyVaultArmId(String kekKeyVaultArmId) {
        this.kekKeyVaultArmId = kekKeyVaultArmId;
        return this;
    }

    /**
     * Get the failoverDiskName property: The failover name for the managed disk.
     *
     * @return the failoverDiskName value.
     */
    public String failoverDiskName() {
        return this.failoverDiskName;
    }

    /**
     * Set the failoverDiskName property: The failover name for the managed disk.
     *
     * @param failoverDiskName the failoverDiskName value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withFailoverDiskName(String failoverDiskName) {
        this.failoverDiskName = failoverDiskName;
        return this;
    }

    /**
     * Get the tfoDiskName property: The test failover name for the managed disk.
     *
     * @return the tfoDiskName value.
     */
    public String tfoDiskName() {
        return this.tfoDiskName;
    }

    /**
     * Set the tfoDiskName property: The test failover name for the managed disk.
     *
     * @param tfoDiskName the tfoDiskName value to set.
     * @return the A2AProtectedManagedDiskDetails object itself.
     */
    public A2AProtectedManagedDiskDetails withTfoDiskName(String tfoDiskName) {
        this.tfoDiskName = tfoDiskName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
