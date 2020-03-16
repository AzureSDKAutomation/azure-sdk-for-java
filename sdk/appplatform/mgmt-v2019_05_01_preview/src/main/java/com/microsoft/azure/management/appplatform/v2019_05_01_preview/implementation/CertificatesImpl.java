/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.Certificates;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CertificateResource;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CertificateResourceCollection;

class CertificatesImpl extends WrapperImpl<CertificatesInner> implements Certificates {
    private final AppPlatformManager manager;

    CertificatesImpl(AppPlatformManager manager) {
        super(manager.inner().certificates());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public CertificateResourceImpl define(String name) {
        return wrapModel(name);
    }

    private CertificateResourceImpl wrapModel(CertificateResourceInner inner) {
        return  new CertificateResourceImpl(inner, manager());
    }

    private CertificateResourceImpl wrapModel(String name) {
        return new CertificateResourceImpl(name, this.manager());
    }

    @Override
    public Observable<CertificateResource> getAsync(String resourceGroupName, String serviceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, certificateName)
        .map(new Func1<CertificateResourceInner, CertificateResource>() {
            @Override
            public CertificateResource call(CertificateResourceInner inner) {
                return new CertificateResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateResource> deleteAsync(String resourceGroupName, String serviceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, certificateName)
        .map(new Func1<CertificateResourceInner, CertificateResource>() {
            @Override
            public CertificateResource call(CertificateResourceInner inner) {
                return new CertificateResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CertificateResourceCollection> listAsync(String resourceGroupName, String serviceName, String certificateName) {
        CertificatesInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName, certificateName)
        .map(new Func1<CertificateResourceCollectionInner, CertificateResourceCollection>() {
            @Override
            public CertificateResourceCollection call(CertificateResourceCollectionInner inner) {
                return new CertificateResourceCollectionImpl(inner, manager());
            }
        });
    }

}
