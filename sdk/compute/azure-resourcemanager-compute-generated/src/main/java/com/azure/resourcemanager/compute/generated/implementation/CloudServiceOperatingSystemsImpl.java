// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceOperatingSystemsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.OSFamilyInner;
import com.azure.resourcemanager.compute.generated.fluent.models.OSVersionInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceOperatingSystems;
import com.azure.resourcemanager.compute.generated.models.OSFamily;
import com.azure.resourcemanager.compute.generated.models.OSVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CloudServiceOperatingSystemsImpl implements CloudServiceOperatingSystems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServiceOperatingSystemsImpl.class);

    private final CloudServiceOperatingSystemsClient innerClient;

    private final ComputeManager serviceManager;

    public CloudServiceOperatingSystemsImpl(
        CloudServiceOperatingSystemsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OSVersion getOSVersion(String location, String osVersionName) {
        OSVersionInner inner = this.serviceClient().getOSVersion(location, osVersionName);
        if (inner != null) {
            return new OSVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OSVersion> getOSVersionWithResponse(String location, String osVersionName, Context context) {
        Response<OSVersionInner> inner =
            this.serviceClient().getOSVersionWithResponse(location, osVersionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OSVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<OSVersion> listOSVersions(String location) {
        PagedIterable<OSVersionInner> inner = this.serviceClient().listOSVersions(location);
        return Utils.mapPage(inner, inner1 -> new OSVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<OSVersion> listOSVersions(String location, Context context) {
        PagedIterable<OSVersionInner> inner = this.serviceClient().listOSVersions(location, context);
        return Utils.mapPage(inner, inner1 -> new OSVersionImpl(inner1, this.manager()));
    }

    public OSFamily getOSFamily(String location, String osFamilyName) {
        OSFamilyInner inner = this.serviceClient().getOSFamily(location, osFamilyName);
        if (inner != null) {
            return new OSFamilyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OSFamily> getOSFamilyWithResponse(String location, String osFamilyName, Context context) {
        Response<OSFamilyInner> inner = this.serviceClient().getOSFamilyWithResponse(location, osFamilyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OSFamilyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<OSFamily> listOSFamilies(String location) {
        PagedIterable<OSFamilyInner> inner = this.serviceClient().listOSFamilies(location);
        return Utils.mapPage(inner, inner1 -> new OSFamilyImpl(inner1, this.manager()));
    }

    public PagedIterable<OSFamily> listOSFamilies(String location, Context context) {
        PagedIterable<OSFamilyInner> inner = this.serviceClient().listOSFamilies(location, context);
        return Utils.mapPage(inner, inner1 -> new OSFamilyImpl(inner1, this.manager()));
    }

    private CloudServiceOperatingSystemsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
