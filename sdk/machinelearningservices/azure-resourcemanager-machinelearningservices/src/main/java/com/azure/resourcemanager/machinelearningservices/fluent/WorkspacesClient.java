// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ListWorkspaceKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceUpdateParameters;

/** An instance of this class provides access to all the operations defined in WorkspacesClient. */
public interface WorkspacesClient {
    /**
     * Gets the properties of the specified machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets the properties of the specified machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters, Context context);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceInner parameters);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters, Context context);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> updateWithResponse(
        String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters, Context context);

    /**
     * Lists all the available machine learning workspaces under the specified resource group.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available machine learning workspaces under the specified resource group.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName, String skiptoken, Context context);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListWorkspaceKeysResultInner listKeys(String resourceGroupName, String workspaceName);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListWorkspaceKeysResultInner> listKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resyncKeys(String resourceGroupName, String workspaceName);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> resyncKeysWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Lists all the available machine learning workspaces under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list();

    /**
     * Lists all the available machine learning workspaces under the specified subscription.
     *
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list(String skiptoken, Context context);
}
