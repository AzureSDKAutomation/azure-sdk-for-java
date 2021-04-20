// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ListSharesExpand. */
public final class ListSharesExpand extends ExpandableStringEnum<ListSharesExpand> {
    /** Static value deleted for ListSharesExpand. */
    public static final ListSharesExpand DELETED = fromString("deleted");

    /** Static value snapshots for ListSharesExpand. */
    public static final ListSharesExpand SNAPSHOTS = fromString("snapshots");

    /**
     * Creates or finds a ListSharesExpand from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ListSharesExpand.
     */
    @JsonCreator
    public static ListSharesExpand fromString(String name) {
        return fromString(name, ListSharesExpand.class);
    }

    /** @return known ListSharesExpand values. */
    public static Collection<ListSharesExpand> values() {
        return values(ListSharesExpand.class);
    }
}
