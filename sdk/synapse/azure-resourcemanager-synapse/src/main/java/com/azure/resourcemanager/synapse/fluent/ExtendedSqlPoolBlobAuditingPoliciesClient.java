// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.ExtendedSqlPoolBlobAuditingPolicyInner;

/**
 * An instance of this class provides access to all the operations defined in ExtendedSqlPoolBlobAuditingPoliciesClient.
 */
public interface ExtendedSqlPoolBlobAuditingPoliciesClient {
    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedSqlPoolBlobAuditingPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedSqlPoolBlobAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters An extended Sql pool blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedSqlPoolBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        ExtendedSqlPoolBlobAuditingPolicyInner parameters);

    /**
     * Creates or updates an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters An extended Sql pool blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedSqlPoolBlobAuditingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        ExtendedSqlPoolBlobAuditingPolicyInner parameters,
        Context context);

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql pool extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExtendedSqlPoolBlobAuditingPolicyInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql pool extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExtendedSqlPoolBlobAuditingPolicyInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);
}
