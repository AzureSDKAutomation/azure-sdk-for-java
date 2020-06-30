/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CIDR Ip address.
 */
public class CidrIpAddress {
    /**
     * Ip address itself.
     */
    @JsonProperty(value = "baseIpAddress")
    private String baseIpAddress;

    /**
     * The length of the prefix of the ip address.
     */
    @JsonProperty(value = "prefixLength")
    private Integer prefixLength;

    /**
     * Get ip address itself.
     *
     * @return the baseIpAddress value
     */
    public String baseIpAddress() {
        return this.baseIpAddress;
    }

    /**
     * Set ip address itself.
     *
     * @param baseIpAddress the baseIpAddress value to set
     * @return the CidrIpAddress object itself.
     */
    public CidrIpAddress withBaseIpAddress(String baseIpAddress) {
        this.baseIpAddress = baseIpAddress;
        return this;
    }

    /**
     * Get the length of the prefix of the ip address.
     *
     * @return the prefixLength value
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the length of the prefix of the ip address.
     *
     * @param prefixLength the prefixLength value to set
     * @return the CidrIpAddress object itself.
     */
    public CidrIpAddress withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

}
