/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SessionStateV6.
 */
public final class SessionStateV6 extends ExpandableStringEnum<SessionStateV6> {
    /** Static value None for SessionStateV6. */
    public static final SessionStateV6 NONE = fromString("None");

    /** Static value Idle for SessionStateV6. */
    public static final SessionStateV6 IDLE = fromString("Idle");

    /** Static value Connect for SessionStateV6. */
    public static final SessionStateV6 CONNECT = fromString("Connect");

    /** Static value Active for SessionStateV6. */
    public static final SessionStateV6 ACTIVE = fromString("Active");

    /** Static value OpenSent for SessionStateV6. */
    public static final SessionStateV6 OPEN_SENT = fromString("OpenSent");

    /** Static value OpenConfirm for SessionStateV6. */
    public static final SessionStateV6 OPEN_CONFIRM = fromString("OpenConfirm");

    /** Static value OpenReceived for SessionStateV6. */
    public static final SessionStateV6 OPEN_RECEIVED = fromString("OpenReceived");

    /** Static value Established for SessionStateV6. */
    public static final SessionStateV6 ESTABLISHED = fromString("Established");

    /** Static value PendingAdd for SessionStateV6. */
    public static final SessionStateV6 PENDING_ADD = fromString("PendingAdd");

    /** Static value PendingUpdate for SessionStateV6. */
    public static final SessionStateV6 PENDING_UPDATE = fromString("PendingUpdate");

    /** Static value PendingRemove for SessionStateV6. */
    public static final SessionStateV6 PENDING_REMOVE = fromString("PendingRemove");

    /**
     * Creates or finds a SessionStateV6 from its string representation.
     * @param name a name to look for
     * @return the corresponding SessionStateV6
     */
    @JsonCreator
    public static SessionStateV6 fromString(String name) {
        return fromString(name, SessionStateV6.class);
    }

    /**
     * @return known SessionStateV6 values
     */
    public static Collection<SessionStateV6> values() {
        return values(SessionStateV6.class);
    }
}
