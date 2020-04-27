/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2019_01_01.Balances;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2019_01_01.Balance;

class BalancesImpl extends WrapperImpl<BalancesInner> implements Balances {
    private final ConsumptionManager manager;

    BalancesImpl(ConsumptionManager manager) {
        super(manager.inner().balances());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Balance> getByBillingAccountAsync(String billingAccountId) {
        BalancesInner client = this.inner();
        return client.getByBillingAccountAsync(billingAccountId)
        .map(new Func1<BalanceInner, Balance>() {
            @Override
            public Balance call(BalanceInner inner) {
                return new BalanceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Balance> getForBillingPeriodByBillingAccountAsync(String billingAccountId, String billingPeriodName) {
        BalancesInner client = this.inner();
        return client.getForBillingPeriodByBillingAccountAsync(billingAccountId, billingPeriodName)
        .map(new Func1<BalanceInner, Balance>() {
            @Override
            public Balance call(BalanceInner inner) {
                return new BalanceImpl(inner, manager());
            }
        });
    }

}
