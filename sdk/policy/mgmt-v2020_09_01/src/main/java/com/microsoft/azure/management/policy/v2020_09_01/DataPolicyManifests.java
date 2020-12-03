/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2020_09_01;

import rx.Observable;
import com.microsoft.azure.management.policy.v2020_09_01.implementation.DataPolicyManifestsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataPolicyManifests.
 */
public interface DataPolicyManifests extends HasInner<DataPolicyManifestsInner> {
    /**
     * Retrieves a data policy manifest.
     * This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataPolicyManifest> getByPolicyModeAsync(String policyMode);

    /**
     * Retrieves data policy manifests.
     * This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only includes all data policy manifests that have a namespace matching the provided value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataPolicyManifest> listAsync();

}
