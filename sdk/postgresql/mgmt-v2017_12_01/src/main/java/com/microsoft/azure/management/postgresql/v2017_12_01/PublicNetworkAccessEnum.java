/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PublicNetworkAccessEnum.
 */
public final class PublicNetworkAccessEnum extends ExpandableStringEnum<PublicNetworkAccessEnum> {
    /** Static value Enabled for PublicNetworkAccessEnum. */
    public static final PublicNetworkAccessEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccessEnum. */
    public static final PublicNetworkAccessEnum DISABLED = fromString("Disabled");

    /**
     * Creates or finds a PublicNetworkAccessEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding PublicNetworkAccessEnum
     */
    @JsonCreator
    public static PublicNetworkAccessEnum fromString(String name) {
        return fromString(name, PublicNetworkAccessEnum.class);
    }

    /**
     * @return known PublicNetworkAccessEnum values
     */
    public static Collection<PublicNetworkAccessEnum> values() {
        return values(PublicNetworkAccessEnum.class);
    }
}
