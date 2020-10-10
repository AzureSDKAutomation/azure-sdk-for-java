/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.PrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources extends HasInner<PrivateLinkResourcesInner> {
    /**
     * List private link resources.
     * List private link resources for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResource> listAsync(String resourceGroupName, String resourceName);

    /**
     * Get the specified private link resource.
     * Get the specified private link resource for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param groupId The name of the private link resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GroupIdInformation> getAsync(String resourceGroupName, String resourceName, String groupId);

}
