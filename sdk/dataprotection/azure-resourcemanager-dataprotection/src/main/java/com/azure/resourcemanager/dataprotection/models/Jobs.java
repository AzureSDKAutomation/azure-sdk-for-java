// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Returns list of jobs belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources.
     */
    PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName);

    /**
     * Returns list of jobs belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources.
     */
    PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName, Context context);
}
