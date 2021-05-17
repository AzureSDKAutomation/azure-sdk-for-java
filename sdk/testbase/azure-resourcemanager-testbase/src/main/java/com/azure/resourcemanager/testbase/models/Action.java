// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Action. */
public final class Action extends ExpandableStringEnum<Action> {
    /** Static value Install for Action. */
    public static final Action INSTALL = fromString("Install");

    /** Static value Launch for Action. */
    public static final Action LAUNCH = fromString("Launch");

    /** Static value Close for Action. */
    public static final Action CLOSE = fromString("Close");

    /** Static value Uninstall for Action. */
    public static final Action UNINSTALL = fromString("Uninstall");

    /** Static value Custom for Action. */
    public static final Action CUSTOM = fromString("Custom");

    /**
     * Creates or finds a Action from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Action.
     */
    @JsonCreator
    public static Action fromString(String name) {
        return fromString(name, Action.class);
    }

    /** @return known Action values. */
    public static Collection<Action> values() {
        return values(Action.class);
    }
}
