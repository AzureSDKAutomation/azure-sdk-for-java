/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job details for update.
 */
public class UpdateJobDetails {
    /**
     * Contact details for notification and shipping.
     */
    @JsonProperty(value = "contactDetails")
    private ContactDetails contactDetails;

    /**
     * Shipping address of the customer.
     */
    @JsonProperty(value = "shippingAddress")
    private ShippingAddress shippingAddress;

    /**
     * Key encryption key for the job.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyEncryptionKey keyEncryptionKey;

    /**
     * Get contact details for notification and shipping.
     *
     * @return the contactDetails value
     */
    public ContactDetails contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set contact details for notification and shipping.
     *
     * @param contactDetails the contactDetails value to set
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get shipping address of the customer.
     *
     * @return the shippingAddress value
     */
    public ShippingAddress shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set shipping address of the customer.
     *
     * @param shippingAddress the shippingAddress value to set
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get key encryption key for the job.
     *
     * @return the keyEncryptionKey value
     */
    public KeyEncryptionKey keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set key encryption key for the job.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withKeyEncryptionKey(KeyEncryptionKey keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

}
