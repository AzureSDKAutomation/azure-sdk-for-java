/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WorkloadNetworkSegmentProvisioningState.
 */
public final class WorkloadNetworkSegmentProvisioningState extends ExpandableStringEnum<WorkloadNetworkSegmentProvisioningState> {
    /** Static value Succeeded for WorkloadNetworkSegmentProvisioningState. */
    public static final WorkloadNetworkSegmentProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkloadNetworkSegmentProvisioningState. */
    public static final WorkloadNetworkSegmentProvisioningState FAILED = fromString("Failed");

    /** Static value Building for WorkloadNetworkSegmentProvisioningState. */
    public static final WorkloadNetworkSegmentProvisioningState BUILDING = fromString("Building");

    /** Static value Deleting for WorkloadNetworkSegmentProvisioningState. */
    public static final WorkloadNetworkSegmentProvisioningState DELETING = fromString("Deleting");

    /** Static value Updating for WorkloadNetworkSegmentProvisioningState. */
    public static final WorkloadNetworkSegmentProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a WorkloadNetworkSegmentProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding WorkloadNetworkSegmentProvisioningState
     */
    @JsonCreator
    public static WorkloadNetworkSegmentProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkSegmentProvisioningState.class);
    }

    /**
     * @return known WorkloadNetworkSegmentProvisioningState values
     */
    public static Collection<WorkloadNetworkSegmentProvisioningState> values() {
        return values(WorkloadNetworkSegmentProvisioningState.class);
    }
}
