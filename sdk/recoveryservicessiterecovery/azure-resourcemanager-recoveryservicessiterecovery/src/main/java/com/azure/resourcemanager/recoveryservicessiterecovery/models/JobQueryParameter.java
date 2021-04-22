// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Query parameter to enumerate jobs. */
@Fluent
public final class JobQueryParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobQueryParameter.class);

    /*
     * Date time to get jobs from.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * Date time to get jobs upto.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * The Id of the fabric to search jobs under.
     */
    @JsonProperty(value = "fabricId")
    private String fabricId;

    /*
     * The type of objects.
     */
    @JsonProperty(value = "affectedObjectTypes")
    private String affectedObjectTypes;

    /*
     * The states of the job to be filtered can be in.
     */
    @JsonProperty(value = "jobStatus")
    private String jobStatus;

    /*
     * The output type of the jobs.
     */
    @JsonProperty(value = "jobOutputType")
    private ExportJobOutputSerializationType jobOutputType;

    /*
     * The job Name.
     */
    @JsonProperty(value = "jobName")
    private String jobName;

    /*
     * The timezone offset for the location of the request (in minutes).
     */
    @JsonProperty(value = "timezoneOffset")
    private Double timezoneOffset;

    /**
     * Get the startTime property: Date time to get jobs from.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Date time to get jobs from.
     *
     * @param startTime the startTime value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Date time to get jobs upto.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Date time to get jobs upto.
     *
     * @param endTime the endTime value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the fabricId property: The Id of the fabric to search jobs under.
     *
     * @return the fabricId value.
     */
    public String fabricId() {
        return this.fabricId;
    }

    /**
     * Set the fabricId property: The Id of the fabric to search jobs under.
     *
     * @param fabricId the fabricId value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withFabricId(String fabricId) {
        this.fabricId = fabricId;
        return this;
    }

    /**
     * Get the affectedObjectTypes property: The type of objects.
     *
     * @return the affectedObjectTypes value.
     */
    public String affectedObjectTypes() {
        return this.affectedObjectTypes;
    }

    /**
     * Set the affectedObjectTypes property: The type of objects.
     *
     * @param affectedObjectTypes the affectedObjectTypes value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withAffectedObjectTypes(String affectedObjectTypes) {
        this.affectedObjectTypes = affectedObjectTypes;
        return this;
    }

    /**
     * Get the jobStatus property: The states of the job to be filtered can be in.
     *
     * @return the jobStatus value.
     */
    public String jobStatus() {
        return this.jobStatus;
    }

    /**
     * Set the jobStatus property: The states of the job to be filtered can be in.
     *
     * @param jobStatus the jobStatus value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get the jobOutputType property: The output type of the jobs.
     *
     * @return the jobOutputType value.
     */
    public ExportJobOutputSerializationType jobOutputType() {
        return this.jobOutputType;
    }

    /**
     * Set the jobOutputType property: The output type of the jobs.
     *
     * @param jobOutputType the jobOutputType value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withJobOutputType(ExportJobOutputSerializationType jobOutputType) {
        this.jobOutputType = jobOutputType;
        return this;
    }

    /**
     * Get the jobName property: The job Name.
     *
     * @return the jobName value.
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set the jobName property: The job Name.
     *
     * @param jobName the jobName value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get the timezoneOffset property: The timezone offset for the location of the request (in minutes).
     *
     * @return the timezoneOffset value.
     */
    public Double timezoneOffset() {
        return this.timezoneOffset;
    }

    /**
     * Set the timezoneOffset property: The timezone offset for the location of the request (in minutes).
     *
     * @param timezoneOffset the timezoneOffset value to set.
     * @return the JobQueryParameter object itself.
     */
    public JobQueryParameter withTimezoneOffset(Double timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
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
