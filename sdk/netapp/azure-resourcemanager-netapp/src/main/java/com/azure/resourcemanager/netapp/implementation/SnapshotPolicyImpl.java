// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.NetAppManager;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.SnapshotPolicy;
import com.azure.resourcemanager.netapp.models.SnapshotPolicyPatch;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.Collections;
import java.util.Map;

public final class SnapshotPolicyImpl implements SnapshotPolicy, SnapshotPolicy.Definition, SnapshotPolicy.Update {
    private SnapshotPolicyInner innerObject;

    private final NetAppManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public HourlySchedule hourlySchedule() {
        return this.innerModel().hourlySchedule();
    }

    public DailySchedule dailySchedule() {
        return this.innerModel().dailySchedule();
    }

    public WeeklySchedule weeklySchedule() {
        return this.innerModel().weeklySchedule();
    }

    public MonthlySchedule monthlySchedule() {
        return this.innerModel().monthlySchedule();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SnapshotPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetAppManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String snapshotPolicyName;

    private SnapshotPolicyPatch updateBody;

    public SnapshotPolicyImpl withExistingNetAppAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public SnapshotPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .createWithResponse(resourceGroupName, accountName, snapshotPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SnapshotPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .createWithResponse(resourceGroupName, accountName, snapshotPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SnapshotPolicyImpl(String name, NetAppManager serviceManager) {
        this.innerObject = new SnapshotPolicyInner();
        this.serviceManager = serviceManager;
        this.snapshotPolicyName = name;
    }

    public SnapshotPolicyImpl update() {
        this.updateBody = new SnapshotPolicyPatch();
        return this;
    }

    public SnapshotPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .update(resourceGroupName, accountName, snapshotPolicyName, updateBody, Context.NONE);
        return this;
    }

    public SnapshotPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .update(resourceGroupName, accountName, snapshotPolicyName, updateBody, context);
        return this;
    }

    SnapshotPolicyImpl(SnapshotPolicyInner innerObject, NetAppManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.snapshotPolicyName = Utils.getValueFromIdByName(innerObject.id(), "snapshotPolicies");
    }

    public SnapshotPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .getWithResponse(resourceGroupName, accountName, snapshotPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public SnapshotPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshotPolicies()
                .getWithResponse(resourceGroupName, accountName, snapshotPolicyName, context)
                .getValue();
        return this;
    }

    public SnapshotPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SnapshotPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SnapshotPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public SnapshotPolicyImpl withHourlySchedule(HourlySchedule hourlySchedule) {
        if (isInCreateMode()) {
            this.innerModel().withHourlySchedule(hourlySchedule);
            return this;
        } else {
            this.updateBody.withHourlySchedule(hourlySchedule);
            return this;
        }
    }

    public SnapshotPolicyImpl withDailySchedule(DailySchedule dailySchedule) {
        if (isInCreateMode()) {
            this.innerModel().withDailySchedule(dailySchedule);
            return this;
        } else {
            this.updateBody.withDailySchedule(dailySchedule);
            return this;
        }
    }

    public SnapshotPolicyImpl withWeeklySchedule(WeeklySchedule weeklySchedule) {
        if (isInCreateMode()) {
            this.innerModel().withWeeklySchedule(weeklySchedule);
            return this;
        } else {
            this.updateBody.withWeeklySchedule(weeklySchedule);
            return this;
        }
    }

    public SnapshotPolicyImpl withMonthlySchedule(MonthlySchedule monthlySchedule) {
        if (isInCreateMode()) {
            this.innerModel().withMonthlySchedule(monthlySchedule);
            return this;
        } else {
            this.updateBody.withMonthlySchedule(monthlySchedule);
            return this;
        }
    }

    public SnapshotPolicyImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateBody.withEnabled(enabled);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}