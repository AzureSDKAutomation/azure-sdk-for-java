/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobStatus.
 */
public final class JobStatus extends ExpandableStringEnum<JobStatus> {
    /** Static value Invalid for JobStatus. */
    public static final JobStatus INVALID = fromString("Invalid");

    /** Static value InProgress for JobStatus. */
    public static final JobStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for JobStatus. */
    public static final JobStatus COMPLETED = fromString("Completed");

    /** Static value Failed for JobStatus. */
    public static final JobStatus FAILED = fromString("Failed");

    /** Static value CompletedWithWarnings for JobStatus. */
    public static final JobStatus COMPLETED_WITH_WARNINGS = fromString("CompletedWithWarnings");

    /** Static value Cancelled for JobStatus. */
    public static final JobStatus CANCELLED = fromString("Cancelled");

    /** Static value Cancelling for JobStatus. */
    public static final JobStatus CANCELLING = fromString("Cancelling");

    /**
     * Creates or finds a JobStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding JobStatus
     */
    @JsonCreator
    public static JobStatus fromString(String name) {
        return fromString(name, JobStatus.class);
    }

    /**
     * @return known JobStatus values
     */
    public static Collection<JobStatus> values() {
        return values(JobStatus.class);
    }
}
