/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SQLDataDirectoryType.
 */
public final class SQLDataDirectoryType extends ExpandableStringEnum<SQLDataDirectoryType> {
    /** Static value Invalid for SQLDataDirectoryType. */
    public static final SQLDataDirectoryType INVALID = fromString("Invalid");

    /** Static value Data for SQLDataDirectoryType. */
    public static final SQLDataDirectoryType DATA = fromString("Data");

    /** Static value Log for SQLDataDirectoryType. */
    public static final SQLDataDirectoryType LOG = fromString("Log");

    /**
     * Creates or finds a SQLDataDirectoryType from its string representation.
     * @param name a name to look for
     * @return the corresponding SQLDataDirectoryType
     */
    @JsonCreator
    public static SQLDataDirectoryType fromString(String name) {
        return fromString(name, SQLDataDirectoryType.class);
    }

    /**
     * @return known SQLDataDirectoryType values
     */
    public static Collection<SQLDataDirectoryType> values() {
        return values(SQLDataDirectoryType.class);
    }
}
