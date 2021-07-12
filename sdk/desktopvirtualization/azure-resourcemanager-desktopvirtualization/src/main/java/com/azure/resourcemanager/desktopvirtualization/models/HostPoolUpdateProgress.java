// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of host pool update progress. */
@Fluent
public final class HostPoolUpdateProgress {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostPoolUpdateProgress.class);

    /*
     * The hostpool update create time.
     */
    @JsonProperty(value = "timeCreated")
    private OffsetDateTime timeCreated;

    /*
     * The hostpool update start time.
     */
    @JsonProperty(value = "timeStarted")
    private OffsetDateTime timeStarted;

    /*
     * The hostpool update fail time.
     */
    @JsonProperty(value = "timeFailed")
    private OffsetDateTime timeFailed;

    /*
     * The hostpool update end time.
     */
    @JsonProperty(value = "timeEnded")
    private OffsetDateTime timeEnded;

    /*
     * The alerts given to customers for hostpool update.
     */
    @JsonProperty(value = "errors")
    private List<HostPoolUpdateFault> errors;

    /*
     * The progress percentage.
     */
    @JsonProperty(value = "progressPercentage")
    private Float progressPercentage;

    /*
     * The number of session hosts to update by hostpool update.
     */
    @JsonProperty(value = "sessionHostsToUpdate")
    private Integer sessionHostsToUpdate;

    /*
     * The number of session hosts updating by hostpool update.
     */
    @JsonProperty(value = "sessionHostsUpdating")
    private Integer sessionHostsUpdating;

    /*
     * The number of session hosts updated by hostpool update.
     */
    @JsonProperty(value = "sessionHostsUpdated")
    private Integer sessionHostsUpdated;

    /*
     * The number of session hosts that failed to rollback.
     */
    @JsonProperty(value = "sessionHostsRollbackFailed")
    private Integer sessionHostsRollbackFailed;

    /**
     * Get the timeCreated property: The hostpool update create time.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Set the timeCreated property: The hostpool update create time.
     *
     * @param timeCreated the timeCreated value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withTimeCreated(OffsetDateTime timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * Get the timeStarted property: The hostpool update start time.
     *
     * @return the timeStarted value.
     */
    public OffsetDateTime timeStarted() {
        return this.timeStarted;
    }

    /**
     * Set the timeStarted property: The hostpool update start time.
     *
     * @param timeStarted the timeStarted value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withTimeStarted(OffsetDateTime timeStarted) {
        this.timeStarted = timeStarted;
        return this;
    }

    /**
     * Get the timeFailed property: The hostpool update fail time.
     *
     * @return the timeFailed value.
     */
    public OffsetDateTime timeFailed() {
        return this.timeFailed;
    }

    /**
     * Set the timeFailed property: The hostpool update fail time.
     *
     * @param timeFailed the timeFailed value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withTimeFailed(OffsetDateTime timeFailed) {
        this.timeFailed = timeFailed;
        return this;
    }

    /**
     * Get the timeEnded property: The hostpool update end time.
     *
     * @return the timeEnded value.
     */
    public OffsetDateTime timeEnded() {
        return this.timeEnded;
    }

    /**
     * Set the timeEnded property: The hostpool update end time.
     *
     * @param timeEnded the timeEnded value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withTimeEnded(OffsetDateTime timeEnded) {
        this.timeEnded = timeEnded;
        return this;
    }

    /**
     * Get the errors property: The alerts given to customers for hostpool update.
     *
     * @return the errors value.
     */
    public List<HostPoolUpdateFault> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: The alerts given to customers for hostpool update.
     *
     * @param errors the errors value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withErrors(List<HostPoolUpdateFault> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the progressPercentage property: The progress percentage.
     *
     * @return the progressPercentage value.
     */
    public Float progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Set the progressPercentage property: The progress percentage.
     *
     * @param progressPercentage the progressPercentage value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withProgressPercentage(Float progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * Get the sessionHostsToUpdate property: The number of session hosts to update by hostpool update.
     *
     * @return the sessionHostsToUpdate value.
     */
    public Integer sessionHostsToUpdate() {
        return this.sessionHostsToUpdate;
    }

    /**
     * Set the sessionHostsToUpdate property: The number of session hosts to update by hostpool update.
     *
     * @param sessionHostsToUpdate the sessionHostsToUpdate value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withSessionHostsToUpdate(Integer sessionHostsToUpdate) {
        this.sessionHostsToUpdate = sessionHostsToUpdate;
        return this;
    }

    /**
     * Get the sessionHostsUpdating property: The number of session hosts updating by hostpool update.
     *
     * @return the sessionHostsUpdating value.
     */
    public Integer sessionHostsUpdating() {
        return this.sessionHostsUpdating;
    }

    /**
     * Set the sessionHostsUpdating property: The number of session hosts updating by hostpool update.
     *
     * @param sessionHostsUpdating the sessionHostsUpdating value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withSessionHostsUpdating(Integer sessionHostsUpdating) {
        this.sessionHostsUpdating = sessionHostsUpdating;
        return this;
    }

    /**
     * Get the sessionHostsUpdated property: The number of session hosts updated by hostpool update.
     *
     * @return the sessionHostsUpdated value.
     */
    public Integer sessionHostsUpdated() {
        return this.sessionHostsUpdated;
    }

    /**
     * Set the sessionHostsUpdated property: The number of session hosts updated by hostpool update.
     *
     * @param sessionHostsUpdated the sessionHostsUpdated value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withSessionHostsUpdated(Integer sessionHostsUpdated) {
        this.sessionHostsUpdated = sessionHostsUpdated;
        return this;
    }

    /**
     * Get the sessionHostsRollbackFailed property: The number of session hosts that failed to rollback.
     *
     * @return the sessionHostsRollbackFailed value.
     */
    public Integer sessionHostsRollbackFailed() {
        return this.sessionHostsRollbackFailed;
    }

    /**
     * Set the sessionHostsRollbackFailed property: The number of session hosts that failed to rollback.
     *
     * @param sessionHostsRollbackFailed the sessionHostsRollbackFailed value to set.
     * @return the HostPoolUpdateProgress object itself.
     */
    public HostPoolUpdateProgress withSessionHostsRollbackFailed(Integer sessionHostsRollbackFailed) {
        this.sessionHostsRollbackFailed = sessionHostsRollbackFailed;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
