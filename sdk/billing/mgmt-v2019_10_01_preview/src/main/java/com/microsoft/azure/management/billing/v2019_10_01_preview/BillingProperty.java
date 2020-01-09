/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingPropertyInner;
import java.util.List;

/**
 * Type representing BillingProperty.
 */
public interface BillingProperty extends HasInner<BillingPropertyInner>, HasManager<BillingManager> {
    /**
     * @return the billingAccountDisplayName value.
     */
    String billingAccountDisplayName();

    /**
     * @return the billingAccountId value.
     */
    String billingAccountId();

    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the billingTenantId value.
     */
    String billingTenantId();

    /**
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the productId value.
     */
    String productId();

    /**
     * @return the productName value.
     */
    String productName();

    /**
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * @return the skuId value.
     */
    String skuId();

    /**
     * @return the suspensionReasons value.
     */
    List<SuspensionReasonDetails> suspensionReasons();

    /**
     * @return the type value.
     */
    String type();

}
