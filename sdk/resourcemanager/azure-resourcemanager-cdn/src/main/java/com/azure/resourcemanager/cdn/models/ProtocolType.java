// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProtocolType. */
public final class ProtocolType extends ExpandableStringEnum<ProtocolType> {
    /** Static value ServerNameIndication for ProtocolType. */
    public static final ProtocolType SERVER_NAME_INDICATION = fromString("ServerNameIndication");

    /** Static value IPBased for ProtocolType. */
    public static final ProtocolType IPBASED = fromString("IPBased");

    /**
     * Creates or finds a ProtocolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProtocolType.
     */
    @JsonCreator
    public static ProtocolType fromString(String name) {
        return fromString(name, ProtocolType.class);
    }

    /** @return known ProtocolType values. */
    public static Collection<ProtocolType> values() {
        return values(ProtocolType.class);
    }
}
