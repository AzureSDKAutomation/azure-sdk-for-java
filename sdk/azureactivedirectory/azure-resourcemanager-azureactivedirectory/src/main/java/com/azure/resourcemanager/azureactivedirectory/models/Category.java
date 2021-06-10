// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Category. */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value AuditLogs for Category. */
    public static final Category AUDIT_LOGS = fromString("AuditLogs");

    /** Static value SignInLogs for Category. */
    public static final Category SIGN_IN_LOGS = fromString("SignInLogs");

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
