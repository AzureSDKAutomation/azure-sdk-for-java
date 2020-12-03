/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2016_06_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2016_06_01.implementation.SubscriptionInner;

/**
 * Type representing Subscription.
 */
public interface Subscription extends HasInner<SubscriptionInner>, HasManager<ResourcesManager> {
    /**
     * @return the authorizationSource value.
     */
    String authorizationSource();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the state value.
     */
    SubscriptionState state();

    /**
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * @return the subscriptionPolicies value.
     */
    SubscriptionPolicies subscriptionPolicies();

}
