/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PublicNetworkAccess.
 */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /** Static value Enabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     * @param name a name to look for
     * @return the corresponding PublicNetworkAccess
     */
    @JsonCreator
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * @return known PublicNetworkAccess values
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}
