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
 * Request parameters to update auto renew for support product.
 */
public class UpdateAutoRenewRequest {
    /**
     * Request parameters to update auto renew policy a product. Possible
     * values include: 'true', 'false'.
     */
    @JsonProperty(value = "autoRenew")
    private UpdateAutoRenew autoRenew;

    /**
     * Get request parameters to update auto renew policy a product. Possible values include: 'true', 'false'.
     *
     * @return the autoRenew value
     */
    public UpdateAutoRenew autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set request parameters to update auto renew policy a product. Possible values include: 'true', 'false'.
     *
     * @param autoRenew the autoRenew value to set
     * @return the UpdateAutoRenewRequest object itself.
     */
    public UpdateAutoRenewRequest withAutoRenew(UpdateAutoRenew autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

}
