/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PartnerTopicProvisioningState.
 */
public final class PartnerTopicProvisioningState extends ExpandableStringEnum<PartnerTopicProvisioningState> {
    /** Static value Creating for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a PartnerTopicProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding PartnerTopicProvisioningState
     */
    @JsonCreator
    public static PartnerTopicProvisioningState fromString(String name) {
        return fromString(name, PartnerTopicProvisioningState.class);
    }

    /**
     * @return known PartnerTopicProvisioningState values
     */
    public static Collection<PartnerTopicProvisioningState> values() {
        return values(PartnerTopicProvisioningState.class);
    }
}
