// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.AuthTokenInner;

/** An immutable client-side representation of AuthToken. */
public interface AuthToken {
    /**
     * Gets the accessToken property: Access token.
     *
     * @return the accessToken value.
     */
    String accessToken();

    /**
     * Gets the tokenType property: Access token type.
     *
     * @return the tokenType value.
     */
    String tokenType();

    /**
     * Gets the expiryTimeUtc property: Access token expiry time (UTC).
     *
     * @return the expiryTimeUtc value.
     */
    Long expiryTimeUtc();

    /**
     * Gets the refreshAfterTimeUtc property: Refresh access token after time (UTC).
     *
     * @return the refreshAfterTimeUtc value.
     */
    Long refreshAfterTimeUtc();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.AuthTokenInner object.
     *
     * @return the inner object.
     */
    AuthTokenInner innerModel();
}
