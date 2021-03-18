// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRehydrationRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.TriggerBackupRequest;
import com.azure.resourcemanager.dataprotection.models.ValidateForBackupRequest;
import com.azure.resourcemanager.dataprotection.models.ValidateRestoreRequestObject;

/** An instance of this class provides access to all the operations defined in BackupInstancesClient. */
public interface BackupInstancesClient {
    /**
     * Gets a backup instances belonging to a backup vault.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a backup instances belonging to a backup vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInstanceResourceInner> getBackupInstancesInVault(String vaultName, String resourceGroupName);

    /**
     * Gets a backup instances belonging to a backup vault.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a backup instances belonging to a backup vault.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInstanceResourceInner> getBackupInstancesInVault(
        String vaultName, String resourceGroupName, Context context);

    /**
     * Gets a backup instance with name in a backup vault.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a backup instance with name in a backup vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInstanceResourceInner get(String vaultName, String resourceGroupName, String backupInstanceName);

    /**
     * Gets a backup instance with name in a backup vault.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a backup instance with name in a backup vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupInstanceResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String backupInstanceName, Context context);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupInstance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInstanceResourceInner>, BackupInstanceResourceInner> beginPut(
        String vaultName, String resourceGroupName, String backupInstanceName, BackupInstanceResourceInner parameters);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupInstance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInstanceResourceInner>, BackupInstanceResourceInner> beginPut(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        BackupInstanceResourceInner parameters,
        Context context);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupInstance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInstanceResourceInner put(
        String vaultName, String resourceGroupName, String backupInstanceName, BackupInstanceResourceInner parameters);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupInstance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInstanceResourceInner put(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        BackupInstanceResourceInner parameters,
        Context context);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String vaultName, String resourceGroupName, String backupInstanceName);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String vaultName, String resourceGroupName, String backupInstanceName, Context context);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vaultName, String resourceGroupName, String backupInstanceName);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vaultName, String resourceGroupName, String backupInstanceName, Context context);

    /**
     * Trigger adhoc backup.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginAdhocBackup(
        String vaultName, String resourceGroupName, String backupInstanceName, TriggerBackupRequest parameters);

    /**
     * Trigger adhoc backup.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginAdhocBackup(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        TriggerBackupRequest parameters,
        Context context);

    /**
     * Trigger adhoc backup.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void adhocBackup(
        String vaultName, String resourceGroupName, String backupInstanceName, TriggerBackupRequest parameters);

    /**
     * Trigger adhoc backup.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void adhocBackup(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        TriggerBackupRequest parameters,
        Context context);

    /**
     * Validate whether adhoc backup will be successful or not.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginValidateForBackup(
        String vaultName, String resourceGroupName, ValidateForBackupRequest parameters);

    /**
     * Validate whether adhoc backup will be successful or not.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginValidateForBackup(
        String vaultName, String resourceGroupName, ValidateForBackupRequest parameters, Context context);

    /**
     * Validate whether adhoc backup will be successful or not.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateForBackup(String vaultName, String resourceGroupName, ValidateForBackupRequest parameters);

    /**
     * Validate whether adhoc backup will be successful or not.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateForBackup(
        String vaultName, String resourceGroupName, ValidateForBackupRequest parameters, Context context);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The backupInstanceName parameter.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerRehydrate(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupRehydrationRequest parameters);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The backupInstanceName parameter.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerRehydrate(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupRehydrationRequest parameters,
        Context context);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The backupInstanceName parameter.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerRehydrate(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupRehydrationRequest parameters);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The backupInstanceName parameter.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerRehydrate(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupRehydrationRequest parameters,
        Context context);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerRestore(
        String vaultName, String resourceGroupName, String backupInstanceName, AzureBackupRestoreRequest parameters);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginTriggerRestore(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        AzureBackupRestoreRequest parameters,
        Context context);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerRestore(
        String vaultName, String resourceGroupName, String backupInstanceName, AzureBackupRestoreRequest parameters);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void triggerRestore(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        AzureBackupRestoreRequest parameters,
        Context context);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginValidateRestore(
        String vaultName, String resourceGroupName, String backupInstanceName, ValidateRestoreRequestObject parameters);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginValidateRestore(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        ValidateRestoreRequestObject parameters,
        Context context);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateRestore(
        String vaultName, String resourceGroupName, String backupInstanceName, ValidateRestoreRequestObject parameters);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateRestore(
        String vaultName,
        String resourceGroupName,
        String backupInstanceName,
        ValidateRestoreRequestObject parameters,
        Context context);
}
