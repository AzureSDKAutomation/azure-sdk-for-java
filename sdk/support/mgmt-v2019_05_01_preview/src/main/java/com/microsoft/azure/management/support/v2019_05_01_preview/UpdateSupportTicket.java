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
 * Updates severity and contact details in the support ticket.
 */
public class UpdateSupportTicket {
    /**
     * Severity level. Possible values include: 'minimal', 'moderate',
     * 'critical'.
     */
    @JsonProperty(value = "severity")
    private SeverityLevel severity;

    /**
     * Contact details to be updated on the support ticket.
     */
    @JsonProperty(value = "contactDetails")
    private UpdateContactProfile contactDetails;

    /**
     * Get severity level. Possible values include: 'minimal', 'moderate', 'critical'.
     *
     * @return the severity value
     */
    public SeverityLevel severity() {
        return this.severity;
    }

    /**
     * Set severity level. Possible values include: 'minimal', 'moderate', 'critical'.
     *
     * @param severity the severity value to set
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withSeverity(SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get contact details to be updated on the support ticket.
     *
     * @return the contactDetails value
     */
    public UpdateContactProfile contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set contact details to be updated on the support ticket.
     *
     * @param contactDetails the contactDetails value to set
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withContactDetails(UpdateContactProfile contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

}
