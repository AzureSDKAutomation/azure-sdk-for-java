/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment resource properties payload.
 */
public class DeploymentResourceProperties {
    /**
     * Uploaded source information of the deployment.
     */
    @JsonProperty(value = "source")
    private UserSourceInfo source;

    /**
     * App name of the deployment.
     */
    @JsonProperty(value = "appName", access = JsonProperty.Access.WRITE_ONLY)
    private String appName;

    /**
     * Provisioning state of the Deployment. Possible values include:
     * 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentResourceProvisioningState provisioningState;

    /**
     * Deployment settings of the Deployment.
     */
    @JsonProperty(value = "deploymentSettings")
    private DeploymentSettings deploymentSettings;

    /**
     * Status of the Deployment. Possible values include: 'Unknown', 'Stopped',
     * 'Running', 'Failed', 'Allocating', 'Upgrading', 'Compiling',
     * 'Processing'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentResourceStatus status;

    /**
     * Indicates whether the Deployment is active.
     */
    @JsonProperty(value = "active", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean active;

    /**
     * Date time when the resource is created.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Collection of instances belong to the Deployment.
     */
    @JsonProperty(value = "instances", access = JsonProperty.Access.WRITE_ONLY)
    private List<DeploymentInstance> instances;

    /**
     * Get uploaded source information of the deployment.
     *
     * @return the source value
     */
    public UserSourceInfo source() {
        return this.source;
    }

    /**
     * Set uploaded source information of the deployment.
     *
     * @param source the source value to set
     * @return the DeploymentResourceProperties object itself.
     */
    public DeploymentResourceProperties withSource(UserSourceInfo source) {
        this.source = source;
        return this;
    }

    /**
     * Get app name of the deployment.
     *
     * @return the appName value
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Get provisioning state of the Deployment. Possible values include: 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public DeploymentResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get deployment settings of the Deployment.
     *
     * @return the deploymentSettings value
     */
    public DeploymentSettings deploymentSettings() {
        return this.deploymentSettings;
    }

    /**
     * Set deployment settings of the Deployment.
     *
     * @param deploymentSettings the deploymentSettings value to set
     * @return the DeploymentResourceProperties object itself.
     */
    public DeploymentResourceProperties withDeploymentSettings(DeploymentSettings deploymentSettings) {
        this.deploymentSettings = deploymentSettings;
        return this;
    }

    /**
     * Get status of the Deployment. Possible values include: 'Unknown', 'Stopped', 'Running', 'Failed', 'Allocating', 'Upgrading', 'Compiling', 'Processing'.
     *
     * @return the status value
     */
    public DeploymentResourceStatus status() {
        return this.status;
    }

    /**
     * Get indicates whether the Deployment is active.
     *
     * @return the active value
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Get date time when the resource is created.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get collection of instances belong to the Deployment.
     *
     * @return the instances value
     */
    public List<DeploymentInstance> instances() {
        return this.instances;
    }

}
