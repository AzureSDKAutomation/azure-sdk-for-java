/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RunbookTypeEnum.
 */
public final class RunbookTypeEnum extends ExpandableStringEnum<RunbookTypeEnum> {
    /** Static value Script for RunbookTypeEnum. */
    public static final RunbookTypeEnum SCRIPT = fromString("Script");

    /** Static value Graph for RunbookTypeEnum. */
    public static final RunbookTypeEnum GRAPH = fromString("Graph");

    /** Static value PowerShellWorkflow for RunbookTypeEnum. */
    public static final RunbookTypeEnum POWER_SHELL_WORKFLOW = fromString("PowerShellWorkflow");

    /** Static value PowerShell for RunbookTypeEnum. */
    public static final RunbookTypeEnum POWER_SHELL = fromString("PowerShell");

    /** Static value GraphPowerShellWorkflow for RunbookTypeEnum. */
    public static final RunbookTypeEnum GRAPH_POWER_SHELL_WORKFLOW = fromString("GraphPowerShellWorkflow");

    /** Static value GraphPowerShell for RunbookTypeEnum. */
    public static final RunbookTypeEnum GRAPH_POWER_SHELL = fromString("GraphPowerShell");

    /**
     * Creates or finds a RunbookTypeEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding RunbookTypeEnum
     */
    @JsonCreator
    public static RunbookTypeEnum fromString(String name) {
        return fromString(name, RunbookTypeEnum.class);
    }

    /**
     * @return known RunbookTypeEnum values
     */
    public static Collection<RunbookTypeEnum> values() {
        return values(RunbookTypeEnum.class);
    }
}
