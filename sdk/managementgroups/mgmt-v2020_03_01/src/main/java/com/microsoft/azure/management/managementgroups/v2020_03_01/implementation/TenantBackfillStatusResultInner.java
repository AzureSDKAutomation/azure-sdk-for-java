/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01.implementation;

import com.microsoft.azure.management.managementgroups.v2020_03_01.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The tenant backfill status.
 */
public class TenantBackfillStatusResultInner {
    /**
     * The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The status of the Tenant Backfill. Possible values include:
     * 'NotStarted', 'NotStartedButGroupsExist', 'Started', 'Failed',
     * 'Cancelled', 'Completed'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /**
     * Get the AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the status of the Tenant Backfill. Possible values include: 'NotStarted', 'NotStartedButGroupsExist', 'Started', 'Failed', 'Cancelled', 'Completed'.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

}
