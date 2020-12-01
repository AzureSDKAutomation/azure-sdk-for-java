/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DnsServiceLogLevelEnum.
 */
public final class DnsServiceLogLevelEnum extends ExpandableStringEnum<DnsServiceLogLevelEnum> {
    /** Static value DEBUG for DnsServiceLogLevelEnum. */
    public static final DnsServiceLogLevelEnum DEBUG = fromString("DEBUG");

    /** Static value INFO for DnsServiceLogLevelEnum. */
    public static final DnsServiceLogLevelEnum INFO = fromString("INFO");

    /** Static value WARNING for DnsServiceLogLevelEnum. */
    public static final DnsServiceLogLevelEnum WARNING = fromString("WARNING");

    /** Static value ERROR for DnsServiceLogLevelEnum. */
    public static final DnsServiceLogLevelEnum ERROR = fromString("ERROR");

    /** Static value FATAL for DnsServiceLogLevelEnum. */
    public static final DnsServiceLogLevelEnum FATAL = fromString("FATAL");

    /**
     * Creates or finds a DnsServiceLogLevelEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding DnsServiceLogLevelEnum
     */
    @JsonCreator
    public static DnsServiceLogLevelEnum fromString(String name) {
        return fromString(name, DnsServiceLogLevelEnum.class);
    }

    /**
     * @return known DnsServiceLogLevelEnum values
     */
    public static Collection<DnsServiceLogLevelEnum> values() {
        return values(DnsServiceLogLevelEnum.class);
    }
}
