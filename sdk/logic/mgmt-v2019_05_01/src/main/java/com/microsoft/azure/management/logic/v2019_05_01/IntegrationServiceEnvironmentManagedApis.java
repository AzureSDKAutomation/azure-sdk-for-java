/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2019_05_01.implementation.IntegrationServiceEnvironmentManagedApisInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IntegrationServiceEnvironmentManagedApis.
 */
public interface IntegrationServiceEnvironmentManagedApis extends SupportsCreating<ManagedApi.DefinitionStages.Blank>, HasInner<IntegrationServiceEnvironmentManagedApisInner> {
    /**
     * Gets the integration service environment managed Api.
     *
     * @param resourceGroup The resource group name.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param apiName The api name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedApi> getAsync(String resourceGroup, String integrationServiceEnvironmentName, String apiName);

    /**
     * Gets the integration service environment managed Apis.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedApi> listAsync(final String resourceGroup, final String integrationServiceEnvironmentName);

    /**
     * Deletes the integration service environment managed Api.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param apiName The api name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroup, String integrationServiceEnvironmentName, String apiName);

}
