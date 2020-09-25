/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.QueuesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Queues.
 */
public interface Queues extends SupportsCreating<StorageQueue.DefinitionStages.Blank>, HasInner<QueuesInner> {
    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageQueue> getAsync(String resourceGroupName, String accountName, String queueName);

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String queueName);

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListQueue> listAsync(final String resourceGroupName, final String accountName);

}
