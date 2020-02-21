/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filters for showing the available skus.
 */
public class AvailableSkuRequest {
    /**
     * Type of the transfer.
     */
    @JsonProperty(value = "transferType", required = true)
    private String transferType;

    /**
     * ISO country code. Country for hardware shipment. For codes check:
     * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * Location for data transfer. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Sku Names to filter for available skus.
     */
    @JsonProperty(value = "skuNames")
    private List<SkuName> skuNames;

    /**
     * Creates an instance of AvailableSkuRequest class.
     * @param country iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     * @param location location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     */
    public AvailableSkuRequest() {
        transferType = "ImportToAzure";
    }

    /**
     * Get type of the transfer.
     *
     * @return the transferType value
     */
    public String transferType() {
        return this.transferType;
    }

    /**
     * Set type of the transfer.
     *
     * @param transferType the transferType value to set
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set iSO country code. Country for hardware shipment. For codes check: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements.
     *
     * @param country the country value to set
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location for data transfer. For locations check: https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @param location the location value to set
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get sku Names to filter for available skus.
     *
     * @return the skuNames value
     */
    public List<SkuName> skuNames() {
        return this.skuNames;
    }

    /**
     * Set sku Names to filter for available skus.
     *
     * @param skuNames the skuNames value to set
     * @return the AvailableSkuRequest object itself.
     */
    public AvailableSkuRequest withSkuNames(List<SkuName> skuNames) {
        this.skuNames = skuNames;
        return this;
    }

}
