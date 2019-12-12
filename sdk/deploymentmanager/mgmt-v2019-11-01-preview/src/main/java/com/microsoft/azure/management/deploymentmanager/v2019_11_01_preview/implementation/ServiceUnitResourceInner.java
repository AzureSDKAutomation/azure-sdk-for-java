/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.DeploymentMode;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ServiceUnitArtifacts;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents the response of a service unit resource.
 */
@JsonFlatten
public class ServiceUnitResourceInner extends Resource {
    /**
     * The Azure Resource Group to which the resources in the service unit
     * belong to or should be deployed to.
     */
    @JsonProperty(value = "properties.targetResourceGroup", required = true)
    private String targetResourceGroup;

    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * Possible values include: 'Incremental', 'Complete'.
     */
    @JsonProperty(value = "properties.deploymentMode", required = true)
    private DeploymentMode deploymentMode;

    /**
     * The artifacts for the service unit.
     */
    @JsonProperty(value = "properties.artifacts")
    private ServiceUnitArtifacts artifacts;

    /**
     * Get the Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     *
     * @return the targetResourceGroup value
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     *
     * @param targetResourceGroup the targetResourceGroup value to set
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

    /**
     * Get describes the type of ARM deployment to be performed on the resource. Possible values include: 'Incremental', 'Complete'.
     *
     * @return the deploymentMode value
     */
    public DeploymentMode deploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Set describes the type of ARM deployment to be performed on the resource. Possible values include: 'Incremental', 'Complete'.
     *
     * @param deploymentMode the deploymentMode value to set
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * Get the artifacts for the service unit.
     *
     * @return the artifacts value
     */
    public ServiceUnitArtifacts artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts for the service unit.
     *
     * @param artifacts the artifacts value to set
     * @return the ServiceUnitResourceInner object itself.
     */
    public ServiceUnitResourceInner withArtifacts(ServiceUnitArtifacts artifacts) {
        this.artifacts = artifacts;
        return this;
    }

}
