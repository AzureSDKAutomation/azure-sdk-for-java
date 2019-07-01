/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of activity log alert actions.
 */
public class ActivityLogAlertActionList {
    /**
     * The list of activity log alerts.
     */
    @JsonProperty(value = "actionGroups")
    private List<ActivityLogAlertActionGroup> actionGroups;

    /**
     * Get the list of activity log alerts.
     *
     * @return the actionGroups value
     */
    public List<ActivityLogAlertActionGroup> actionGroups() {
        return this.actionGroups;
    }

    /**
     * Set the list of activity log alerts.
     *
     * @param actionGroups the actionGroups value to set
     * @return the ActivityLogAlertActionList object itself.
     */
    public ActivityLogAlertActionList withActionGroups(List<ActivityLogAlertActionGroup> actionGroups) {
        this.actionGroups = actionGroups;
        return this;
    }

}
