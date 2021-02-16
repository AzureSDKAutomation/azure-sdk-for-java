// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request properties provided for a pipeline run. */
@Fluent
public final class PipelineRunRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineRunRequest.class);

    /*
     * The resource ID of the pipeline to run.
     */
    @JsonProperty(value = "pipelineResourceId")
    private String pipelineResourceId;

    /*
     * List of source artifacts to be transferred by the pipeline.
     * Specify an image by repository ('hello-world'). This will use the
     * 'latest' tag.
     * Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest
     * ('hello-world@sha256:abc123').
     */
    @JsonProperty(value = "artifacts")
    private List<String> artifacts;

    /*
     * The source properties of the pipeline run.
     */
    @JsonProperty(value = "source")
    private PipelineRunSourceProperties source;

    /*
     * The target properties of the pipeline run.
     */
    @JsonProperty(value = "target")
    private PipelineRunTargetProperties target;

    /*
     * The digest of the tar used to transfer the artifacts.
     */
    @JsonProperty(value = "catalogDigest")
    private String catalogDigest;

    /**
     * Get the pipelineResourceId property: The resource ID of the pipeline to run.
     *
     * @return the pipelineResourceId value.
     */
    public String pipelineResourceId() {
        return this.pipelineResourceId;
    }

    /**
     * Set the pipelineResourceId property: The resource ID of the pipeline to run.
     *
     * @param pipelineResourceId the pipelineResourceId value to set.
     * @return the PipelineRunRequest object itself.
     */
    public PipelineRunRequest withPipelineResourceId(String pipelineResourceId) {
        this.pipelineResourceId = pipelineResourceId;
        return this;
    }

    /**
     * Get the artifacts property: List of source artifacts to be transferred by the pipeline. Specify an image by
     * repository ('hello-world'). This will use the 'latest' tag. Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @return the artifacts value.
     */
    public List<String> artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts property: List of source artifacts to be transferred by the pipeline. Specify an image by
     * repository ('hello-world'). This will use the 'latest' tag. Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     *
     * @param artifacts the artifacts value to set.
     * @return the PipelineRunRequest object itself.
     */
    public PipelineRunRequest withArtifacts(List<String> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Get the source property: The source properties of the pipeline run.
     *
     * @return the source value.
     */
    public PipelineRunSourceProperties source() {
        return this.source;
    }

    /**
     * Set the source property: The source properties of the pipeline run.
     *
     * @param source the source value to set.
     * @return the PipelineRunRequest object itself.
     */
    public PipelineRunRequest withSource(PipelineRunSourceProperties source) {
        this.source = source;
        return this;
    }

    /**
     * Get the target property: The target properties of the pipeline run.
     *
     * @return the target value.
     */
    public PipelineRunTargetProperties target() {
        return this.target;
    }

    /**
     * Set the target property: The target properties of the pipeline run.
     *
     * @param target the target value to set.
     * @return the PipelineRunRequest object itself.
     */
    public PipelineRunRequest withTarget(PipelineRunTargetProperties target) {
        this.target = target;
        return this;
    }

    /**
     * Get the catalogDigest property: The digest of the tar used to transfer the artifacts.
     *
     * @return the catalogDigest value.
     */
    public String catalogDigest() {
        return this.catalogDigest;
    }

    /**
     * Set the catalogDigest property: The digest of the tar used to transfer the artifacts.
     *
     * @param catalogDigest the catalogDigest value to set.
     * @return the PipelineRunRequest object itself.
     */
    public PipelineRunRequest withCatalogDigest(String catalogDigest) {
        this.catalogDigest = catalogDigest;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (target() != null) {
            target().validate();
        }
    }
}
