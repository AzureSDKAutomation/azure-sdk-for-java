// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OsType. */
public final class OsType extends ExpandableStringEnum<OsType> {
    /** Static value Windows for OsType. */
    public static final OsType WINDOWS = fromString("Windows");

    /** Static value Linux for OsType. */
    public static final OsType LINUX = fromString("Linux");

    /** Static value Other for OsType. */
    public static final OsType OTHER = fromString("Other");

    /**
     * Creates or finds a OsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OsType.
     */
    @JsonCreator
    public static OsType fromString(String name) {
        return fromString(name, OsType.class);
    }

    /** @return known OsType values. */
    public static Collection<OsType> values() {
        return values(OsType.class);
    }
}
