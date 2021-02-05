// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerVersion. */
public final class ServerVersion extends ExpandableStringEnum<ServerVersion> {
    /** Static value 3.2 for ServerVersion. */
    public static final ServerVersion THREE_TWO = fromString("3.2");

    /** Static value 3.6 for ServerVersion. */
    public static final ServerVersion THREE_SIX = fromString("3.6");

    /**
     * Creates or finds a ServerVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerVersion.
     */
    @JsonCreator
    public static ServerVersion fromString(String name) {
        return fromString(name, ServerVersion.class);
    }

    /** @return known ServerVersion values. */
    public static Collection<ServerVersion> values() {
        return values(ServerVersion.class);
    }
}
