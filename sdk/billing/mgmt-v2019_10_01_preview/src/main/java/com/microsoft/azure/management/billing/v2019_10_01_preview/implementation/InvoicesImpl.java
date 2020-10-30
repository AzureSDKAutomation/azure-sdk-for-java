/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Invoices;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceListResult;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Invoice;
import com.microsoft.azure.management.billing.v2019_10_01_preview.DownloadUrl;
import java.util.List;

class InvoicesImpl extends WrapperImpl<InvoicesInner> implements Invoices {
    private final BillingManager manager;

    InvoicesImpl(BillingManager manager) {
        super(manager.inner().invoices());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private InvoiceImpl wrapModel(InvoiceInner inner) {
        return  new InvoiceImpl(inner, manager());
    }

    @Override
    public Observable<InvoiceListResult> listByBillingAccountAsync(String billingAccountName, String periodStartDate, String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName, periodStartDate, periodEndDate)
        .map(new Func1<InvoiceListResultInner, InvoiceListResult>() {
            @Override
            public InvoiceListResult call(InvoiceListResultInner inner) {
                return new InvoiceListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<InvoiceListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName, String periodStartDate, String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName, periodStartDate, periodEndDate)
        .map(new Func1<InvoiceListResultInner, InvoiceListResult>() {
            @Override
            public InvoiceListResult call(InvoiceListResultInner inner) {
                return new InvoiceListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> getAsync(String billingAccountName, String billingProfileName, String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, invoiceName)
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> listByBillingSubscriptionAsync(final String billingAccountName, final String billingSubscriptionName, final String periodStartDate, final String periodEndDate) {
        InvoicesInner client = this.inner();
        return client.listByBillingSubscriptionAsync(billingAccountName, billingSubscriptionName, periodStartDate, periodEndDate)
        .flatMapIterable(new Func1<Page<InvoiceInner>, Iterable<InvoiceInner>>() {
            @Override
            public Iterable<InvoiceInner> call(Page<InvoiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> getByIdAsync(String billingAccountName, String billingSubscriptionName, String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getByIdAsync(billingAccountName, billingSubscriptionName, invoiceName)
        .map(new Func1<InvoiceInner, Invoice>() {
            @Override
            public Invoice call(InvoiceInner inner) {
                return new InvoiceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Invoice> getBillingAccountInvoiceAsync(String billingAccountName, String invoiceName) {
        InvoicesInner client = this.inner();
        return client.getBillingAccountInvoiceAsync(billingAccountName, invoiceName)
        .flatMap(new Func1<InvoiceInner, Observable<Invoice>>() {
            @Override
            public Observable<Invoice> call(InvoiceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Invoice)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<DownloadUrl> downloadMultipleEAInvoicesAsync(String billingAccountName, List<String> downloadUrls) {
        InvoicesInner client = this.inner();
        return client.downloadMultipleEAInvoicesAsync(billingAccountName, downloadUrls)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DownloadUrl> downloadMultipleBillingSubscriptionInvoicesAsync(List<String> downloadUrls) {
        InvoicesInner client = this.inner();
        return client.downloadMultipleBillingSubscriptionInvoicesAsync(downloadUrls)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DownloadUrl> downloadMultipleBillingProfileInvoicesAsync(String billingAccountName, String billingProfileName, List<String> downloadUrls) {
        InvoicesInner client = this.inner();
        return client.downloadMultipleBillingProfileInvoicesAsync(billingAccountName, billingProfileName, downloadUrls)
        .map(new Func1<DownloadUrlInner, DownloadUrl>() {
            @Override
            public DownloadUrl call(DownloadUrlInner inner) {
                return new DownloadUrlImpl(inner, manager());
            }
        });
    }

}
