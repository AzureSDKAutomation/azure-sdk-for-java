// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner;

/** An immutable client-side representation of OperationsDefinition. */
public interface OperationsDefinition {
    /**
     * Gets the name property: Name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the origin property: The origin property.
     *
     * @return the origin value.
     */
    OperationsDefinitionOrigin origin();

    /**
     * Gets the display property: Display information of the operation.
     *
     * @return the display value.
     */
    OperationsDefinitionDisplay display();

    /**
     * Gets the actionType property: The actionType property.
     *
     * @return the actionType value.
     */
    OperationsDefinitionActionType actionType();

    /**
     * Gets the properties property: Any object.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner object.
     *
     * @return the inner object.
     */
    OperationsDefinitionInner innerModel();
}
