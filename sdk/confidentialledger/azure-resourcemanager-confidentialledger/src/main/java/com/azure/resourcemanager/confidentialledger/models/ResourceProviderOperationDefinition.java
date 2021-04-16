// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.resourcemanager.confidentialledger.fluent.models.ResourceProviderOperationDefinitionInner;

/** An immutable client-side representation of ResourceProviderOperationDefinition. */
public interface ResourceProviderOperationDefinition {
    /**
     * Gets the name property: Resource provider operation name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is data action or not.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: Details about the operations.
     *
     * @return the display value.
     */
    ResourceProviderOperationDisplay display();

    /**
     * Gets the inner
     * com.azure.resourcemanager.confidentialledger.fluent.models.ResourceProviderOperationDefinitionInner object.
     *
     * @return the inner object.
     */
    ResourceProviderOperationDefinitionInner innerModel();
}
