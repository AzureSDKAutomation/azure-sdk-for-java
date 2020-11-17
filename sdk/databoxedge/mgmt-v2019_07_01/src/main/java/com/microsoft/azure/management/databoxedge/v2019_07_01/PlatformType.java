/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PlatformType.
 */
public final class PlatformType extends ExpandableStringEnum<PlatformType> {
    /** Static value Windows for PlatformType. */
    public static final PlatformType WINDOWS = fromString("Windows");

    /** Static value Linux for PlatformType. */
    public static final PlatformType LINUX = fromString("Linux");

    /**
     * Creates or finds a PlatformType from its string representation.
     * @param name a name to look for
     * @return the corresponding PlatformType
     */
    @JsonCreator
    public static PlatformType fromString(String name) {
        return fromString(name, PlatformType.class);
    }

    /**
     * @return known PlatformType values
     */
    public static Collection<PlatformType> values() {
        return values(PlatformType.class);
    }
}
