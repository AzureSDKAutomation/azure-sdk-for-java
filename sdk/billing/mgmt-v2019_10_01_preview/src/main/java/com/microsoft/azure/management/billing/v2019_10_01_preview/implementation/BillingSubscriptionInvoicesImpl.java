/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscriptionInvoices;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscriptionBillingAccountInvoice;
import com.microsoft.azure.management.billing.v2019_10_01_preview.DownloadUrl;

class BillingSubscriptionInvoicesImpl extends WrapperImpl<BillingSubscriptionInvoicesInner> implements BillingSubscriptionInvoices {
    private final BillingManager manager;

    BillingSubscriptionInvoicesImpl(BillingManager manager) {
        super(manager.inner().billingSubscriptionInvoices());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingSubscriptionBillingAccountInvoiceImpl wrapBillingSubscriptionBillingAccountInvoiceModel(InvoiceInner inner) {
        return  new BillingSubscriptionBillingAccountInvoiceImpl(inner, manager());
    }

    private Observable<InvoiceInner> getInvoiceInnerUsingBillingSubscriptionInvoicesInnerAsync(String id) {
        String billingSubscriptionName = IdParsingUtils.getValueFromIdByName(id, "billingSubscriptions");
        String invoiceName = IdParsingUtils.getValueFromIdByName(id, "invoices");
        BillingSubscriptionInvoicesInner client = this.inner();
        return client.getByIdAsync(billingSubscriptionName, invoiceName);
    }

    @Override
    public Observable<BillingSubscriptionBillingAccountInvoice> getByIdAsync(String billingSubscriptionName, String invoiceName) {
        BillingSubscriptionInvoicesInner client = this.inner();
        return client.getByIdAsync(billingSubscriptionName, invoiceName)
        .flatMap(new Func1<InvoiceInner, Observable<BillingSubscriptionBillingAccountInvoice>>() {
            @Override
            public Observable<BillingSubscriptionBillingAccountInvoice> call(InvoiceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BillingSubscriptionBillingAccountInvoice)wrapBillingSubscriptionBillingAccountInvoiceModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<DownloadUrl> downloadAsync(String billingSubscriptionName, String invoiceName) {
        BillingSubscriptionInvoicesInner client = this.inner();
        return client.downloadAsync(billingSubscriptionName, invoiceName)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

}
