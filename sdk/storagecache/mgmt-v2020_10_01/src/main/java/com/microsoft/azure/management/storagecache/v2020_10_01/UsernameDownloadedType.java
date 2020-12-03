/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UsernameDownloadedType.
 */
public final class UsernameDownloadedType extends ExpandableStringEnum<UsernameDownloadedType> {
    /** Static value Yes for UsernameDownloadedType. */
    public static final UsernameDownloadedType YES = fromString("Yes");

    /** Static value No for UsernameDownloadedType. */
    public static final UsernameDownloadedType NO = fromString("No");

    /** Static value Error for UsernameDownloadedType. */
    public static final UsernameDownloadedType ERROR = fromString("Error");

    /**
     * Creates or finds a UsernameDownloadedType from its string representation.
     * @param name a name to look for
     * @return the corresponding UsernameDownloadedType
     */
    @JsonCreator
    public static UsernameDownloadedType fromString(String name) {
        return fromString(name, UsernameDownloadedType.class);
    }

    /**
     * @return known UsernameDownloadedType values
     */
    public static Collection<UsernameDownloadedType> values() {
        return values(UsernameDownloadedType.class);
    }
}
