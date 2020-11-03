/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_11_01.implementation.PrivateLinkResourceInner;
import com.microsoft.azure.management.containerservice.v2020_11_01.implementation.ResolvePrivateLinkServiceIdsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResolvePrivateLinkServiceIds.
 */
public interface ResolvePrivateLinkServiceIds extends HasInner<ResolvePrivateLinkServiceIdsInner> {
    /**
     * Gets the private link service ID for the specified managed cluster.
     * Gets the private link service ID the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters (name, groupId) supplied in order to resolve a private link service ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> pOSTAsync(String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters);

}
