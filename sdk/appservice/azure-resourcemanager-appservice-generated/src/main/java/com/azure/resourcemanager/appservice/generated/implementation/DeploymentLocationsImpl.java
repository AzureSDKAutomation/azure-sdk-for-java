// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentLocationsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.GeoRegionInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironment;
import com.azure.resourcemanager.appservice.generated.models.DeploymentLocations;
import com.azure.resourcemanager.appservice.generated.models.GeoRegion;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentDeploymentInfo;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DeploymentLocationsImpl implements DeploymentLocations {
    private DeploymentLocationsInner innerObject;

    private final WebSiteManager serviceManager;

    DeploymentLocationsImpl(DeploymentLocationsInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GeoRegion> locations() {
        List<GeoRegionInner> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GeoRegionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<AppServiceEnvironment> hostingEnvironments() {
        List<AppServiceEnvironment> inner = this.innerModel().hostingEnvironments();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos() {
        List<HostingEnvironmentDeploymentInfo> inner = this.innerModel().hostingEnvironmentDeploymentInfos();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DeploymentLocationsInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}