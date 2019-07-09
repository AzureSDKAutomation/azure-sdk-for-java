/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMwareV2 fabric specific details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareV2")
public class VMwareV2FabricSpecificDetails extends FabricSpecificDetails {
    /**
     * The ARM Id of the VMware site.
     */
    @JsonProperty(value = "vmwareSiteId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareSiteId;

    /**
     * The Migration solution ARM Id.
     */
    @JsonProperty(value = "migrationSolutionId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationSolutionId;

    /**
     * The service endpoint.
     */
    @JsonProperty(value = "serviceEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceEndpoint;

    /**
     * Get the ARM Id of the VMware site.
     *
     * @return the vmwareSiteId value
     */
    public String vmwareSiteId() {
        return this.vmwareSiteId;
    }

    /**
     * Get the Migration solution ARM Id.
     *
     * @return the migrationSolutionId value
     */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * Get the service endpoint.
     *
     * @return the serviceEndpoint value
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

}
