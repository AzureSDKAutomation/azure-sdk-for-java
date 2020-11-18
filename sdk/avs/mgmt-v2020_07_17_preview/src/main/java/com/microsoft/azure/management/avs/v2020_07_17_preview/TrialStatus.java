/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TrialStatus.
 */
public final class TrialStatus extends ExpandableStringEnum<TrialStatus> {
    /** Static value TrialAvailable for TrialStatus. */
    public static final TrialStatus TRIAL_AVAILABLE = fromString("TrialAvailable");

    /** Static value TrialUsed for TrialStatus. */
    public static final TrialStatus TRIAL_USED = fromString("TrialUsed");

    /** Static value TrialDisabled for TrialStatus. */
    public static final TrialStatus TRIAL_DISABLED = fromString("TrialDisabled");

    /**
     * Creates or finds a TrialStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TrialStatus
     */
    @JsonCreator
    public static TrialStatus fromString(String name) {
        return fromString(name, TrialStatus.class);
    }

    /**
     * @return known TrialStatus values
     */
    public static Collection<TrialStatus> values() {
        return values(TrialStatus.class);
    }
}
