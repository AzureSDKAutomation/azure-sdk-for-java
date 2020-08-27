/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SharedPrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SharedPrivateLinkResources.
 */
public interface SharedPrivateLinkResources extends SupportsCreating<SharedPrivateLinkResource.DefinitionStages.Blank>, HasInner<SharedPrivateLinkResourcesInner> {
    /**
     * Gets the details of the shared private link resource managed by the Search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive Search service within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SharedPrivateLinkResource> getAsync(String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName);

    /**
     * Gets a list of all shared private link resources managed by the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SharedPrivateLinkResource> listByServiceAsync(final String resourceGroupName, final String searchServiceName);

    /**
     * Initiates the deletion of the shared private link resource from the Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive Search service within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName);

}
