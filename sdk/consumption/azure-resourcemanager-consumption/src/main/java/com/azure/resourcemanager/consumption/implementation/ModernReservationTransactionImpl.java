// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.ConsumptionManager;
import com.azure.resourcemanager.consumption.fluent.models.ModernReservationTransactionInner;
import com.azure.resourcemanager.consumption.models.ModernReservationTransaction;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ModernReservationTransactionImpl implements ModernReservationTransaction {
    private ModernReservationTransactionInner innerObject;

    private final ConsumptionManager serviceManager;

    public ModernReservationTransactionImpl(
        ModernReservationTransactionInner innerObject, ConsumptionManager serviceManager) {
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

    public List<String> tags() {
        List<String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BigDecimal amount() {
        return this.innerModel().amount();
    }

    public String armSkuName() {
        return this.innerModel().armSkuName();
    }

    public String billingFrequency() {
        return this.innerModel().billingFrequency();
    }

    public String billingProfileId() {
        return this.innerModel().billingProfileId();
    }

    public String billingProfileName() {
        return this.innerModel().billingProfileName();
    }

    public String currency() {
        return this.innerModel().currency();
    }

    public String description() {
        return this.innerModel().description();
    }

    public OffsetDateTime eventDate() {
        return this.innerModel().eventDate();
    }

    public String eventType() {
        return this.innerModel().eventType();
    }

    public String invoice() {
        return this.innerModel().invoice();
    }

    public String invoiceId() {
        return this.innerModel().invoiceId();
    }

    public String invoiceSectionId() {
        return this.innerModel().invoiceSectionId();
    }

    public String invoiceSectionName() {
        return this.innerModel().invoiceSectionName();
    }

    public UUID purchasingSubscriptionGuid() {
        return this.innerModel().purchasingSubscriptionGuid();
    }

    public String purchasingSubscriptionName() {
        return this.innerModel().purchasingSubscriptionName();
    }

    public BigDecimal quantity() {
        return this.innerModel().quantity();
    }

    public String region() {
        return this.innerModel().region();
    }

    public String reservationOrderId() {
        return this.innerModel().reservationOrderId();
    }

    public String reservationOrderName() {
        return this.innerModel().reservationOrderName();
    }

    public String term() {
        return this.innerModel().term();
    }

    public ModernReservationTransactionInner innerModel() {
        return this.innerObject;
    }

    private ConsumptionManager manager() {
        return this.serviceManager;
    }
}
