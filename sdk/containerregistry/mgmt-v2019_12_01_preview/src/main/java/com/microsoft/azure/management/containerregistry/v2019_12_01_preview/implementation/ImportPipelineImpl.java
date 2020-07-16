/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ImportPipeline;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ImportPipelineSourceProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineTriggerProperties;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineOptions;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;

class ImportPipelineImpl extends CreatableUpdatableImpl<ImportPipeline, ImportPipelineInner, ImportPipelineImpl> implements ImportPipeline, ImportPipeline.Definition, ImportPipeline.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String importPipelineName;

    ImportPipelineImpl(String name, ContainerRegistryManager manager) {
        super(name, new ImportPipelineInner());
        this.manager = manager;
        // Set resource name
        this.importPipelineName = name;
        //
    }

    ImportPipelineImpl(ImportPipelineInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.importPipelineName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.importPipelineName = IdParsingUtils.getValueFromIdByName(inner.id(), "importPipelines");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ImportPipeline> createResourceAsync() {
        ImportPipelinesInner client = this.manager().inner().importPipelines();
        return client.createAsync(this.resourceGroupName, this.registryName, this.importPipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ImportPipeline> updateResourceAsync() {
        ImportPipelinesInner client = this.manager().inner().importPipelines();
        return client.createAsync(this.resourceGroupName, this.registryName, this.importPipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ImportPipelineInner> getInnerAsync() {
        ImportPipelinesInner client = this.manager().inner().importPipelines();
        return client.getAsync(this.resourceGroupName, this.registryName, this.importPipelineName);
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
    public ImportPipelineSourceProperties source() {
        return this.inner().source();
    }

    @Override
    public PipelineTriggerProperties trigger() {
        return this.inner().trigger();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ImportPipelineImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public ImportPipelineImpl withSource(ImportPipelineSourceProperties source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public ImportPipelineImpl withIdentity(IdentityProperties identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ImportPipelineImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ImportPipelineImpl withOptions(List<PipelineOptions> options) {
        this.inner().withOptions(options);
        return this;
    }

    @Override
    public ImportPipelineImpl withTrigger(PipelineTriggerProperties trigger) {
        this.inner().withTrigger(trigger);
        return this;
    }

}
