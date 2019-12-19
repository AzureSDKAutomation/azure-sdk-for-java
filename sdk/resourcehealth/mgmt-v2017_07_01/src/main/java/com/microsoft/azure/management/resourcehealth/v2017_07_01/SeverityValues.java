/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SeverityValues.
 */
public final class SeverityValues extends ExpandableStringEnum<SeverityValues> {
    /** Static value Information for SeverityValues. */
    public static final SeverityValues INFORMATION = fromString("Information");

    /** Static value Warning for SeverityValues. */
    public static final SeverityValues WARNING = fromString("Warning");

    /** Static value Error for SeverityValues. */
    public static final SeverityValues ERROR = fromString("Error");

    /**
     * Creates or finds a SeverityValues from its string representation.
     * @param name a name to look for
     * @return the corresponding SeverityValues
     */
    @JsonCreator
    public static SeverityValues fromString(String name) {
        return fromString(name, SeverityValues.class);
    }

    /**
     * @return known SeverityValues values
     */
    public static Collection<SeverityValues> values() {
        return values(SeverityValues.class);
    }
}
