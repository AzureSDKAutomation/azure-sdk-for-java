/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an artifact.
 */
public class ArtifactInstallProperties {
    /**
     * The artifact's identifier.
     */
    @JsonProperty(value = "artifactId")
    private String artifactId;

    /**
     * The parameters of the artifact.
     */
    @JsonProperty(value = "parameters")
    private List<ArtifactParameterProperties> parameters;

    /**
     * Get the artifact's identifier.
     *
     * @return the artifactId value
     */
    public String artifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifact's identifier.
     *
     * @param artifactId the artifactId value to set
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the parameters of the artifact.
     *
     * @return the parameters value
     */
    public List<ArtifactParameterProperties> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters of the artifact.
     *
     * @param parameters the parameters value to set
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withParameters(List<ArtifactParameterProperties> parameters) {
        this.parameters = parameters;
        return this;
    }

}
