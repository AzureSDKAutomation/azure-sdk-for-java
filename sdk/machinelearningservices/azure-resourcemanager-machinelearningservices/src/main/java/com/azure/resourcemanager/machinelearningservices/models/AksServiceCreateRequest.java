// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.AuthKeysInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The request to create an AKS service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("AKS")
@Fluent
public final class AksServiceCreateRequest extends CreateEndpointVariantRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AksServiceCreateRequest.class);

    /*
     * The number of replicas on the cluster.
     */
    @JsonProperty(value = "numReplicas")
    private Integer numReplicas;

    /*
     * Details of the data collection options specified.
     */
    @JsonProperty(value = "dataCollection")
    private ModelDataCollection dataCollection;

    /*
     * The name of the compute resource.
     */
    @JsonProperty(value = "computeName")
    private String computeName;

    /*
     * Whether or not Application Insights is enabled.
     */
    @JsonProperty(value = "appInsightsEnabled")
    private Boolean appInsightsEnabled;

    /*
     * The auto scaler properties.
     */
    @JsonProperty(value = "autoScaler")
    private AutoScaler autoScaler;

    /*
     * The container resource requirements.
     */
    @JsonProperty(value = "containerResourceRequirements")
    private ContainerResourceRequirements containerResourceRequirements;

    /*
     * The maximum number of concurrent requests per container.
     */
    @JsonProperty(value = "maxConcurrentRequestsPerContainer")
    private Integer maxConcurrentRequestsPerContainer;

    /*
     * Maximum time a request will wait in the queue (in milliseconds). After
     * this time, the service will return 503 (Service Unavailable)
     */
    @JsonProperty(value = "maxQueueWaitMs")
    private Integer maxQueueWaitMs;

    /*
     * Kubernetes namespace for the service.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The scoring timeout in milliseconds.
     */
    @JsonProperty(value = "scoringTimeoutMs")
    private Integer scoringTimeoutMs;

    /*
     * Whether or not authentication is enabled.
     */
    @JsonProperty(value = "authEnabled")
    private Boolean authEnabled;

    /*
     * The liveness probe requirements.
     */
    @JsonProperty(value = "livenessProbeRequirements")
    private LivenessProbeRequirements livenessProbeRequirements;

    /*
     * Whether or not AAD authentication is enabled.
     */
    @JsonProperty(value = "aadAuthEnabled")
    private Boolean aadAuthEnabled;

    /**
     * Get the numReplicas property: The number of replicas on the cluster.
     *
     * @return the numReplicas value.
     */
    public Integer numReplicas() {
        return this.numReplicas;
    }

    /**
     * Set the numReplicas property: The number of replicas on the cluster.
     *
     * @param numReplicas the numReplicas value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
        return this;
    }

    /**
     * Get the dataCollection property: Details of the data collection options specified.
     *
     * @return the dataCollection value.
     */
    public ModelDataCollection dataCollection() {
        return this.dataCollection;
    }

    /**
     * Set the dataCollection property: Details of the data collection options specified.
     *
     * @param dataCollection the dataCollection value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withDataCollection(ModelDataCollection dataCollection) {
        this.dataCollection = dataCollection;
        return this;
    }

    /**
     * Get the computeName property: The name of the compute resource.
     *
     * @return the computeName value.
     */
    public String computeName() {
        return this.computeName;
    }

    /**
     * Set the computeName property: The name of the compute resource.
     *
     * @param computeName the computeName value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withComputeName(String computeName) {
        this.computeName = computeName;
        return this;
    }

    /**
     * Get the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @return the appInsightsEnabled value.
     */
    public Boolean appInsightsEnabled() {
        return this.appInsightsEnabled;
    }

    /**
     * Set the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @param appInsightsEnabled the appInsightsEnabled value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withAppInsightsEnabled(Boolean appInsightsEnabled) {
        this.appInsightsEnabled = appInsightsEnabled;
        return this;
    }

    /**
     * Get the autoScaler property: The auto scaler properties.
     *
     * @return the autoScaler value.
     */
    public AutoScaler autoScaler() {
        return this.autoScaler;
    }

    /**
     * Set the autoScaler property: The auto scaler properties.
     *
     * @param autoScaler the autoScaler value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withAutoScaler(AutoScaler autoScaler) {
        this.autoScaler = autoScaler;
        return this;
    }

    /**
     * Get the containerResourceRequirements property: The container resource requirements.
     *
     * @return the containerResourceRequirements value.
     */
    public ContainerResourceRequirements containerResourceRequirements() {
        return this.containerResourceRequirements;
    }

    /**
     * Set the containerResourceRequirements property: The container resource requirements.
     *
     * @param containerResourceRequirements the containerResourceRequirements value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withContainerResourceRequirements(
        ContainerResourceRequirements containerResourceRequirements) {
        this.containerResourceRequirements = containerResourceRequirements;
        return this;
    }

    /**
     * Get the maxConcurrentRequestsPerContainer property: The maximum number of concurrent requests per container.
     *
     * @return the maxConcurrentRequestsPerContainer value.
     */
    public Integer maxConcurrentRequestsPerContainer() {
        return this.maxConcurrentRequestsPerContainer;
    }

    /**
     * Set the maxConcurrentRequestsPerContainer property: The maximum number of concurrent requests per container.
     *
     * @param maxConcurrentRequestsPerContainer the maxConcurrentRequestsPerContainer value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withMaxConcurrentRequestsPerContainer(Integer maxConcurrentRequestsPerContainer) {
        this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
        return this;
    }

    /**
     * Get the maxQueueWaitMs property: Maximum time a request will wait in the queue (in milliseconds). After this
     * time, the service will return 503 (Service Unavailable).
     *
     * @return the maxQueueWaitMs value.
     */
    public Integer maxQueueWaitMs() {
        return this.maxQueueWaitMs;
    }

    /**
     * Set the maxQueueWaitMs property: Maximum time a request will wait in the queue (in milliseconds). After this
     * time, the service will return 503 (Service Unavailable).
     *
     * @param maxQueueWaitMs the maxQueueWaitMs value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withMaxQueueWaitMs(Integer maxQueueWaitMs) {
        this.maxQueueWaitMs = maxQueueWaitMs;
        return this;
    }

    /**
     * Get the namespace property: Kubernetes namespace for the service.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Kubernetes namespace for the service.
     *
     * @param namespace the namespace value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the scoringTimeoutMs property: The scoring timeout in milliseconds.
     *
     * @return the scoringTimeoutMs value.
     */
    public Integer scoringTimeoutMs() {
        return this.scoringTimeoutMs;
    }

    /**
     * Set the scoringTimeoutMs property: The scoring timeout in milliseconds.
     *
     * @param scoringTimeoutMs the scoringTimeoutMs value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withScoringTimeoutMs(Integer scoringTimeoutMs) {
        this.scoringTimeoutMs = scoringTimeoutMs;
        return this;
    }

    /**
     * Get the authEnabled property: Whether or not authentication is enabled.
     *
     * @return the authEnabled value.
     */
    public Boolean authEnabled() {
        return this.authEnabled;
    }

    /**
     * Set the authEnabled property: Whether or not authentication is enabled.
     *
     * @param authEnabled the authEnabled value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }

    /**
     * Get the livenessProbeRequirements property: The liveness probe requirements.
     *
     * @return the livenessProbeRequirements value.
     */
    public LivenessProbeRequirements livenessProbeRequirements() {
        return this.livenessProbeRequirements;
    }

    /**
     * Set the livenessProbeRequirements property: The liveness probe requirements.
     *
     * @param livenessProbeRequirements the livenessProbeRequirements value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withLivenessProbeRequirements(LivenessProbeRequirements livenessProbeRequirements) {
        this.livenessProbeRequirements = livenessProbeRequirements;
        return this;
    }

    /**
     * Get the aadAuthEnabled property: Whether or not AAD authentication is enabled.
     *
     * @return the aadAuthEnabled value.
     */
    public Boolean aadAuthEnabled() {
        return this.aadAuthEnabled;
    }

    /**
     * Set the aadAuthEnabled property: Whether or not AAD authentication is enabled.
     *
     * @param aadAuthEnabled the aadAuthEnabled value to set.
     * @return the AksServiceCreateRequest object itself.
     */
    public AksServiceCreateRequest withAadAuthEnabled(Boolean aadAuthEnabled) {
        this.aadAuthEnabled = aadAuthEnabled;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withIsDefault(Boolean isDefault) {
        super.withIsDefault(isDefault);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withTrafficPercentile(Float trafficPercentile) {
        super.withTrafficPercentile(trafficPercentile);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withType(VariantType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withKvTags(Map<String, String> kvTags) {
        super.withKvTags(kvTags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withKeys(AuthKeysInner keys) {
        super.withKeys(keys);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withEnvironmentImageRequest(EnvironmentImageRequest environmentImageRequest) {
        super.withEnvironmentImageRequest(environmentImageRequest);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceCreateRequest withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataCollection() != null) {
            dataCollection().validate();
        }
        if (autoScaler() != null) {
            autoScaler().validate();
        }
        if (containerResourceRequirements() != null) {
            containerResourceRequirements().validate();
        }
        if (livenessProbeRequirements() != null) {
            livenessProbeRequirements().validate();
        }
    }
}
