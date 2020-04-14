/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Role.
 */
public final class Role extends ExpandableStringEnum<Role> {
    /** Static value Noc for Role. */
    public static final Role NOC = fromString("Noc");

    /** Static value Policy for Role. */
    public static final Role POLICY = fromString("Policy");

    /** Static value Technical for Role. */
    public static final Role TECHNICAL = fromString("Technical");

    /** Static value Service for Role. */
    public static final Role SERVICE = fromString("Service");

    /** Static value Other for Role. */
    public static final Role OTHER = fromString("Other");

    /**
     * Creates or finds a Role from its string representation.
     * @param name a name to look for
     * @return the corresponding Role
     */
    @JsonCreator
    public static Role fromString(String name) {
        return fromString(name, Role.class);
    }

    /**
     * @return known Role values
     */
    public static Collection<Role> values() {
        return values(Role.class);
    }
}
