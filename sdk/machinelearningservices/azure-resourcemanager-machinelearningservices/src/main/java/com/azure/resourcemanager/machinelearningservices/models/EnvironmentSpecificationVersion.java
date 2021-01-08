// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Data Transfer Object (DTO) for an Execution Environment Specification. Name and version should default to the
 * AzureML-Minimal environment version tested with the current SDK client version as this is a main use-case. &lt;see
 * href="https://repo2docker.readthedocs.io/en/latest/specification.html" /&gt;.
 */
@Fluent
public final class EnvironmentSpecificationVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentSpecificationVersion.class);

    /*
     * Environment specification is either user managed or curated by the Azure
     * ML service
     * <see
     * href="https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments"
     * />
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private EnvironmentSpecificationType type;

    /*
     * Class to represent configuration settings for Docker
     */
    @JsonProperty(value = "docker")
    private DockerSpecification docker;

    /*
     * Standard configuration file used by conda that lets you install any kind
     * of package, including Python, R, and C/C++ packages
     * <see
     * href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment"
     * />
     */
    @JsonProperty(value = "condaFile")
    private String condaFile;

    /*
     * The asset datastoreId
     */
    @JsonProperty(value = "datastoreId")
    private String datastoreId;

    /*
     * Details of an AssetUri.
     */
    @JsonProperty(value = "assetPath")
    private AssetPath assetPath;

    /*
     * The asset description text.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Tag dictionary. Tags can be added, removed, and updated.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The asset property dictionary.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * Get the type property: Environment specification is either user managed or curated by the Azure ML service
     * &lt;see href="https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments" /&gt;.
     *
     * @return the type value.
     */
    public EnvironmentSpecificationType type() {
        return this.type;
    }

    /**
     * Get the docker property: Class to represent configuration settings for Docker.
     *
     * @return the docker value.
     */
    public DockerSpecification docker() {
        return this.docker;
    }

    /**
     * Set the docker property: Class to represent configuration settings for Docker.
     *
     * @param docker the docker value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withDocker(DockerSpecification docker) {
        this.docker = docker;
        return this;
    }

    /**
     * Get the condaFile property: Standard configuration file used by conda that lets you install any kind of package,
     * including Python, R, and C/C++ packages &lt;see
     * href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment"
     * /&gt;.
     *
     * @return the condaFile value.
     */
    public String condaFile() {
        return this.condaFile;
    }

    /**
     * Set the condaFile property: Standard configuration file used by conda that lets you install any kind of package,
     * including Python, R, and C/C++ packages &lt;see
     * href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment"
     * /&gt;.
     *
     * @param condaFile the condaFile value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withCondaFile(String condaFile) {
        this.condaFile = condaFile;
        return this;
    }

    /**
     * Get the datastoreId property: The asset datastoreId.
     *
     * @return the datastoreId value.
     */
    public String datastoreId() {
        return this.datastoreId;
    }

    /**
     * Set the datastoreId property: The asset datastoreId.
     *
     * @param datastoreId the datastoreId value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * Get the assetPath property: Details of an AssetUri.
     *
     * @return the assetPath value.
     */
    public AssetPath assetPath() {
        return this.assetPath;
    }

    /**
     * Set the assetPath property: Details of an AssetUri.
     *
     * @param assetPath the assetPath value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withAssetPath(AssetPath assetPath) {
        this.assetPath = assetPath;
        return this;
    }

    /**
     * Get the description property: The asset description text.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The asset description text.
     *
     * @param description the description value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the tags property: Tag dictionary. Tags can be added, removed, and updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tag dictionary. Tags can be added, removed, and updated.
     *
     * @param tags the tags value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The asset property dictionary.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The asset property dictionary.
     *
     * @param properties the properties value to set.
     * @return the EnvironmentSpecificationVersion object itself.
     */
    public EnvironmentSpecificationVersion withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (docker() != null) {
            docker().validate();
        }
        if (assetPath() != null) {
            assetPath().validate();
        }
    }
}
