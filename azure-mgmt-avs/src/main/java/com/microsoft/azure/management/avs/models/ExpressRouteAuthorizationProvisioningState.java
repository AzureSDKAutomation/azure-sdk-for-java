/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRouteAuthorizationProvisioningState.
 */
public final class ExpressRouteAuthorizationProvisioningState extends ExpandableStringEnum<ExpressRouteAuthorizationProvisioningState> {
    /** Static value Succeeded for ExpressRouteAuthorizationProvisioningState. */
    public static final ExpressRouteAuthorizationProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ExpressRouteAuthorizationProvisioningState. */
    public static final ExpressRouteAuthorizationProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for ExpressRouteAuthorizationProvisioningState. */
    public static final ExpressRouteAuthorizationProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a ExpressRouteAuthorizationProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRouteAuthorizationProvisioningState
     */
    @JsonCreator
    public static ExpressRouteAuthorizationProvisioningState fromString(String name) {
        return fromString(name, ExpressRouteAuthorizationProvisioningState.class);
    }

    /**
     * @return known ExpressRouteAuthorizationProvisioningState values
     */
    public static Collection<ExpressRouteAuthorizationProvisioningState> values() {
        return values(ExpressRouteAuthorizationProvisioningState.class);
    }
}
