// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of AksComputeSecrets. */
@Fluent
public class AksComputeSecretsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AksComputeSecretsProperties.class);

    /*
     * Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     */
    @JsonProperty(value = "userKubeConfig")
    private String userKubeConfig;

    /*
     * Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     */
    @JsonProperty(value = "adminKubeConfig")
    private String adminKubeConfig;

    /*
     * Image registry pull secret.
     */
    @JsonProperty(value = "imagePullSecretName")
    private String imagePullSecretName;

    /**
     * Get the userKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @return the userKubeConfig value.
     */
    public String userKubeConfig() {
        return this.userKubeConfig;
    }

    /**
     * Set the userKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @param userKubeConfig the userKubeConfig value to set.
     * @return the AksComputeSecretsProperties object itself.
     */
    public AksComputeSecretsProperties withUserKubeConfig(String userKubeConfig) {
        this.userKubeConfig = userKubeConfig;
        return this;
    }

    /**
     * Get the adminKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @return the adminKubeConfig value.
     */
    public String adminKubeConfig() {
        return this.adminKubeConfig;
    }

    /**
     * Set the adminKubeConfig property: Content of kubeconfig file that can be used to connect to the Kubernetes
     * cluster.
     *
     * @param adminKubeConfig the adminKubeConfig value to set.
     * @return the AksComputeSecretsProperties object itself.
     */
    public AksComputeSecretsProperties withAdminKubeConfig(String adminKubeConfig) {
        this.adminKubeConfig = adminKubeConfig;
        return this;
    }

    /**
     * Get the imagePullSecretName property: Image registry pull secret.
     *
     * @return the imagePullSecretName value.
     */
    public String imagePullSecretName() {
        return this.imagePullSecretName;
    }

    /**
     * Set the imagePullSecretName property: Image registry pull secret.
     *
     * @param imagePullSecretName the imagePullSecretName value to set.
     * @return the AksComputeSecretsProperties object itself.
     */
    public AksComputeSecretsProperties withImagePullSecretName(String imagePullSecretName) {
        this.imagePullSecretName = imagePullSecretName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
