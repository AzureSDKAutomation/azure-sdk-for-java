// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.resourcemanager.search.fluent.models.AdminKeyResultInner;

/** An immutable client-side representation of AdminKeyResult. */
public interface AdminKeyResult {
    /**
     * Gets the primaryKey property: The primary admin API key of the search service.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: The secondary admin API key of the search service.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the inner com.azure.resourcemanager.search.fluent.models.AdminKeyResultInner object.
     *
     * @return the inner object.
     */
    AdminKeyResultInner innerModel();
}
