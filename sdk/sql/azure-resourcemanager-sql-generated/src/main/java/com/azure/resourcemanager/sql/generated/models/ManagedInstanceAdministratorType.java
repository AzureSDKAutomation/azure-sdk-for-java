// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedInstanceAdministratorType. */
public final class ManagedInstanceAdministratorType extends ExpandableStringEnum<ManagedInstanceAdministratorType> {
    /** Static value ActiveDirectory for ManagedInstanceAdministratorType. */
    public static final ManagedInstanceAdministratorType ACTIVE_DIRECTORY = fromString("ActiveDirectory");

    /**
     * Creates or finds a ManagedInstanceAdministratorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedInstanceAdministratorType.
     */
    @JsonCreator
    public static ManagedInstanceAdministratorType fromString(String name) {
        return fromString(name, ManagedInstanceAdministratorType.class);
    }

    /** @return known ManagedInstanceAdministratorType values. */
    public static Collection<ManagedInstanceAdministratorType> values() {
        return values(ManagedInstanceAdministratorType.class);
    }
}
