/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.StartMenuItem;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class StartMenuItemImpl extends WrapperImpl<StartMenuItemInner> implements StartMenuItem {
    private final DesktopVirtualizationManager manager;

    StartMenuItemImpl(StartMenuItemInner inner,  DesktopVirtualizationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DesktopVirtualizationManager manager() {
        return this.manager;
    }



    @Override
    public String appAlias() {
        return this.inner().appAlias();
    }

    @Override
    public String commandLineArguments() {
        return this.inner().commandLineArguments();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
