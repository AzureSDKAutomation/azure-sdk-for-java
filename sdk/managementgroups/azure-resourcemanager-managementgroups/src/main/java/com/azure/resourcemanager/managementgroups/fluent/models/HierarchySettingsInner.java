// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings defined at the Management Group scope. */
@JsonFlatten
@Fluent
public class HierarchySettingsInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HierarchySettingsInner.class);

    /*
     * The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /*
     * Indicates whether RBAC access is required upon group creation under the
     * root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root
     * Management Group scope in order to create new Groups directly under the
     * root. This will prevent new users from creating new Management Groups,
     * unless they are given access.
     */
    @JsonProperty(value = "properties.requireAuthorizationForGroupCreation")
    private Boolean requireAuthorizationForGroupCreation;

    /*
     * Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup
     */
    @JsonProperty(value = "properties.defaultManagementGroup")
    private String defaultManagementGroup;

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the hierarchy settings. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     *
     * @return the requireAuthorizationForGroupCreation value.
     */
    public Boolean requireAuthorizationForGroupCreation() {
        return this.requireAuthorizationForGroupCreation;
    }

    /**
     * Set the requireAuthorizationForGroupCreation property: Indicates whether RBAC access is required upon group
     * creation under the root Management Group. If set to true, user will require
     * Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new
     * Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are
     * given access.
     *
     * @param requireAuthorizationForGroupCreation the requireAuthorizationForGroupCreation value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withRequireAuthorizationForGroupCreation(
        Boolean requireAuthorizationForGroupCreation) {
        this.requireAuthorizationForGroupCreation = requireAuthorizationForGroupCreation;
        return this;
    }

    /**
     * Get the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     *
     * @return the defaultManagementGroup value.
     */
    public String defaultManagementGroup() {
        return this.defaultManagementGroup;
    }

    /**
     * Set the defaultManagementGroup property: Settings that sets the default Management Group under which new
     * subscriptions get added in this tenant. For example,
     * /providers/Microsoft.Management/managementGroups/defaultGroup.
     *
     * @param defaultManagementGroup the defaultManagementGroup value to set.
     * @return the HierarchySettingsInner object itself.
     */
    public HierarchySettingsInner withDefaultManagementGroup(String defaultManagementGroup) {
        this.defaultManagementGroup = defaultManagementGroup;
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
