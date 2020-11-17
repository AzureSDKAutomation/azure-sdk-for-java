/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.policyinsights.v2020_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2020_07_01.PolicyMetadatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.policyinsights.v2020_07_01.PolicyMetadata;
import com.microsoft.azure.management.policyinsights.v2020_07_01.SlimPolicyMetadata;

class PolicyMetadatasImpl extends WrapperImpl<PolicyMetadatasInner> implements PolicyMetadatas {
    private final PolicyInsightsManager manager;

    PolicyMetadatasImpl(PolicyInsightsManager manager) {
        super(manager.inner().policyMetadatas());
        this.manager = manager;
    }

    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyMetadata> getResourceAsync(String resourceName) {
        PolicyMetadatasInner client = this.inner();
        return client.getResourceAsync(resourceName)
        .map(new Func1<PolicyMetadataInner, PolicyMetadata>() {
            @Override
            public PolicyMetadata call(PolicyMetadataInner inner) {
                return new PolicyMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SlimPolicyMetadata> listAsync() {
        PolicyMetadatasInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SlimPolicyMetadataInner>, Iterable<SlimPolicyMetadataInner>>() {
            @Override
            public Iterable<SlimPolicyMetadataInner> call(Page<SlimPolicyMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SlimPolicyMetadataInner, SlimPolicyMetadata>() {
            @Override
            public SlimPolicyMetadata call(SlimPolicyMetadataInner inner) {
                return new SlimPolicyMetadataImpl(inner, manager());
            }
        });
    }

}
