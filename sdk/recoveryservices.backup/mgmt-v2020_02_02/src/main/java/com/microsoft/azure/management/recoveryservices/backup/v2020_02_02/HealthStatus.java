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
 * Defines values for HealthStatus.
 */
public final class HealthStatus extends ExpandableStringEnum<HealthStatus> {
    /** Static value Passed for HealthStatus. */
    public static final HealthStatus PASSED = fromString("Passed");

    /** Static value ActionRequired for HealthStatus. */
    public static final HealthStatus ACTION_REQUIRED = fromString("ActionRequired");

    /** Static value ActionSuggested for HealthStatus. */
    public static final HealthStatus ACTION_SUGGESTED = fromString("ActionSuggested");

    /** Static value Healthy for HealthStatus. */
    public static final HealthStatus HEALTHY = fromString("Healthy");

    /** Static value TransientDegraded for HealthStatus. */
    public static final HealthStatus TRANSIENT_DEGRADED = fromString("TransientDegraded");

    /** Static value PersistentDegraded for HealthStatus. */
    public static final HealthStatus PERSISTENT_DEGRADED = fromString("PersistentDegraded");

    /** Static value TransientUnhealthy for HealthStatus. */
    public static final HealthStatus TRANSIENT_UNHEALTHY = fromString("TransientUnhealthy");

    /** Static value PersistentUnhealthy for HealthStatus. */
    public static final HealthStatus PERSISTENT_UNHEALTHY = fromString("PersistentUnhealthy");

    /** Static value Invalid for HealthStatus. */
    public static final HealthStatus INVALID = fromString("Invalid");

    /**
     * Creates or finds a HealthStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding HealthStatus
     */
    @JsonCreator
    public static HealthStatus fromString(String name) {
        return fromString(name, HealthStatus.class);
    }

    /**
     * @return known HealthStatus values
     */
    public static Collection<HealthStatus> values() {
        return values(HealthStatus.class);
    }
}
