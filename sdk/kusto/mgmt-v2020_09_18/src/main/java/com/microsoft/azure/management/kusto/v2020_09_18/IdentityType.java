/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IdentityType.
 */
public final class IdentityType extends ExpandableStringEnum<IdentityType> {
    /** Static value None for IdentityType. */
    public static final IdentityType NONE = fromString("None");

    /** Static value SystemAssigned for IdentityType. */
    public static final IdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for IdentityType. */
    public static final IdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAssigned, UserAssigned for IdentityType. */
    public static final IdentityType SYSTEM_ASSIGNED_USER_ASSIGNED = fromString("SystemAssigned, UserAssigned");

    /**
     * Creates or finds a IdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding IdentityType
     */
    @JsonCreator
    public static IdentityType fromString(String name) {
        return fromString(name, IdentityType.class);
    }

    /**
     * @return known IdentityType values
     */
    public static Collection<IdentityType> values() {
        return values(IdentityType.class);
    }
}
