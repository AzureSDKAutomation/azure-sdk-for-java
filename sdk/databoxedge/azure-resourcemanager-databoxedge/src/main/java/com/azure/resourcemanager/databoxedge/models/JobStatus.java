// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobStatus. */
public final class JobStatus extends ExpandableStringEnum<JobStatus> {
    /** Static value Invalid for JobStatus. */
    public static final JobStatus INVALID = fromString("Invalid");

    /** Static value Running for JobStatus. */
    public static final JobStatus RUNNING = fromString("Running");

    /** Static value Succeeded for JobStatus. */
    public static final JobStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for JobStatus. */
    public static final JobStatus FAILED = fromString("Failed");

    /** Static value Canceled for JobStatus. */
    public static final JobStatus CANCELED = fromString("Canceled");

    /** Static value Paused for JobStatus. */
    public static final JobStatus PAUSED = fromString("Paused");

    /** Static value Scheduled for JobStatus. */
    public static final JobStatus SCHEDULED = fromString("Scheduled");

    /**
     * Creates or finds a JobStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobStatus.
     */
    @JsonCreator
    public static JobStatus fromString(String name) {
        return fromString(name, JobStatus.class);
    }

    /** @return known JobStatus values. */
    public static Collection<JobStatus> values() {
        return values(JobStatus.class);
    }
}
