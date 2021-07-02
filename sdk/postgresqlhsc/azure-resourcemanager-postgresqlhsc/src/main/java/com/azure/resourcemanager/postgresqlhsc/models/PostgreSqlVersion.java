// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PostgreSqlVersion. */
public final class PostgreSqlVersion extends ExpandableStringEnum<PostgreSqlVersion> {
    /** Static value 11 for PostgreSqlVersion. */
    public static final PostgreSqlVersion ONE_ONE = fromString("11");

    /** Static value 12 for PostgreSqlVersion. */
    public static final PostgreSqlVersion ONE_TWO = fromString("12");

    /**
     * Creates or finds a PostgreSqlVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostgreSqlVersion.
     */
    @JsonCreator
    public static PostgreSqlVersion fromString(String name) {
        return fromString(name, PostgreSqlVersion.class);
    }

    /** @return known PostgreSqlVersion values. */
    public static Collection<PostgreSqlVersion> values() {
        return values(PostgreSqlVersion.class);
    }
}
