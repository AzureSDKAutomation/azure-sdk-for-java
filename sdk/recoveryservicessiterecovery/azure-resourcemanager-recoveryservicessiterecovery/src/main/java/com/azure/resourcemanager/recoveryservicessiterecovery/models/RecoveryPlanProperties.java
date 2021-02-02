// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Recovery plan custom details. */
@Fluent
public final class RecoveryPlanProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPlanProperties.class);

    /*
     * The friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The primary fabric Id.
     */
    @JsonProperty(value = "primaryFabricId")
    private String primaryFabricId;

    /*
     * The primary fabric friendly name.
     */
    @JsonProperty(value = "primaryFabricFriendlyName")
    private String primaryFabricFriendlyName;

    /*
     * The recovery fabric Id.
     */
    @JsonProperty(value = "recoveryFabricId")
    private String recoveryFabricId;

    /*
     * The recovery fabric friendly name.
     */
    @JsonProperty(value = "recoveryFabricFriendlyName")
    private String recoveryFabricFriendlyName;

    /*
     * The failover deployment model.
     */
    @JsonProperty(value = "failoverDeploymentModel")
    private String failoverDeploymentModel;

    /*
     * The list of replication providers.
     */
    @JsonProperty(value = "replicationProviders")
    private List<String> replicationProviders;

    /*
     * The list of allowed operations.
     */
    @JsonProperty(value = "allowedOperations")
    private List<String> allowedOperations;

    /*
     * The start time of the last planned failover.
     */
    @JsonProperty(value = "lastPlannedFailoverTime")
    private OffsetDateTime lastPlannedFailoverTime;

    /*
     * The start time of the last unplanned failover.
     */
    @JsonProperty(value = "lastUnplannedFailoverTime")
    private OffsetDateTime lastUnplannedFailoverTime;

    /*
     * The start time of the last test failover.
     */
    @JsonProperty(value = "lastTestFailoverTime")
    private OffsetDateTime lastTestFailoverTime;

    /*
     * The current scenario details.
     */
    @JsonProperty(value = "currentScenario")
    private CurrentScenarioDetails currentScenario;

    /*
     * The recovery plan status.
     */
    @JsonProperty(value = "currentScenarioStatus")
    private String currentScenarioStatus;

    /*
     * The recovery plan status description.
     */
    @JsonProperty(value = "currentScenarioStatusDescription")
    private String currentScenarioStatusDescription;

    /*
     * The recovery plan groups.
     */
    @JsonProperty(value = "groups")
    private List<RecoveryPlanGroup> groups;

    /*
     * The provider id and provider specific details.
     */
    @JsonProperty(value = "providerSpecificDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails;

    /**
     * Get the friendlyName property: The friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the primaryFabricId property: The primary fabric Id.
     *
     * @return the primaryFabricId value.
     */
    public String primaryFabricId() {
        return this.primaryFabricId;
    }

    /**
     * Set the primaryFabricId property: The primary fabric Id.
     *
     * @param primaryFabricId the primaryFabricId value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withPrimaryFabricId(String primaryFabricId) {
        this.primaryFabricId = primaryFabricId;
        return this;
    }

    /**
     * Get the primaryFabricFriendlyName property: The primary fabric friendly name.
     *
     * @return the primaryFabricFriendlyName value.
     */
    public String primaryFabricFriendlyName() {
        return this.primaryFabricFriendlyName;
    }

    /**
     * Set the primaryFabricFriendlyName property: The primary fabric friendly name.
     *
     * @param primaryFabricFriendlyName the primaryFabricFriendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withPrimaryFabricFriendlyName(String primaryFabricFriendlyName) {
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        return this;
    }

    /**
     * Get the recoveryFabricId property: The recovery fabric Id.
     *
     * @return the recoveryFabricId value.
     */
    public String recoveryFabricId() {
        return this.recoveryFabricId;
    }

    /**
     * Set the recoveryFabricId property: The recovery fabric Id.
     *
     * @param recoveryFabricId the recoveryFabricId value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withRecoveryFabricId(String recoveryFabricId) {
        this.recoveryFabricId = recoveryFabricId;
        return this;
    }

    /**
     * Get the recoveryFabricFriendlyName property: The recovery fabric friendly name.
     *
     * @return the recoveryFabricFriendlyName value.
     */
    public String recoveryFabricFriendlyName() {
        return this.recoveryFabricFriendlyName;
    }

    /**
     * Set the recoveryFabricFriendlyName property: The recovery fabric friendly name.
     *
     * @param recoveryFabricFriendlyName the recoveryFabricFriendlyName value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withRecoveryFabricFriendlyName(String recoveryFabricFriendlyName) {
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        return this;
    }

    /**
     * Get the failoverDeploymentModel property: The failover deployment model.
     *
     * @return the failoverDeploymentModel value.
     */
    public String failoverDeploymentModel() {
        return this.failoverDeploymentModel;
    }

    /**
     * Set the failoverDeploymentModel property: The failover deployment model.
     *
     * @param failoverDeploymentModel the failoverDeploymentModel value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withFailoverDeploymentModel(String failoverDeploymentModel) {
        this.failoverDeploymentModel = failoverDeploymentModel;
        return this;
    }

    /**
     * Get the replicationProviders property: The list of replication providers.
     *
     * @return the replicationProviders value.
     */
    public List<String> replicationProviders() {
        return this.replicationProviders;
    }

    /**
     * Set the replicationProviders property: The list of replication providers.
     *
     * @param replicationProviders the replicationProviders value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withReplicationProviders(List<String> replicationProviders) {
        this.replicationProviders = replicationProviders;
        return this;
    }

    /**
     * Get the allowedOperations property: The list of allowed operations.
     *
     * @return the allowedOperations value.
     */
    public List<String> allowedOperations() {
        return this.allowedOperations;
    }

    /**
     * Set the allowedOperations property: The list of allowed operations.
     *
     * @param allowedOperations the allowedOperations value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withAllowedOperations(List<String> allowedOperations) {
        this.allowedOperations = allowedOperations;
        return this;
    }

    /**
     * Get the lastPlannedFailoverTime property: The start time of the last planned failover.
     *
     * @return the lastPlannedFailoverTime value.
     */
    public OffsetDateTime lastPlannedFailoverTime() {
        return this.lastPlannedFailoverTime;
    }

    /**
     * Set the lastPlannedFailoverTime property: The start time of the last planned failover.
     *
     * @param lastPlannedFailoverTime the lastPlannedFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastPlannedFailoverTime(OffsetDateTime lastPlannedFailoverTime) {
        this.lastPlannedFailoverTime = lastPlannedFailoverTime;
        return this;
    }

    /**
     * Get the lastUnplannedFailoverTime property: The start time of the last unplanned failover.
     *
     * @return the lastUnplannedFailoverTime value.
     */
    public OffsetDateTime lastUnplannedFailoverTime() {
        return this.lastUnplannedFailoverTime;
    }

    /**
     * Set the lastUnplannedFailoverTime property: The start time of the last unplanned failover.
     *
     * @param lastUnplannedFailoverTime the lastUnplannedFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastUnplannedFailoverTime(OffsetDateTime lastUnplannedFailoverTime) {
        this.lastUnplannedFailoverTime = lastUnplannedFailoverTime;
        return this;
    }

    /**
     * Get the lastTestFailoverTime property: The start time of the last test failover.
     *
     * @return the lastTestFailoverTime value.
     */
    public OffsetDateTime lastTestFailoverTime() {
        return this.lastTestFailoverTime;
    }

    /**
     * Set the lastTestFailoverTime property: The start time of the last test failover.
     *
     * @param lastTestFailoverTime the lastTestFailoverTime value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withLastTestFailoverTime(OffsetDateTime lastTestFailoverTime) {
        this.lastTestFailoverTime = lastTestFailoverTime;
        return this;
    }

    /**
     * Get the currentScenario property: The current scenario details.
     *
     * @return the currentScenario value.
     */
    public CurrentScenarioDetails currentScenario() {
        return this.currentScenario;
    }

    /**
     * Set the currentScenario property: The current scenario details.
     *
     * @param currentScenario the currentScenario value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenario(CurrentScenarioDetails currentScenario) {
        this.currentScenario = currentScenario;
        return this;
    }

    /**
     * Get the currentScenarioStatus property: The recovery plan status.
     *
     * @return the currentScenarioStatus value.
     */
    public String currentScenarioStatus() {
        return this.currentScenarioStatus;
    }

    /**
     * Set the currentScenarioStatus property: The recovery plan status.
     *
     * @param currentScenarioStatus the currentScenarioStatus value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenarioStatus(String currentScenarioStatus) {
        this.currentScenarioStatus = currentScenarioStatus;
        return this;
    }

    /**
     * Get the currentScenarioStatusDescription property: The recovery plan status description.
     *
     * @return the currentScenarioStatusDescription value.
     */
    public String currentScenarioStatusDescription() {
        return this.currentScenarioStatusDescription;
    }

    /**
     * Set the currentScenarioStatusDescription property: The recovery plan status description.
     *
     * @param currentScenarioStatusDescription the currentScenarioStatusDescription value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withCurrentScenarioStatusDescription(String currentScenarioStatusDescription) {
        this.currentScenarioStatusDescription = currentScenarioStatusDescription;
        return this;
    }

    /**
     * Get the groups property: The recovery plan groups.
     *
     * @return the groups value.
     */
    public List<RecoveryPlanGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The recovery plan groups.
     *
     * @param groups the groups value to set.
     * @return the RecoveryPlanProperties object itself.
     */
    public RecoveryPlanProperties withGroups(List<RecoveryPlanGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider id and provider specific details.
     *
     * @return the providerSpecificDetails value.
     */
    public List<RecoveryPlanProviderSpecificDetails> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (currentScenario() != null) {
            currentScenario().validate();
        }
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().forEach(e -> e.validate());
        }
    }
}
