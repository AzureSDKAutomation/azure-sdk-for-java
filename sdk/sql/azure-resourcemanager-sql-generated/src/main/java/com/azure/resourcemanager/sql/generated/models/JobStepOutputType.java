// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobStepOutputType. */
public final class JobStepOutputType extends ExpandableStringEnum<JobStepOutputType> {
    /** Static value SqlDatabase for JobStepOutputType. */
    public static final JobStepOutputType SQL_DATABASE = fromString("SqlDatabase");

    /**
     * Creates or finds a JobStepOutputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobStepOutputType.
     */
    @JsonCreator
    public static JobStepOutputType fromString(String name) {
        return fromString(name, JobStepOutputType.class);
    }

    /** @return known JobStepOutputType values. */
    public static Collection<JobStepOutputType> values() {
        return values(JobStepOutputType.class);
    }
}
