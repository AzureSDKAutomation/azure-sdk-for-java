/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FieldRestrictionResult.
 */
public final class FieldRestrictionResult extends ExpandableStringEnum<FieldRestrictionResult> {
    /** Static value Required for FieldRestrictionResult. */
    public static final FieldRestrictionResult REQUIRED = fromString("Required");

    /** Static value Removed for FieldRestrictionResult. */
    public static final FieldRestrictionResult REMOVED = fromString("Removed");

    /** Static value Deny for FieldRestrictionResult. */
    public static final FieldRestrictionResult DENY = fromString("Deny");

    /**
     * Creates or finds a FieldRestrictionResult from its string representation.
     * @param name a name to look for
     * @return the corresponding FieldRestrictionResult
     */
    @JsonCreator
    public static FieldRestrictionResult fromString(String name) {
        return fromString(name, FieldRestrictionResult.class);
    }

    /**
     * @return known FieldRestrictionResult values
     */
    public static Collection<FieldRestrictionResult> values() {
        return values(FieldRestrictionResult.class);
    }
}
