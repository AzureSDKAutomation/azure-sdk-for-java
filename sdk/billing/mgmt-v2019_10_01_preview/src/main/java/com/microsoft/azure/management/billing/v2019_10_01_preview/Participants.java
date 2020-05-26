/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details about a participant.
 */
public class Participants {
    /**
     * The acceptance status of the participant.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The date when the status got changed.
     */
    @JsonProperty(value = "statusDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime statusDate;

    /**
     * The email address of the participant.
     */
    @JsonProperty(value = "email", access = JsonProperty.Access.WRITE_ONLY)
    private String email;

    /**
     * Get the acceptance status of the participant.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the date when the status got changed.
     *
     * @return the statusDate value
     */
    public DateTime statusDate() {
        return this.statusDate;
    }

    /**
     * Get the email address of the participant.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

}
