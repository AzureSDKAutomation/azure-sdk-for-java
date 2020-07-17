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
 * Defines values for HealthState.
 */
public final class HealthState extends ExpandableStringEnum<HealthState> {
    /** Static value Passed for HealthState. */
    public static final HealthState PASSED = fromString("Passed");

    /** Static value ActionRequired for HealthState. */
    public static final HealthState ACTION_REQUIRED = fromString("ActionRequired");

    /** Static value ActionSuggested for HealthState. */
    public static final HealthState ACTION_SUGGESTED = fromString("ActionSuggested");

    /** Static value Invalid for HealthState. */
    public static final HealthState INVALID = fromString("Invalid");

    /**
     * Creates or finds a HealthState from its string representation.
     * @param name a name to look for
     * @return the corresponding HealthState
     */
    @JsonCreator
    public static HealthState fromString(String name) {
        return fromString(name, HealthState.class);
    }

    /**
     * @return known HealthState values
     */
    public static Collection<HealthState> values() {
        return values(HealthState.class);
    }
}
