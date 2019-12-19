/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.EmergingIssues;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.EmergingIssuesGetResult;

class EmergingIssuesImpl extends WrapperImpl<EmergingIssuesInner> implements EmergingIssues {
    private final ResourceHealthManager manager;

    EmergingIssuesImpl(ResourceHealthManager manager) {
        super(manager.inner().emergingIssues());
        this.manager = manager;
    }

    public ResourceHealthManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EmergingIssuesGetResult> getAsync() {
        EmergingIssuesInner client = this.inner();
        return client.getAsync()
        .map(new Func1<EmergingIssuesGetResultInner, EmergingIssuesGetResult>() {
            @Override
            public EmergingIssuesGetResult call(EmergingIssuesGetResultInner inner) {
                return new EmergingIssuesGetResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EmergingIssuesGetResult> listAsync() {
        EmergingIssuesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EmergingIssuesGetResultInner>, Iterable<EmergingIssuesGetResultInner>>() {
            @Override
            public Iterable<EmergingIssuesGetResultInner> call(Page<EmergingIssuesGetResultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EmergingIssuesGetResultInner, EmergingIssuesGetResult>() {
            @Override
            public EmergingIssuesGetResult call(EmergingIssuesGetResultInner inner) {
                return new EmergingIssuesGetResultImpl(inner, manager());
            }
        });
    }

}
