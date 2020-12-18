// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.ConsumptionManager;
import com.azure.resourcemanager.consumption.fluent.models.CreditSummaryInner;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.CreditBalanceSummary;
import com.azure.resourcemanager.consumption.models.CreditSummary;
import java.util.Collections;
import java.util.Map;

public final class CreditSummaryImpl implements CreditSummary {
    private CreditSummaryInner innerObject;

    private final ConsumptionManager serviceManager;

    CreditSummaryImpl(CreditSummaryInner innerObject, ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CreditBalanceSummary balanceSummary() {
        return this.innerModel().balanceSummary();
    }

    public Amount pendingCreditAdjustments() {
        return this.innerModel().pendingCreditAdjustments();
    }

    public Amount expiredCredit() {
        return this.innerModel().expiredCredit();
    }

    public Amount pendingEligibleCharges() {
        return this.innerModel().pendingEligibleCharges();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public CreditSummaryInner innerModel() {
        return this.innerObject;
    }

    private ConsumptionManager manager() {
        return this.serviceManager;
    }
}
