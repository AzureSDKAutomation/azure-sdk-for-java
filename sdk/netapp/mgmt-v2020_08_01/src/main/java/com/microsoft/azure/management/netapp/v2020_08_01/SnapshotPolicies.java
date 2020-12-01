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
import com.microsoft.azure.management.netapp.v2020_08_01.implementation.SnapshotPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SnapshotPolicies.
 */
public interface SnapshotPolicies extends SupportsCreating<SnapshotPolicy.DefinitionStages.Blank>, HasInner<SnapshotPoliciesInner> {
    /**
     * Get a snapshot Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param snapshotPolicyName The name of the snapshot policy target
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SnapshotPolicy> getAsync(String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * List snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SnapshotPolicy> listAsync(String resourceGroupName, String accountName);

    /**
     * Delete snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param snapshotPolicyName The name of the snapshot policy target
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String snapshotPolicyName);

    /**
     * Get volumes associated with snapshot policy.
     * Get volumes associated with snapshot policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param snapshotPolicyName The name of the snapshot policy target
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SnapshotPolicyVolumeList> listVolumesAsync(String resourceGroupName, String accountName, String snapshotPolicyName);

}
