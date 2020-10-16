/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information for technical support ticket.
 */
public class TechnicalTicketDetails {
    /**
     * This is the resource id of the Azure service resource (For example: A
     * virtual machine resource or an HDInsight resource) for which the support
     * ticket is created.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get this is the resource id of the Azure service resource (For example: A virtual machine resource or an HDInsight resource) for which the support ticket is created.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set this is the resource id of the Azure service resource (For example: A virtual machine resource or an HDInsight resource) for which the support ticket is created.
     *
     * @param resourceId the resourceId value to set
     * @return the TechnicalTicketDetails object itself.
     */
    public TechnicalTicketDetails withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
