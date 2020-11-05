/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.Desktop;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.DesktopPatch;
import java.util.Map;
import rx.functions.Func1;

class DesktopImpl extends CreatableUpdatableImpl<Desktop, DesktopInner, DesktopImpl> implements Desktop, Desktop.Update {
    private final DesktopVirtualizationManager manager;
    private String resourceGroupName;
    private String applicationGroupName;
    private String desktopName;
    private DesktopPatch updateParameter;

    DesktopImpl(String name, DesktopVirtualizationManager manager) {
        super(name, new DesktopInner());
        this.manager = manager;
        // Set resource name
        this.desktopName = name;
        //
        this.updateParameter = new DesktopPatch();
    }

    DesktopImpl(DesktopInner inner, DesktopVirtualizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.desktopName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.applicationGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "applicationGroups");
        this.desktopName = IdParsingUtils.getValueFromIdByName(inner.id(), "desktops");
        //
        this.updateParameter = new DesktopPatch();
    }

    @Override
    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Desktop> createResourceAsync() {
        DesktopsInner client = this.manager().inner().desktops();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<Desktop> updateResourceAsync() {
        DesktopsInner client = this.manager().inner().desktops();
        return client.updateAsync(this.resourceGroupName, this.applicationGroupName, this.desktopName, this.updateParameter)
            .map(new Func1<DesktopInner, DesktopInner>() {
               @Override
               public DesktopInner call(DesktopInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DesktopInner> getInnerAsync() {
        DesktopsInner client = this.manager().inner().desktops();
        return client.getAsync(this.resourceGroupName, this.applicationGroupName, this.desktopName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DesktopPatch();
    }

    @Override
    public String description() {
        return this.inner().description();
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
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DesktopImpl withDescription(String description) {
        this.updateParameter.withDescription(description);
        return this;
    }

    @Override
    public DesktopImpl withFriendlyName(String friendlyName) {
        this.updateParameter.withFriendlyName(friendlyName);
        return this;
    }

    @Override
    public DesktopImpl withTags(Map<String, String> tags) {
        this.updateParameter.withTags(tags);
        return this;
    }

}
