// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedInstanceEncryptionProtectors. */
public interface ManagedInstanceEncryptionProtectors {
    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(
        String resourceGroupName, String managedInstanceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Revalidates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(
        String resourceGroupName,
        String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context);

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance encryption protectors.
     */
    PagedIterable<ManagedInstanceEncryptionProtector> listByInstance(
        String resourceGroupName, String managedInstanceName);

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance encryption protectors.
     */
    PagedIterable<ManagedInstanceEncryptionProtector> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector.
     */
    ManagedInstanceEncryptionProtector get(
        String resourceGroupName, String managedInstanceName, EncryptionProtectorName encryptionProtectorName);

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param encryptionProtectorName The name of the encryption protector to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector.
     */
    Response<ManagedInstanceEncryptionProtector> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context);

    /**
     * Gets a managed instance encryption protector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector.
     */
    ManagedInstanceEncryptionProtector getById(String id);

    /**
     * Gets a managed instance encryption protector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance encryption protector.
     */
    Response<ManagedInstanceEncryptionProtector> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedInstanceEncryptionProtector resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedInstanceEncryptionProtector definition.
     */
    ManagedInstanceEncryptionProtector.DefinitionStages.Blank define(EncryptionProtectorName name);
}
