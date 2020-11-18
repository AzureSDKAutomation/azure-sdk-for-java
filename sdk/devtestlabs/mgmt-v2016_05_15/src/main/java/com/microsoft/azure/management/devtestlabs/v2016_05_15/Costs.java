/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.CostsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Costs.
 */
public interface Costs extends SupportsCreating<LabCost.DefinitionStages.Blank>, HasInner<CostsInner> {
    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LabCost> getAsync(String resourceGroupName, String labName, String name);

}
