/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingAccountBillingRoleAssignmentModel;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class BillingAccountBillingRoleAssignmentModelImpl extends CreatableUpdatableImpl<BillingAccountBillingRoleAssignmentModel, BillingRoleAssignmentInner, BillingAccountBillingRoleAssignmentModelImpl> implements BillingAccountBillingRoleAssignmentModel, BillingAccountBillingRoleAssignmentModel.Definition, BillingAccountBillingRoleAssignmentModel.Update {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingRoleAssignmentName;

    BillingAccountBillingRoleAssignmentModelImpl(String name, BillingManager manager) {
        super(name, new BillingRoleAssignmentInner());
        this.manager = manager;
        // Set resource name
        this.billingRoleAssignmentName = name;
        //
    }

    BillingAccountBillingRoleAssignmentModelImpl(BillingRoleAssignmentInner inner, BillingManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.billingRoleAssignmentName = inner.name();
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingRoleAssignmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingRoleAssignments");
        //
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingAccountBillingRoleAssignmentModel> createResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.putAsync(this.billingAccountName, this.billingRoleAssignmentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BillingAccountBillingRoleAssignmentModel> updateResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.putAsync(this.billingAccountName, this.billingRoleAssignmentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BillingRoleAssignmentInner> getInnerAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String billingRoleAssignmentName() {
        return this.inner().billingRoleAssignmentName();
    }

    @Override
    public String createdByPrincipalId() {
        return this.inner().createdByPrincipalId();
    }

    @Override
    public String createdByPrincipalTenantId() {
        return this.inner().createdByPrincipalTenantId();
    }

    @Override
    public String createdByUserEmailAddress() {
        return this.inner().createdByUserEmailAddress();
    }

    @Override
    public String createdOn() {
        return this.inner().createdOn();
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
    public String principalId() {
        return this.inner().principalId();
    }

    @Override
    public String principalTenantId() {
        return this.inner().principalTenantId();
    }

    @Override
    public String roleDefinitionId() {
        return this.inner().roleDefinitionId();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userAuthenticationType() {
        return this.inner().userAuthenticationType();
    }

    @Override
    public String userEmailAddress() {
        return this.inner().userEmailAddress();
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withExistingBillingAccount(String billingAccountName) {
        this.billingAccountName = billingAccountName;
        return this;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withPrincipalId(String principalId) {
        this.inner().withPrincipalId(principalId);
        return this;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withPrincipalTenantId(String principalTenantId) {
        this.inner().withPrincipalTenantId(principalTenantId);
        return this;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withRoleDefinitionId(String roleDefinitionId) {
        this.inner().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withUserAuthenticationType(String userAuthenticationType) {
        this.inner().withUserAuthenticationType(userAuthenticationType);
        return this;
    }

    @Override
    public BillingAccountBillingRoleAssignmentModelImpl withUserEmailAddress(String userEmailAddress) {
        this.inner().withUserEmailAddress(userEmailAddress);
        return this;
    }

}
