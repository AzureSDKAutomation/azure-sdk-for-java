// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ImageDescriptor;
import com.azure.resourcemanager.containerregistry.generated.models.ImageUpdateTrigger;
import com.azure.resourcemanager.containerregistry.generated.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.RunStatus;
import com.azure.resourcemanager.containerregistry.generated.models.RunType;
import com.azure.resourcemanager.containerregistry.generated.models.SourceTriggerDescriptor;
import com.azure.resourcemanager.containerregistry.generated.models.SystemData;
import com.azure.resourcemanager.containerregistry.generated.models.TimerTriggerDescriptor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Run resource properties. */
@JsonFlatten
@Fluent
public class RunInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunInner.class);

    /*
     * The unique identifier for the run.
     */
    @JsonProperty(value = "properties.runId")
    private String runId;

    /*
     * The current status of the run.
     */
    @JsonProperty(value = "properties.status")
    private RunStatus status;

    /*
     * The last updated time for the run.
     */
    @JsonProperty(value = "properties.lastUpdatedTime")
    private OffsetDateTime lastUpdatedTime;

    /*
     * The type of run.
     */
    @JsonProperty(value = "properties.runType")
    private RunType runType;

    /*
     * The dedicated agent pool for the run.
     */
    @JsonProperty(value = "properties.agentPoolName")
    private String agentPoolName;

    /*
     * The time the run was scheduled.
     */
    @JsonProperty(value = "properties.createTime")
    private OffsetDateTime createTime;

    /*
     * The time the run started.
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * The time the run finished.
     */
    @JsonProperty(value = "properties.finishTime")
    private OffsetDateTime finishTime;

    /*
     * The list of all images that were generated from the run. This is
     * applicable if the run generates base image dependencies.
     */
    @JsonProperty(value = "properties.outputImages")
    private List<ImageDescriptor> outputImages;

    /*
     * The task against which run was scheduled.
     */
    @JsonProperty(value = "properties.task")
    private String task;

    /*
     * The image update trigger that caused the run. This is applicable if the
     * task has base image trigger configured.
     */
    @JsonProperty(value = "properties.imageUpdateTrigger")
    private ImageUpdateTrigger imageUpdateTrigger;

    /*
     * The source trigger that caused the run.
     */
    @JsonProperty(value = "properties.sourceTrigger")
    private SourceTriggerDescriptor sourceTrigger;

    /*
     * The timer trigger that caused the run.
     */
    @JsonProperty(value = "properties.timerTrigger")
    private TimerTriggerDescriptor timerTrigger;

    /*
     * The platform properties against which the run will happen.
     */
    @JsonProperty(value = "properties.platform")
    private PlatformProperties platform;

    /*
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "properties.agentConfiguration")
    private AgentProperties agentConfiguration;

    /*
     * The scope of the credentials that were used to login to the source
     * registry during this run.
     */
    @JsonProperty(value = "properties.sourceRegistryAuth")
    private String sourceRegistryAuth;

    /*
     * The list of custom registries that were logged in during this run.
     */
    @JsonProperty(value = "properties.customRegistries")
    private List<String> customRegistries;

    /*
     * The error message received from backend systems after the run is
     * scheduled.
     */
    @JsonProperty(value = "properties.runErrorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String runErrorMessage;

    /*
     * The update trigger token passed for the Run.
     */
    @JsonProperty(value = "properties.updateTriggerToken")
    private String updateTriggerToken;

    /*
     * The image description for the log artifact.
     */
    @JsonProperty(value = "properties.logArtifact", access = JsonProperty.Access.WRITE_ONLY)
    private ImageDescriptor logArtifact;

    /*
     * The provisioning state of a run.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The value that indicates whether archiving is enabled or not.
     */
    @JsonProperty(value = "properties.isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the runId property: The unique identifier for the run.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the runId property: The unique identifier for the run.
     *
     * @param runId the runId value to set.
     * @return the RunInner object itself.
     */
    public RunInner withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the status property: The current status of the run.
     *
     * @return the status value.
     */
    public RunStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the run.
     *
     * @param status the status value to set.
     * @return the RunInner object itself.
     */
    public RunInner withStatus(RunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: The last updated time for the run.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: The last updated time for the run.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the RunInner object itself.
     */
    public RunInner withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the runType property: The type of run.
     *
     * @return the runType value.
     */
    public RunType runType() {
        return this.runType;
    }

    /**
     * Set the runType property: The type of run.
     *
     * @param runType the runType value to set.
     * @return the RunInner object itself.
     */
    public RunInner withRunType(RunType runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the agentPoolName property: The dedicated agent pool for the run.
     *
     * @return the agentPoolName value.
     */
    public String agentPoolName() {
        return this.agentPoolName;
    }

    /**
     * Set the agentPoolName property: The dedicated agent pool for the run.
     *
     * @param agentPoolName the agentPoolName value to set.
     * @return the RunInner object itself.
     */
    public RunInner withAgentPoolName(String agentPoolName) {
        this.agentPoolName = agentPoolName;
        return this;
    }

    /**
     * Get the createTime property: The time the run was scheduled.
     *
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The time the run was scheduled.
     *
     * @param createTime the createTime value to set.
     * @return the RunInner object itself.
     */
    public RunInner withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the startTime property: The time the run started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time the run started.
     *
     * @param startTime the startTime value to set.
     * @return the RunInner object itself.
     */
    public RunInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the finishTime property: The time the run finished.
     *
     * @return the finishTime value.
     */
    public OffsetDateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the finishTime property: The time the run finished.
     *
     * @param finishTime the finishTime value to set.
     * @return the RunInner object itself.
     */
    public RunInner withFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the outputImages property: The list of all images that were generated from the run. This is applicable if the
     * run generates base image dependencies.
     *
     * @return the outputImages value.
     */
    public List<ImageDescriptor> outputImages() {
        return this.outputImages;
    }

    /**
     * Set the outputImages property: The list of all images that were generated from the run. This is applicable if the
     * run generates base image dependencies.
     *
     * @param outputImages the outputImages value to set.
     * @return the RunInner object itself.
     */
    public RunInner withOutputImages(List<ImageDescriptor> outputImages) {
        this.outputImages = outputImages;
        return this;
    }

    /**
     * Get the task property: The task against which run was scheduled.
     *
     * @return the task value.
     */
    public String task() {
        return this.task;
    }

    /**
     * Set the task property: The task against which run was scheduled.
     *
     * @param task the task value to set.
     * @return the RunInner object itself.
     */
    public RunInner withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * Get the imageUpdateTrigger property: The image update trigger that caused the run. This is applicable if the task
     * has base image trigger configured.
     *
     * @return the imageUpdateTrigger value.
     */
    public ImageUpdateTrigger imageUpdateTrigger() {
        return this.imageUpdateTrigger;
    }

    /**
     * Set the imageUpdateTrigger property: The image update trigger that caused the run. This is applicable if the task
     * has base image trigger configured.
     *
     * @param imageUpdateTrigger the imageUpdateTrigger value to set.
     * @return the RunInner object itself.
     */
    public RunInner withImageUpdateTrigger(ImageUpdateTrigger imageUpdateTrigger) {
        this.imageUpdateTrigger = imageUpdateTrigger;
        return this;
    }

    /**
     * Get the sourceTrigger property: The source trigger that caused the run.
     *
     * @return the sourceTrigger value.
     */
    public SourceTriggerDescriptor sourceTrigger() {
        return this.sourceTrigger;
    }

    /**
     * Set the sourceTrigger property: The source trigger that caused the run.
     *
     * @param sourceTrigger the sourceTrigger value to set.
     * @return the RunInner object itself.
     */
    public RunInner withSourceTrigger(SourceTriggerDescriptor sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
        return this;
    }

    /**
     * Get the timerTrigger property: The timer trigger that caused the run.
     *
     * @return the timerTrigger value.
     */
    public TimerTriggerDescriptor timerTrigger() {
        return this.timerTrigger;
    }

    /**
     * Set the timerTrigger property: The timer trigger that caused the run.
     *
     * @param timerTrigger the timerTrigger value to set.
     * @return the RunInner object itself.
     */
    public RunInner withTimerTrigger(TimerTriggerDescriptor timerTrigger) {
        this.timerTrigger = timerTrigger;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run will happen.
     *
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run will happen.
     *
     * @param platform the platform value to set.
     * @return the RunInner object itself.
     */
    public RunInner withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the RunInner object itself.
     */
    public RunInner withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the sourceRegistryAuth property: The scope of the credentials that were used to login to the source registry
     * during this run.
     *
     * @return the sourceRegistryAuth value.
     */
    public String sourceRegistryAuth() {
        return this.sourceRegistryAuth;
    }

    /**
     * Set the sourceRegistryAuth property: The scope of the credentials that were used to login to the source registry
     * during this run.
     *
     * @param sourceRegistryAuth the sourceRegistryAuth value to set.
     * @return the RunInner object itself.
     */
    public RunInner withSourceRegistryAuth(String sourceRegistryAuth) {
        this.sourceRegistryAuth = sourceRegistryAuth;
        return this;
    }

    /**
     * Get the customRegistries property: The list of custom registries that were logged in during this run.
     *
     * @return the customRegistries value.
     */
    public List<String> customRegistries() {
        return this.customRegistries;
    }

    /**
     * Set the customRegistries property: The list of custom registries that were logged in during this run.
     *
     * @param customRegistries the customRegistries value to set.
     * @return the RunInner object itself.
     */
    public RunInner withCustomRegistries(List<String> customRegistries) {
        this.customRegistries = customRegistries;
        return this;
    }

    /**
     * Get the runErrorMessage property: The error message received from backend systems after the run is scheduled.
     *
     * @return the runErrorMessage value.
     */
    public String runErrorMessage() {
        return this.runErrorMessage;
    }

    /**
     * Get the updateTriggerToken property: The update trigger token passed for the Run.
     *
     * @return the updateTriggerToken value.
     */
    public String updateTriggerToken() {
        return this.updateTriggerToken;
    }

    /**
     * Set the updateTriggerToken property: The update trigger token passed for the Run.
     *
     * @param updateTriggerToken the updateTriggerToken value to set.
     * @return the RunInner object itself.
     */
    public RunInner withUpdateTriggerToken(String updateTriggerToken) {
        this.updateTriggerToken = updateTriggerToken;
        return this;
    }

    /**
     * Get the logArtifact property: The image description for the log artifact.
     *
     * @return the logArtifact value.
     */
    public ImageDescriptor logArtifact() {
        return this.logArtifact;
    }

    /**
     * Get the provisioningState property: The provisioning state of a run.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of a run.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RunInner object itself.
     */
    public RunInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the isArchiveEnabled property: The value that indicates whether archiving is enabled or not.
     *
     * @return the isArchiveEnabled value.
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the isArchiveEnabled property: The value that indicates whether archiving is enabled or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set.
     * @return the RunInner object itself.
     */
    public RunInner withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outputImages() != null) {
            outputImages().forEach(e -> e.validate());
        }
        if (imageUpdateTrigger() != null) {
            imageUpdateTrigger().validate();
        }
        if (sourceTrigger() != null) {
            sourceTrigger().validate();
        }
        if (timerTrigger() != null) {
            timerTrigger().validate();
        }
        if (platform() != null) {
            platform().validate();
        }
        if (agentConfiguration() != null) {
            agentConfiguration().validate();
        }
        if (logArtifact() != null) {
            logArtifact().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
