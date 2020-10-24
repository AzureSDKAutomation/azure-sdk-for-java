/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Application;
import rx.Observable;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPatchable;
import java.util.List;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Sku;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ProvisioningState;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationBillingDetailsDefinition;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationJitAccessPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationAuthorization;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationManagementMode;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageContact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageSupportUrls;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationArtifact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationClientDetails;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Plan;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Identity;
import com.microsoft.azure.management.managedapplications.v2019_07_01.PlanPatchable;
import rx.functions.Func1;

class ApplicationImpl extends GroupableResourceCoreImpl<Application, ApplicationInner, ApplicationImpl, ManagedApplicationsManager> implements Application, Application.Definition, Application.Update {
    private ApplicationPatchable updateParameter;
    ApplicationImpl(String name, ApplicationInner inner, ManagedApplicationsManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ApplicationPatchable();
    }

    @Override
    public Observable<Application> createResourceAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ApplicationInner, ApplicationInner>() {
               @Override
               public ApplicationInner call(ApplicationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Application> updateResourceAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ApplicationInner, ApplicationInner>() {
               @Override
               public ApplicationInner call(ApplicationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationInner> getInnerAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ApplicationPatchable();
    }

    @Override
    public String applicationDefinitionId() {
        return this.inner().applicationDefinitionId();
    }

    @Override
    public List<ApplicationArtifact> artifacts() {
        return this.inner().artifacts();
    }

    @Override
    public List<ApplicationAuthorization> authorizations() {
        return this.inner().authorizations();
    }

    @Override
    public ApplicationBillingDetailsDefinition billingDetails() {
        return this.inner().billingDetails();
    }

    @Override
    public ApplicationClientDetails createdBy() {
        return this.inner().createdBy();
    }

    @Override
    public ApplicationPackageContact customerSupport() {
        return this.inner().customerSupport();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public ApplicationJitAccessPolicy jitAccessPolicy() {
        return this.inner().jitAccessPolicy();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public String managedResourceGroupId() {
        return this.inner().managedResourceGroupId();
    }

    @Override
    public ApplicationManagementMode managementMode() {
        return this.inner().managementMode();
    }

    @Override
    public Object outputs() {
        return this.inner().outputs();
    }

    @Override
    public Object parameters() {
        return this.inner().parameters();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String publisherTenantId() {
        return this.inner().publisherTenantId();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public ApplicationPackageSupportUrls supportUrls() {
        return this.inner().supportUrls();
    }

    @Override
    public ApplicationClientDetails updatedBy() {
        return this.inner().updatedBy();
    }

    @Override
    public ApplicationImpl withPlan(Plan plan) {
        this.inner().withPlan(plan);
        return this;
    }

    @Override
    public ApplicationImpl withPlan(PlanPatchable plan) {
        this.updateParameter.withPlan(plan);
        return this;
    }

    @Override
    public ApplicationImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public ApplicationImpl withApplicationDefinitionId(String applicationDefinitionId) {
        if (isInCreateMode()) {
            this.inner().withApplicationDefinitionId(applicationDefinitionId);
        } else {
            this.updateParameter.withApplicationDefinitionId(applicationDefinitionId);
        }
        return this;
    }

    @Override
    public ApplicationImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public ApplicationImpl withJitAccessPolicy(ApplicationJitAccessPolicy jitAccessPolicy) {
        if (isInCreateMode()) {
            this.inner().withJitAccessPolicy(jitAccessPolicy);
        } else {
            this.updateParameter.withJitAccessPolicy(jitAccessPolicy);
        }
        return this;
    }

    @Override
    public ApplicationImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.inner().withManagedBy(managedBy);
        } else {
            this.updateParameter.withManagedBy(managedBy);
        }
        return this;
    }

    @Override
    public ApplicationImpl withManagedResourceGroupId(String managedResourceGroupId) {
        if (isInCreateMode()) {
            this.inner().withManagedResourceGroupId(managedResourceGroupId);
        } else {
            this.updateParameter.withManagedResourceGroupId(managedResourceGroupId);
        }
        return this;
    }

    @Override
    public ApplicationImpl withParameters(Object parameters) {
        if (isInCreateMode()) {
            this.inner().withParameters(parameters);
        } else {
            this.updateParameter.withParameters(parameters);
        }
        return this;
    }

    @Override
    public ApplicationImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
