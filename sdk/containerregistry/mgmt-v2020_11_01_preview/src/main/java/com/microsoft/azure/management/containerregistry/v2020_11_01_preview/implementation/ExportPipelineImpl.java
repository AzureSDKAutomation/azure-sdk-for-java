/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ExportPipeline;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SystemData;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ExportPipelineTargetProperties;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.PipelineOptions;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ProvisioningState;

class ExportPipelineImpl extends CreatableUpdatableImpl<ExportPipeline, ExportPipelineInner, ExportPipelineImpl> implements ExportPipeline, ExportPipeline.Definition, ExportPipeline.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String exportPipelineName;

    ExportPipelineImpl(String name, ContainerRegistryManager manager) {
        super(name, new ExportPipelineInner());
        this.manager = manager;
        // Set resource name
        this.exportPipelineName = name;
        //
    }

    ExportPipelineImpl(ExportPipelineInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.exportPipelineName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.exportPipelineName = IdParsingUtils.getValueFromIdByName(inner.id(), "exportPipelines");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExportPipeline> createResourceAsync() {
        ExportPipelinesInner client = this.manager().inner().exportPipelines();
        return client.createAsync(this.resourceGroupName, this.registryName, this.exportPipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExportPipeline> updateResourceAsync() {
        ExportPipelinesInner client = this.manager().inner().exportPipelines();
        return client.createAsync(this.resourceGroupName, this.registryName, this.exportPipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExportPipelineInner> getInnerAsync() {
        ExportPipelinesInner client = this.manager().inner().exportPipelines();
        return client.getAsync(this.resourceGroupName, this.registryName, this.exportPipelineName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public IdentityProperties identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<PipelineOptions> options() {
        return this.inner().options();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public ExportPipelineTargetProperties target() {
        return this.inner().target();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExportPipelineImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public ExportPipelineImpl withTarget(ExportPipelineTargetProperties target) {
        this.inner().withTarget(target);
        return this;
    }

    @Override
    public ExportPipelineImpl withIdentity(IdentityProperties identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ExportPipelineImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ExportPipelineImpl withOptions(List<PipelineOptions> options) {
        this.inner().withOptions(options);
        return this;
    }

}
