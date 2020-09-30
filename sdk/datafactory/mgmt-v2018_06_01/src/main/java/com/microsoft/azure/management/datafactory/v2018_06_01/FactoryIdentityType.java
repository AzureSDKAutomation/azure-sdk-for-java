/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FactoryIdentityType.
 */
public final class FactoryIdentityType extends ExpandableStringEnum<FactoryIdentityType> {
    /** Static value SystemAssigned for FactoryIdentityType. */
    public static final FactoryIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for FactoryIdentityType. */
    public static final FactoryIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAssigned,UserAssigned for FactoryIdentityType. */
    public static final FactoryIdentityType SYSTEM_ASSIGNED_USER_ASSIGNED = fromString("SystemAssigned,UserAssigned");

    /**
     * Creates or finds a FactoryIdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding FactoryIdentityType
     */
    @JsonCreator
    public static FactoryIdentityType fromString(String name) {
        return fromString(name, FactoryIdentityType.class);
    }

    /**
     * @return known FactoryIdentityType values
     */
    public static Collection<FactoryIdentityType> values() {
        return values(FactoryIdentityType.class);
    }
}
