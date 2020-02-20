/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties for updating a docker build step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DockerBuildStepUpdateParameters.class)
@JsonTypeName("Docker")
public class DockerBuildStepUpdateParameters extends TaskStepUpdateParameters {
    /**
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /**
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /**
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /**
     * The Docker file path relative to the source context.
     */
    @JsonProperty(value = "dockerFilePath")
    private String dockerFilePath;

    /**
     * The collection of override arguments to be used when executing this
     * build step.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /**
     * The name of the target build stage for the docker build.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get the fully qualified image names including the repository and tag.
     *
     * @return the imageNames value
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @return the isPushEnabled value
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the value of this property indicates whether the image built should be pushed to the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the Docker file path relative to the source context.
     *
     * @return the dockerFilePath value
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the Docker file path relative to the source context.
     *
     * @param dockerFilePath the dockerFilePath value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the collection of override arguments to be used when executing this build step.
     *
     * @return the arguments value
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the collection of override arguments to be used when executing this build step.
     *
     * @param arguments the arguments value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the name of the target build stage for the docker build.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the name of the target build stage for the docker build.
     *
     * @param target the target value to set
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withTarget(String target) {
        this.target = target;
        return this;
    }

}
