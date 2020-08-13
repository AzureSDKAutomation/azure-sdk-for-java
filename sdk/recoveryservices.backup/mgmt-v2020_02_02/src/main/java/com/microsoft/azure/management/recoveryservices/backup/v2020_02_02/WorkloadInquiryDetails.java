/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of an inquired protectable item.
 */
public class WorkloadInquiryDetails {
    /**
     * Type of the Workload such as SQL, Oracle etc.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Contains the protectable item Count inside this Container.
     */
    @JsonProperty(value = "itemCount")
    private Long itemCount;

    /**
     * Inquiry validation such as permissions and other backup validations.
     */
    @JsonProperty(value = "inquiryValidation")
    private InquiryValidation inquiryValidation;

    /**
     * Get type of the Workload such as SQL, Oracle etc.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the Workload such as SQL, Oracle etc.
     *
     * @param type the type value to set
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get contains the protectable item Count inside this Container.
     *
     * @return the itemCount value
     */
    public Long itemCount() {
        return this.itemCount;
    }

    /**
     * Set contains the protectable item Count inside this Container.
     *
     * @param itemCount the itemCount value to set
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * Get inquiry validation such as permissions and other backup validations.
     *
     * @return the inquiryValidation value
     */
    public InquiryValidation inquiryValidation() {
        return this.inquiryValidation;
    }

    /**
     * Set inquiry validation such as permissions and other backup validations.
     *
     * @param inquiryValidation the inquiryValidation value to set
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withInquiryValidation(InquiryValidation inquiryValidation) {
        this.inquiryValidation = inquiryValidation;
        return this;
    }

}
