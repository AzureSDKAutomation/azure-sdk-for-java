// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VpnGatewayGeneration. */
public final class VpnGatewayGeneration extends ExpandableStringEnum<VpnGatewayGeneration> {
    /** Static value None for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration NONE = fromString("None");

    /** Static value Generation1 for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration GENERATION1 = fromString("Generation1");

    /** Static value Generation2 for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration GENERATION2 = fromString("Generation2");

    /**
     * Creates or finds a VpnGatewayGeneration from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnGatewayGeneration.
     */
    @JsonCreator
    public static VpnGatewayGeneration fromString(String name) {
        return fromString(name, VpnGatewayGeneration.class);
    }

    /** @return known VpnGatewayGeneration values. */
    public static Collection<VpnGatewayGeneration> values() {
        return values(VpnGatewayGeneration.class);
    }
}
