/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.scheduler.v2016_03_01.implementation.JobCollectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing JobCollections.
 */
public interface JobCollections extends SupportsCreating<JobCollectionDefinition.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<JobCollectionDefinition>, SupportsListingByResourceGroup<JobCollectionDefinition>, SupportsListing<JobCollectionDefinition>, HasInner<JobCollectionsInner> {
    /**
     * Enables all of the jobs in the job collection.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableAsync(String resourceGroupName, String jobCollectionName);

    /**
     * Disables all of the jobs in the job collection.
     *
     * @param resourceGroupName The resource group name.
     * @param jobCollectionName The job collection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disableAsync(String resourceGroupName, String jobCollectionName);

}
