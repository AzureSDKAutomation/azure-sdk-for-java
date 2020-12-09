// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CacheBehavior. */
public final class CacheBehavior extends ExpandableStringEnum<CacheBehavior> {
    /** Static value BypassCache for CacheBehavior. */
    public static final CacheBehavior BYPASS_CACHE = fromString("BypassCache");

    /** Static value Override for CacheBehavior. */
    public static final CacheBehavior OVERRIDE = fromString("Override");

    /** Static value SetIfMissing for CacheBehavior. */
    public static final CacheBehavior SET_IF_MISSING = fromString("SetIfMissing");

    /**
     * Creates or finds a CacheBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CacheBehavior.
     */
    @JsonCreator
    public static CacheBehavior fromString(String name) {
        return fromString(name, CacheBehavior.class);
    }

    /** @return known CacheBehavior values. */
    public static Collection<CacheBehavior> values() {
        return values(CacheBehavior.class);
    }
}
