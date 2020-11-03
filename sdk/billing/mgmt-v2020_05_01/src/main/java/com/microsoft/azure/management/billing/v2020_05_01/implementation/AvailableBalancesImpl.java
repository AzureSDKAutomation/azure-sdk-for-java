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
import com.microsoft.azure.management.billing.v2020_05_01.AvailableBalances;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2020_05_01.AvailableBalance;

class AvailableBalancesImpl extends WrapperImpl<AvailableBalancesInner> implements AvailableBalances {
    private final BillingManager manager;

    AvailableBalancesImpl(BillingManager manager) {
        super(manager.inner().availableBalances());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AvailableBalance> getAsync(String billingAccountName, String billingProfileName) {
        AvailableBalancesInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName)
        .map(new Func1<AvailableBalanceInner, AvailableBalance>() {
            @Override
            public AvailableBalance call(AvailableBalanceInner inner) {
                return new AvailableBalanceImpl(inner, manager());
            }
        });
    }

}
