/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.ContinuousWebJob;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.appservice.v2019_08_01.ContinuousWebJobStatus;
import com.microsoft.azure.management.appservice.v2019_08_01.WebJobType;

class ContinuousWebJobImpl extends IndexableRefreshableWrapperImpl<ContinuousWebJob, ContinuousWebJobInner> implements ContinuousWebJob {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String webJobName;

    ContinuousWebJobImpl(ContinuousWebJobInner inner,  CertificateRegistrationManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.webJobName = IdParsingUtils.getValueFromIdByName(inner.id(), "continuouswebjobs");
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ContinuousWebJobInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getContinuousWebJobAsync(this.resourceGroupName, this.name, this.webJobName);
    }



    @Override
    public String detailedStatus() {
        return this.inner().detailedStatus();
    }

    @Override
    public String error() {
        return this.inner().error();
    }

    @Override
    public String extraInfoUrl() {
        return this.inner().extraInfoUrl();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String logUrl() {
        return this.inner().logUrl();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String runCommand() {
        return this.inner().runCommand();
    }

    @Override
    public Map<String, Object> settings() {
        return this.inner().settings();
    }

    @Override
    public ContinuousWebJobStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String url() {
        return this.inner().url();
    }

    @Override
    public Boolean usingSdk() {
        return this.inner().usingSdk();
    }

    @Override
    public WebJobType webJobType() {
        return this.inner().webJobType();
    }

}
