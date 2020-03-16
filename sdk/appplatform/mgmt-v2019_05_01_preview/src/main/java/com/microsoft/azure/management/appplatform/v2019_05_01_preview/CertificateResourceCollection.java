/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation.AppPlatformManager;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation.CertificateResourceCollectionInner;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation.CertificateResourceInner;
import java.util.List;

/**
 * Type representing CertificateResourceCollection.
 */
public interface CertificateResourceCollection extends HasInner<CertificateResourceCollectionInner>, HasManager<AppPlatformManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the resources value.
     */
    List<CertificateResourceInner> resources();

}
