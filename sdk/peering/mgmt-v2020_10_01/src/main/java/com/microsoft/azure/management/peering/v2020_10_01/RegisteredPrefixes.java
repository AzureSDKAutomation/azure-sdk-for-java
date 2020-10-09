/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_10_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.peering.v2020_10_01.implementation.RegisteredPrefixesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RegisteredPrefixes.
 */
public interface RegisteredPrefixes extends SupportsCreating<PeeringRegisteredPrefix.DefinitionStages.Blank>, HasInner<RegisteredPrefixesInner> {
    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringRegisteredPrefix> getAsync(String resourceGroupName, String peeringName, String registeredPrefixName);

    /**
     * Lists all registered prefixes under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringRegisteredPrefix> listByPeeringAsync(final String resourceGroupName, final String peeringName);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String peeringName, String registeredPrefixName);

}
