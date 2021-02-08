/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Transformations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Transformation;

class TransformationsImpl extends WrapperImpl<TransformationsInner> implements Transformations {
    private final StreamAnalyticsManager manager;

    TransformationsImpl(StreamAnalyticsManager manager) {
        super(manager.inner().transformations());
        this.manager = manager;
    }

    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public TransformationImpl define(String name) {
        return wrapModel(name);
    }

    private TransformationImpl wrapModel(TransformationInner inner) {
        return  new TransformationImpl(inner, manager());
    }

    private TransformationImpl wrapModel(String name) {
        return new TransformationImpl(name, this.manager());
    }

    @Override
    public Observable<Transformation> getAsync(String resourceGroupName, String jobName, String transformationName) {
        TransformationsInner client = this.inner();
        return client.getAsync(resourceGroupName, jobName, transformationName)
        .flatMap(new Func1<TransformationInner, Observable<Transformation>>() {
            @Override
            public Observable<Transformation> call(TransformationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Transformation)wrapModel(inner));
                }
            }
       });
    }

}