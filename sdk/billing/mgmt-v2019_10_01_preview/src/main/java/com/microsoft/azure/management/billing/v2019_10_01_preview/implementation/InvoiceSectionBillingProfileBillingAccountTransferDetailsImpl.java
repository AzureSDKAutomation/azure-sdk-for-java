/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceSectionBillingProfileBillingAccountTransferDetails;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.DetailedTransferStatus;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferStatus;

class InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl extends IndexableRefreshableWrapperImpl<InvoiceSectionBillingProfileBillingAccountTransferDetails, TransferDetailsInner> implements InvoiceSectionBillingProfileBillingAccountTransferDetails {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingProfileName;
    private String invoiceSectionName;
    private String transferName;

    InvoiceSectionBillingProfileBillingAccountTransferDetailsImpl(TransferDetailsInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingProfileName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingProfiles");
        this.invoiceSectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "invoiceSections");
        this.transferName = IdParsingUtils.getValueFromIdByName(inner.id(), "transfers");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<TransferDetailsInner> getInnerAsync() {
        TransfersInner client = this.manager().inner().transfers();
        return client.getAsync(this.billingAccountName, this.billingProfileName, this.invoiceSectionName, this.transferName);
    }



    @Override
    public String billingAccountId() {
        return this.inner().billingAccountId();
    }

    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
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
    public String invoiceSectionId() {
        return this.inner().invoiceSectionId();
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
