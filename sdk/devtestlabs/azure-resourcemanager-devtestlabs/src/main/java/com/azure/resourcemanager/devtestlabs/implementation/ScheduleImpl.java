// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.RetargetScheduleProperties;
import com.azure.resourcemanager.devtestlabs.models.Schedule;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class ScheduleImpl implements Schedule, Schedule.Definition, Schedule.Update {
    private ScheduleInner innerObject;

    private final DevTestLabsManager serviceManager;

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

    public EnableStatus status() {
        return this.innerModel().status();
    }

    public String taskType() {
        return this.innerModel().taskType();
    }

    public WeekDetails weeklyRecurrence() {
        return this.innerModel().weeklyRecurrence();
    }

    public DayDetails dailyRecurrence() {
        return this.innerModel().dailyRecurrence();
    }

    public HourDetails hourlyRecurrence() {
        return this.innerModel().hourlyRecurrence();
    }

    public String timeZoneId() {
        return this.innerModel().timeZoneId();
    }

    public NotificationSettings notificationSettings() {
        return this.innerModel().notificationSettings();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ScheduleInner innerModel() {
        return this.innerObject;
    }

    private DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private UpdateResource updateSchedule;

    public ScheduleImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Schedule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .createOrUpdateWithResponse(resourceGroupName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Schedule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .createOrUpdateWithResponse(resourceGroupName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    ScheduleImpl(String name, DevTestLabsManager serviceManager) {
        this.innerObject = new ScheduleInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ScheduleImpl update() {
        this.updateSchedule = new UpdateResource();
        return this;
    }

    public Schedule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .updateWithResponse(resourceGroupName, name, updateSchedule, Context.NONE)
                .getValue();
        return this;
    }

    public Schedule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .updateWithResponse(resourceGroupName, name, updateSchedule, context)
                .getValue();
        return this;
    }

    ScheduleImpl(ScheduleInner innerObject, DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "schedules");
    }

    public Schedule refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .getByResourceGroupWithResponse(resourceGroupName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Schedule refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGlobalSchedules()
                .getByResourceGroupWithResponse(resourceGroupName, name, localExpand, context)
                .getValue();
        return this;
    }

    public void execute() {
        serviceManager.globalSchedules().execute(resourceGroupName, name);
    }

    public void execute(Context context) {
        serviceManager.globalSchedules().execute(resourceGroupName, name, context);
    }

    public void retarget(RetargetScheduleProperties retargetScheduleProperties) {
        serviceManager.globalSchedules().retarget(resourceGroupName, name, retargetScheduleProperties);
    }

    public void retarget(RetargetScheduleProperties retargetScheduleProperties, Context context) {
        serviceManager.globalSchedules().retarget(resourceGroupName, name, retargetScheduleProperties, context);
    }

    public ScheduleImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ScheduleImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ScheduleImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateSchedule.withTags(tags);
            return this;
        }
    }

    public ScheduleImpl withStatus(EnableStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public ScheduleImpl withTaskType(String taskType) {
        this.innerModel().withTaskType(taskType);
        return this;
    }

    public ScheduleImpl withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.innerModel().withWeeklyRecurrence(weeklyRecurrence);
        return this;
    }

    public ScheduleImpl withDailyRecurrence(DayDetails dailyRecurrence) {
        this.innerModel().withDailyRecurrence(dailyRecurrence);
        return this;
    }

    public ScheduleImpl withHourlyRecurrence(HourDetails hourlyRecurrence) {
        this.innerModel().withHourlyRecurrence(hourlyRecurrence);
        return this;
    }

    public ScheduleImpl withTimeZoneId(String timeZoneId) {
        this.innerModel().withTimeZoneId(timeZoneId);
        return this;
    }

    public ScheduleImpl withNotificationSettings(NotificationSettings notificationSettings) {
        this.innerModel().withNotificationSettings(notificationSettings);
        return this;
    }

    public ScheduleImpl withTargetResourceId(String targetResourceId) {
        this.innerModel().withTargetResourceId(targetResourceId);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
