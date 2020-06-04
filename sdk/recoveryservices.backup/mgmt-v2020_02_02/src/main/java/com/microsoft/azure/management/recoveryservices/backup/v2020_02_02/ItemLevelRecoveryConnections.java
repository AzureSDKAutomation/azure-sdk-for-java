/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ItemLevelRecoveryConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ItemLevelRecoveryConnections.
 */
public interface ItemLevelRecoveryConnections extends HasInner<ItemLevelRecoveryConnectionsInner> {
    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
    explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status of
    provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
    for this backed up data.
     * @param parameters resource ILR request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable provisionAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource parameters);

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
    displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
    this backed up data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revokeAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId);

}
