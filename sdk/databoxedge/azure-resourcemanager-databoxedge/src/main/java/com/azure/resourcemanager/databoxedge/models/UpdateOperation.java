// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpdateOperation. */
public final class UpdateOperation extends ExpandableStringEnum<UpdateOperation> {
    /** Static value None for UpdateOperation. */
    public static final UpdateOperation NONE = fromString("None");

    /** Static value Scan for UpdateOperation. */
    public static final UpdateOperation SCAN = fromString("Scan");

    /** Static value Download for UpdateOperation. */
    public static final UpdateOperation DOWNLOAD = fromString("Download");

    /** Static value Install for UpdateOperation. */
    public static final UpdateOperation INSTALL = fromString("Install");

    /**
     * Creates or finds a UpdateOperation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateOperation.
     */
    @JsonCreator
    public static UpdateOperation fromString(String name) {
        return fromString(name, UpdateOperation.class);
    }

    /** @return known UpdateOperation values. */
    public static Collection<UpdateOperation> values() {
        return values(UpdateOperation.class);
    }
}
