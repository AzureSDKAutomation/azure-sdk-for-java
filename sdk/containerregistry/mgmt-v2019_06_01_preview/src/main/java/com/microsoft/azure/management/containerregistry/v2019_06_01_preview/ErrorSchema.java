/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response from the Azure Container Registry service.
 */
public class ErrorSchema {
    /**
     * Azure container registry build API error body.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get azure container registry build API error body.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set azure container registry build API error body.
     *
     * @param error the error value to set
     * @return the ErrorSchema object itself.
     */
    public ErrorSchema withError(Error error) {
        this.error = error;
        return this;
    }

}
