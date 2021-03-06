// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner;
import com.azure.resourcemanager.billing.models.BillingRoleAssignment;

public final class BillingRoleAssignmentImpl implements BillingRoleAssignment {
    private BillingRoleAssignmentInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    BillingRoleAssignmentImpl(
        BillingRoleAssignmentInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String createdOn() {
        return this.innerModel().createdOn();
    }

    public String createdByPrincipalTenantId() {
        return this.innerModel().createdByPrincipalTenantId();
    }

    public String createdByPrincipalId() {
        return this.innerModel().createdByPrincipalId();
    }

    public String createdByUserEmailAddress() {
        return this.innerModel().createdByUserEmailAddress();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public String principalTenantId() {
        return this.innerModel().principalTenantId();
    }

    public String roleDefinitionId() {
        return this.innerModel().roleDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public String userAuthenticationType() {
        return this.innerModel().userAuthenticationType();
    }

    public String userEmailAddress() {
        return this.innerModel().userEmailAddress();
    }

    public BillingRoleAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
