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
 * Defines values for SegmentStatusEnum.
 */
public final class SegmentStatusEnum extends ExpandableStringEnum<SegmentStatusEnum> {
    /** Static value SUCCESS, FAILURE for SegmentStatusEnum. */
    public static final SegmentStatusEnum SUCCESS_FAILURE = fromString("SUCCESS, FAILURE");

    /**
     * Creates or finds a SegmentStatusEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding SegmentStatusEnum
     */
    @JsonCreator
    public static SegmentStatusEnum fromString(String name) {
        return fromString(name, SegmentStatusEnum.class);
    }

    /**
     * @return known SegmentStatusEnum values
     */
    public static Collection<SegmentStatusEnum> values() {
        return values(SegmentStatusEnum.class);
    }
}
