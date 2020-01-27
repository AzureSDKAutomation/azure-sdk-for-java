/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.managementgroups.v2020_03_01.implementation.ManagementGroupsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.managementgroups.v2020_03_01.DescendantInfo;

/**
 * Type representing ManagementGroups.
 */
public interface ManagementGroups extends HasInner<ManagementGroupsInner> {
    /**
     * Get the details of the management group.
     *
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementGroup> getAsync(String groupId);

    /**
     * Create or update a management group. If a management group is already created and a subsequent create request is issued with different properties, the management group properties will be updated.
     *
     * @param groupId Management Group ID.
     * @param createManagementGroupRequest Management group creation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> createOrUpdateAsync(String groupId, CreateManagementGroupRequest createManagementGroupRequest);

    /**
     * Delete management group. If a management group contains child resources, the request will fail.
     *
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationResults> deleteAsync(String groupId);

    /**
     * List management groups for the authenticated user .
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementGroupInfo> listAsync();

    /**
     * List all entities that descend from a management group.
     *
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DescendantInfo> getDescendantsAsync(final String groupId);

}
