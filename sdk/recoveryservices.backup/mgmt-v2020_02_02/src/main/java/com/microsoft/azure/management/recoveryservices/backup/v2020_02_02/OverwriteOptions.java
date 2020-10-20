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
 * Defines values for OverwriteOptions.
 */
public final class OverwriteOptions extends ExpandableStringEnum<OverwriteOptions> {
    /** Static value Invalid for OverwriteOptions. */
    public static final OverwriteOptions INVALID = fromString("Invalid");

    /** Static value FailOnConflict for OverwriteOptions. */
    public static final OverwriteOptions FAIL_ON_CONFLICT = fromString("FailOnConflict");

    /** Static value Overwrite for OverwriteOptions. */
    public static final OverwriteOptions OVERWRITE = fromString("Overwrite");

    /**
     * Creates or finds a OverwriteOptions from its string representation.
     * @param name a name to look for
     * @return the corresponding OverwriteOptions
     */
    @JsonCreator
    public static OverwriteOptions fromString(String name) {
        return fromString(name, OverwriteOptions.class);
    }

    /**
     * @return known OverwriteOptions values
     */
    public static Collection<OverwriteOptions> values() {
        return values(OverwriteOptions.class);
    }
}
