/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.WorkerPoolResourceInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import java.util.List;

/**
 * Type representing MultiRolePools.
 */
public interface MultiRolePools extends HasInner<WorkerPoolResourceInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the computeMode value.
     */
    ComputeModeOptions computeMode();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceNames value.
     */
    List<String> instanceNames();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workerCount value.
     */
    Integer workerCount();

    /**
     * @return the workerSize value.
     */
    String workerSize();

    /**
     * @return the workerSizeId value.
     */
    Integer workerSizeId();

}
