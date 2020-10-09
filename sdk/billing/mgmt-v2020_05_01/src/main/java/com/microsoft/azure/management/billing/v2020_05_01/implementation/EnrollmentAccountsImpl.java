/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.EnrollmentAccounts;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.EnrollmentAccountSummary;

class EnrollmentAccountsImpl extends WrapperImpl<EnrollmentAccountsInner> implements EnrollmentAccounts {
    private final BillingManager manager;

    EnrollmentAccountsImpl(BillingManager manager) {
        super(manager.inner().enrollmentAccounts());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EnrollmentAccountSummary> getAsync(String name) {
        EnrollmentAccountsInner client = this.inner();
        return client.getAsync(name)
        .map(new Func1<EnrollmentAccountSummaryInner, EnrollmentAccountSummary>() {
            @Override
            public EnrollmentAccountSummary call(EnrollmentAccountSummaryInner inner) {
                return new EnrollmentAccountSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EnrollmentAccountSummary> listAsync() {
        EnrollmentAccountsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EnrollmentAccountSummaryInner>, Iterable<EnrollmentAccountSummaryInner>>() {
            @Override
            public Iterable<EnrollmentAccountSummaryInner> call(Page<EnrollmentAccountSummaryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EnrollmentAccountSummaryInner, EnrollmentAccountSummary>() {
            @Override
            public EnrollmentAccountSummary call(EnrollmentAccountSummaryInner inner) {
                return new EnrollmentAccountSummaryImpl(inner, manager());
            }
        });
    }

}
