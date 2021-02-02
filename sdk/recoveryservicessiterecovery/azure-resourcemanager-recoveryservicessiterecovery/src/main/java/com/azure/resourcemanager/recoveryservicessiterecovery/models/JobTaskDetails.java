// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** This class represents a task which is actually a workflow so that one can navigate to its individual drill down. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("JobTaskDetails")
@Fluent
public final class JobTaskDetails extends TaskTypeDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobTaskDetails.class);

    /*
     * The job entity.
     */
    @JsonProperty(value = "jobTask")
    private JobEntity jobTask;

    /**
     * Get the jobTask property: The job entity.
     *
     * @return the jobTask value.
     */
    public JobEntity jobTask() {
        return this.jobTask;
    }

    /**
     * Set the jobTask property: The job entity.
     *
     * @param jobTask the jobTask value to set.
     * @return the JobTaskDetails object itself.
     */
    public JobTaskDetails withJobTask(JobEntity jobTask) {
        this.jobTask = jobTask;
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
        if (jobTask() != null) {
            jobTask().validate();
        }
    }
}
