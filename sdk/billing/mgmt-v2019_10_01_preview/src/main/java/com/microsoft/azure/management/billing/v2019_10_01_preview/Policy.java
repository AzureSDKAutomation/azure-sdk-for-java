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
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.PolicyInner;

/**
 * Type representing Policy.
 */
public interface Policy extends HasInner<PolicyInner>, HasManager<BillingManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the marketplacePurchases value.
     */
    MarketplacePurchasesPolicy marketplacePurchases();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the reservationPurchases value.
     */
    ReservationPurchasesPolicy reservationPurchases();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the viewCharges value.
     */
    ViewChargesPolicy viewCharges();

}
