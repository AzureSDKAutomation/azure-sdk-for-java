// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Category. */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value None for Category. */
    public static final Category NONE = fromString("None");

    /** Static value Unidentified for Category. */
    public static final Category UNIDENTIFIED = fromString("Unidentified");

    /** Static value Package for Category. */
    public static final Category PACKAGE = fromString("Package");

    /** Static value OSUpdate for Category. */
    public static final Category OSUPDATE = fromString("OSUpdate");

    /** Static value Infrastructure for Category. */
    public static final Category INFRASTRUCTURE = fromString("Infrastructure");

    /**
     * Creates or finds a Category from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Category.
     */
    @JsonCreator
    public static Category fromString(String name) {
        return fromString(name, Category.class);
    }

    /** @return known Category values. */
    public static Collection<Category> values() {
        return values(Category.class);
    }
}
