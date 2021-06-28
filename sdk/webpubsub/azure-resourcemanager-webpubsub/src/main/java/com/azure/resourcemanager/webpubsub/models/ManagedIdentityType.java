// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedIdentityType. */
public final class ManagedIdentityType extends ExpandableStringEnum<ManagedIdentityType> {
    /** Static value None for ManagedIdentityType. */
    public static final ManagedIdentityType NONE = fromString("None");

    /** Static value SystemAssigned for ManagedIdentityType. */
    public static final ManagedIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for ManagedIdentityType. */
    public static final ManagedIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates or finds a ManagedIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityType.
     */
    @JsonCreator
    public static ManagedIdentityType fromString(String name) {
        return fromString(name, ManagedIdentityType.class);
    }

    /** @return known ManagedIdentityType values. */
    public static Collection<ManagedIdentityType> values() {
        return values(ManagedIdentityType.class);
    }
}
