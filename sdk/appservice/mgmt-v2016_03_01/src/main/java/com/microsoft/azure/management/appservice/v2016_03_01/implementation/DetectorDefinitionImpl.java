/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.DetectorDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DetectorDefinitionImpl extends WrapperImpl<DetectorDefinitionInner> implements DetectorDefinition {
    private final WebManager manager;
    DetectorDefinitionImpl(DetectorDefinitionInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isEnabled() {
        return this.inner().isEnabled();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Double rank() {
        return this.inner().rank();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
