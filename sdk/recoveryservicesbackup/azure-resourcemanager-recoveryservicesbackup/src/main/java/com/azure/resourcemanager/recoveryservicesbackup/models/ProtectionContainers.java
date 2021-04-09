// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ProtectionContainers. */
public interface ProtectionContainers {
    /**
     * Gets details of the specific container registered to your Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container whose details need to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specific container registered to your Recovery Services Vault.
     */
    ProtectionContainerResource get(
        String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Gets details of the specific container registered to your Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container whose details need to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specific container registered to your Recovery Services Vault.
     */
    Response<ProtectionContainerResource> getWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String containerName, Context context);

    /**
     * Unregisters the given container from your Recovery Services Vault. This is an asynchronous operation. To
     * determine whether the backend service has finished processing the request, call Get Container Operation Result
     * API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container which needs to be unregistered from the Recovery Services Vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unregister(String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Unregisters the given container from your Recovery Services Vault. This is an asynchronous operation. To
     * determine whether the backend service has finished processing the request, call Get Container Operation Result
     * API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container which needs to be unregistered from the Recovery Services Vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> unregisterWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String containerName, Context context);

    /**
     * This is an async operation and the results should be tracked using location header or Azure-async-url.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric Name associated with the container.
     * @param containerName Name of the container in which inquiry needs to be triggered.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void inquire(String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * This is an async operation and the results should be tracked using location header or Azure-async-url.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric Name associated with the container.
     * @param containerName Name of the container in which inquiry needs to be triggered.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> inquireWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        Context context);

    /**
     * Discovers all the containers in the subscription that can be backed up to Recovery Services Vault. This is an
     * asynchronous operation. To know the status of the operation, call GetRefreshOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void refresh(String vaultName, String resourceGroupName, String fabricName);

    /**
     * Discovers all the containers in the subscription that can be backed up to Recovery Services Vault. This is an
     * asynchronous operation. To know the status of the operation, call GetRefreshOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated the container.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> refreshWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String filter, Context context);

    /**
     * Gets details of the specific container registered to your Recovery Services Vault.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specific container registered to your Recovery Services Vault.
     */
    ProtectionContainerResource getById(String id);

    /**
     * Gets details of the specific container registered to your Recovery Services Vault.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specific container registered to your Recovery Services Vault.
     */
    Response<ProtectionContainerResource> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ProtectionContainerResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProtectionContainerResource definition.
     */
    ProtectionContainerResource.DefinitionStages.Blank define(String name);
}
