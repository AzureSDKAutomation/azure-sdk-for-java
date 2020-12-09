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
import com.azure.resourcemanager.synapse.fluent.models.ServerBlobAuditingPolicyInner;
import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyName;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkspaceManagedSqlServerBlobAuditingPoliciesClient.
 */
public interface WorkspaceManagedSqlServerBlobAuditingPoliciesClient {
    /**
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerBlobAuditingPolicyInner get(
        String resourceGroupName, String workspaceName, BlobAuditingPolicyName blobAuditingPolicyName);

    /**
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerBlobAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String workspaceName, BlobAuditingPolicyName blobAuditingPolicyName, Context context);

    /**
     * Create or Update a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param parameters A server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerBlobAuditingPolicyInner>, ServerBlobAuditingPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        BlobAuditingPolicyName blobAuditingPolicyName,
        ServerBlobAuditingPolicyInner parameters);

    /**
     * Create or Update a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param parameters A server blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerBlobAuditingPolicyInner>, ServerBlobAuditingPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        BlobAuditingPolicyName blobAuditingPolicyName,
        ServerBlobAuditingPolicyInner parameters,
        Context context);

    /**
     * Create or Update a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param parameters A server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        BlobAuditingPolicyName blobAuditingPolicyName,
        ServerBlobAuditingPolicyInner parameters);

    /**
     * Create or Update a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param parameters A server blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        BlobAuditingPolicyName blobAuditingPolicyName,
        ServerBlobAuditingPolicyInner parameters,
        Context context);

    /**
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerBlobAuditingPolicyInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerBlobAuditingPolicyInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);
}
