/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pre-backup validation for Azure VM Workload provider.
 */
public class PreBackupValidation {
    /**
     * Status of protectable item, i.e. InProgress,Succeeded,Failed. Possible
     * values include: 'Invalid', 'Success', 'Failed'.
     */
    @JsonProperty(value = "status")
    private InquiryStatus status;

    /**
     * Error code of protectable item.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Message corresponding to the error code for the protectable item.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get status of protectable item, i.e. InProgress,Succeeded,Failed. Possible values include: 'Invalid', 'Success', 'Failed'.
     *
     * @return the status value
     */
    public InquiryStatus status() {
        return this.status;
    }

    /**
     * Set status of protectable item, i.e. InProgress,Succeeded,Failed. Possible values include: 'Invalid', 'Success', 'Failed'.
     *
     * @param status the status value to set
     * @return the PreBackupValidation object itself.
     */
    public PreBackupValidation withStatus(InquiryStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get error code of protectable item.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code of protectable item.
     *
     * @param code the code value to set
     * @return the PreBackupValidation object itself.
     */
    public PreBackupValidation withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get message corresponding to the error code for the protectable item.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message corresponding to the error code for the protectable item.
     *
     * @param message the message value to set
     * @return the PreBackupValidation object itself.
     */
    public PreBackupValidation withMessage(String message) {
        this.message = message;
        return this;
    }

}
