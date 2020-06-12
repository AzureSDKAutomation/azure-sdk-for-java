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
 * Defines values for TransactionTypeKind.
 */
public final class TransactionTypeKind extends ExpandableStringEnum<TransactionTypeKind> {
    /** Static value all for TransactionTypeKind. */
    public static final TransactionTypeKind ALL = fromString("all");

    /** Static value reservation for TransactionTypeKind. */
    public static final TransactionTypeKind RESERVATION = fromString("reservation");

    /**
     * Creates or finds a TransactionTypeKind from its string representation.
     * @param name a name to look for
     * @return the corresponding TransactionTypeKind
     */
    @JsonCreator
    public static TransactionTypeKind fromString(String name) {
        return fromString(name, TransactionTypeKind.class);
    }

    /**
     * @return known TransactionTypeKind values
     */
    public static Collection<TransactionTypeKind> values() {
        return values(TransactionTypeKind.class);
    }
}
