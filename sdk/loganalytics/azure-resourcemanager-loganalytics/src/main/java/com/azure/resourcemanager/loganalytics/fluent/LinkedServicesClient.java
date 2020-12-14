// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedServiceInner;

/** An instance of this class provides access to all the operations defined in LinkedServicesClient. */
public interface LinkedServicesClient {
    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linkedServices resource.
     * @param parameters The top level Linked service resource container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LinkedServiceInner>, LinkedServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters);

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linkedServices resource.
     * @param parameters The top level Linked service resource container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LinkedServiceInner>, LinkedServiceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String linkedServiceName,
        LinkedServiceInner parameters,
        Context context);

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linkedServices resource.
     * @param parameters The top level Linked service resource container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedServiceInner createOrUpdate(
        String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters);

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linkedServices resource.
     * @param parameters The top level Linked service resource container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedServiceInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String linkedServiceName,
        LinkedServiceInner parameters,
        Context context);

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LinkedServiceInner>, LinkedServiceInner> beginDelete(
        String resourceGroupName, String workspaceName, String linkedServiceName);

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LinkedServiceInner>, LinkedServiceInner> beginDelete(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context);

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedServiceInner delete(String resourceGroupName, String workspaceName, String linkedServiceName);

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Linked service resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedServiceInner delete(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context);

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedServiceInner get(String resourceGroupName, String workspaceName, String linkedServiceName);

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param linkedServiceName Name of the linked service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LinkedServiceInner> getWithResponse(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context);

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the linked services instances in a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LinkedServiceInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the linked services instances in a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LinkedServiceInner> listByWorkspace(String resourceGroupName, String workspaceName, Context context);
}
