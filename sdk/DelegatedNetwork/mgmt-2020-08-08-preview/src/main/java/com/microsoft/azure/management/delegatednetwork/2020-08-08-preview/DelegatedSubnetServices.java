/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import rx.Observable;
import rx.Completable;

/**
 * Type representing DelegatedSubnetServices.
 */
public interface DelegatedSubnetServices {
    /**
     * Begins definition for a new DelegatedSubnet resource.
     * @param name resource name.
     * @return the first stage of the new DelegatedSubnet definition.
     */
    DelegatedSubnet.DefinitionStages.Blank defineDelegatedSubnet(String name);

    /**
     * Get all the DelegatedSubnets resources in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DelegatedSubnet> listAsync();

    /**
     * Get all the DelegatedSubnets resources in a resource group.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given DelegatedNetwork resource is part. This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DelegatedSubnet> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets details about the specified dnc DelegatedSubnet Link.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given DelegatedNetwork resource is part. This name must be at least 1 character in length, and no more than 90.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vnetName The name of the virtual network. This name must be at least 1 character in length, and no more than 90.
     * @param subnetName The name of the delegated subnet. This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DelegatedSubnet> getDetailsAsync(String resourceGroupName, String resourceName, String vnetName, String subnetName);

    /**
     * Delete dnc DelegatedSubnet.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given DelegatedNetwork resource is part. This name must be at least 1 character in length, and no more than 90.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vnetName The name of the virtual network. This name must be at least 1 character in length, and no more than 90.
     * @param subnetName The name of the delegated subnet. This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteDetailsAsync(String resourceGroupName, String resourceName, String vnetName, String subnetName);

}
