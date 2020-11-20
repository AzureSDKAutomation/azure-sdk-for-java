/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataPolicy.
 */
public final class DataPolicy extends ExpandableStringEnum<DataPolicy> {
    /** Static value Cloud for DataPolicy. */
    public static final DataPolicy CLOUD = fromString("Cloud");

    /** Static value Local for DataPolicy. */
    public static final DataPolicy LOCAL = fromString("Local");

    /**
     * Creates or finds a DataPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding DataPolicy
     */
    @JsonCreator
    public static DataPolicy fromString(String name) {
        return fromString(name, DataPolicy.class);
    }

    /**
     * @return known DataPolicy values
     */
    public static Collection<DataPolicy> values() {
        return values(DataPolicy.class);
    }
}
