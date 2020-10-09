/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PaymentMethodType.
 */
public final class PaymentMethodType extends ExpandableStringEnum<PaymentMethodType> {
    /** Static value Credits for PaymentMethodType. */
    public static final PaymentMethodType CREDITS = fromString("Credits");

    /** Static value ChequeWire for PaymentMethodType. */
    public static final PaymentMethodType CHEQUE_WIRE = fromString("ChequeWire");

    /**
     * Creates or finds a PaymentMethodType from its string representation.
     * @param name a name to look for
     * @return the corresponding PaymentMethodType
     */
    @JsonCreator
    public static PaymentMethodType fromString(String name) {
        return fromString(name, PaymentMethodType.class);
    }

    /**
     * @return known PaymentMethodType values
     */
    public static Collection<PaymentMethodType> values() {
        return values(PaymentMethodType.class);
    }
}
