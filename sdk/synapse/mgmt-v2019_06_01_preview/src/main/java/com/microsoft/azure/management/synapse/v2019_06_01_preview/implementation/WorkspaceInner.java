/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.DataLakeStorageAccountDetails;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.VirtualNetworkProfile;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ManagedVirtualNetworkSettings;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ManagedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A workspace.
 */
@JsonFlatten
public class WorkspaceInner extends Resource {
    /**
     * Workspace default data lake storage account details.
     */
    @JsonProperty(value = "properties.defaultDataLakeStorage")
    private DataLakeStorageAccountDetails defaultDataLakeStorage;

    /**
     * SQL administrator login password.
     */
    @JsonProperty(value = "properties.sqlAdministratorLoginPassword")
    private String sqlAdministratorLoginPassword;

    /**
     * Workspace managed resource group. The resource group name uniquely
     * identifies the resource group within the user subscriptionId. The
     * resource group name must be no longer than 90 characters long, and must
     * be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(',
     * ')' and'.'. Note that the name cannot end with '.'.
     */
    @JsonProperty(value = "properties.managedResourceGroupName")
    private String managedResourceGroupName;

    /**
     * Resource provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Login for workspace SQL active directory administrator.
     */
    @JsonProperty(value = "properties.sqlAdministratorLogin")
    private String sqlAdministratorLogin;

    /**
     * Virtual Network profile.
     */
    @JsonProperty(value = "properties.virtualNetworkProfile")
    private VirtualNetworkProfile virtualNetworkProfile;

    /**
     * Connectivity endpoints.
     */
    @JsonProperty(value = "properties.connectivityEndpoints")
    private Map<String, String> connectivityEndpoints;

    /**
     * Setting this to 'default' will ensure that all compute for this
     * workspace is in a virtual network managed on behalf of the user.
     */
    @JsonProperty(value = "properties.managedVirtualNetwork")
    private String managedVirtualNetwork;

    /**
     * Private endpoint connections to the workspace.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Workspace level configs and feature flags.
     */
    @JsonProperty(value = "properties.extraProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, Object> extraProperties;

    /**
     * Managed Virtual Network Settings.
     */
    @JsonProperty(value = "properties.managedVirtualNetworkSettings")
    private ManagedVirtualNetworkSettings managedVirtualNetworkSettings;

    /**
     * Identity of the workspace.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /**
     * Get workspace default data lake storage account details.
     *
     * @return the defaultDataLakeStorage value
     */
    public DataLakeStorageAccountDetails defaultDataLakeStorage() {
        return this.defaultDataLakeStorage;
    }

    /**
     * Set workspace default data lake storage account details.
     *
     * @param defaultDataLakeStorage the defaultDataLakeStorage value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withDefaultDataLakeStorage(DataLakeStorageAccountDetails defaultDataLakeStorage) {
        this.defaultDataLakeStorage = defaultDataLakeStorage;
        return this;
    }

    /**
     * Get sQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value
     */
    public String sqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword;
    }

    /**
     * Set sQL administrator login password.
     *
     * @param sqlAdministratorLoginPassword the sqlAdministratorLoginPassword value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        return this;
    }

    /**
     * Get workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'.
     *
     * @return the managedResourceGroupName value
     */
    public String managedResourceGroupName() {
        return this.managedResourceGroupName;
    }

    /**
     * Set workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'.
     *
     * @param managedResourceGroupName the managedResourceGroupName value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withManagedResourceGroupName(String managedResourceGroupName) {
        this.managedResourceGroupName = managedResourceGroupName;
        return this;
    }

    /**
     * Get resource provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get login for workspace SQL active directory administrator.
     *
     * @return the sqlAdministratorLogin value
     */
    public String sqlAdministratorLogin() {
        return this.sqlAdministratorLogin;
    }

    /**
     * Set login for workspace SQL active directory administrator.
     *
     * @param sqlAdministratorLogin the sqlAdministratorLogin value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSqlAdministratorLogin(String sqlAdministratorLogin) {
        this.sqlAdministratorLogin = sqlAdministratorLogin;
        return this;
    }

    /**
     * Get virtual Network profile.
     *
     * @return the virtualNetworkProfile value
     */
    public VirtualNetworkProfile virtualNetworkProfile() {
        return this.virtualNetworkProfile;
    }

    /**
     * Set virtual Network profile.
     *
     * @param virtualNetworkProfile the virtualNetworkProfile value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withVirtualNetworkProfile(VirtualNetworkProfile virtualNetworkProfile) {
        this.virtualNetworkProfile = virtualNetworkProfile;
        return this;
    }

    /**
     * Get connectivity endpoints.
     *
     * @return the connectivityEndpoints value
     */
    public Map<String, String> connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Set connectivity endpoints.
     *
     * @param connectivityEndpoints the connectivityEndpoints value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withConnectivityEndpoints(Map<String, String> connectivityEndpoints) {
        this.connectivityEndpoints = connectivityEndpoints;
        return this;
    }

    /**
     * Get setting this to 'default' will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     *
     * @return the managedVirtualNetwork value
     */
    public String managedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }

    /**
     * Set setting this to 'default' will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     *
     * @param managedVirtualNetwork the managedVirtualNetwork value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withManagedVirtualNetwork(String managedVirtualNetwork) {
        this.managedVirtualNetwork = managedVirtualNetwork;
        return this;
    }

    /**
     * Get private endpoint connections to the workspace.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set private endpoint connections to the workspace.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get workspace level configs and feature flags.
     *
     * @return the extraProperties value
     */
    public Map<String, Object> extraProperties() {
        return this.extraProperties;
    }

    /**
     * Get managed Virtual Network Settings.
     *
     * @return the managedVirtualNetworkSettings value
     */
    public ManagedVirtualNetworkSettings managedVirtualNetworkSettings() {
        return this.managedVirtualNetworkSettings;
    }

    /**
     * Set managed Virtual Network Settings.
     *
     * @param managedVirtualNetworkSettings the managedVirtualNetworkSettings value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withManagedVirtualNetworkSettings(ManagedVirtualNetworkSettings managedVirtualNetworkSettings) {
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        return this;
    }

    /**
     * Get identity of the workspace.
     *
     * @return the identity value
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set identity of the workspace.
     *
     * @param identity the identity value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

}
