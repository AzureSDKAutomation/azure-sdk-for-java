/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.management.billing.v2020_05_01.PartnerTransferDetails;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.billing.v2020_05_01.DetailedTransferStatus;
import com.microsoft.azure.management.billing.v2020_05_01.TransferStatus;

class PartnerTransferDetailsImpl extends IndexableRefreshableWrapperImpl<PartnerTransferDetails, PartnerTransferDetailsInner> implements PartnerTransferDetails {
    private final BillingManager manager;
    private String billingAccountName;
    private String customerName;
    private String transferName;

    PartnerTransferDetailsImpl(PartnerTransferDetailsInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.customerName = IdParsingUtils.getValueFromIdByName(inner.id(), "customers");
        this.transferName = IdParsingUtils.getValueFromIdByName(inner.id(), "transfers");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<PartnerTransferDetailsInner> getInnerAsync() {
        PartnerTransfersInner client = this.manager().inner().partnerTransfers();
        return client.getAsync(this.billingAccountName, this.customerName, this.transferName);
    }



    @Override
    public String canceledBy() {
        return this.inner().canceledBy();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public List<DetailedTransferStatus> detailedTransferStatus() {
        return this.inner().detailedTransferStatus();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String initiatorCustomerType() {
        return this.inner().initiatorCustomerType();
    }

    @Override
    public String initiatorEmailId() {
        return this.inner().initiatorEmailId();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String recipientEmailId() {
        return this.inner().recipientEmailId();
    }

    @Override
    public String resellerId() {
        return this.inner().resellerId();
    }

    @Override
    public String resellerName() {
        return this.inner().resellerName();
    }

    @Override
    public TransferStatus transferStatus() {
        return this.inner().transferStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
