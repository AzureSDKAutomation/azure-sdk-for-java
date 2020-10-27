/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PremiumMessagingRegionProperties model.
 */
public class PremiumMessagingRegionProperties {
    /**
     * Region code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Full name of the region.
     */
    @JsonProperty(value = "fullName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullName;

    /**
     * Get region code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get full name of the region.
     *
     * @return the fullName value
     */
    public String fullName() {
        return this.fullName;
    }

}
