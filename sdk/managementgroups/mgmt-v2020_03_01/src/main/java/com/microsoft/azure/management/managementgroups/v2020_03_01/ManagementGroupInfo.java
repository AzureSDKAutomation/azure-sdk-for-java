/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.managementgroups.v2020_03_01.implementation.ManagementManager;
import com.microsoft.azure.management.managementgroups.v2020_03_01.implementation.ManagementGroupInfoInner;

/**
 * Type representing ManagementGroupInfo.
 */
public interface ManagementGroupInfo extends HasInner<ManagementGroupInfoInner>, HasManager<ManagementManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the type value.
     */
    String type();

}
