/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VolumeServiceLevel.
 */
public final class VolumeServiceLevel extends ExpandableStringEnum<VolumeServiceLevel> {
    /** Static value Standard for VolumeServiceLevel. */
    public static final VolumeServiceLevel STANDARD = fromString("Standard");

    /** Static value Premium for VolumeServiceLevel. */
    public static final VolumeServiceLevel PREMIUM = fromString("Premium");

    /** Static value Ultra for VolumeServiceLevel. */
    public static final VolumeServiceLevel ULTRA = fromString("Ultra");

    /**
     * Creates or finds a VolumeServiceLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding VolumeServiceLevel
     */
    @JsonCreator
    public static VolumeServiceLevel fromString(String name) {
        return fromString(name, VolumeServiceLevel.class);
    }

    /**
     * @return known VolumeServiceLevel values
     */
    public static Collection<VolumeServiceLevel> values() {
        return values(VolumeServiceLevel.class);
    }
}
