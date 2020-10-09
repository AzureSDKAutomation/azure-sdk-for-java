/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_03_01_preview.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result returned from a check name availability request.
 */
public class CheckNameResultInner {
    /**
     * Specifies a Boolean value that indicates if the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * Message indicating an unavailable name due to a conflict, or a
     * description of the naming rules that are violated.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Message providing the reason why the given name is invalid. Possible
     * values include: 'NameIsAvailable', 'NameConflict', 'InvalidName'.
     */
    @JsonProperty(value = "reason")
    private Reason reason;

    /**
     * Get specifies a Boolean value that indicates if the name is available.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set specifies a Boolean value that indicates if the name is available.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get message indicating an unavailable name due to a conflict, or a description of the naming rules that are violated.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message indicating an unavailable name due to a conflict, or a description of the naming rules that are violated.
     *
     * @param message the message value to set
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message providing the reason why the given name is invalid. Possible values include: 'NameIsAvailable', 'NameConflict', 'InvalidName'.
     *
     * @return the reason value
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Set message providing the reason why the given name is invalid. Possible values include: 'NameIsAvailable', 'NameConflict', 'InvalidName'.
     *
     * @param reason the reason value to set
     * @return the CheckNameResultInner object itself.
     */
    public CheckNameResultInner withReason(Reason reason) {
        this.reason = reason;
        return this;
    }

}
