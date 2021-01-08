// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.AuthKeysInner;

/** An immutable client-side representation of AuthKeys. */
public interface AuthKeys {
    /**
     * Gets the primaryKey property: The primary key.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: The secondary key.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.AuthKeysInner object.
     *
     * @return the inner object.
     */
    AuthKeysInner innerModel();
}
