/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PipelineOptions.
 */
public final class PipelineOptions extends ExpandableStringEnum<PipelineOptions> {
    /** Static value OverwriteTags for PipelineOptions. */
    public static final PipelineOptions OVERWRITE_TAGS = fromString("OverwriteTags");

    /** Static value OverwriteBlobs for PipelineOptions. */
    public static final PipelineOptions OVERWRITE_BLOBS = fromString("OverwriteBlobs");

    /** Static value DeleteSourceBlobOnSuccess for PipelineOptions. */
    public static final PipelineOptions DELETE_SOURCE_BLOB_ON_SUCCESS = fromString("DeleteSourceBlobOnSuccess");

    /** Static value ContinueOnErrors for PipelineOptions. */
    public static final PipelineOptions CONTINUE_ON_ERRORS = fromString("ContinueOnErrors");

    /**
     * Creates or finds a PipelineOptions from its string representation.
     * @param name a name to look for
     * @return the corresponding PipelineOptions
     */
    @JsonCreator
    public static PipelineOptions fromString(String name) {
        return fromString(name, PipelineOptions.class);
    }

    /**
     * @return known PipelineOptions values
     */
    public static Collection<PipelineOptions> values() {
        return values(PipelineOptions.class);
    }
}
