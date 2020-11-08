/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation;

import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.DelegatedSubnetState;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.SubnetDetails;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.ControllerDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.DelegatedSubnetResource;

/**
 * Represents an instance of a orchestrator.
 */
@JsonFlatten
public class DelegatedSubnetInner extends DelegatedSubnetResource {
    /**
     * Resource guid.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The current state of dnc delegated subnet resource. Possible values
     * include: 'Deleting', 'Succeeded', 'Failed', 'Provisioning'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DelegatedSubnetState provisioningState;

    /**
     * orchestrator details.
     */
    @JsonProperty(value = "properties.subnetDetails")
    private SubnetDetails subnetDetails;

    /**
     * controller details.
     */
    @JsonProperty(value = "properties.controllerDetails")
    private ControllerDetails controllerDetails;

    /**
     * Get resource guid.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the current state of dnc delegated subnet resource. Possible values include: 'Deleting', 'Succeeded', 'Failed', 'Provisioning'.
     *
     * @return the provisioningState value
     */
    public DelegatedSubnetState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get orchestrator details.
     *
     * @return the subnetDetails value
     */
    public SubnetDetails subnetDetails() {
        return this.subnetDetails;
    }

    /**
     * Set orchestrator details.
     *
     * @param subnetDetails the subnetDetails value to set
     * @return the DelegatedSubnetInner object itself.
     */
    public DelegatedSubnetInner withSubnetDetails(SubnetDetails subnetDetails) {
        this.subnetDetails = subnetDetails;
        return this;
    }

    /**
     * Get controller details.
     *
     * @return the controllerDetails value
     */
    public ControllerDetails controllerDetails() {
        return this.controllerDetails;
    }

    /**
     * Set controller details.
     *
     * @param controllerDetails the controllerDetails value to set
     * @return the DelegatedSubnetInner object itself.
     */
    public DelegatedSubnetInner withControllerDetails(ControllerDetails controllerDetails) {
        this.controllerDetails = controllerDetails;
        return this;
    }

}
