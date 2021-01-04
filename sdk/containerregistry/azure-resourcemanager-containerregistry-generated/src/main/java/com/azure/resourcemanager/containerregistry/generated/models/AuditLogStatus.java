// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuditLogStatus. */
public final class AuditLogStatus extends ExpandableStringEnum<AuditLogStatus> {
    /** Static value Enabled for AuditLogStatus. */
    public static final AuditLogStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for AuditLogStatus. */
    public static final AuditLogStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a AuditLogStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuditLogStatus.
     */
    @JsonCreator
    public static AuditLogStatus fromString(String name) {
        return fromString(name, AuditLogStatus.class);
    }

    /** @return known AuditLogStatus values. */
    public static Collection<AuditLogStatus> values() {
        return values(AuditLogStatus.class);
    }
}
