/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccount;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Department;
import org.joda.time.DateTime;

class EnrollmentAccountImpl extends IndexableRefreshableWrapperImpl<EnrollmentAccount, EnrollmentAccountInner> implements EnrollmentAccount {
    private final BillingManager manager;
    private String billingAccountName;
    private String enrollmentAccountName;

    EnrollmentAccountImpl(EnrollmentAccountInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.enrollmentAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "enrollmentAccounts");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<EnrollmentAccountInner> getInnerAsync() {
        EnrollmentAccountsInner client = this.manager().inner().enrollmentAccounts();
        return client.getByEnrollmentAccountIdAsync(this.billingAccountName, this.enrollmentAccountName);
    }



    @Override
    public String accountName() {
        return this.inner().accountName();
    }

    @Override
    public String accountOwner() {
        return this.inner().accountOwner();
    }

    @Override
    public String costCenter() {
        return this.inner().costCenter();
    }

    @Override
    public Department department() {
        DepartmentInner inner = this.inner().department();
        if (inner != null) {
            return  new DepartmentImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public DateTime endDate() {
        return this.inner().endDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime startDate() {
        return this.inner().startDate();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
