/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2019_08_01.implementation.ProviderInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2019_08_01.implementation.ResourcesManager;
import java.util.List;

/**
 * Type representing Provider.
 */
public interface Provider extends HasInner<ProviderInner>, Indexable, Refreshable<Provider>, HasManager<ResourcesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the namespace value.
     */
    String namespace();

    /**
     * @return the registrationPolicy value.
     */
    String registrationPolicy();

    /**
     * @return the registrationState value.
     */
    String registrationState();

    /**
     * @return the resourceTypes value.
     */
    List<ProviderResourceType> resourceTypes();

}
