/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to check name availability. It contains a flag and
 * possible reason of failure.
 */
public class NameAvailabilityInner {
    /**
     * Indicates whether the name is available or not.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * The reason of the availability. Required if name is not available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * The message of the operation.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get indicates whether the name is available or not.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set indicates whether the name is available or not.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason of the availability. Required if name is not available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason of the availability. Required if name is not available.
     *
     * @param reason the reason value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message of the operation.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message of the operation.
     *
     * @param message the message value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
