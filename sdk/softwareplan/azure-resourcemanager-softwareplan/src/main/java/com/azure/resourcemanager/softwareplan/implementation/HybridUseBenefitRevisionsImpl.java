// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.softwareplan.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.softwareplan.fluent.HybridUseBenefitRevisionsClient;
import com.azure.resourcemanager.softwareplan.fluent.models.HybridUseBenefitModelInner;
import com.azure.resourcemanager.softwareplan.models.HybridUseBenefitModel;
import com.azure.resourcemanager.softwareplan.models.HybridUseBenefitRevisions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HybridUseBenefitRevisionsImpl implements HybridUseBenefitRevisions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HybridUseBenefitRevisionsImpl.class);

    private final HybridUseBenefitRevisionsClient innerClient;

    private final com.azure.resourcemanager.softwareplan.SoftwarePlanManager serviceManager;

    public HybridUseBenefitRevisionsImpl(
        HybridUseBenefitRevisionsClient innerClient,
        com.azure.resourcemanager.softwareplan.SoftwarePlanManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId, Context context) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId, context);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId, Context context) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId, context);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridUseBenefitModel> list(String scope, String planId, Context context) {
        PagedIterable<HybridUseBenefitModelInner> inner = this.serviceClient().list(scope, planId, context);
        return Utils.mapPage(inner, inner1 -> new HybridUseBenefitModelImpl(inner1, this.manager()));
    }

    private HybridUseBenefitRevisionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.softwareplan.SoftwarePlanManager manager() {
        return this.serviceManager;
    }
}
