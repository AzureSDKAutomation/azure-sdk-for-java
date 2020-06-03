/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.NetworkTraceInner;

/**
 * Type representing NetworkTrace.
 */
public interface NetworkTrace extends HasInner<NetworkTraceInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the path value.
     */
    String path();

    /**
     * @return the status value.
     */
    String status();

}
