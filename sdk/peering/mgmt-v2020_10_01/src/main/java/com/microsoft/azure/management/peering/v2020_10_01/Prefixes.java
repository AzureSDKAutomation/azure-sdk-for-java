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
import com.microsoft.azure.management.peering.v2020_10_01.implementation.PrefixesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Prefixes.
 */
public interface Prefixes extends SupportsCreating<PeeringServicePrefix.DefinitionStages.Blank>, HasInner<PrefixesInner> {
    /**
     * Gets an existing prefix with the specified name under the given subscription, resource group and peering service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringServiceName The name of the peering service.
     * @param prefixName The name of the prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringServicePrefix> getAsync(String resourceGroupName, String peeringServiceName, String prefixName);

    /**
     * Lists all prefixes under the given subscription, resource group and peering service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringServiceName The name of the peering service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringServicePrefix> listByPeeringServiceAsync(final String resourceGroupName, final String peeringServiceName);

    /**
     * Deletes an existing prefix with the specified name under the given subscription, resource group and peering service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringServiceName The name of the peering service.
     * @param prefixName The name of the prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String peeringServiceName, String prefixName);

}
