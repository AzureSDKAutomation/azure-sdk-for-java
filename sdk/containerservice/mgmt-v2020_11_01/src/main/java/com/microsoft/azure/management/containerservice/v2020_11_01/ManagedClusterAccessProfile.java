/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_11_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_11_01.implementation.ManagedClusterAccessProfileInner;
import java.util.Map;

/**
 * Type representing ManagedClusterAccessProfile.
 */
public interface ManagedClusterAccessProfile extends HasInner<ManagedClusterAccessProfileInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kubeConfig value.
     */
    byte[] kubeConfig();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
