// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableMongodbCollectionGetResultInner;

/** An immutable client-side representation of RestorableMongodbCollectionGetResult. */
public interface RestorableMongodbCollectionGetResult {
    /**
     * Gets the id property: The unique resource Identifier of the ARM resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the ARM resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of Azure resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the resource property: The resource of an Azure Cosmos DB MongoDB collection event.
     *
     * @return the resource value.
     */
    RestorableMongodbCollectionPropertiesResource resource();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableMongodbCollectionGetResultInner
     * object.
     *
     * @return the inner object.
     */
    RestorableMongodbCollectionGetResultInner innerModel();
}
