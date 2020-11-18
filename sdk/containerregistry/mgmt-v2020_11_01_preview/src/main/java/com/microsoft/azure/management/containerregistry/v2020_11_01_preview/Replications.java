/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.ReplicationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Replications.
 */
public interface Replications extends SupportsCreating<Replication.DefinitionStages.Blank>, HasInner<ReplicationsInner> {
    /**
     * Gets the properties of the specified replication.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Replication> getAsync(String resourceGroupName, String registryName, String replicationName);

    /**
     * Lists all the replications for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Replication> listAsync(final String resourceGroupName, final String registryName);

    /**
     * Deletes a replication from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String registryName, String replicationName);

}
