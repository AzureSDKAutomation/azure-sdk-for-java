// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** CloudEdgeManagementRole role, Currently It's in Private Preview. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("CloudEdgeManagement")
@JsonFlatten
@Fluent
public class CloudEdgeManagementRole extends RoleInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudEdgeManagementRole.class);

    /*
     * Local Edge Management Status
     */
    @JsonProperty(value = "properties.localManagementStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RoleStatus localManagementStatus;

    /*
     * Edge Profile of the resource
     */
    @JsonProperty(value = "properties.edgeProfile", access = JsonProperty.Access.WRITE_ONLY)
    private EdgeProfile edgeProfile;

    /*
     * Role status.
     */
    @JsonProperty(value = "properties.roleStatus")
    private RoleStatus roleStatus;

    /**
     * Get the localManagementStatus property: Local Edge Management Status.
     *
     * @return the localManagementStatus value.
     */
    public RoleStatus localManagementStatus() {
        return this.localManagementStatus;
    }

    /**
     * Get the edgeProfile property: Edge Profile of the resource.
     *
     * @return the edgeProfile value.
     */
    public EdgeProfile edgeProfile() {
        return this.edgeProfile;
    }

    /**
     * Get the roleStatus property: Role status.
     *
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.roleStatus;
    }

    /**
     * Set the roleStatus property: Role status.
     *
     * @param roleStatus the roleStatus value to set.
     * @return the CloudEdgeManagementRole object itself.
     */
    public CloudEdgeManagementRole withRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (edgeProfile() != null) {
            edgeProfile().validate();
        }
    }
}
