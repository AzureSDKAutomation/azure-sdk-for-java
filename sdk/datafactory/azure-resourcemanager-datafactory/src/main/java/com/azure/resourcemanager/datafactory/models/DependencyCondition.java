// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DependencyCondition. */
public final class DependencyCondition extends ExpandableStringEnum<DependencyCondition> {
    /** Static value Succeeded for DependencyCondition. */
    public static final DependencyCondition SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for DependencyCondition. */
    public static final DependencyCondition FAILED = fromString("Failed");

    /** Static value Skipped for DependencyCondition. */
    public static final DependencyCondition SKIPPED = fromString("Skipped");

    /** Static value Completed for DependencyCondition. */
    public static final DependencyCondition COMPLETED = fromString("Completed");

    /**
     * Creates or finds a DependencyCondition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DependencyCondition.
     */
    @JsonCreator
    public static DependencyCondition fromString(String name) {
        return fromString(name, DependencyCondition.class);
    }

    /** @return known DependencyCondition values. */
    public static Collection<DependencyCondition> values() {
        return values(DependencyCondition.class);
    }
}
