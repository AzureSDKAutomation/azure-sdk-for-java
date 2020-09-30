/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.Transfers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.TransferDetails;

class TransfersImpl extends WrapperImpl<TransfersInner> implements Transfers {
    private final BillingManager manager;

    TransfersImpl(BillingManager manager) {
        super(manager.inner().transfers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public TransferDetailsImpl define(String name) {
        return wrapModel(name);
    }

    private TransferDetailsImpl wrapModel(TransferDetailsInner inner) {
        return  new TransferDetailsImpl(inner, manager());
    }

    private TransferDetailsImpl wrapModel(String name) {
        return new TransferDetailsImpl(name, this.manager());
    }

    @Override
    public Observable<TransferDetails> cancelAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String transferName) {
        TransfersInner client = this.inner();
        return client.cancelAsync(billingAccountName, billingProfileName, invoiceSectionName, transferName)
        .map(new Func1<TransferDetailsInner, TransferDetails>() {
            @Override
            public TransferDetails call(TransferDetailsInner inner) {
                return new TransferDetailsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransferDetails> listAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName) {
        TransfersInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName, invoiceSectionName)
        .flatMapIterable(new Func1<Page<TransferDetailsInner>, Iterable<TransferDetailsInner>>() {
            @Override
            public Iterable<TransferDetailsInner> call(Page<TransferDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransferDetailsInner, TransferDetails>() {
            @Override
            public TransferDetails call(TransferDetailsInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<TransferDetails> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String transferName) {
        TransfersInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, invoiceSectionName, transferName)
        .flatMap(new Func1<TransferDetailsInner, Observable<TransferDetails>>() {
            @Override
            public Observable<TransferDetails> call(TransferDetailsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TransferDetails)wrapModel(inner));
                }
            }
       });
    }

}
