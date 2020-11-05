/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tenant Id information.
 */
public class TenantIdDescriptionInner {
    /**
     * The fully qualified ID of the tenant. For example,
     * /tenants/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Country/region name of the address for the tenant.
     */
    @JsonProperty(value = "country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /**
     * Country/region abbreviation for the tenant.
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /**
     * The display name of the tenant.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The list of domains for the tenant.
     */
    @JsonProperty(value = "domains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> domains;

    /**
     * Get the fully qualified ID of the tenant. For example, /tenants/00000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get country/region name of the address for the tenant.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Get country/region abbreviation for the tenant.
     *
     * @return the countryCode value
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Get the display name of the tenant.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the list of domains for the tenant.
     *
     * @return the domains value
     */
    public List<String> domains() {
        return this.domains;
    }

}
