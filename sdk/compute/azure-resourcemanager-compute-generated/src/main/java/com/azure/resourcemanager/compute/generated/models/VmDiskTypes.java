// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VmDiskTypes. */
public final class VmDiskTypes extends ExpandableStringEnum<VmDiskTypes> {
    /** Static value None for VmDiskTypes. */
    public static final VmDiskTypes NONE = fromString("None");

    /** Static value Unmanaged for VmDiskTypes. */
    public static final VmDiskTypes UNMANAGED = fromString("Unmanaged");

    /**
     * Creates or finds a VmDiskTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VmDiskTypes.
     */
    @JsonCreator
    public static VmDiskTypes fromString(String name) {
        return fromString(name, VmDiskTypes.class);
    }

    /** @return known VmDiskTypes values. */
    public static Collection<VmDiskTypes> values() {
        return values(VmDiskTypes.class);
    }
}
