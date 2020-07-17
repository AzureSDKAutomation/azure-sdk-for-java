/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2018_06_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2018_06_01.implementation.TenantIdDescriptionInner;
import java.util.List;

/**
 * Type representing TenantIdDescription.
 */
public interface TenantIdDescription extends HasInner<TenantIdDescriptionInner>, HasManager<ResourcesManager> {
    /**
     * @return the country value.
     */
    String country();

    /**
     * @return the countryCode value.
     */
    String countryCode();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the domains value.
     */
    List<String> domains();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the tenantId value.
     */
    String tenantId();

}
