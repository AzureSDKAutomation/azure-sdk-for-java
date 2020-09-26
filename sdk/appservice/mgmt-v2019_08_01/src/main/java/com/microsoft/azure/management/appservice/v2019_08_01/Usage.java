/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.UsageInner;
import org.joda.time.DateTime;

/**
 * Type representing Usage.
 */
public interface Usage extends HasInner<UsageInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the computeMode value.
     */
    ComputeModeOptions computeMode();

    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextResetTime value.
     */
    DateTime nextResetTime();

    /**
     * @return the resourceName value.
     */
    String resourceName();

    /**
     * @return the siteMode value.
     */
    String siteMode();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the unit value.
     */
    String unit();

}
