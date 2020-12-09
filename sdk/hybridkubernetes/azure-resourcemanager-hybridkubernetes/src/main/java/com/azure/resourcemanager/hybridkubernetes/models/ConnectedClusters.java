// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ConnectedClusters. */
public interface ConnectedClusters {
    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    ConnectedCluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    Response<ConnectedCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets cluster user credentials of the connected cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credentials of the connected cluster with a specified resource group and name.
     */
    CredentialResults listClusterUserCredentials(String resourceGroupName, String clusterName);

    /**
     * Gets cluster user credentials of the connected cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param clientProxy Parameter to indicate whether the request is for client side proxy or not.
     * @param clientAuthenticationDetails Authentication details of the user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credentials of the connected cluster with a specified resource group and name.
     */
    Response<CredentialResults> listClusterUserCredentialsWithResponse(
        String resourceGroupName,
        String clusterName,
        Boolean clientProxy,
        AuthenticationDetails clientAuthenticationDetails,
        Context context);

    /**
     * API to enumerate registered connected K8s clusters under a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    PagedIterable<ConnectedCluster> listByResourceGroup(String resourceGroupName);

    /**
     * API to enumerate registered connected K8s clusters under a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    PagedIterable<ConnectedCluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * API to enumerate registered connected K8s clusters under a Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    PagedIterable<ConnectedCluster> list();

    /**
     * API to enumerate registered connected K8s clusters under a Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    PagedIterable<ConnectedCluster> list(Context context);

    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    ConnectedCluster getById(String id);

    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    Response<ConnectedCluster> getByIdWithResponse(String id, Context context);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConnectedCluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConnectedCluster definition.
     */
    ConnectedCluster.DefinitionStages.Blank define(String name);
}
