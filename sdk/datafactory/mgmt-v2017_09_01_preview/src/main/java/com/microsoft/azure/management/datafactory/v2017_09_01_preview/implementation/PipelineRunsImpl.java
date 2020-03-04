/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.PipelineRuns;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.PipelineRun;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.PipelineRunQueryResponse;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.PipelineRunFilterParameters;

class PipelineRunsImpl extends WrapperImpl<PipelineRunsInner> implements PipelineRuns {
    private final DataFactoryManager manager;

    PipelineRunsImpl(DataFactoryManager manager) {
        super(manager.inner().pipelineRuns());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    private PipelineRunImpl wrapModel(PipelineRunInner inner) {
        return  new PipelineRunImpl(inner, manager());
    }

    @Override
    public Observable<PipelineRun> getAsync(String resourceGroupName, String factoryName, String runId) {
        PipelineRunsInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, runId)
        .flatMap(new Func1<PipelineRunInner, Observable<PipelineRun>>() {
            @Override
            public Observable<PipelineRun> call(PipelineRunInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PipelineRun)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<PipelineRunQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, PipelineRunFilterParameters filterParameters) {
        PipelineRunsInner client = this.inner();
        return client.queryByFactoryAsync(resourceGroupName, factoryName, filterParameters)
        .map(new Func1<PipelineRunQueryResponseInner, PipelineRunQueryResponse>() {
            @Override
            public PipelineRunQueryResponse call(PipelineRunQueryResponseInner inner) {
                return new PipelineRunQueryResponseImpl(inner, manager());
            }
        });
    }

}
