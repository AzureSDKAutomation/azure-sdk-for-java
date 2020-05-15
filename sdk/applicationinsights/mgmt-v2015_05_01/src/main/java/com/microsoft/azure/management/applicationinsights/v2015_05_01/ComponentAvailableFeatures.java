/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ComponentAvailableFeaturesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ComponentAvailableFeatures.
 */
public interface ComponentAvailableFeatures extends HasInner<ComponentAvailableFeaturesInner> {
    /**
     * Returns all available features of the application insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentAvailableFeatures> getAsync(String resourceGroupName, String resourceName);

}
