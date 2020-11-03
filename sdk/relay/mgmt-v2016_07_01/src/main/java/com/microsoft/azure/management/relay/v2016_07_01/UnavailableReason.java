/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UnavailableReason.
 */
public enum UnavailableReason {
    /** Enum value None. */
    NONE("None"),

    /** Enum value InvalidName. */
    INVALID_NAME("InvalidName"),

    /** Enum value SubscriptionIsDisabled. */
    SUBSCRIPTION_IS_DISABLED("SubscriptionIsDisabled"),

    /** Enum value NameInUse. */
    NAME_IN_USE("NameInUse"),

    /** Enum value NameInLockdown. */
    NAME_IN_LOCKDOWN("NameInLockdown"),

    /** Enum value TooManyNamespaceInCurrentSubscription. */
    TOO_MANY_NAMESPACE_IN_CURRENT_SUBSCRIPTION("TooManyNamespaceInCurrentSubscription");

    /** The actual serialized value for a UnavailableReason instance. */
    private String value;

    UnavailableReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UnavailableReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UnavailableReason object, or null if unable to parse.
     */
    @JsonCreator
    public static UnavailableReason fromString(String value) {
        UnavailableReason[] items = UnavailableReason.values();
        for (UnavailableReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
