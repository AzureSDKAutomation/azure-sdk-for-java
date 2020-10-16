/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the billing related details of a Azure Spot VM or VMSS.
 * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
 */
public class BillingProfile {
    /**
     * Specifies the maximum price you are willing to pay for a Azure Spot
     * VM/VMSS. This price is in US Dollars. &lt;br&gt;&lt;br&gt; This price
     * will be compared with the current Azure Spot price for the VM size.
     * Also, the prices are compared at the time of create/update of Azure Spot
     * VM/VMSS and the operation will only succeed if  the maxPrice is greater
     * than the current Azure Spot price. &lt;br&gt;&lt;br&gt; The maxPrice
     * will also be used for evicting a Azure Spot VM/VMSS if the current Azure
     * Spot price goes beyond the maxPrice after creation of VM/VMSS.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; - Any
     * decimal value greater than zero. Example: 0.01538 &lt;br&gt;&lt;br&gt;
     * -1 – indicates default price to be up-to on-demand. &lt;br&gt;&lt;br&gt;
     * You can set the maxPrice to -1 to indicate that the Azure Spot VM/VMSS
     * should not be evicted for price reasons. Also, the default max price is
     * -1 if it is not provided by you. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     */
    @JsonProperty(value = "maxPrice")
    private Double maxPrice;

    /**
     * Get specifies the maximum price you are willing to pay for a Azure Spot VM/VMSS. This price is in US Dollars. &lt;br&gt;&lt;br&gt; This price will be compared with the current Azure Spot price for the VM size. Also, the prices are compared at the time of create/update of Azure Spot VM/VMSS and the operation will only succeed if  the maxPrice is greater than the current Azure Spot price. &lt;br&gt;&lt;br&gt; The maxPrice will also be used for evicting a Azure Spot VM/VMSS if the current Azure Spot price goes beyond the maxPrice after creation of VM/VMSS. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; - Any decimal value greater than zero. Example: 0.01538 &lt;br&gt;&lt;br&gt; -1 – indicates default price to be up-to on-demand. &lt;br&gt;&lt;br&gt; You can set the maxPrice to -1 to indicate that the Azure Spot VM/VMSS should not be evicted for price reasons. Also, the default max price is -1 if it is not provided by you. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the maxPrice value
     */
    public Double maxPrice() {
        return this.maxPrice;
    }

    /**
     * Set specifies the maximum price you are willing to pay for a Azure Spot VM/VMSS. This price is in US Dollars. &lt;br&gt;&lt;br&gt; This price will be compared with the current Azure Spot price for the VM size. Also, the prices are compared at the time of create/update of Azure Spot VM/VMSS and the operation will only succeed if  the maxPrice is greater than the current Azure Spot price. &lt;br&gt;&lt;br&gt; The maxPrice will also be used for evicting a Azure Spot VM/VMSS if the current Azure Spot price goes beyond the maxPrice after creation of VM/VMSS. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; - Any decimal value greater than zero. Example: 0.01538 &lt;br&gt;&lt;br&gt; -1 – indicates default price to be up-to on-demand. &lt;br&gt;&lt;br&gt; You can set the maxPrice to -1 to indicate that the Azure Spot VM/VMSS should not be evicted for price reasons. Also, the default max price is -1 if it is not provided by you. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param maxPrice the maxPrice value to set
     * @return the BillingProfile object itself.
     */
    public BillingProfile withMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

}
