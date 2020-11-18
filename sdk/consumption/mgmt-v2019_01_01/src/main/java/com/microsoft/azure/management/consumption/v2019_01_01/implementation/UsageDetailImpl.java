/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import com.microsoft.azure.management.consumption.v2019_01_01.UsageDetail;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2019_01_01.MeterDetails;
import java.util.UUID;
import java.util.Map;
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
    public String accountName() {
        return this.inner().accountName();
    }

    @Override
    public String additionalProperties() {
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
    public Boolean chargesBilledSeparately() {
        return this.inner().chargesBilledSeparately();
    }

    @Override
    public String consumedService() {
        return this.inner().consumedService();
    }

    @Override
    public String costCenter() {
        return this.inner().costCenter();
    }

    @Override
    public String currency() {
        return this.inner().currency();
    }

    @Override
    public String departmentName() {
        return this.inner().departmentName();
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
    public String location() {
        return this.inner().location();
    }

    @Override
    public MeterDetails meterDetails() {
        return this.inner().meterDetails();
    }

    @Override
    public UUID meterId() {
        return this.inner().meterId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String offerId() {
        return this.inner().offerId();
    }

    @Override
    public String partNumber() {
        return this.inner().partNumber();
    }

    @Override
    public BigDecimal pretaxCost() {
        return this.inner().pretaxCost();
    }

    @Override
    public String product() {
        return this.inner().product();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public UUID subscriptionGuid() {
        return this.inner().subscriptionGuid();
    }

    @Override
    public String subscriptionName() {
        return this.inner().subscriptionName();
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
