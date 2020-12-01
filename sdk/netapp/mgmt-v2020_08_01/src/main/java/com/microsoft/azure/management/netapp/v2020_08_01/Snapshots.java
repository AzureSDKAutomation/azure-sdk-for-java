/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_08_01.implementation.SnapshotsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Snapshots.
 */
public interface Snapshots extends SupportsCreating<Snapshot.DefinitionStages.Blank>, HasInner<SnapshotsInner> {
    /**
     * Describe a snapshot.
     * Get details of the specified snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param snapshotName The name of the mount target
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Snapshot> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String snapshotName);

    /**
     * Describe all snapshots.
     * List all snapshots associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Snapshot> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Delete a snapshot.
     * Delete snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param snapshotName The name of the mount target
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String snapshotName);

}
