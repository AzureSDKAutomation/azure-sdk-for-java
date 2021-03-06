/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DynamicThresholdOperator.
 */
public final class DynamicThresholdOperator extends ExpandableStringEnum<DynamicThresholdOperator> {
    /** Static value GreaterThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value LessThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator LESS_THAN = fromString("LessThan");

    /** Static value GreaterOrLessThan for DynamicThresholdOperator. */
    public static final DynamicThresholdOperator GREATER_OR_LESS_THAN = fromString("GreaterOrLessThan");

    /**
     * Creates or finds a DynamicThresholdOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding DynamicThresholdOperator
     */
    @JsonCreator
    public static DynamicThresholdOperator fromString(String name) {
        return fromString(name, DynamicThresholdOperator.class);
    }

    /**
     * @return known DynamicThresholdOperator values
     */
    public static Collection<DynamicThresholdOperator> values() {
        return values(DynamicThresholdOperator.class);
    }
}
