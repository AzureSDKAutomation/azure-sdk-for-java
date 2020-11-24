/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of a request to check the availability of a container registry
 * name.
 */
public class RegistryNameStatusInner {
    /**
     * The value that indicates whether the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * If any, the reason that the name is not available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * If any, the error message that provides more detail for the reason that
     * the name is not available.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the value that indicates whether the name is available.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the value that indicates whether the name is available.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get if any, the reason that the name is not available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set if any, the reason that the name is not available.
     *
     * @param reason the reason value to set
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get if any, the error message that provides more detail for the reason that the name is not available.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set if any, the error message that provides more detail for the reason that the name is not available.
     *
     * @param message the message value to set
     * @return the RegistryNameStatusInner object itself.
     */
    public RegistryNameStatusInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
