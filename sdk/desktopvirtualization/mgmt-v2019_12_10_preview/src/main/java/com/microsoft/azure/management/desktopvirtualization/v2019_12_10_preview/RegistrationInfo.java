/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a RegistrationInfo definition.
 */
public class RegistrationInfo {
    /**
     * Expiration time of registration token.
     */
    @JsonProperty(value = "expirationTime")
    private DateTime expirationTime;

    /**
     * The registration token base64 encoded string.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * The type of resetting the token. Possible values include: 'Delete',
     * 'None', 'Update'.
     */
    @JsonProperty(value = "registrationTokenOperation")
    private RegistrationTokenOperation registrationTokenOperation;

    /**
     * Get expiration time of registration token.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set expiration time of registration token.
     *
     * @param expirationTime the expirationTime value to set
     * @return the RegistrationInfo object itself.
     */
    public RegistrationInfo withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get the registration token base64 encoded string.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the registration token base64 encoded string.
     *
     * @param token the token value to set
     * @return the RegistrationInfo object itself.
     */
    public RegistrationInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the type of resetting the token. Possible values include: 'Delete', 'None', 'Update'.
     *
     * @return the registrationTokenOperation value
     */
    public RegistrationTokenOperation registrationTokenOperation() {
        return this.registrationTokenOperation;
    }

    /**
     * Set the type of resetting the token. Possible values include: 'Delete', 'None', 'Update'.
     *
     * @param registrationTokenOperation the registrationTokenOperation value to set
     * @return the RegistrationInfo object itself.
     */
    public RegistrationInfo withRegistrationTokenOperation(RegistrationTokenOperation registrationTokenOperation) {
        this.registrationTokenOperation = registrationTokenOperation;
        return this;
    }

}
