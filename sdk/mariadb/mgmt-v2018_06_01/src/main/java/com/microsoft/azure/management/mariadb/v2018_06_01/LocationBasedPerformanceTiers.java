/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import rx.Observable;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.LocationBasedPerformanceTiersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LocationBasedPerformanceTiers.
 */
public interface LocationBasedPerformanceTiers extends HasInner<LocationBasedPerformanceTiersInner> {
    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PerformanceTierProperties> listAsync(String locationName);

}
