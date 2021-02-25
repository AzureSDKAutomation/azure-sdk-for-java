// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.ProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.ApplicationStackResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.FunctionAppStackInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebAppStackInner;
import com.azure.resourcemanager.appservice.generated.models.ApplicationStackResource;
import com.azure.resourcemanager.appservice.generated.models.CsmOperationDescription;
import com.azure.resourcemanager.appservice.generated.models.FunctionAppStack;
import com.azure.resourcemanager.appservice.generated.models.ProviderOsTypeSelected;
import com.azure.resourcemanager.appservice.generated.models.ProviderStackOsType;
import com.azure.resourcemanager.appservice.generated.models.Providers;
import com.azure.resourcemanager.appservice.generated.models.WebAppStack;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProvidersImpl implements Providers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProvidersImpl.class);

    private final ProvidersClient innerClient;

    private final AppServiceManager serviceManager;

    public ProvidersImpl(ProvidersClient innerClient, AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationStackResource> getAvailableStacks() {
        PagedIterable<ApplicationStackResourceInner> inner = this.serviceClient().getAvailableStacks();
        return Utils.mapPage(inner, inner1 -> new ApplicationStackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStackResource> getAvailableStacks(
        ProviderOsTypeSelected osTypeSelected, Context context) {
        PagedIterable<ApplicationStackResourceInner> inner =
            this.serviceClient().getAvailableStacks(osTypeSelected, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationStackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<FunctionAppStack> getFunctionAppStacks() {
        PagedIterable<FunctionAppStackInner> inner = this.serviceClient().getFunctionAppStacks();
        return Utils.mapPage(inner, inner1 -> new FunctionAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<FunctionAppStack> getFunctionAppStacks(ProviderStackOsType stackOsType, Context context) {
        PagedIterable<FunctionAppStackInner> inner = this.serviceClient().getFunctionAppStacks(stackOsType, context);
        return Utils.mapPage(inner, inner1 -> new FunctionAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<FunctionAppStack> getFunctionAppStacksForLocation(String location) {
        PagedIterable<FunctionAppStackInner> inner = this.serviceClient().getFunctionAppStacksForLocation(location);
        return Utils.mapPage(inner, inner1 -> new FunctionAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<FunctionAppStack> getFunctionAppStacksForLocation(
        String location, ProviderStackOsType stackOsType, Context context) {
        PagedIterable<FunctionAppStackInner> inner =
            this.serviceClient().getFunctionAppStacksForLocation(location, stackOsType, context);
        return Utils.mapPage(inner, inner1 -> new FunctionAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<WebAppStack> getWebAppStacksForLocation(String location) {
        PagedIterable<WebAppStackInner> inner = this.serviceClient().getWebAppStacksForLocation(location);
        return Utils.mapPage(inner, inner1 -> new WebAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<WebAppStack> getWebAppStacksForLocation(
        String location, ProviderStackOsType stackOsType, Context context) {
        PagedIterable<WebAppStackInner> inner =
            this.serviceClient().getWebAppStacksForLocation(location, stackOsType, context);
        return Utils.mapPage(inner, inner1 -> new WebAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmOperationDescription> listOperations() {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations();
        return Utils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmOperationDescription> listOperations(Context context) {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations(context);
        return Utils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<WebAppStack> getWebAppStacks() {
        PagedIterable<WebAppStackInner> inner = this.serviceClient().getWebAppStacks();
        return Utils.mapPage(inner, inner1 -> new WebAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<WebAppStack> getWebAppStacks(ProviderStackOsType stackOsType, Context context) {
        PagedIterable<WebAppStackInner> inner = this.serviceClient().getWebAppStacks(stackOsType, context);
        return Utils.mapPage(inner, inner1 -> new WebAppStackImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStackResource> list() {
        PagedIterable<ApplicationStackResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ApplicationStackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStackResource> list(ProviderOsTypeSelected osTypeSelected, Context context) {
        PagedIterable<ApplicationStackResourceInner> inner = this.serviceClient().list(osTypeSelected, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationStackResourceImpl(inner1, this.manager()));
    }

    private ProvidersClient serviceClient() {
        return this.innerClient;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
