/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2017_04_24_preview.implementation;

import com.microsoft.azure.management.consumption.v2017_04_24_preview.UsageDetail;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;
import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2017_04_24_preview.MeterDetails;
import org.joda.time.DateTime;

class UsageDetailImpl extends WrapperImpl<UsageDetailInner> implements UsageDetail {
    private final ConsumptionManager manager;
    UsageDetailImpl(UsageDetailInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public BigDecimal billableQuantity() {
        return this.inner().billableQuantity();
    }

    @Override
    public String billingPeriodId() {
        return this.inner().billingPeriodId();
    }

    @Override
    public String currency() {
        return this.inner().currency();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String instanceId() {
        return this.inner().instanceId();
    }

    @Override
    public String instanceLocation() {
        return this.inner().instanceLocation();
    }

    @Override
    public String instanceName() {
        return this.inner().instanceName();
    }

    @Override
    public String invoiceId() {
        return this.inner().invoiceId();
    }

    @Override
    public Boolean isEstimated() {
        return this.inner().isEstimated();
    }

    @Override
    public MeterDetails meterDetails() {
        return this.inner().meterDetails();
    }

    @Override
    public String meterId() {
        return this.inner().meterId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public BigDecimal pretaxCost() {
        return this.inner().pretaxCost();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime usageEnd() {
        return this.inner().usageEnd();
    }

    @Override
    public BigDecimal usageQuantity() {
        return this.inner().usageQuantity();
    }

    @Override
    public DateTime usageStart() {
        return this.inner().usageStart();
    }

}
