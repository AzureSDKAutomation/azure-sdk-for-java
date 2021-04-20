// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LongTermRetentionManagedInstanceBackups. */
public interface LongTermRetentionManagedInstanceBackups {
    /**
     * Gets a long term retention backup for a managed database.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup for a managed database.
     */
    ManagedInstanceLongTermRetentionBackup get(
        String locationName, String managedInstanceName, String databaseName, String backupName);

    /**
     * Gets a long term retention backup for a managed database.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup for a managed database.
     */
    Response<ManagedInstanceLongTermRetentionBackup> getWithResponse(
        String locationName, String managedInstanceName, String databaseName, String backupName, Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String locationName, String managedInstanceName, String databaseName, String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String locationName, String managedInstanceName, String databaseName, String backupName, Context context);

    /**
     * Lists all long term retention backups for a managed database.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByDatabase(
        String locationName, String managedInstanceName, String databaseName);

    /**
     * Lists all long term retention backups for a managed database.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByDatabase(
        String locationName,
        String managedInstanceName,
        String databaseName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given managed instance.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByInstance(
        String locationName, String managedInstanceName);

    /**
     * Lists the long term retention backups for a given managed instance.
     *
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByInstance(
        String locationName,
        String managedInstanceName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for managed databases in a given location.
     *
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByLocation(String locationName);

    /**
     * Lists the long term retention backups for managed databases in a given location.
     *
     * @param locationName The location of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByLocation(
        String locationName, Boolean onlyLatestPerDatabase, DatabaseState databaseState, Context context);

    /**
     * Gets a long term retention backup for a managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup for a managed database.
     */
    ManagedInstanceLongTermRetentionBackup getByResourceGroup(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        String databaseName,
        String backupName);

    /**
     * Gets a long term retention backup for a managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup for a managed database.
     */
    Response<ManagedInstanceLongTermRetentionBackup> getByResourceGroupWithResponse(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        String databaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        String databaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        String databaseName,
        String backupName,
        Context context);

    /**
     * Lists all long term retention backups for a managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName, String locationName, String managedInstanceName, String databaseName);

    /**
     * Lists all long term retention backups for a managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        String databaseName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupInstance(
        String resourceGroupName, String locationName, String managedInstanceName);

    /**
     * Lists the long term retention backups for a given managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param managedInstanceName The name of the managed instance.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupInstance(
        String resourceGroupName,
        String locationName,
        String managedInstanceName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for managed databases in a given location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupLocation(
        String resourceGroupName, String locationName);

    /**
     * Lists the long term retention backups for managed databases in a given location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups for managed database(s).
     */
    PagedIterable<ManagedInstanceLongTermRetentionBackup> listByResourceGroupLocation(
        String resourceGroupName,
        String locationName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);
}
