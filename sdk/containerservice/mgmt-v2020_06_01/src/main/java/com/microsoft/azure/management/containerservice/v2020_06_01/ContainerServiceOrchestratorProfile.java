/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service orchestrator.
 */
public class ContainerServiceOrchestratorProfile {
    /**
     * The orchestrator to use to manage container service cluster resources.
     * Valid values are Kubernetes, Swarm, DCOS, DockerCE and Custom. Possible
     * values include: 'Kubernetes', 'Swarm', 'DCOS', 'DockerCE', 'Custom'.
     */
    @JsonProperty(value = "orchestratorType", required = true)
    private ContainerServiceOrchestratorTypes orchestratorType;

    /**
     * The version of the orchestrator to use. You can specify the
     * major.minor.patch part of the actual version.For example, you can
     * specify version as "1.6.11".
     */
    @JsonProperty(value = "orchestratorVersion")
    private String orchestratorVersion;

    /**
     * Get the orchestrator to use to manage container service cluster resources. Valid values are Kubernetes, Swarm, DCOS, DockerCE and Custom. Possible values include: 'Kubernetes', 'Swarm', 'DCOS', 'DockerCE', 'Custom'.
     *
     * @return the orchestratorType value
     */
    public ContainerServiceOrchestratorTypes orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set the orchestrator to use to manage container service cluster resources. Valid values are Kubernetes, Swarm, DCOS, DockerCE and Custom. Possible values include: 'Kubernetes', 'Swarm', 'DCOS', 'DockerCE', 'Custom'.
     *
     * @param orchestratorType the orchestratorType value to set
     * @return the ContainerServiceOrchestratorProfile object itself.
     */
    public ContainerServiceOrchestratorProfile withOrchestratorType(ContainerServiceOrchestratorTypes orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

    /**
     * Get the version of the orchestrator to use. You can specify the major.minor.patch part of the actual version.For example, you can specify version as "1.6.11".
     *
     * @return the orchestratorVersion value
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the version of the orchestrator to use. You can specify the major.minor.patch part of the actual version.For example, you can specify version as "1.6.11".
     *
     * @param orchestratorVersion the orchestratorVersion value to set
     * @return the ContainerServiceOrchestratorProfile object itself.
     */
    public ContainerServiceOrchestratorProfile withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

}
