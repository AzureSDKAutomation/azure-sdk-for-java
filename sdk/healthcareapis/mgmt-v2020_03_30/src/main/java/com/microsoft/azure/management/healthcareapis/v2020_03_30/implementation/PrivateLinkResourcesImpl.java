/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.PrivateLinkResourceListResult;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.PrivateLinkResource;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final HealthcareApisManager manager;

    PrivateLinkResourcesImpl(HealthcareApisManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public HealthcareApisManager manager() {
        return this.manager;
    }

    private PrivateLinkResourceImpl wrapModel(PrivateLinkResourceInner inner) {
        return  new PrivateLinkResourceImpl(inner, manager());
    }

    @Override
    public Observable<PrivateLinkResourceListResult> listByServiceAsync(String resourceGroupName, String resourceName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, resourceName)
        .map(new Func1<PrivateLinkResourceListResultInner, PrivateLinkResourceListResult>() {
            @Override
            public PrivateLinkResourceListResult call(PrivateLinkResourceListResultInner inner) {
                return new PrivateLinkResourceListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PrivateLinkResource> getAsync(String resourceGroupName, String resourceName, String groupName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, groupName)
        .flatMap(new Func1<PrivateLinkResourceInner, Observable<PrivateLinkResource>>() {
            @Override
            public Observable<PrivateLinkResource> call(PrivateLinkResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateLinkResource)wrapModel(inner));
                }
            }
       });
    }

}
