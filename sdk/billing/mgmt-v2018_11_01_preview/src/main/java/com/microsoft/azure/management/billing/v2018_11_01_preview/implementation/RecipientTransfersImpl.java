/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.RecipientTransfers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2018_11_01_preview.RecipientTransferDetails;

class RecipientTransfersImpl extends WrapperImpl<RecipientTransfersInner> implements RecipientTransfers {
    private final BillingManager manager;

    RecipientTransfersImpl(BillingManager manager) {
        super(manager.inner().recipientTransfers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecipientTransferDetails> acceptAsync(String transferName) {
        RecipientTransfersInner client = this.inner();
        return client.acceptAsync(transferName)
        .map(new Func1<RecipientTransferDetailsInner, RecipientTransferDetails>() {
            @Override
            public RecipientTransferDetails call(RecipientTransferDetailsInner inner) {
                return new RecipientTransferDetailsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecipientTransferDetails> declineAsync(String transferName) {
        RecipientTransfersInner client = this.inner();
        return client.declineAsync(transferName)
        .map(new Func1<RecipientTransferDetailsInner, RecipientTransferDetails>() {
            @Override
            public RecipientTransferDetails call(RecipientTransferDetailsInner inner) {
                return new RecipientTransferDetailsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecipientTransferDetails> getAsync(String transferName) {
        RecipientTransfersInner client = this.inner();
        return client.getAsync(transferName)
        .map(new Func1<RecipientTransferDetailsInner, RecipientTransferDetails>() {
            @Override
            public RecipientTransferDetails call(RecipientTransferDetailsInner inner) {
                return new RecipientTransferDetailsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecipientTransferDetails> listAsync() {
        RecipientTransfersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RecipientTransferDetailsInner>, Iterable<RecipientTransferDetailsInner>>() {
            @Override
            public Iterable<RecipientTransferDetailsInner> call(Page<RecipientTransferDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecipientTransferDetailsInner, RecipientTransferDetails>() {
            @Override
            public RecipientTransferDetails call(RecipientTransferDetailsInner inner) {
                return new RecipientTransferDetailsImpl(inner, manager());
            }
        });
    }

}
