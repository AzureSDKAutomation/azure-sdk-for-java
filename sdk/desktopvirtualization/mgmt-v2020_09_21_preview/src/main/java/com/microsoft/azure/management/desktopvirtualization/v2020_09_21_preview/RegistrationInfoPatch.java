/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a RegistrationInfo definition.
 */
public class RegistrationInfoPatch {
    /**
     * Expiration time of registration token.
     */
    @JsonProperty(value = "expirationTime")
    private DateTime expirationTime;

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
     * @return the RegistrationInfoPatch object itself.
     */
    public RegistrationInfoPatch withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
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
     * @return the RegistrationInfoPatch object itself.
     */
    public RegistrationInfoPatch withRegistrationTokenOperation(RegistrationTokenOperation registrationTokenOperation) {
        this.registrationTokenOperation = registrationTokenOperation;
        return this;
    }

}
