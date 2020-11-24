/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UserSourceType.
 */
public final class UserSourceType extends ExpandableStringEnum<UserSourceType> {
    /** Static value Jar for UserSourceType. */
    public static final UserSourceType JAR = fromString("Jar");

    /** Static value NetCoreZip for UserSourceType. */
    public static final UserSourceType NET_CORE_ZIP = fromString("NetCoreZip");

    /** Static value Source for UserSourceType. */
    public static final UserSourceType SOURCE = fromString("Source");

    /**
     * Creates or finds a UserSourceType from its string representation.
     * @param name a name to look for
     * @return the corresponding UserSourceType
     */
    @JsonCreator
    public static UserSourceType fromString(String name) {
        return fromString(name, UserSourceType.class);
    }

    /**
     * @return known UserSourceType values
     */
    public static Collection<UserSourceType> values() {
        return values(UserSourceType.class);
    }
}
