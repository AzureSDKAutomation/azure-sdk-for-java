/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.SubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Subscriptions.
 */
public interface Subscriptions extends SupportsCreating<SubscriptionContract.DefinitionStages.Blank>, HasInner<SubscriptionsInner> {
    /**
     * Lists all subscriptions of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSubscriptionContract> listAsync(final String resourceGroupName, final String serviceName);

    /**
     * Gets the entity state (Etag) version of the apimanagement subscription specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String sid);

    /**
     * Gets the specified Subscription entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSubscriptionContract> getAsync(String resourceGroupName, String serviceName, String sid);

    /**
     * Deletes the specified subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String sid, String ifMatch);

    /**
     * Regenerates primary key of existing subscription of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName, String sid);

    /**
     * Regenerates secondary key of existing subscription of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName, String sid);

}
