/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2020_07_01;

import rx.Observable;

/**
 * Type representing PolicyTrackedResources.
 */
public interface PolicyTrackedResources {
    /**
     * Queries policy tracked resources under the management group.
     *
     * @param managementGroupName Management group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyTrackedResource> listQueryResultsForManagementGroupAsync(final String managementGroupName);

    /**
     * Queries policy tracked resources under the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyTrackedResource> listQueryResultsForSubscriptionAsync(final String subscriptionId);

    /**
     * Queries policy tracked resources under the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyTrackedResource> listQueryResultsForResourceGroupAsync(final String resourceGroupName, final String subscriptionId);

    /**
     * Queries policy tracked resources under the resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyTrackedResource> listQueryResultsForResourceAsync(final String resourceId);

}
