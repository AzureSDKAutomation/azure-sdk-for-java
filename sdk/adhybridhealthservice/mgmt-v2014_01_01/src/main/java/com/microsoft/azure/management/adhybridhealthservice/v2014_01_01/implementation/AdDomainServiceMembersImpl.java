/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AdDomainServiceMembers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceAddsServiceMemberModel;

class AdDomainServiceMembersImpl extends WrapperImpl<AdDomainServiceMembersInner> implements AdDomainServiceMembers {
    private final ADHybridHealthServiceManager manager;

    AdDomainServiceMembersImpl(ADHybridHealthServiceManager manager) {
        super(manager.inner().adDomainServiceMembers());
        this.manager = manager;
    }

    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    private AddsserviceAddsServiceMemberModelImpl wrapModel(AddsServiceMemberInner inner) {
        return  new AddsserviceAddsServiceMemberModelImpl(inner, manager());
    }

    @Override
    public Observable<AddsserviceAddsServiceMemberModel> listAsync(final String serviceName, final boolean isGroupbySite) {
        AdDomainServiceMembersInner client = this.inner();
        return client.listAsync(serviceName, isGroupbySite)
        .flatMapIterable(new Func1<Page<AddsServiceMemberInner>, Iterable<AddsServiceMemberInner>>() {
            @Override
            public Iterable<AddsServiceMemberInner> call(Page<AddsServiceMemberInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AddsServiceMemberInner, AddsserviceAddsServiceMemberModel>() {
            @Override
            public AddsserviceAddsServiceMemberModel call(AddsServiceMemberInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
