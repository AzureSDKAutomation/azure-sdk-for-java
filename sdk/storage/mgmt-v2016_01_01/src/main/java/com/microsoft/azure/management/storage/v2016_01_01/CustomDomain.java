/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2016_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The custom domain assigned to this storage account. This can be set via
 * Update.
 */
public class CustomDomain {
    /**
     * Gets or sets the custom domain name assigned to the storage account.
     * Name is the CNAME source.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     */
    @JsonProperty(value = "useSubDomainName")
    private Boolean useSubDomainName;

    /**
     * Get gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     *
     * @param name the name value to set
     * @return the CustomDomain object itself.
     */
    public CustomDomain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     *
     * @return the useSubDomainName value
     */
    public Boolean useSubDomainName() {
        return this.useSubDomainName;
    }

    /**
     * Set indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     *
     * @param useSubDomainName the useSubDomainName value to set
     * @return the CustomDomain object itself.
     */
    public CustomDomain withUseSubDomainName(Boolean useSubDomainName) {
        this.useSubDomainName = useSubDomainName;
        return this;
    }

}
