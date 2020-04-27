/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.ContinuousWebJobStatus;
import com.microsoft.azure.management.appservice.v2019_08_01.WebJobType;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Continuous Web Job Information.
 */
@JsonFlatten
public class ContinuousWebJobInner extends ProxyOnlyResource {
    /**
     * Job status. Possible values include: 'Initializing', 'Starting',
     * 'Running', 'PendingRestart', 'Stopped'.
     */
    @JsonProperty(value = "properties.status")
    private ContinuousWebJobStatus status;

    /**
     * Detailed status.
     */
    @JsonProperty(value = "properties.detailed_status")
    private String detailedStatus;

    /**
     * Log URL.
     */
    @JsonProperty(value = "properties.log_url")
    private String logUrl;

    /**
     * Run command.
     */
    @JsonProperty(value = "properties.run_command")
    private String runCommand;

    /**
     * Job URL.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /**
     * Extra Info URL.
     */
    @JsonProperty(value = "properties.extra_info_url")
    private String extraInfoUrl;

    /**
     * Job type. Possible values include: 'Continuous', 'Triggered'.
     */
    @JsonProperty(value = "properties.web_job_type")
    private WebJobType webJobType;

    /**
     * Error information.
     */
    @JsonProperty(value = "properties.error")
    private String error;

    /**
     * Using SDK?.
     */
    @JsonProperty(value = "properties.using_sdk")
    private Boolean usingSdk;

    /**
     * Job settings.
     */
    @JsonProperty(value = "properties.settings")
    private Map<String, Object> settings;

    /**
     * Get job status. Possible values include: 'Initializing', 'Starting', 'Running', 'PendingRestart', 'Stopped'.
     *
     * @return the status value
     */
    public ContinuousWebJobStatus status() {
        return this.status;
    }

    /**
     * Set job status. Possible values include: 'Initializing', 'Starting', 'Running', 'PendingRestart', 'Stopped'.
     *
     * @param status the status value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withStatus(ContinuousWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get detailed status.
     *
     * @return the detailedStatus value
     */
    public String detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Set detailed status.
     *
     * @param detailedStatus the detailedStatus value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * Get log URL.
     *
     * @return the logUrl value
     */
    public String logUrl() {
        return this.logUrl;
    }

    /**
     * Set log URL.
     *
     * @param logUrl the logUrl value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * Get run command.
     *
     * @return the runCommand value
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set run command.
     *
     * @param runCommand the runCommand value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get job URL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set job URL.
     *
     * @param url the url value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get extra Info URL.
     *
     * @return the extraInfoUrl value
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set extra Info URL.
     *
     * @param extraInfoUrl the extraInfoUrl value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get job type. Possible values include: 'Continuous', 'Triggered'.
     *
     * @return the webJobType value
     */
    public WebJobType webJobType() {
        return this.webJobType;
    }

    /**
     * Set job type. Possible values include: 'Continuous', 'Triggered'.
     *
     * @param webJobType the webJobType value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withWebJobType(WebJobType webJobType) {
        this.webJobType = webJobType;
        return this;
    }

    /**
     * Get error information.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set error information.
     *
     * @param error the error value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get using SDK?.
     *
     * @return the usingSdk value
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set using SDK?.
     *
     * @param usingSdk the usingSdk value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get job settings.
     *
     * @return the settings value
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set job settings.
     *
     * @param settings the settings value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

}
