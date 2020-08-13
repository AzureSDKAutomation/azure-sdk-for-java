/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.HostNameBinding;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2019_08_01.AzureResourceType;
import com.microsoft.azure.management.appservice.v2019_08_01.CustomHostNameDnsRecordType;
import com.microsoft.azure.management.appservice.v2019_08_01.HostNameType;
import com.microsoft.azure.management.appservice.v2019_08_01.SslState;

class HostNameBindingImpl extends CreatableUpdatableImpl<HostNameBinding, HostNameBindingInner, HostNameBindingImpl> implements HostNameBinding, HostNameBinding.Definition, HostNameBinding.Update {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String hostName;

    HostNameBindingImpl(String name, CertificateRegistrationManager manager) {
        super(name, new HostNameBindingInner());
        this.manager = manager;
        // Set resource name
        this.hostName = name;
        //
    }

    HostNameBindingImpl(HostNameBindingInner inner, CertificateRegistrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.hostName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.hostName = IdParsingUtils.getValueFromIdByName(inner.id(), "hostNameBindings");
        //
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HostNameBinding> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateHostNameBindingAsync(this.resourceGroupName, this.name, this.hostName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HostNameBinding> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateHostNameBindingAsync(this.resourceGroupName, this.name, this.hostName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HostNameBindingInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getHostNameBindingAsync(this.resourceGroupName, this.name, this.hostName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String azureResourceName() {
        return this.inner().azureResourceName();
    }

    @Override
    public AzureResourceType azureResourceType() {
        return this.inner().azureResourceType();
    }

    @Override
    public CustomHostNameDnsRecordType customHostNameDnsRecordType() {
        return this.inner().customHostNameDnsRecordType();
    }

    @Override
    public String domainId() {
        return this.inner().domainId();
    }

    @Override
    public HostNameType hostNameType() {
        return this.inner().hostNameType();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String siteName() {
        return this.inner().siteName();
    }

    @Override
    public SslState sslState() {
        return this.inner().sslState();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String virtualIP() {
        return this.inner().virtualIP();
    }

    @Override
    public HostNameBindingImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public HostNameBindingImpl withAzureResourceName(String azureResourceName) {
        this.inner().withAzureResourceName(azureResourceName);
        return this;
    }

    @Override
    public HostNameBindingImpl withAzureResourceType(AzureResourceType azureResourceType) {
        this.inner().withAzureResourceType(azureResourceType);
        return this;
    }

    @Override
    public HostNameBindingImpl withCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.inner().withCustomHostNameDnsRecordType(customHostNameDnsRecordType);
        return this;
    }

    @Override
    public HostNameBindingImpl withDomainId(String domainId) {
        this.inner().withDomainId(domainId);
        return this;
    }

    @Override
    public HostNameBindingImpl withHostNameType(HostNameType hostNameType) {
        this.inner().withHostNameType(hostNameType);
        return this;
    }

    @Override
    public HostNameBindingImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public HostNameBindingImpl withSiteName(String siteName) {
        this.inner().withSiteName(siteName);
        return this;
    }

    @Override
    public HostNameBindingImpl withSslState(SslState sslState) {
        this.inner().withSslState(sslState);
        return this;
    }

    @Override
    public HostNameBindingImpl withThumbprint(String thumbprint) {
        this.inner().withThumbprint(thumbprint);
        return this;
    }

}
