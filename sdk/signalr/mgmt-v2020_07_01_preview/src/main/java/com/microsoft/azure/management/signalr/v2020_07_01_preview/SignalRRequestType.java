/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SignalRRequestType.
 */
public final class SignalRRequestType extends ExpandableStringEnum<SignalRRequestType> {
    /** Static value ClientConnection for SignalRRequestType. */
    public static final SignalRRequestType CLIENT_CONNECTION = fromString("ClientConnection");

    /** Static value ServerConnection for SignalRRequestType. */
    public static final SignalRRequestType SERVER_CONNECTION = fromString("ServerConnection");

    /** Static value RESTAPI for SignalRRequestType. */
    public static final SignalRRequestType RESTAPI = fromString("RESTAPI");

    /**
     * Creates or finds a SignalRRequestType from its string representation.
     * @param name a name to look for
     * @return the corresponding SignalRRequestType
     */
    @JsonCreator
    public static SignalRRequestType fromString(String name) {
        return fromString(name, SignalRRequestType.class);
    }

    /**
     * @return known SignalRRequestType values
     */
    public static Collection<SignalRRequestType> values() {
        return values(SignalRRequestType.class);
    }
}
