// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Managed Virtual Network Settings. */
@Fluent
public final class ManagedVirtualNetworkSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedVirtualNetworkSettings.class);

    /*
     * Prevent Data Exfiltration
     */
    @JsonProperty(value = "preventDataExfiltration")
    private Boolean preventDataExfiltration;

    /*
     * Linked Access Check On Target Resource
     */
    @JsonProperty(value = "linkedAccessCheckOnTargetResource")
    private Boolean linkedAccessCheckOnTargetResource;

    /*
     * Allowed Aad Tenant Ids For Linking
     */
    @JsonProperty(value = "allowedAadTenantIdsForLinking")
    private List<String> allowedAadTenantIdsForLinking;

    /**
     * Get the preventDataExfiltration property: Prevent Data Exfiltration.
     *
     * @return the preventDataExfiltration value.
     */
    public Boolean preventDataExfiltration() {
        return this.preventDataExfiltration;
    }

    /**
     * Set the preventDataExfiltration property: Prevent Data Exfiltration.
     *
     * @param preventDataExfiltration the preventDataExfiltration value to set.
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withPreventDataExfiltration(Boolean preventDataExfiltration) {
        this.preventDataExfiltration = preventDataExfiltration;
        return this;
    }

    /**
     * Get the linkedAccessCheckOnTargetResource property: Linked Access Check On Target Resource.
     *
     * @return the linkedAccessCheckOnTargetResource value.
     */
    public Boolean linkedAccessCheckOnTargetResource() {
        return this.linkedAccessCheckOnTargetResource;
    }

    /**
     * Set the linkedAccessCheckOnTargetResource property: Linked Access Check On Target Resource.
     *
     * @param linkedAccessCheckOnTargetResource the linkedAccessCheckOnTargetResource value to set.
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withLinkedAccessCheckOnTargetResource(
        Boolean linkedAccessCheckOnTargetResource) {
        this.linkedAccessCheckOnTargetResource = linkedAccessCheckOnTargetResource;
        return this;
    }

    /**
     * Get the allowedAadTenantIdsForLinking property: Allowed Aad Tenant Ids For Linking.
     *
     * @return the allowedAadTenantIdsForLinking value.
     */
    public List<String> allowedAadTenantIdsForLinking() {
        return this.allowedAadTenantIdsForLinking;
    }

    /**
     * Set the allowedAadTenantIdsForLinking property: Allowed Aad Tenant Ids For Linking.
     *
     * @param allowedAadTenantIdsForLinking the allowedAadTenantIdsForLinking value to set.
     * @return the ManagedVirtualNetworkSettings object itself.
     */
    public ManagedVirtualNetworkSettings withAllowedAadTenantIdsForLinking(List<String> allowedAadTenantIdsForLinking) {
        this.allowedAadTenantIdsForLinking = allowedAadTenantIdsForLinking;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
