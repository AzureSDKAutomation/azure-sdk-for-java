// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OsUpdateType. */
public final class OsUpdateType extends ExpandableStringEnum<OsUpdateType> {
    /** Static value SecurityUpdate for OsUpdateType. */
    public static final OsUpdateType SECURITY_UPDATE = fromString("SecurityUpdate");

    /** Static value FeatureUpdate for OsUpdateType. */
    public static final OsUpdateType FEATURE_UPDATE = fromString("FeatureUpdate");

    /**
     * Creates or finds a OsUpdateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OsUpdateType.
     */
    @JsonCreator
    public static OsUpdateType fromString(String name) {
        return fromString(name, OsUpdateType.class);
    }

    /** @return known OsUpdateType values. */
    public static Collection<OsUpdateType> values() {
        return values(OsUpdateType.class);
    }
}
