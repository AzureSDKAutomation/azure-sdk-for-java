// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner;

/** An instance of this class provides access to all the operations defined in DatabasePrincipalAssignmentsClient. */
public interface DatabasePrincipalAssignmentsClient {
    /**
     * Lists all Kusto pool database principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principal assignments operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabasePrincipalAssignmentInner> list(
        String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName);

    /**
     * Lists all Kusto pool database principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principal assignments operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabasePrincipalAssignmentInner> list(
        String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName, Context context);

    /**
     * Gets a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool database principalAssignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner get(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName);

    /**
     * Gets a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool database principalAssignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabasePrincipalAssignmentInner> getWithResponse(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Creates a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DatabasePrincipalAssignmentInner>, DatabasePrincipalAssignmentInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        DatabasePrincipalAssignmentInner parameters);

    /**
     * Creates a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DatabasePrincipalAssignmentInner>, DatabasePrincipalAssignmentInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        DatabasePrincipalAssignmentInner parameters,
        Context context);

    /**
     * Creates a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        DatabasePrincipalAssignmentInner parameters);

    /**
     * Creates a Kusto pool database principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        DatabasePrincipalAssignmentInner parameters,
        Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);
}
