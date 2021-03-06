// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.resourcemanager.databox.fluent.models.AddressValidationOutputInner;
import java.util.List;

/** An immutable client-side representation of AddressValidationOutput. */
public interface AddressValidationOutput {
    /**
     * Gets the error property: Error code and message of validation response.
     *
     * @return the error value.
     */
    CloudError error();

    /**
     * Gets the validationStatus property: The address validation status.
     *
     * @return the validationStatus value.
     */
    AddressValidationStatus validationStatus();

    /**
     * Gets the alternateAddresses property: List of alternate addresses.
     *
     * @return the alternateAddresses value.
     */
    List<ShippingAddress> alternateAddresses();

    /**
     * Gets the inner com.azure.resourcemanager.databox.fluent.models.AddressValidationOutputInner object.
     *
     * @return the inner object.
     */
    AddressValidationOutputInner innerModel();
}
