// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoutingSource. */
public final class RoutingSource extends ExpandableStringEnum<RoutingSource> {
    /** Static value Invalid for RoutingSource. */
    public static final RoutingSource INVALID = fromString("Invalid");

    /** Static value DeviceMessages for RoutingSource. */
    public static final RoutingSource DEVICE_MESSAGES = fromString("DeviceMessages");

    /** Static value TwinChangeEvents for RoutingSource. */
    public static final RoutingSource TWIN_CHANGE_EVENTS = fromString("TwinChangeEvents");

    /** Static value DeviceLifecycleEvents for RoutingSource. */
    public static final RoutingSource DEVICE_LIFECYCLE_EVENTS = fromString("DeviceLifecycleEvents");

    /** Static value DeviceJobLifecycleEvents for RoutingSource. */
    public static final RoutingSource DEVICE_JOB_LIFECYCLE_EVENTS = fromString("DeviceJobLifecycleEvents");

    /** Static value DigitalTwinChangeEvents for RoutingSource. */
    public static final RoutingSource DIGITAL_TWIN_CHANGE_EVENTS = fromString("DigitalTwinChangeEvents");

    /** Static value DeviceConnectionStateEvents for RoutingSource. */
    public static final RoutingSource DEVICE_CONNECTION_STATE_EVENTS = fromString("DeviceConnectionStateEvents");

    /**
     * Creates or finds a RoutingSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingSource.
     */
    @JsonCreator
    public static RoutingSource fromString(String name) {
        return fromString(name, RoutingSource.class);
    }

    /** @return known RoutingSource values. */
    public static Collection<RoutingSource> values() {
        return values(RoutingSource.class);
    }
}
