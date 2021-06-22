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

/** Job custom data details. */
@Fluent
public final class JobProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobProperties.class);

    /*
     * The activity id.
     */
    @JsonProperty(value = "activityId")
    private String activityId;

    /*
     * The ScenarioName.
     */
    @JsonProperty(value = "scenarioName")
    private String scenarioName;

    /*
     * The DisplayName.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The status of the Job. It is one of these values - NotStarted,
     * InProgress, Succeeded, Failed, Cancelled, Suspended or Other.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The description of the state of the Job. For e.g. - For Succeeded state,
     * description can be Completed, PartiallySucceeded,
     * CompletedWithInformation or Skipped.
     */
    @JsonProperty(value = "stateDescription")
    private String stateDescription;

    /*
     * The tasks.
     */
    @JsonProperty(value = "tasks")
    private List<AsrTask> tasks;

    /*
     * The errors.
     */
    @JsonProperty(value = "errors")
    private List<JobErrorDetails> errors;

    /*
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The Allowed action the job.
     */
    @JsonProperty(value = "allowedActions")
    private List<String> allowedActions;

    /*
     * The affected Object Id.
     */
    @JsonProperty(value = "targetObjectId")
    private String targetObjectId;

    /*
     * The name of the affected object.
     */
    @JsonProperty(value = "targetObjectName")
    private String targetObjectName;

    /*
     * The type of the affected object which is of
     * Microsoft.Azure.SiteRecovery.V2015_11_10.AffectedObjectType class.
     */
    @JsonProperty(value = "targetInstanceType")
    private String targetInstanceType;

    /*
     * The custom job details like test failover job details.
     */
    @JsonProperty(value = "customDetails")
    private JobDetails customDetails;

    /**
     * Get the activityId property: The activity id.
     *
     * @return the activityId value.
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Set the activityId property: The activity id.
     *
     * @param activityId the activityId value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * Get the scenarioName property: The ScenarioName.
     *
     * @return the scenarioName value.
     */
    public String scenarioName() {
        return this.scenarioName;
    }

    /**
     * Set the scenarioName property: The ScenarioName.
     *
     * @param scenarioName the scenarioName value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * Get the friendlyName property: The DisplayName.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The DisplayName.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the state property: The status of the Job. It is one of these values - NotStarted, InProgress, Succeeded,
     * Failed, Cancelled, Suspended or Other.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The status of the Job. It is one of these values - NotStarted, InProgress, Succeeded,
     * Failed, Cancelled, Suspended or Other.
     *
     * @param state the state value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateDescription property: The description of the state of the Job. For e.g. - For Succeeded state,
     * description can be Completed, PartiallySucceeded, CompletedWithInformation or Skipped.
     *
     * @return the stateDescription value.
     */
    public String stateDescription() {
        return this.stateDescription;
    }

    /**
     * Set the stateDescription property: The description of the state of the Job. For e.g. - For Succeeded state,
     * description can be Completed, PartiallySucceeded, CompletedWithInformation or Skipped.
     *
     * @param stateDescription the stateDescription value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
        return this;
    }

    /**
     * Get the tasks property: The tasks.
     *
     * @return the tasks value.
     */
    public List<AsrTask> tasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The tasks.
     *
     * @param tasks the tasks value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTasks(List<AsrTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the errors property: The errors.
     *
     * @return the errors value.
     */
    public List<JobErrorDetails> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors.
     *
     * @param errors the errors value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withErrors(List<JobErrorDetails> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the startTime property: The start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time.
     *
     * @param startTime the startTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time.
     *
     * @param endTime the endTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the allowedActions property: The Allowed action the job.
     *
     * @return the allowedActions value.
     */
    public List<String> allowedActions() {
        return this.allowedActions;
    }

    /**
     * Set the allowedActions property: The Allowed action the job.
     *
     * @param allowedActions the allowedActions value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

    /**
     * Get the targetObjectId property: The affected Object Id.
     *
     * @return the targetObjectId value.
     */
    public String targetObjectId() {
        return this.targetObjectId;
    }

    /**
     * Set the targetObjectId property: The affected Object Id.
     *
     * @param targetObjectId the targetObjectId value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
        return this;
    }

    /**
     * Get the targetObjectName property: The name of the affected object.
     *
     * @return the targetObjectName value.
     */
    public String targetObjectName() {
        return this.targetObjectName;
    }

    /**
     * Set the targetObjectName property: The name of the affected object.
     *
     * @param targetObjectName the targetObjectName value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetObjectName(String targetObjectName) {
        this.targetObjectName = targetObjectName;
        return this;
    }

    /**
     * Get the targetInstanceType property: The type of the affected object which is of
     * Microsoft.Azure.SiteRecovery.V2015_11_10.AffectedObjectType class.
     *
     * @return the targetInstanceType value.
     */
    public String targetInstanceType() {
        return this.targetInstanceType;
    }

    /**
     * Set the targetInstanceType property: The type of the affected object which is of
     * Microsoft.Azure.SiteRecovery.V2015_11_10.AffectedObjectType class.
     *
     * @param targetInstanceType the targetInstanceType value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }

    /**
     * Get the customDetails property: The custom job details like test failover job details.
     *
     * @return the customDetails value.
     */
    public JobDetails customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails property: The custom job details like test failover job details.
     *
     * @param customDetails the customDetails value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withCustomDetails(JobDetails customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tasks() != null) {
            tasks().forEach(e -> e.validate());
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
        if (customDetails() != null) {
            customDetails().validate();
        }
    }
}
