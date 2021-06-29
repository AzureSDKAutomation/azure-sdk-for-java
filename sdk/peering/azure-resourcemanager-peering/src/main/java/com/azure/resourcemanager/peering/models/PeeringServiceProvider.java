// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.resourcemanager.peering.fluent.models.PeeringServiceProviderInner;

/** An immutable client-side representation of PeeringServiceProvider. */
public interface PeeringServiceProvider {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the serviceProviderName property: The name of the service provider.
     *
     * @return the serviceProviderName value.
     */
    String serviceProviderName();

    /**
     * Gets the inner com.azure.resourcemanager.peering.fluent.models.PeeringServiceProviderInner object.
     *
     * @return the inner object.
     */
    PeeringServiceProviderInner innerModel();
}
