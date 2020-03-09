/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.EventHubsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.EventhubNamespaceAuthorizationRule;

/**
 * Type representing EventHubs.
 */
public interface EventHubs extends SupportsCreating<Eventhub.DefinitionStages.Blank>, HasInner<EventHubsInner> {
    /**
     * Begins definition for a new AuthorizationRule resource.
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    EventhubNamespaceAuthorizationRule.DefinitionStages.Blank defineAuthorizationRule(String name);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Eventhub> getAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets all the Event Hubs in a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Eventhub> listByNamespaceAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes an Event Hub from the specified Namespace and resource group.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an AuthorizationRule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventhubNamespaceAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventhubNamespaceAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String eventHubName);

    /**
     * Deletes an Event Hub AuthorizationRule.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the AuthorizationRule Keys (PrimaryKey/SecondaryKey).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateAccessKeyParameters parameters);

}
