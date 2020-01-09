/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2019_10_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2019_10_01.implementation.AgentPoolUpgradeProfileInner;
import java.util.List;

/**
 * Type representing AgentPoolUpgradeProfile.
 */
public interface AgentPoolUpgradeProfile extends HasInner<AgentPoolUpgradeProfileInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kubernetesVersion value.
     */
    String kubernetesVersion();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the osType value.
     */
    OSType osType();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the upgrades value.
     */
    List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades();

}
