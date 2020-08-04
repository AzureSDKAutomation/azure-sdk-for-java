/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_04_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_04_01.implementation.OrchestratorVersionProfileListResultInner;
import java.util.List;

/**
 * Type representing OrchestratorVersionProfileListResult.
 */
public interface OrchestratorVersionProfileListResult extends HasInner<OrchestratorVersionProfileListResultInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the orchestrators value.
     */
    List<OrchestratorVersionProfile> orchestrators();

    /**
     * @return the type value.
     */
    String type();

}
