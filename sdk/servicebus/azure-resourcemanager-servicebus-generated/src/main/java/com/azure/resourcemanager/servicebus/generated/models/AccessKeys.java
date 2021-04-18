// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.resourcemanager.servicebus.generated.fluent.models.AccessKeysInner;

/** An immutable client-side representation of AccessKeys. */
public interface AccessKeys {
    /**
     * Gets the primaryConnectionString property: Primary connection string of the created namespace authorization rule.
     *
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * Gets the secondaryConnectionString property: Secondary connection string of the created namespace authorization
     * rule.
     *
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * Gets the aliasPrimaryConnectionString property: Primary connection string of the alias if GEO DR is enabled.
     *
     * @return the aliasPrimaryConnectionString value.
     */
    String aliasPrimaryConnectionString();

    /**
     * Gets the aliasSecondaryConnectionString property: Secondary connection string of the alias if GEO DR is enabled.
     *
     * @return the aliasSecondaryConnectionString value.
     */
    String aliasSecondaryConnectionString();

    /**
     * Gets the primaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the keyName property: A string that describes the authorization rule.
     *
     * @return the keyName value.
     */
    String keyName();

    /**
     * Gets the inner com.azure.resourcemanager.servicebus.generated.fluent.models.AccessKeysInner object.
     *
     * @return the inner object.
     */
    AccessKeysInner innerModel();
}
