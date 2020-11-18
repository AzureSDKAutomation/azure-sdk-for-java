/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.WorkspaceAadAdminInfoInner;

/**
 * Type representing WorkspaceAadAdminInfo.
 */
public interface WorkspaceAadAdminInfo extends HasInner<WorkspaceAadAdminInfoInner>, HasManager<SynapseManager> {
    /**
     * @return the administratorType value.
     */
    String administratorType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the login value.
     */
    String login();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sid value.
     */
    String sid();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the type value.
     */
    String type();

}
