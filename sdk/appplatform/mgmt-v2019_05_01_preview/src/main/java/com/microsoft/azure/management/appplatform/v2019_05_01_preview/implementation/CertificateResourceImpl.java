/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CertificateResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CertificateProperties;
import rx.functions.Func1;

class CertificateResourceImpl extends CreatableUpdatableImpl<CertificateResource, CertificateResourceInner, CertificateResourceImpl> implements CertificateResource, CertificateResource.Definition, CertificateResource.Update {
    private String certificateName;
    private String resourceGroupName;
    private String serviceName;
    private CertificateProperties cproperties;
    private CertificateProperties uproperties;
    private final AppPlatformManager manager;

    CertificateResourceImpl(String name, AppPlatformManager manager) {
        super(name, new CertificateResourceInner());
        this.manager = manager;
        // Set resource name
        this.certificateName = name;
        //
        this.cproperties = new CertificateProperties();
        this.uproperties = new CertificateProperties();
    }

    CertificateResourceImpl(CertificateResourceInner inner, AppPlatformManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.certificateName = inner.name();
        // set resource ancestor and positional variables
        this.certificateName = IdParsingUtils.getValueFromIdByName(inner.id(), "certificates");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "Spring");
        // set other parameters for create and update
        this.cproperties = new CertificateProperties();
        this.uproperties = new CertificateProperties();
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CertificateResource> createResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsyncAsync(this.certificateName, this.resourceGroupName, this.serviceName, this.cproperties)
            .map(new Func1<CertificateResourceInner, CertificateResourceInner>() {
               @Override
               public CertificateResourceInner call(CertificateResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CertificateResource> updateResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsyncAsync(this.certificateName, this.resourceGroupName, this.serviceName, this.uproperties)
            .map(new Func1<CertificateResourceInner, CertificateResourceInner>() {
               @Override
               public CertificateResourceInner call(CertificateResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CertificateResourceInner> getInnerAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new CertificateProperties();
        this.uproperties = new CertificateProperties();
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
    public CertificateProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CertificateResourceImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public CertificateResourceImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public CertificateResourceImpl withProperties(CertificateProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
