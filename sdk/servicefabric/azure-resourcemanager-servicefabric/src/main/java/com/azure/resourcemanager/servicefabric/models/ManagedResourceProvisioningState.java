// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedResourceProvisioningState. */
public final class ManagedResourceProvisioningState extends ExpandableStringEnum<ManagedResourceProvisioningState> {
    /** Static value None for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState NONE = fromString("None");

    /** Static value Creating for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState CREATING = fromString("Creating");

    /** Static value Created for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState CREATED = fromString("Created");

    /** Static value Updating for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deleting for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState DELETING = fromString("Deleting");

    /** Static value Deleted for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState DELETED = fromString("Deleted");

    /** Static value Other for ManagedResourceProvisioningState. */
    public static final ManagedResourceProvisioningState OTHER = fromString("Other");

    /**
     * Creates or finds a ManagedResourceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedResourceProvisioningState.
     */
    @JsonCreator
    public static ManagedResourceProvisioningState fromString(String name) {
        return fromString(name, ManagedResourceProvisioningState.class);
    }

    /** @return known ManagedResourceProvisioningState values. */
    public static Collection<ManagedResourceProvisioningState> values() {
        return values(ManagedResourceProvisioningState.class);
    }
}
