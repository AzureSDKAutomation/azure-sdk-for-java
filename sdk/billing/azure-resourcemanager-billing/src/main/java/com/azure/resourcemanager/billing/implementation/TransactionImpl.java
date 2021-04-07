// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.TransactionInner;
import com.azure.resourcemanager.billing.models.Amount;
import com.azure.resourcemanager.billing.models.ReservationType;
import com.azure.resourcemanager.billing.models.Transaction;
import com.azure.resourcemanager.billing.models.TransactionTypeKind;
import java.time.OffsetDateTime;

public final class TransactionImpl implements Transaction {
    private TransactionInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    TransactionImpl(TransactionInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
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

    public TransactionTypeKind kind() {
        return this.innerModel().kind();
    }

    public OffsetDateTime date() {
        return this.innerModel().date();
    }

    public String invoice() {
        return this.innerModel().invoice();
    }

    public String invoiceId() {
        return this.innerModel().invoiceId();
    }

    public String orderId() {
        return this.innerModel().orderId();
    }

    public String orderName() {
        return this.innerModel().orderName();
    }

    public String productFamily() {
        return this.innerModel().productFamily();
    }

    public String productTypeId() {
        return this.innerModel().productTypeId();
    }

    public String productType() {
        return this.innerModel().productType();
    }

    public String productDescription() {
        return this.innerModel().productDescription();
    }

    public ReservationType transactionType() {
        return this.innerModel().transactionType();
    }

    public Amount transactionAmount() {
        return this.innerModel().transactionAmount();
    }

    public Integer quantity() {
        return this.innerModel().quantity();
    }

    public String invoiceSectionId() {
        return this.innerModel().invoiceSectionId();
    }

    public String invoiceSectionDisplayName() {
        return this.innerModel().invoiceSectionDisplayName();
    }

    public String billingProfileId() {
        return this.innerModel().billingProfileId();
    }

    public String billingProfileDisplayName() {
        return this.innerModel().billingProfileDisplayName();
    }

    public String customerId() {
        return this.innerModel().customerId();
    }

    public String customerDisplayName() {
        return this.innerModel().customerDisplayName();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String subscriptionName() {
        return this.innerModel().subscriptionName();
    }

    public String azurePlan() {
        return this.innerModel().azurePlan();
    }

    public Amount azureCreditApplied() {
        return this.innerModel().azureCreditApplied();
    }

    public String billingCurrency() {
        return this.innerModel().billingCurrency();
    }

    public Float discount() {
        return this.innerModel().discount();
    }

    public Amount effectivePrice() {
        return this.innerModel().effectivePrice();
    }

    public Float exchangeRate() {
        return this.innerModel().exchangeRate();
    }

    public Amount marketPrice() {
        return this.innerModel().marketPrice();
    }

    public String pricingCurrency() {
        return this.innerModel().pricingCurrency();
    }

    public OffsetDateTime servicePeriodStartDate() {
        return this.innerModel().servicePeriodStartDate();
    }

    public OffsetDateTime servicePeriodEndDate() {
        return this.innerModel().servicePeriodEndDate();
    }

    public Amount subTotal() {
        return this.innerModel().subTotal();
    }

    public Amount tax() {
        return this.innerModel().tax();
    }

    public String unitOfMeasure() {
        return this.innerModel().unitOfMeasure();
    }

    public Float units() {
        return this.innerModel().units();
    }

    public String unitType() {
        return this.innerModel().unitType();
    }

    public TransactionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
