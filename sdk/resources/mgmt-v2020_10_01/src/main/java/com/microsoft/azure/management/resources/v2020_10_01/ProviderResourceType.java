/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2020_10_01.implementation.ProviderResourceTypeInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2020_10_01.implementation.ResourcesManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing ProviderResourceType.
 */
public interface ProviderResourceType extends HasInner<ProviderResourceTypeInner>, HasManager<ResourcesManager> {
    /**
     * @return the aliases value.
     */
    List<Alias> aliases();

    /**
     * @return the apiProfiles value.
     */
    List<ApiProfile> apiProfiles();

    /**
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * @return the capabilities value.
     */
    String capabilities();

    /**
     * @return the defaultApiVersion value.
     */
    String defaultApiVersion();

    /**
     * @return the locationMappings value.
     */
    List<ProviderExtendedLocation> locationMappings();

    /**
     * @return the locations value.
     */
    List<String> locations();

    /**
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * @return the resourceType value.
     */
    String resourceType();

}
