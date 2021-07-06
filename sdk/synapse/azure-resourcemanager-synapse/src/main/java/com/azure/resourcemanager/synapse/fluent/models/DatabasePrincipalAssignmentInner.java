// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalRole;
import com.azure.resourcemanager.synapse.models.PrincipalType;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing a database principal assignment. */
@JsonFlatten
@Fluent
public class DatabasePrincipalAssignmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasePrincipalAssignmentInner.class);

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The principal ID assigned to the database principal. It can be a user
     * email, application ID, or security group name.
     */
    @JsonProperty(value = "properties.principalId")
    private String principalId;

    /*
     * Database principal role.
     */
    @JsonProperty(value = "properties.role")
    private DatabasePrincipalRole role;

    /*
     * The tenant id of the principal
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /*
     * Principal type.
     */
    @JsonProperty(value = "properties.principalType")
    private PrincipalType principalType;

    /*
     * The tenant name of the principal
     */
    @JsonProperty(value = "properties.tenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantName;

    /*
     * The principal name
     */
    @JsonProperty(value = "properties.principalName", access = JsonProperty.Access.WRITE_ONLY)
    private String principalName;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     *
     * @param principalId the principalId value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the role property: Database principal role.
     *
     * @return the role value.
     */
    public DatabasePrincipalRole role() {
        return this.role;
    }

    /**
     * Set the role property: Database principal role.
     *
     * @param role the role value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withRole(DatabasePrincipalRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of the principal.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of the principal.
     *
     * @param tenantId the tenantId value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalType property: Principal type.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: Principal type.
     *
     * @param principalType the principalType value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the tenantName property: The tenant name of the principal.
     *
     * @return the tenantName value.
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Get the principalName property: The principal name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
