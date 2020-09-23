/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.DisksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Disks.
 */
public interface Disks extends SupportsCreating<Disk.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Disk>, SupportsListingByResourceGroup<Disk>, SupportsListing<Disk>, HasInner<DisksInner> {
    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessUri> grantAccessAsync(String resourceGroupName, String diskName, GrantAccessData grantAccessData);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revokeAccessAsync(String resourceGroupName, String diskName);

}
