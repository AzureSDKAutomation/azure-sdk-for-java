// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebAppStackInner;
import com.azure.resourcemanager.appservice.generated.models.StackPreferredOs;
import com.azure.resourcemanager.appservice.generated.models.WebAppMajorVersion;
import com.azure.resourcemanager.appservice.generated.models.WebAppStack;
import java.util.Collections;
import java.util.List;

public final class WebAppStackImpl implements WebAppStack {
    private WebAppStackInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    WebAppStackImpl(
        WebAppStackInner innerObject, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String displayText() {
        return this.innerModel().displayText();
    }

    public String value() {
        return this.innerModel().value();
    }

    public List<WebAppMajorVersion> majorVersions() {
        List<WebAppMajorVersion> inner = this.innerModel().majorVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StackPreferredOs preferredOs() {
        return this.innerModel().preferredOs();
    }

    public WebAppStackInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
