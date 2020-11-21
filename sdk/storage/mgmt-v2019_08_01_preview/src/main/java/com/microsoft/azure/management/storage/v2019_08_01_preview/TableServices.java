/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.TableServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TableServices.
 */
public interface TableServices extends SupportsCreating<TableServiceProperties.DefinitionStages.Blank>, HasInner<TableServicesInner> {
    /**
     * List all table services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListTableServices> listAsync(String resourceGroupName, String accountName);

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TableServiceProperties> getServicePropertiesAsync(String resourceGroupName, String accountName);

}
