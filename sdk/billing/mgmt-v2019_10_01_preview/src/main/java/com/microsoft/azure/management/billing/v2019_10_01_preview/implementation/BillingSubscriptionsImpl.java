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
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscriptions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscription;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscriptionsListResult;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferBillingSubscriptionResult;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ValidateSubscriptionTransferEligibilityResult;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferBillingSubscriptionRequestProperties;

class BillingSubscriptionsImpl extends WrapperImpl<BillingSubscriptionsInner> implements BillingSubscriptions {
    private final BillingManager manager;

    BillingSubscriptionsImpl(BillingManager manager) {
        super(manager.inner().billingSubscriptions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingSubscriptionImpl wrapModel(BillingSubscriptionInner inner) {
        return  new BillingSubscriptionImpl(inner, manager());
    }

    @Override
    public Observable<BillingSubscription> listByBillingAccountAsync(final String billingAccountName) {
        BillingSubscriptionsInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<BillingSubscriptionInner>, Iterable<BillingSubscriptionInner>>() {
            @Override
            public Iterable<BillingSubscriptionInner> call(Page<BillingSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingSubscriptionInner, BillingSubscription>() {
            @Override
            public BillingSubscription call(BillingSubscriptionInner inner) {
                return new BillingSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingSubscriptionsListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName) {
        BillingSubscriptionsInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingSubscriptionsListResultInner, BillingSubscriptionsListResult>() {
            @Override
            public BillingSubscriptionsListResult call(BillingSubscriptionsListResultInner inner) {
                return new BillingSubscriptionsListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingSubscriptionsListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        BillingSubscriptionsInner client = this.inner();
        return client.listByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName)
        .map(new Func1<BillingSubscriptionsListResultInner, BillingSubscriptionsListResult>() {
            @Override
            public BillingSubscriptionsListResult call(BillingSubscriptionsListResultInner inner) {
                return new BillingSubscriptionsListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingSubscription> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingSubscriptionName) {
        BillingSubscriptionsInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, invoiceSectionName, billingSubscriptionName)
        .map(new Func1<BillingSubscriptionInner, BillingSubscription>() {
            @Override
            public BillingSubscription call(BillingSubscriptionInner inner) {
                return new BillingSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransferBillingSubscriptionResult> transferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingSubscriptionName, TransferBillingSubscriptionRequestProperties parameters) {
        BillingSubscriptionsInner client = this.inner();
        return client.transferAsync(billingAccountName, billingProfileName, invoiceSectionName, billingSubscriptionName, parameters)
        .map(new Func1<TransferBillingSubscriptionResultInner, TransferBillingSubscriptionResult>() {
            @Override
            public TransferBillingSubscriptionResult call(TransferBillingSubscriptionResultInner inner) {
                return new TransferBillingSubscriptionResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ValidateSubscriptionTransferEligibilityResult> validateTransferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingSubscriptionName, TransferBillingSubscriptionRequestProperties parameters) {
        BillingSubscriptionsInner client = this.inner();
        return client.validateTransferAsync(billingAccountName, billingProfileName, invoiceSectionName, billingSubscriptionName, parameters)
        .map(new Func1<ValidateSubscriptionTransferEligibilityResultInner, ValidateSubscriptionTransferEligibilityResult>() {
            @Override
            public ValidateSubscriptionTransferEligibilityResult call(ValidateSubscriptionTransferEligibilityResultInner inner) {
                return new ValidateSubscriptionTransferEligibilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingSubscription> listByCustomerAsync(final String billingAccountName, final String customerName) {
        BillingSubscriptionsInner client = this.inner();
        return client.listByCustomerAsync(billingAccountName, customerName)
        .flatMapIterable(new Func1<Page<BillingSubscriptionInner>, Iterable<BillingSubscriptionInner>>() {
            @Override
            public Iterable<BillingSubscriptionInner> call(Page<BillingSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingSubscriptionInner, BillingSubscription>() {
            @Override
            public BillingSubscription call(BillingSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BillingSubscription> getByCustomerAsync(String billingAccountName, String customerName, String billingSubscriptionName) {
        BillingSubscriptionsInner client = this.inner();
        return client.getByCustomerAsync(billingAccountName, customerName, billingSubscriptionName)
        .flatMap(new Func1<BillingSubscriptionInner, Observable<BillingSubscription>>() {
            @Override
            public Observable<BillingSubscription> call(BillingSubscriptionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BillingSubscription)wrapModel(inner));
                }
            }
       });
    }

}
