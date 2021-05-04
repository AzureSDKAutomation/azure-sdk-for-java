// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VMGuestPatchRebootSetting. */
public final class VMGuestPatchRebootSetting extends ExpandableStringEnum<VMGuestPatchRebootSetting> {
    /** Static value IfRequired for VMGuestPatchRebootSetting. */
    public static final VMGuestPatchRebootSetting IF_REQUIRED = fromString("IfRequired");

    /** Static value Never for VMGuestPatchRebootSetting. */
    public static final VMGuestPatchRebootSetting NEVER = fromString("Never");

    /** Static value Always for VMGuestPatchRebootSetting. */
    public static final VMGuestPatchRebootSetting ALWAYS = fromString("Always");

    /**
     * Creates or finds a VMGuestPatchRebootSetting from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VMGuestPatchRebootSetting.
     */
    @JsonCreator
    public static VMGuestPatchRebootSetting fromString(String name) {
        return fromString(name, VMGuestPatchRebootSetting.class);
    }

    /** @return known VMGuestPatchRebootSetting values. */
    public static Collection<VMGuestPatchRebootSetting> values() {
        return values(VMGuestPatchRebootSetting.class);
    }
}
