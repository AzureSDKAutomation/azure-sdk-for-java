// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NotebookWorkspaces. */
public interface NotebookWorkspaces {
    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account.
     */
    PagedIterable<NotebookWorkspace> listByDatabaseAccount(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account.
     */
    PagedIterable<NotebookWorkspace> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    NotebookWorkspace get(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    Response<NotebookWorkspace> getWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    NotebookWorkspaceConnectionInfoResult listConnectionInfo(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    Response<NotebookWorkspaceConnectionInfoResult> listConnectionInfoWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account.
     */
    PagedIterable<NotebookWorkspace> listByDatabaseAccount(String resourceGroupName, String accountName);

    /**
     * Gets the notebook workspace resources of an existing Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace resources of an existing Cosmos DB account.
     */
    PagedIterable<NotebookWorkspace> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    NotebookWorkspace get(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    Response<NotebookWorkspace> getWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    NotebookWorkspaceConnectionInfoResult listConnectionInfo(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Retrieves the connection info for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection info for the given notebook workspace.
     */
    Response<NotebookWorkspaceConnectionInfoResult> listConnectionInfoWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Regenerates the auth token for the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName);

    /**
     * Starts the notebook workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param notebookWorkspaceName The name of the notebook workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    NotebookWorkspace getById(String id);

    /**
     * Gets the notebook workspace for a Cosmos DB account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the notebook workspace for a Cosmos DB account.
     */
    Response<NotebookWorkspace> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the notebook workspace for a Cosmos DB account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NotebookWorkspace resource.
     *
     * @param name resource name.
     * @return the first stage of the new NotebookWorkspace definition.
     */
    NotebookWorkspace.DefinitionStages.Blank define(NotebookWorkspaceName name);
}
