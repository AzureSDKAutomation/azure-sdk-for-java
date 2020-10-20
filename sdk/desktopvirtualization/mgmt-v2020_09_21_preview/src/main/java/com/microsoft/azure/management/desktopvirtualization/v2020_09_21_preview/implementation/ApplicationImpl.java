/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.Application;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.ApplicationPatch;
import java.util.Map;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.RemoteApplicationType;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.CommandLineSetting;
import rx.functions.Func1;

class ApplicationImpl extends CreatableUpdatableImpl<Application, ApplicationInner, ApplicationImpl> implements Application, Application.Definition, Application.Update {
    private final DesktopVirtualizationManager manager;
    private String resourceGroupName;
    private String applicationGroupName;
    private String applicationName;
    private ApplicationPatch updateParameter;

    ApplicationImpl(String name, DesktopVirtualizationManager manager) {
        super(name, new ApplicationInner());
        this.manager = manager;
        // Set resource name
        this.applicationName = name;
        //
        this.updateParameter = new ApplicationPatch();
    }

    ApplicationImpl(ApplicationInner inner, DesktopVirtualizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.applicationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.applicationGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "applicationGroups");
        this.applicationName = IdParsingUtils.getValueFromIdByName(inner.id(), "applications");
        //
        this.updateParameter = new ApplicationPatch();
    }

    @Override
    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Application> createResourceAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.createOrUpdateAsync(this.resourceGroupName, this.applicationGroupName, this.applicationName, this.inner())
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
        return client.updateAsync(this.resourceGroupName, this.applicationGroupName, this.applicationName, this.updateParameter)
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
        return client.getAsync(this.resourceGroupName, this.applicationGroupName, this.applicationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ApplicationPatch();
    }

    @Override
    public RemoteApplicationType applicationType() {
        return this.inner().applicationType();
    }

    @Override
    public String commandLineArguments() {
        return this.inner().commandLineArguments();
    }

    @Override
    public CommandLineSetting commandLineSetting() {
        return this.inner().commandLineSetting();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String filePath() {
        return this.inner().filePath();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public byte[] iconContent() {
        return this.inner().iconContent();
    }

    @Override
    public String iconHash() {
        return this.inner().iconHash();
    }

    @Override
    public Integer iconIndex() {
        return this.inner().iconIndex();
    }

    @Override
    public String iconPath() {
        return this.inner().iconPath();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String msixPackageApplicationId() {
        return this.inner().msixPackageApplicationId();
    }

    @Override
    public String msixPackageFamilyName() {
        return this.inner().msixPackageFamilyName();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean showInPortal() {
        return this.inner().showInPortal();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ApplicationImpl withExistingApplicationGroup(String resourceGroupName, String applicationGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.applicationGroupName = applicationGroupName;
        return this;
    }

    @Override
    public ApplicationImpl withTags(Map<String, String> tags) {
        this.updateParameter.withTags(tags);
        return this;
    }

    @Override
    public ApplicationImpl withCommandLineSetting(CommandLineSetting commandLineSetting) {
        if (isInCreateMode()) {
            this.inner().withCommandLineSetting(commandLineSetting);
        } else {
            this.updateParameter.withCommandLineSetting(commandLineSetting);
        }
        return this;
    }

    @Override
    public ApplicationImpl withApplicationType(RemoteApplicationType applicationType) {
        if (isInCreateMode()) {
            this.inner().withApplicationType(applicationType);
        } else {
            this.updateParameter.withApplicationType(applicationType);
        }
        return this;
    }

    @Override
    public ApplicationImpl withCommandLineArguments(String commandLineArguments) {
        if (isInCreateMode()) {
            this.inner().withCommandLineArguments(commandLineArguments);
        } else {
            this.updateParameter.withCommandLineArguments(commandLineArguments);
        }
        return this;
    }

    @Override
    public ApplicationImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public ApplicationImpl withFilePath(String filePath) {
        if (isInCreateMode()) {
            this.inner().withFilePath(filePath);
        } else {
            this.updateParameter.withFilePath(filePath);
        }
        return this;
    }

    @Override
    public ApplicationImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.inner().withFriendlyName(friendlyName);
        } else {
            this.updateParameter.withFriendlyName(friendlyName);
        }
        return this;
    }

    @Override
    public ApplicationImpl withIconIndex(Integer iconIndex) {
        if (isInCreateMode()) {
            this.inner().withIconIndex(iconIndex);
        } else {
            this.updateParameter.withIconIndex(iconIndex);
        }
        return this;
    }

    @Override
    public ApplicationImpl withIconPath(String iconPath) {
        if (isInCreateMode()) {
            this.inner().withIconPath(iconPath);
        } else {
            this.updateParameter.withIconPath(iconPath);
        }
        return this;
    }

    @Override
    public ApplicationImpl withMsixPackageApplicationId(String msixPackageApplicationId) {
        if (isInCreateMode()) {
            this.inner().withMsixPackageApplicationId(msixPackageApplicationId);
        } else {
            this.updateParameter.withMsixPackageApplicationId(msixPackageApplicationId);
        }
        return this;
    }

    @Override
    public ApplicationImpl withMsixPackageFamilyName(String msixPackageFamilyName) {
        if (isInCreateMode()) {
            this.inner().withMsixPackageFamilyName(msixPackageFamilyName);
        } else {
            this.updateParameter.withMsixPackageFamilyName(msixPackageFamilyName);
        }
        return this;
    }

    @Override
    public ApplicationImpl withShowInPortal(Boolean showInPortal) {
        if (isInCreateMode()) {
            this.inner().withShowInPortal(showInPortal);
        } else {
            this.updateParameter.withShowInPortal(showInPortal);
        }
        return this;
    }

}
