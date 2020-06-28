/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of cluster.
 */
public class ClusterGetProperties {
    /**
     * The version of the cluster.
     */
    @JsonProperty(value = "clusterVersion")
    private String clusterVersion;

    /**
     * The type of operating system. Possible values include: 'Windows',
     * 'Linux'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * The cluster tier. Possible values include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /**
     * The cluster definition.
     */
    @JsonProperty(value = "clusterDefinition", required = true)
    private ClusterDefinition clusterDefinition;

    /**
     * The cluster kafka rest proxy configuration.
     */
    @JsonProperty(value = "kafkaRestProperties")
    private KafkaRestProperties kafkaRestProperties;

    /**
     * The security profile.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /**
     * The compute profile.
     */
    @JsonProperty(value = "computeProfile")
    private ComputeProfile computeProfile;

    /**
     * The provisioning state, which only appears in the response. Possible
     * values include: 'InProgress', 'Failed', 'Succeeded', 'Canceled',
     * 'Deleting'.
     */
    @JsonProperty(value = "provisioningState")
    private HDInsightClusterProvisioningState provisioningState;

    /**
     * The date on which the cluster was created.
     */
    @JsonProperty(value = "createdDate")
    private String createdDate;

    /**
     * The state of the cluster.
     */
    @JsonProperty(value = "clusterState")
    private String clusterState;

    /**
     * The quota information.
     */
    @JsonProperty(value = "quotaInfo")
    private QuotaInfo quotaInfo;

    /**
     * The list of errors.
     */
    @JsonProperty(value = "errors")
    private List<Errors> errors;

    /**
     * The list of connectivity endpoints.
     */
    @JsonProperty(value = "connectivityEndpoints")
    private List<ConnectivityEndpoint> connectivityEndpoints;

    /**
     * The disk encryption properties.
     */
    @JsonProperty(value = "diskEncryptionProperties")
    private DiskEncryptionProperties diskEncryptionProperties;

    /**
     * The minimal supported tls version.
     */
    @JsonProperty(value = "minSupportedTlsVersion")
    private String minSupportedTlsVersion;

    /**
     * The network settings.
     */
    @JsonProperty(value = "networkSettings")
    private NetworkSettings networkSettings;

    /**
     * Get the version of the cluster.
     *
     * @return the clusterVersion value
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the version of the cluster.
     *
     * @param clusterVersion the clusterVersion value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the type of operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the type of operating system. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the cluster tier. Possible values include: 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the cluster tier. Possible values include: 'Standard', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the cluster definition.
     *
     * @return the clusterDefinition value
     */
    public ClusterDefinition clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * Set the cluster definition.
     *
     * @param clusterDefinition the clusterDefinition value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterDefinition(ClusterDefinition clusterDefinition) {
        this.clusterDefinition = clusterDefinition;
        return this;
    }

    /**
     * Get the cluster kafka rest proxy configuration.
     *
     * @return the kafkaRestProperties value
     */
    public KafkaRestProperties kafkaRestProperties() {
        return this.kafkaRestProperties;
    }

    /**
     * Set the cluster kafka rest proxy configuration.
     *
     * @param kafkaRestProperties the kafkaRestProperties value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withKafkaRestProperties(KafkaRestProperties kafkaRestProperties) {
        this.kafkaRestProperties = kafkaRestProperties;
        return this;
    }

    /**
     * Get the security profile.
     *
     * @return the securityProfile value
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the security profile.
     *
     * @param securityProfile the securityProfile value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the compute profile.
     *
     * @return the computeProfile value
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the compute profile.
     *
     * @param computeProfile the computeProfile value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response. Possible values include: 'InProgress', 'Failed', 'Succeeded', 'Canceled', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public HDInsightClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state, which only appears in the response. Possible values include: 'InProgress', 'Failed', 'Succeeded', 'Canceled', 'Deleting'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withProvisioningState(HDInsightClusterProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the date on which the cluster was created.
     *
     * @return the createdDate value
     */
    public String createdDate() {
        return this.createdDate;
    }

    /**
     * Set the date on which the cluster was created.
     *
     * @param createdDate the createdDate value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the state of the cluster.
     *
     * @return the clusterState value
     */
    public String clusterState() {
        return this.clusterState;
    }

    /**
     * Set the state of the cluster.
     *
     * @param clusterState the clusterState value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    /**
     * Get the quota information.
     *
     * @return the quotaInfo value
     */
    public QuotaInfo quotaInfo() {
        return this.quotaInfo;
    }

    /**
     * Set the quota information.
     *
     * @param quotaInfo the quotaInfo value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withQuotaInfo(QuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }

    /**
     * Get the list of errors.
     *
     * @return the errors value
     */
    public List<Errors> errors() {
        return this.errors;
    }

    /**
     * Set the list of errors.
     *
     * @param errors the errors value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withErrors(List<Errors> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the list of connectivity endpoints.
     *
     * @return the connectivityEndpoints value
     */
    public List<ConnectivityEndpoint> connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Set the list of connectivity endpoints.
     *
     * @param connectivityEndpoints the connectivityEndpoints value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withConnectivityEndpoints(List<ConnectivityEndpoint> connectivityEndpoints) {
        this.connectivityEndpoints = connectivityEndpoints;
        return this;
    }

    /**
     * Get the disk encryption properties.
     *
     * @return the diskEncryptionProperties value
     */
    public DiskEncryptionProperties diskEncryptionProperties() {
        return this.diskEncryptionProperties;
    }

    /**
     * Set the disk encryption properties.
     *
     * @param diskEncryptionProperties the diskEncryptionProperties value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withDiskEncryptionProperties(DiskEncryptionProperties diskEncryptionProperties) {
        this.diskEncryptionProperties = diskEncryptionProperties;
        return this;
    }

    /**
     * Get the minimal supported tls version.
     *
     * @return the minSupportedTlsVersion value
     */
    public String minSupportedTlsVersion() {
        return this.minSupportedTlsVersion;
    }

    /**
     * Set the minimal supported tls version.
     *
     * @param minSupportedTlsVersion the minSupportedTlsVersion value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withMinSupportedTlsVersion(String minSupportedTlsVersion) {
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        return this;
    }

    /**
     * Get the network settings.
     *
     * @return the networkSettings value
     */
    public NetworkSettings networkSettings() {
        return this.networkSettings;
    }

    /**
     * Set the network settings.
     *
     * @param networkSettings the networkSettings value to set
     * @return the ClusterGetProperties object itself.
     */
    public ClusterGetProperties withNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
        return this;
    }

}
