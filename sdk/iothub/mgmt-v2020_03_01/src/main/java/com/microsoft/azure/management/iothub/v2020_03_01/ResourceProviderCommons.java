/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.ResourceProviderCommonsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResourceProviderCommons.
 */
public interface ResourceProviderCommons extends HasInner<ResourceProviderCommonsInner> {
    /**
     * Get the number of iot hubs in the subscription.
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UserSubscriptionQuota> listAsync();

}
