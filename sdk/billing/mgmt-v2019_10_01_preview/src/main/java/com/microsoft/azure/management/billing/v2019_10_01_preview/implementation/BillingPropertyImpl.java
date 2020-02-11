/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingProperty;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class BillingPropertyImpl extends WrapperImpl<BillingPropertyInner> implements BillingProperty {
    private final BillingManager manager;
    BillingPropertyImpl(BillingPropertyInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String billingAccountDisplayName() {
        return this.inner().billingAccountDisplayName();
    }

    @Override
    public String billingAccountId() {
        return this.inner().billingAccountId();
    }

    @Override
    public String billingProfileDisplayName() {
        return this.inner().billingProfileDisplayName();
    }

    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
    }

    @Override
    public Object billingProfileSpendingLimit() {
        return this.inner().billingProfileSpendingLimit();
    }

    @Override
    public Object billingProfileStatus() {
        return this.inner().billingProfileStatus();
    }

    @Override
    public Object billingProfileStatusReasonCode() {
        return this.inner().billingProfileStatusReasonCode();
    }

    @Override
    public String billingTenantId() {
        return this.inner().billingTenantId();
    }

    @Override
    public String costCenter() {
        return this.inner().costCenter();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invoiceSectionDisplayName() {
        return this.inner().invoiceSectionDisplayName();
    }

    @Override
    public String invoiceSectionId() {
        return this.inner().invoiceSectionId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String productId() {
        return this.inner().productId();
    }

    @Override
    public String productName() {
        return this.inner().productName();
    }

    @Override
    public String skuDescription() {
        return this.inner().skuDescription();
    }

    @Override
    public String skuId() {
        return this.inner().skuId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
