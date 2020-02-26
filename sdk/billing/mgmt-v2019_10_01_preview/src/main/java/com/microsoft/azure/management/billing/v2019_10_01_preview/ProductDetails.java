/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the product to be transferred.
 */
public class ProductDetails {
    /**
     * Type of the product to be transferred. Possible values include:
     * 'AzureSubscription', 'AzureReservation'.
     */
    @JsonProperty(value = "productType")
    private ProductType productType;

    /**
     * Id of product to be transferred.
     */
    @JsonProperty(value = "productId")
    private String productId;

    /**
     * Get type of the product to be transferred. Possible values include: 'AzureSubscription', 'AzureReservation'.
     *
     * @return the productType value
     */
    public ProductType productType() {
        return this.productType;
    }

    /**
     * Set type of the product to be transferred. Possible values include: 'AzureSubscription', 'AzureReservation'.
     *
     * @param productType the productType value to set
     * @return the ProductDetails object itself.
     */
    public ProductDetails withProductType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get id of product to be transferred.
     *
     * @return the productId value
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Set id of product to be transferred.
     *
     * @param productId the productId value to set
     * @return the ProductDetails object itself.
     */
    public ProductDetails withProductId(String productId) {
        this.productId = productId;
        return this;
    }

}
