// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of KustoPoolPrincipalAssignments. */
public interface KustoPoolPrincipalAssignments {
    /**
     * Lists all Kusto pool principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto cluster principal assignments operation response.
     */
    PagedIterable<ClusterPrincipalAssignment> list(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Lists all Kusto pool principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto cluster principal assignments operation response.
     */
    PagedIterable<ClusterPrincipalAssignment> list(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment.
     */
    ClusterPrincipalAssignment get(
        String workspaceName, String kustoPoolName, String principalAssignmentName, String resourceGroupName);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment.
     */
    Response<ClusterPrincipalAssignment> getWithResponse(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String workspaceName, String kustoPoolName, String principalAssignmentName, String resourceGroupName);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment.
     */
    ClusterPrincipalAssignment getById(String id);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment.
     */
    Response<ClusterPrincipalAssignment> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ClusterPrincipalAssignment resource.
     *
     * @param name resource name.
     * @return the first stage of the new ClusterPrincipalAssignment definition.
     */
    ClusterPrincipalAssignment.DefinitionStages.Blank define(String name);
}
