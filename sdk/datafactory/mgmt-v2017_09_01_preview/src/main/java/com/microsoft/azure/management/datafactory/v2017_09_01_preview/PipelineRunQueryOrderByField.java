/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PipelineRunQueryOrderByField.
 */
public final class PipelineRunQueryOrderByField extends ExpandableStringEnum<PipelineRunQueryOrderByField> {
    /** Static value RunStart for PipelineRunQueryOrderByField. */
    public static final PipelineRunQueryOrderByField RUN_START = fromString("RunStart");

    /** Static value RunEnd for PipelineRunQueryOrderByField. */
    public static final PipelineRunQueryOrderByField RUN_END = fromString("RunEnd");

    /**
     * Creates or finds a PipelineRunQueryOrderByField from its string representation.
     * @param name a name to look for
     * @return the corresponding PipelineRunQueryOrderByField
     */
    @JsonCreator
    public static PipelineRunQueryOrderByField fromString(String name) {
        return fromString(name, PipelineRunQueryOrderByField.class);
    }

    /**
     * @return known PipelineRunQueryOrderByField values
     */
    public static Collection<PipelineRunQueryOrderByField> values() {
        return values(PipelineRunQueryOrderByField.class);
    }
}
