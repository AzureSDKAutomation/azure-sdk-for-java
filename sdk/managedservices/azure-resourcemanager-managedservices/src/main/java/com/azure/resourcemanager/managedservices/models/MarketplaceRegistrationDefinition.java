// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.resourcemanager.managedservices.fluent.models.MarketplaceRegistrationDefinitionInner;

/** An immutable client-side representation of MarketplaceRegistrationDefinition. */
public interface MarketplaceRegistrationDefinition {
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
     * Gets the properties property: The properties of the marketplace registration definition.
     *
     * @return the properties value.
     */
    MarketplaceRegistrationDefinitionProperties properties();

    /**
     * Gets the plan property: The details for the Managed Services offer’s plan in Azure Marketplace.
     *
     * @return the plan value.
     */
    Plan plan();

    /**
     * Gets the inner com.azure.resourcemanager.managedservices.fluent.models.MarketplaceRegistrationDefinitionInner
     * object.
     *
     * @return the inner object.
     */
    MarketplaceRegistrationDefinitionInner innerModel();
}
