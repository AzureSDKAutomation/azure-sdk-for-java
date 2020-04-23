/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.iotcentral.v2020_03_01.implementation.AppsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Apps.
 */
public interface Apps extends SupportsCreating<App.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<App>, SupportsListingByResourceGroup<App>, SupportsListing<App>, HasInner<AppsInner> {
    /**
     * Check if an IoT Central application name is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the name of the IoT Central application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppAvailabilityInfo> checkNameAvailabilityAsync(OperationInputs operationInputs);

    /**
     * Check if an IoT Central application subdomain is available.
     *
     * @param operationInputs Set the name parameter in the OperationInputs structure to the subdomain of the IoT Central application to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppAvailabilityInfo> checkSubdomainAvailabilityAsync(OperationInputs operationInputs);

    /**
     * Get all available application templates.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppTemplate> listTemplatesAsync();

}
