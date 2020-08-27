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
 * Defines values for UnitType.
 */
public final class UnitType extends ExpandableStringEnum<UnitType> {
    /** Static value Count for UnitType. */
    public static final UnitType COUNT = fromString("Count");

    /** Static value Bytes for UnitType. */
    public static final UnitType BYTES = fromString("Bytes");

    /** Static value Seconds for UnitType. */
    public static final UnitType SECONDS = fromString("Seconds");

    /** Static value Percent for UnitType. */
    public static final UnitType PERCENT = fromString("Percent");

    /** Static value CountPerSecond for UnitType. */
    public static final UnitType COUNT_PER_SECOND = fromString("CountPerSecond");

    /** Static value BytesPerSecond for UnitType. */
    public static final UnitType BYTES_PER_SECOND = fromString("BytesPerSecond");

    /** Static value Milliseconds for UnitType. */
    public static final UnitType MILLISECONDS = fromString("Milliseconds");

    /**
     * Creates or finds a UnitType from its string representation.
     * @param name a name to look for
     * @return the corresponding UnitType
     */
    @JsonCreator
    public static UnitType fromString(String name) {
        return fromString(name, UnitType.class);
    }

    /**
     * @return known UnitType values
     */
    public static Collection<UnitType> values() {
        return values(UnitType.class);
    }
}
