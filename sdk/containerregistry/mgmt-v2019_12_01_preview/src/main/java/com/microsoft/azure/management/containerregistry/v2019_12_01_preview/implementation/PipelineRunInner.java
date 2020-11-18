/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineRunRequest;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineRunResponse;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An object that represents a pipeline run for a container registry.
 */
@JsonFlatten
public class PipelineRunInner extends ProxyResource {
    /**
     * The provisioning state of a pipeline run. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The request parameters for a pipeline run.
     */
    @JsonProperty(value = "properties.request")
    private PipelineRunRequest request;

    /**
     * The response of a pipeline run.
     */
    @JsonProperty(value = "properties.response", access = JsonProperty.Access.WRITE_ONLY)
    private PipelineRunResponse response;

    /**
     * How the pipeline run should be forced to recreate even if the pipeline
     * run configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /**
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the provisioning state of a pipeline run. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the request parameters for a pipeline run.
     *
     * @return the request value
     */
    public PipelineRunRequest request() {
        return this.request;
    }

    /**
     * Set the request parameters for a pipeline run.
     *
     * @param request the request value to set
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withRequest(PipelineRunRequest request) {
        this.request = request;
        return this;
    }

    /**
     * Get the response of a pipeline run.
     *
     * @return the response value
     */
    public PipelineRunResponse response() {
        return this.response;
    }

    /**
     * Get how the pipeline run should be forced to recreate even if the pipeline run configuration has not changed.
     *
     * @return the forceUpdateTag value
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set how the pipeline run should be forced to recreate even if the pipeline run configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
