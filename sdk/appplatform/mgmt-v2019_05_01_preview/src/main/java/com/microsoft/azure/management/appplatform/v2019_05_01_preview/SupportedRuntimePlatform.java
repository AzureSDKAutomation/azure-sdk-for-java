/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SupportedRuntimePlatform.
 */
public final class SupportedRuntimePlatform extends ExpandableStringEnum<SupportedRuntimePlatform> {
    /** Static value Java for SupportedRuntimePlatform. */
    public static final SupportedRuntimePlatform JAVA = fromString("Java");

    /** Static value .NET Core for SupportedRuntimePlatform. */
    public static final SupportedRuntimePlatform NET_CORE = fromString(".NET Core");

    /**
     * Creates or finds a SupportedRuntimePlatform from its string representation.
     * @param name a name to look for
     * @return the corresponding SupportedRuntimePlatform
     */
    @JsonCreator
    public static SupportedRuntimePlatform fromString(String name) {
        return fromString(name, SupportedRuntimePlatform.class);
    }

    /**
     * @return known SupportedRuntimePlatform values
     */
    public static Collection<SupportedRuntimePlatform> values() {
        return values(SupportedRuntimePlatform.class);
    }
}
