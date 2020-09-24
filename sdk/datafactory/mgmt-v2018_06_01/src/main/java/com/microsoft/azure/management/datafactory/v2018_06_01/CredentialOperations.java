/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.CredentialOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CredentialOperations.
 */
public interface CredentialOperations extends SupportsCreating<CredentialResource.DefinitionStages.Blank>, HasInner<CredentialOperationsInner> {
    /**
     * Gets a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CredentialResource> getAsync(String resourceGroupName, String factoryName, String credentialName);

    /**
     * List credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CredentialResource> listByFactoryAsync(final String resourceGroupName, final String factoryName);

    /**
     * Deletes a credential.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param credentialName Credential name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String factoryName, String credentialName);

}
