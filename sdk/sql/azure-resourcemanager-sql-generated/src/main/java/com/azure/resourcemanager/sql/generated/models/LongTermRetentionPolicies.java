// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LongTermRetentionPolicies. */
public interface LongTermRetentionPolicies {
    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    LongTermRetentionPolicy get(
        String resourceGroupName, String serverName, String databaseName, LongTermRetentionPolicyName policyName);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    Response<LongTermRetentionPolicy> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        LongTermRetentionPolicyName policyName,
        Context context);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    PagedIterable<LongTermRetentionPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    PagedIterable<LongTermRetentionPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Gets a database's long term retention policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    LongTermRetentionPolicy getById(String id);

    /**
     * Gets a database's long term retention policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    Response<LongTermRetentionPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LongTermRetentionPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new LongTermRetentionPolicy definition.
     */
    LongTermRetentionPolicy.DefinitionStages.Blank define(LongTermRetentionPolicyName name);
}
