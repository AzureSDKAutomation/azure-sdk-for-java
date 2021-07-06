// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IpAction. */
public final class IpAction extends ExpandableStringEnum<IpAction> {
    /** Static value Accept for IpAction. */
    public static final IpAction ACCEPT = fromString("Accept");

    /** Static value Reject for IpAction. */
    public static final IpAction REJECT = fromString("Reject");

    /**
     * Creates or finds a IpAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpAction.
     */
    @JsonCreator
    public static IpAction fromString(String name) {
        return fromString(name, IpAction.class);
    }

    /** @return known IpAction values. */
    public static Collection<IpAction> values() {
        return values(IpAction.class);
    }
}
