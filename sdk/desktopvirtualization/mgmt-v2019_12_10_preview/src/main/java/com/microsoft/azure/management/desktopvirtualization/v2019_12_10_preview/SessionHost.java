/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.SessionHostInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.DesktopVirtualizationManager;
import org.joda.time.DateTime;

/**
 * Type representing SessionHost.
 */
public interface SessionHost extends HasInner<SessionHostInner>, Indexable, Refreshable<SessionHost>, Updatable<SessionHost.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * @return the allowNewSession value.
     */
    Boolean allowNewSession();

    /**
     * @return the assignedUser value.
     */
    String assignedUser();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastHeartBeat value.
     */
    DateTime lastHeartBeat();

    /**
     * @return the lastUpdateTime value.
     */
    DateTime lastUpdateTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the osVersion value.
     */
    String osVersion();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the sessions value.
     */
    Integer sessions();

    /**
     * @return the status value.
     */
    Status status();

    /**
     * @return the statusTimestamp value.
     */
    DateTime statusTimestamp();

    /**
     * @return the sxSStackVersion value.
     */
    String sxSStackVersion();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updateErrorMessage value.
     */
    String updateErrorMessage();

    /**
     * @return the updateState value.
     */
    UpdateState updateState();

    /**
     * @return the virtualMachineId value.
     */
    String virtualMachineId();

    /**
     * The template for a SessionHost update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SessionHost>, UpdateStages.WithAllowNewSession, UpdateStages.WithAssignedUser {
    }

    /**
     * Grouping of SessionHost update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sessionhost update allowing to specify AllowNewSession.
         */
        interface WithAllowNewSession {
            /**
             * Specifies allowNewSession.
             * @param allowNewSession Allow a new session
             * @return the next update stage
             */
            Update withAllowNewSession(Boolean allowNewSession);
        }

        /**
         * The stage of the sessionhost update allowing to specify AssignedUser.
         */
        interface WithAssignedUser {
            /**
             * Specifies assignedUser.
             * @param assignedUser User assigned to SessionHost
             * @return the next update stage
             */
            Update withAssignedUser(String assignedUser);
        }

    }
}
