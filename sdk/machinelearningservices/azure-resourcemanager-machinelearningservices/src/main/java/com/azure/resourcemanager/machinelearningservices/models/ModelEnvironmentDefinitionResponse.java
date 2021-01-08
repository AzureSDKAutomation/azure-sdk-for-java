// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ModelEnvironmentDefinitionResponse model. */
@Fluent
public class ModelEnvironmentDefinitionResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModelEnvironmentDefinitionResponse.class);

    /*
     * The name of the environment.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The environment version.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Settings for a Python environment.
     */
    @JsonProperty(value = "python")
    private ModelPythonSection python;

    /*
     * Definition of environment variables to be defined in the environment.
     */
    @JsonProperty(value = "environmentVariables")
    private Map<String, String> environmentVariables;

    /*
     * The definition of a Docker container.
     */
    @JsonProperty(value = "docker")
    private ModelDockerSectionResponse docker;

    /*
     * The configuration for a Spark environment.
     */
    @JsonProperty(value = "spark")
    private ModelSparkSection spark;

    /*
     * Settings for a R environment.
     */
    @JsonProperty(value = "r")
    private RSectionResponse r;

    /*
     * The inferencing stack version added to the image. To avoid adding an
     * inferencing stack, do not set this value. Valid values: "latest".
     */
    @JsonProperty(value = "inferencingStackVersion")
    private String inferencingStackVersion;

    /**
     * Get the name property: The name of the environment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the environment.
     *
     * @param name the name value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The environment version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The environment version.
     *
     * @param version the version value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the python property: Settings for a Python environment.
     *
     * @return the python value.
     */
    public ModelPythonSection python() {
        return this.python;
    }

    /**
     * Set the python property: Settings for a Python environment.
     *
     * @param python the python value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withPython(ModelPythonSection python) {
        this.python = python;
        return this;
    }

    /**
     * Get the environmentVariables property: Definition of environment variables to be defined in the environment.
     *
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Definition of environment variables to be defined in the environment.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the docker property: The definition of a Docker container.
     *
     * @return the docker value.
     */
    public ModelDockerSectionResponse docker() {
        return this.docker;
    }

    /**
     * Set the docker property: The definition of a Docker container.
     *
     * @param docker the docker value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withDocker(ModelDockerSectionResponse docker) {
        this.docker = docker;
        return this;
    }

    /**
     * Get the spark property: The configuration for a Spark environment.
     *
     * @return the spark value.
     */
    public ModelSparkSection spark() {
        return this.spark;
    }

    /**
     * Set the spark property: The configuration for a Spark environment.
     *
     * @param spark the spark value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withSpark(ModelSparkSection spark) {
        this.spark = spark;
        return this;
    }

    /**
     * Get the r property: Settings for a R environment.
     *
     * @return the r value.
     */
    public RSectionResponse r() {
        return this.r;
    }

    /**
     * Set the r property: Settings for a R environment.
     *
     * @param r the r value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withR(RSectionResponse r) {
        this.r = r;
        return this;
    }

    /**
     * Get the inferencingStackVersion property: The inferencing stack version added to the image. To avoid adding an
     * inferencing stack, do not set this value. Valid values: "latest".
     *
     * @return the inferencingStackVersion value.
     */
    public String inferencingStackVersion() {
        return this.inferencingStackVersion;
    }

    /**
     * Set the inferencingStackVersion property: The inferencing stack version added to the image. To avoid adding an
     * inferencing stack, do not set this value. Valid values: "latest".
     *
     * @param inferencingStackVersion the inferencingStackVersion value to set.
     * @return the ModelEnvironmentDefinitionResponse object itself.
     */
    public ModelEnvironmentDefinitionResponse withInferencingStackVersion(String inferencingStackVersion) {
        this.inferencingStackVersion = inferencingStackVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (python() != null) {
            python().validate();
        }
        if (docker() != null) {
            docker().validate();
        }
        if (spark() != null) {
            spark().validate();
        }
        if (r() != null) {
            r().validate();
        }
    }
}
