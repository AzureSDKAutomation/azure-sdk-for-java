/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The check policy restrictions parameters describing the resource that is
 * being evaluated.
 */
public class CheckRestrictionsRequest {
    /**
     * The information about the resource that will be evaluated.
     */
    @JsonProperty(value = "resourceDetails", required = true)
    private CheckRestrictionsResourceDetails resourceDetails;

    /**
     * The list of fields and values that should be evaluated for potential
     * restrictions.
     */
    @JsonProperty(value = "pendingFields")
    private List<PendingField> pendingFields;

    /**
     * Get the information about the resource that will be evaluated.
     *
     * @return the resourceDetails value
     */
    public CheckRestrictionsResourceDetails resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the information about the resource that will be evaluated.
     *
     * @param resourceDetails the resourceDetails value to set
     * @return the CheckRestrictionsRequest object itself.
     */
    public CheckRestrictionsRequest withResourceDetails(CheckRestrictionsResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the list of fields and values that should be evaluated for potential restrictions.
     *
     * @return the pendingFields value
     */
    public List<PendingField> pendingFields() {
        return this.pendingFields;
    }

    /**
     * Set the list of fields and values that should be evaluated for potential restrictions.
     *
     * @param pendingFields the pendingFields value to set
     * @return the CheckRestrictionsRequest object itself.
     */
    public CheckRestrictionsRequest withPendingFields(List<PendingField> pendingFields) {
        this.pendingFields = pendingFields;
        return this;
    }

}
