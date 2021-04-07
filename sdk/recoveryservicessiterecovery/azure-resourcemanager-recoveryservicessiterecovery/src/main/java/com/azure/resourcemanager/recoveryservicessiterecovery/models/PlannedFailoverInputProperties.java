// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input definition for planned failover input properties. */
@Fluent
public final class PlannedFailoverInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PlannedFailoverInputProperties.class);

    /*
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /*
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private PlannedFailoverProviderSpecificFailoverInput providerSpecificDetails;

    /**
     * Get the failoverDirection property: Failover direction.
     *
     * @return the failoverDirection value.
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: Failover direction.
     *
     * @param failoverDirection the failoverDirection value to set.
     * @return the PlannedFailoverInputProperties object itself.
     */
    public PlannedFailoverInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific settings.
     *
     * @return the providerSpecificDetails value.
     */
    public PlannedFailoverProviderSpecificFailoverInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the PlannedFailoverInputProperties object itself.
     */
    public PlannedFailoverInputProperties withProviderSpecificDetails(
        PlannedFailoverProviderSpecificFailoverInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
