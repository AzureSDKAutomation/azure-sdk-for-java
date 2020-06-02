/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.DomainTopicsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DomainTopics.
 */
public interface DomainTopics extends SupportsCreating<DomainTopic.DefinitionStages.Blank>, HasInner<DomainTopicsInner> {
    /**
     * Get a domain topic.
     * Get properties of a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainTopic> getAsync(String resourceGroupName, String domainName, String domainTopicName);

    /**
     * List domain topics.
     * List all the topics in a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DomainTopic> listByDomainAsync(final String resourceGroupName, final String domainName);

    /**
     * Delete a domain topic.
     * Delete existing domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String domainName, String domainTopicName);

}
