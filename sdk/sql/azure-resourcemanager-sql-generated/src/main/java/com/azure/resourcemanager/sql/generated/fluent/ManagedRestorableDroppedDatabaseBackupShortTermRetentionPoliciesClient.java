// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient.
 */
public interface ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient {
    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner get(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedBackupShortTermRetentionPolicyInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Context context);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters,
            Context context);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            ManagedBackupShortTermRetentionPolicyInner parameters,
            Context context);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters);

    /**
     * Sets a database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param parameters The short term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context);
}
