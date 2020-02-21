/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CompositePathSortOrder.
 */
public final class CompositePathSortOrder extends ExpandableStringEnum<CompositePathSortOrder> {
    /** Static value Ascending for CompositePathSortOrder. */
    public static final CompositePathSortOrder ASCENDING = fromString("Ascending");

    /** Static value Descending for CompositePathSortOrder. */
    public static final CompositePathSortOrder DESCENDING = fromString("Descending");

    /**
     * Creates or finds a CompositePathSortOrder from its string representation.
     * @param name a name to look for
     * @return the corresponding CompositePathSortOrder
     */
    @JsonCreator
    public static CompositePathSortOrder fromString(String name) {
        return fromString(name, CompositePathSortOrder.class);
    }

    /**
     * @return known CompositePathSortOrder values
     */
    public static Collection<CompositePathSortOrder> values() {
        return values(CompositePathSortOrder.class);
    }
}
