/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.bing.v2020_06_10_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of Bing account.
 */
public class BingAccountProperties {
    /**
     * Gets the status of the Bing account at the time the operation was
     * called. Possible values include: 'Creating', 'Moving', 'Deleting',
     * 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Endpoint of the created account.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * The internal identifier.
     */
    @JsonProperty(value = "internalId", access = JsonProperty.Access.WRITE_ONLY)
    private String internalId;

    /**
     * (Bing Search Only) The flag to enable statistics of Bing Search.
     */
    @JsonProperty(value = "statisticsEnabled")
    private Boolean statisticsEnabled;

    /**
     * Get gets the status of the Bing account at the time the operation was called. Possible values include: 'Creating', 'Moving', 'Deleting', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get endpoint of the created account.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the internal identifier.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Get (Bing Search Only) The flag to enable statistics of Bing Search.
     *
     * @return the statisticsEnabled value
     */
    public Boolean statisticsEnabled() {
        return this.statisticsEnabled;
    }

    /**
     * Set (Bing Search Only) The flag to enable statistics of Bing Search.
     *
     * @param statisticsEnabled the statisticsEnabled value to set
     * @return the BingAccountProperties object itself.
     */
    public BingAccountProperties withStatisticsEnabled(Boolean statisticsEnabled) {
        this.statisticsEnabled = statisticsEnabled;
        return this;
    }

}
