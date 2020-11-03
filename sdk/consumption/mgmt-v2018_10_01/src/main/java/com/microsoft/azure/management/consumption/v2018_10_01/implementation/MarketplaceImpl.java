/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import com.microsoft.azure.management.consumption.v2018_10_01.Marketplace;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.Map;
import org.joda.time.DateTime;

class MarketplaceImpl extends WrapperImpl<MarketplaceInner> implements Marketplace {
    private final ConsumptionManager manager;
    MarketplaceImpl(MarketplaceInner inner, ConsumptionManager manager) {
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
    public String billingPeriodId() {
        return this.inner().billingPeriodId();
    }

    @Override
    public BigDecimal consumedQuantity() {
        return this.inner().consumedQuantity();
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
    public String instanceName() {
        return this.inner().instanceName();
    }

    @Override
    public Boolean isEstimated() {
        return this.inner().isEstimated();
    }

    @Override
    public Boolean isRecurringCharge() {
        return this.inner().isRecurringCharge();
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
    public String offerName() {
        return this.inner().offerName();
    }

    @Override
    public String orderNumber() {
        return this.inner().orderNumber();
    }

    @Override
    public String planName() {
        return this.inner().planName();
    }

    @Override
    public BigDecimal pretaxCost() {
        return this.inner().pretaxCost();
    }

    @Override
    public String publisherName() {
        return this.inner().publisherName();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public BigDecimal resourceRate() {
        return this.inner().resourceRate();
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
    public String unitOfMeasure() {
        return this.inner().unitOfMeasure();
    }

    @Override
    public DateTime usageEnd() {
        return this.inner().usageEnd();
    }

    @Override
    public DateTime usageStart() {
        return this.inner().usageStart();
    }

}
