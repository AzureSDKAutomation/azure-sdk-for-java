/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Create operation.
 */
public class InvoiceSectionsCreateHeaders {
    /**
     * Location URI to poll for result.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Recommends the retryable time after receiving this.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * URI to poll for the operation status.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Get location URI to poll for result.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location URI to poll for result.
     *
     * @param location the location value to set
     * @return the InvoiceSectionsCreateHeaders object itself.
     */
    public InvoiceSectionsCreateHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get recommends the retryable time after receiving this.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set recommends the retryable time after receiving this.
     *
     * @param retryAfter the retryAfter value to set
     * @return the InvoiceSectionsCreateHeaders object itself.
     */
    public InvoiceSectionsCreateHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get uRI to poll for the operation status.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set uRI to poll for the operation status.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the InvoiceSectionsCreateHeaders object itself.
     */
    public InvoiceSectionsCreateHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

}
