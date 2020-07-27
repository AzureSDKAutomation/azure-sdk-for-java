/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.hdinsight.job.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SparkBatchJob model.
 */
public class SparkBatchJob {
    /**
     * The livy id of the spark batch job.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * The application id of this job.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * The detailed application info.
     */
    @JsonProperty(value = "appInfo")
    private Map<String, String> appInfo;

    /**
     * The current state of the spark batch job. Possible values include:
     * 'not_started', 'starting', 'idle', 'running', 'busy', 'shutting_down',
     * 'error', 'dead', 'killed', 'success', 'recovering'.
     */
    @JsonProperty(value = "state")
    private JobState state;

    /**
     * The log lines.
     */
    @JsonProperty(value = "log")
    private List<String> logLines;

    /**
     * Get the livy id of the spark batch job.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the livy id of the spark batch job.
     *
     * @param id the id value to set
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the application id of this job.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the application id of this job.
     *
     * @param appId the appId value to set
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the detailed application info.
     *
     * @return the appInfo value
     */
    public Map<String, String> appInfo() {
        return this.appInfo;
    }

    /**
     * Set the detailed application info.
     *
     * @param appInfo the appInfo value to set
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob withAppInfo(Map<String, String> appInfo) {
        this.appInfo = appInfo;
        return this;
    }

    /**
     * Get the current state of the spark batch job. Possible values include: 'not_started', 'starting', 'idle', 'running', 'busy', 'shutting_down', 'error', 'dead', 'killed', 'success', 'recovering'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Set the current state of the spark batch job. Possible values include: 'not_started', 'starting', 'idle', 'running', 'busy', 'shutting_down', 'error', 'dead', 'killed', 'success', 'recovering'.
     *
     * @param state the state value to set
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob withState(JobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the log lines.
     *
     * @return the logLines value
     */
    public List<String> logLines() {
        return this.logLines;
    }

    /**
     * Set the log lines.
     *
     * @param logLines the logLines value to set
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob withLogLines(List<String> logLines) {
        this.logLines = logLines;
        return this;
    }

}
