// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of KustoPools. */
public interface KustoPools {
    /**
     * List all Kusto pools.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto pools operation response.
     */
    KustoPoolListResult listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List all Kusto pools.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto pools operation response.
     */
    Response<KustoPoolListResult> listByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool.
     */
    KustoPool get(String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Gets a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool.
     */
    Response<KustoPool> getWithResponse(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Deletes a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kustoPoolName The name of the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String workspaceName, String resourceGroupName, String kustoPoolName);

    /**
     * Deletes a Kusto pool.
     *
     * @param workspaceName The name of the workspace.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kustoPoolName The name of the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String workspaceName, String resourceGroupName, String kustoPoolName, Context context);

    /**
     * Gets a Kusto pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool.
     */
    KustoPool getById(String id);

    /**
     * Gets a Kusto pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool.
     */
    Response<KustoPool> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Kusto pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Kusto pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new KustoPool resource.
     *
     * @param name resource name.
     * @return the first stage of the new KustoPool definition.
     */
    KustoPool.DefinitionStages.Blank define(String name);
}
