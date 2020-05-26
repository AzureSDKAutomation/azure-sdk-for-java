/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_10_01.UsageDetails;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.consumption.v2018_10_01.UsageDetail;

class UsageDetailsImpl extends WrapperImpl<UsageDetailsInner> implements UsageDetails {
    private final ConsumptionManager manager;

    UsageDetailsImpl(ConsumptionManager manager) {
        super(manager.inner().usageDetails());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<UsageDetail> listByBillingPeriodAsync(final String billingPeriodName) {
        UsageDetailsInner client = this.inner();
        return client.listByBillingPeriodAsync(billingPeriodName)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listByBillingAccountAsync(final String billingAccountId) {
        UsageDetailsInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountId)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listForBillingPeriodByBillingAccountAsync(final String billingAccountId, final String billingPeriodName) {
        UsageDetailsInner client = this.inner();
        return client.listForBillingPeriodByBillingAccountAsync(billingAccountId, billingPeriodName)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listByDepartmentAsync(final String departmentId) {
        UsageDetailsInner client = this.inner();
        return client.listByDepartmentAsync(departmentId)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listForBillingPeriodByDepartmentAsync(final String departmentId, final String billingPeriodName) {
        UsageDetailsInner client = this.inner();
        return client.listForBillingPeriodByDepartmentAsync(departmentId, billingPeriodName)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listByEnrollmentAccountAsync(final String enrollmentAccountId) {
        UsageDetailsInner client = this.inner();
        return client.listByEnrollmentAccountAsync(enrollmentAccountId)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listForBillingPeriodByEnrollmentAccountAsync(final String enrollmentAccountId, final String billingPeriodName) {
        UsageDetailsInner client = this.inner();
        return client.listForBillingPeriodByEnrollmentAccountAsync(enrollmentAccountId, billingPeriodName)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listByManagementGroupAsync(final String managementGroupId) {
        UsageDetailsInner client = this.inner();
        return client.listByManagementGroupAsync(managementGroupId)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listForBillingPeriodByManagementGroupAsync(final String managementGroupId, final String billingPeriodName) {
        UsageDetailsInner client = this.inner();
        return client.listForBillingPeriodByManagementGroupAsync(managementGroupId, billingPeriodName)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UsageDetail> listAsync() {
        UsageDetailsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

}
