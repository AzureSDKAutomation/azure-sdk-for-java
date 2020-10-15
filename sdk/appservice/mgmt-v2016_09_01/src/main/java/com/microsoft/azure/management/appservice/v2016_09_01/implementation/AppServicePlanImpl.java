/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2016_09_01.AppServicePlan;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2016_09_01.AppServicePlanPatchResource;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2016_09_01.StatusOptions;
import com.microsoft.azure.management.appservice.v2016_09_01.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v2016_09_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2016_09_01.SkuDescription;
import rx.functions.Func1;

class AppServicePlanImpl extends GroupableResourceCoreImpl<AppServicePlan, AppServicePlanInner, AppServicePlanImpl, WebManager> implements AppServicePlan, AppServicePlan.Definition, AppServicePlan.Update {
    private AppServicePlanPatchResource updateParameter;
    AppServicePlanImpl(String name, AppServicePlanInner inner, WebManager manager) {
        super(name, inner, manager);
        this.updateParameter = new AppServicePlanPatchResource();
    }

    @Override
    public Observable<AppServicePlan> createResourceAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<AppServicePlanInner, AppServicePlanInner>() {
               @Override
               public AppServicePlanInner call(AppServicePlanInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AppServicePlan> updateResourceAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<AppServicePlanInner, AppServicePlanInner>() {
               @Override
               public AppServicePlanInner call(AppServicePlanInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppServicePlanInner> getInnerAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AppServicePlanPatchResource();
    }

    @Override
    public String adminSiteName() {
        return this.inner().adminSiteName();
    }

    @Override
    public String appServicePlanName() {
        return this.inner().appServicePlanName();
    }

    @Override
    public String geoRegion() {
        return this.inner().geoRegion();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.inner().hostingEnvironmentProfile();
    }

    @Override
    public Boolean isSpot() {
        return this.inner().isSpot();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public Integer maximumNumberOfWorkers() {
        return this.inner().maximumNumberOfWorkers();
    }

    @Override
    public Integer numberOfSites() {
        return this.inner().numberOfSites();
    }

    @Override
    public Boolean perSiteScaling() {
        return this.inner().perSiteScaling();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Boolean reserved() {
        return this.inner().reserved();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public SkuDescription sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime spotExpirationTime() {
        return this.inner().spotExpirationTime();
    }

    @Override
    public StatusOptions status() {
        return this.inner().status();
    }

    @Override
    public String subscription() {
        return this.inner().subscription();
    }

    @Override
    public Integer targetWorkerCount() {
        return this.inner().targetWorkerCount();
    }

    @Override
    public Integer targetWorkerSizeId() {
        return this.inner().targetWorkerSizeId();
    }

    @Override
    public String workerTierName() {
        return this.inner().workerTierName();
    }

    @Override
    public AppServicePlanImpl withAppServicePlanName(String appServicePlanName) {
        this.inner().withAppServicePlanName(appServicePlanName);
        return this;
    }

    @Override
    public AppServicePlanImpl withSku(SkuDescription sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public AppServicePlanImpl withAdminSiteName(String adminSiteName) {
        if (isInCreateMode()) {
            this.inner().withAdminSiteName(adminSiteName);
        } else {
            this.updateParameter.withAdminSiteName(adminSiteName);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        if (isInCreateMode()) {
            this.inner().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        } else {
            this.updateParameter.withHostingEnvironmentProfile(hostingEnvironmentProfile);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withIsSpot(Boolean isSpot) {
        if (isInCreateMode()) {
            this.inner().withIsSpot(isSpot);
        } else {
            this.updateParameter.withIsSpot(isSpot);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withPerSiteScaling(Boolean perSiteScaling) {
        if (isInCreateMode()) {
            this.inner().withPerSiteScaling(perSiteScaling);
        } else {
            this.updateParameter.withPerSiteScaling(perSiteScaling);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withReserved(Boolean reserved) {
        if (isInCreateMode()) {
            this.inner().withReserved(reserved);
        } else {
            this.updateParameter.withReserved(reserved);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withSpotExpirationTime(DateTime spotExpirationTime) {
        if (isInCreateMode()) {
            this.inner().withSpotExpirationTime(spotExpirationTime);
        } else {
            this.updateParameter.withSpotExpirationTime(spotExpirationTime);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withTargetWorkerCount(Integer targetWorkerCount) {
        if (isInCreateMode()) {
            this.inner().withTargetWorkerCount(targetWorkerCount);
        } else {
            this.updateParameter.withTargetWorkerCount(targetWorkerCount);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        if (isInCreateMode()) {
            this.inner().withTargetWorkerSizeId(targetWorkerSizeId);
        } else {
            this.updateParameter.withTargetWorkerSizeId(targetWorkerSizeId);
        }
        return this;
    }

    @Override
    public AppServicePlanImpl withWorkerTierName(String workerTierName) {
        if (isInCreateMode()) {
            this.inner().withWorkerTierName(workerTierName);
        } else {
            this.updateParameter.withWorkerTierName(workerTierName);
        }
        return this;
    }

}
