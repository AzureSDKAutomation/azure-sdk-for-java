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
import com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupInner;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionDatabaseState;

/** An instance of this class provides access to all the operations defined in LongTermRetentionBackupsClient. */
public interface LongTermRetentionBackupsClient {
    /**
     * Gets a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongTermRetentionBackupInner getByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Gets a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LongTermRetentionBackupInner> getByResourceGroupWithResponse(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupLocation(
        String resourceGroupName, String locationName);

    /**
     * Lists the long term retention backups for a given location.
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
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupLocation(
        String resourceGroupName,
        String locationName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupServer(
        String resourceGroupName, String locationName, String longTermRetentionServerName);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByResourceGroupServer(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);

    /**
     * Gets a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongTermRetentionBackupInner get(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Gets a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LongTermRetentionBackupInner> getWithResponse(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByDatabase(
        String locationName, String longTermRetentionServerName, String longTermRetentionDatabaseName);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByDatabase(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByLocation(String locationName);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param locationName The location of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByLocation(
        String locationName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByServer(String locationName, String longTermRetentionServerName);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LongTermRetentionBackupInner> listByServer(
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context);
}
