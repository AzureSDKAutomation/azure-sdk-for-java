// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a managed Cassandra cluster. */
@Fluent
public final class ClusterResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterResourceProperties.class);

    /*
     * The status of the resource at the time the operation was called.
     */
    @JsonProperty(value = "provisioningState")
    private ManagedCassandraProvisioningState provisioningState;

    /*
     * To create an empty cluster, omit this field or set it to null. To
     * restore a backup into a new cluster, set this field to the resource id
     * of the backup.
     */
    @JsonProperty(value = "restoreFromBackupId")
    private String restoreFromBackupId;

    /*
     * Resource id of a subnet that this cluster's management service should
     * have its network interface attached to. The subnet must be routable to
     * all subnets that will be delegated to data centers. The resource id must
     * be of the form '/subscriptions/<subscription
     * id>/resourceGroups/<resource
     * group>/providers/Microsoft.Network/virtualNetworks/<virtual
     * network>/subnets/<subnet>'
     */
    @JsonProperty(value = "delegatedManagementSubnetId")
    private String delegatedManagementSubnetId;

    /*
     * Which version of Cassandra should this cluster converge to running
     * (e.g., 3.11). When updated, the cluster may take some time to migrate to
     * the new version.
     */
    @JsonProperty(value = "cassandraVersion")
    private String cassandraVersion;

    /*
     * If you need to set the clusterName property in cassandra.yaml to
     * something besides the resource name of the cluster, set the value to use
     * on this property.
     */
    @JsonProperty(value = "clusterNameOverride")
    private String clusterNameOverride;

    /*
     * Which authentication method Cassandra should use to authenticate
     * clients. 'None' turns off authentication, so should not be used except
     * in emergencies. 'Cassandra' is the default password based
     * authentication. The default is 'Cassandra'.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /*
     * Initial password for clients connecting as admin to the cluster. Should
     * be changed after cluster creation. Returns null on GET. This field only
     * applies when the authenticationMethod field is 'Cassandra'.
     */
    @JsonProperty(value = "initialCassandraAdminPassword")
    private String initialCassandraAdminPassword;

    /*
     * Number of hours to wait between taking a backup of the cluster. To
     * disable backups, set this property to 0.
     */
    @JsonProperty(value = "hoursBetweenBackups")
    private Integer hoursBetweenBackups;

    /*
     * Hostname or IP address where the Prometheus endpoint containing data
     * about the managed Cassandra nodes can be reached.
     */
    @JsonProperty(value = "prometheusEndpoint")
    private SeedNode prometheusEndpoint;

    /*
     * Should automatic repairs run on this cluster? If omitted, this is true,
     * and should stay true unless you are running a hybrid cluster where you
     * are already doing your own repairs.
     */
    @JsonProperty(value = "repairEnabled")
    private Boolean repairEnabled;

    /*
     * List of TLS certificates used to authorize clients connecting to the
     * cluster. All connections are TLS encrypted whether clientCertificates is
     * set or not, but if clientCertificates is set, the managed Cassandra
     * cluster will reject all connections not bearing a TLS client certificate
     * that can be validated from one or more of the public certificates in
     * this property.
     */
    @JsonProperty(value = "clientCertificates")
    private List<Certificate> clientCertificates;

    /*
     * List of TLS certificates used to authorize gossip from unmanaged data
     * centers. The TLS certificates of all nodes in unmanaged data centers
     * must be verifiable using one of the certificates provided in this
     * property.
     */
    @JsonProperty(value = "externalGossipCertificates")
    private List<Certificate> externalGossipCertificates;

    /*
     * List of TLS certificates that unmanaged nodes must trust for gossip with
     * managed nodes. All managed nodes will present TLS client certificates
     * that are verifiable using one of the certificates provided in this
     * property.
     */
    @JsonProperty(value = "gossipCertificates", access = JsonProperty.Access.WRITE_ONLY)
    private List<Certificate> gossipCertificates;

    /*
     * List of IP addresses of seed nodes in unmanaged data centers. These will
     * be added to the seed node lists of all managed nodes.
     */
    @JsonProperty(value = "externalSeedNodes")
    private List<SeedNode> externalSeedNodes;

    /*
     * List of IP addresses of seed nodes in the managed data centers. These
     * should be added to the seed node lists of all unmanaged nodes.
     */
    @JsonProperty(value = "seedNodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<SeedNode> seedNodes;

    /**
     * Get the provisioningState property: The status of the resource at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ManagedCassandraProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The status of the resource at the time the operation was called.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withProvisioningState(ManagedCassandraProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the restoreFromBackupId property: To create an empty cluster, omit this field or set it to null. To restore a
     * backup into a new cluster, set this field to the resource id of the backup.
     *
     * @return the restoreFromBackupId value.
     */
    public String restoreFromBackupId() {
        return this.restoreFromBackupId;
    }

    /**
     * Set the restoreFromBackupId property: To create an empty cluster, omit this field or set it to null. To restore a
     * backup into a new cluster, set this field to the resource id of the backup.
     *
     * @param restoreFromBackupId the restoreFromBackupId value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withRestoreFromBackupId(String restoreFromBackupId) {
        this.restoreFromBackupId = restoreFromBackupId;
        return this;
    }

    /**
     * Get the delegatedManagementSubnetId property: Resource id of a subnet that this cluster's management service
     * should have its network interface attached to. The subnet must be routable to all subnets that will be delegated
     * to data centers. The resource id must be of the form '/subscriptions/&lt;subscription
     * id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual
     * network&gt;/subnets/&lt;subnet&gt;'.
     *
     * @return the delegatedManagementSubnetId value.
     */
    public String delegatedManagementSubnetId() {
        return this.delegatedManagementSubnetId;
    }

    /**
     * Set the delegatedManagementSubnetId property: Resource id of a subnet that this cluster's management service
     * should have its network interface attached to. The subnet must be routable to all subnets that will be delegated
     * to data centers. The resource id must be of the form '/subscriptions/&lt;subscription
     * id&gt;/resourceGroups/&lt;resource group&gt;/providers/Microsoft.Network/virtualNetworks/&lt;virtual
     * network&gt;/subnets/&lt;subnet&gt;'.
     *
     * @param delegatedManagementSubnetId the delegatedManagementSubnetId value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withDelegatedManagementSubnetId(String delegatedManagementSubnetId) {
        this.delegatedManagementSubnetId = delegatedManagementSubnetId;
        return this;
    }

    /**
     * Get the cassandraVersion property: Which version of Cassandra should this cluster converge to running (e.g.,
     * 3.11). When updated, the cluster may take some time to migrate to the new version.
     *
     * @return the cassandraVersion value.
     */
    public String cassandraVersion() {
        return this.cassandraVersion;
    }

    /**
     * Set the cassandraVersion property: Which version of Cassandra should this cluster converge to running (e.g.,
     * 3.11). When updated, the cluster may take some time to migrate to the new version.
     *
     * @param cassandraVersion the cassandraVersion value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withCassandraVersion(String cassandraVersion) {
        this.cassandraVersion = cassandraVersion;
        return this;
    }

    /**
     * Get the clusterNameOverride property: If you need to set the clusterName property in cassandra.yaml to something
     * besides the resource name of the cluster, set the value to use on this property.
     *
     * @return the clusterNameOverride value.
     */
    public String clusterNameOverride() {
        return this.clusterNameOverride;
    }

    /**
     * Set the clusterNameOverride property: If you need to set the clusterName property in cassandra.yaml to something
     * besides the resource name of the cluster, set the value to use on this property.
     *
     * @param clusterNameOverride the clusterNameOverride value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClusterNameOverride(String clusterNameOverride) {
        this.clusterNameOverride = clusterNameOverride;
        return this;
    }

    /**
     * Get the authenticationMethod property: Which authentication method Cassandra should use to authenticate clients.
     * 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password
     * based authentication. The default is 'Cassandra'.
     *
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: Which authentication method Cassandra should use to authenticate clients.
     * 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password
     * based authentication. The default is 'Cassandra'.
     *
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

    /**
     * Get the initialCassandraAdminPassword property: Initial password for clients connecting as admin to the cluster.
     * Should be changed after cluster creation. Returns null on GET. This field only applies when the
     * authenticationMethod field is 'Cassandra'.
     *
     * @return the initialCassandraAdminPassword value.
     */
    public String initialCassandraAdminPassword() {
        return this.initialCassandraAdminPassword;
    }

    /**
     * Set the initialCassandraAdminPassword property: Initial password for clients connecting as admin to the cluster.
     * Should be changed after cluster creation. Returns null on GET. This field only applies when the
     * authenticationMethod field is 'Cassandra'.
     *
     * @param initialCassandraAdminPassword the initialCassandraAdminPassword value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withInitialCassandraAdminPassword(String initialCassandraAdminPassword) {
        this.initialCassandraAdminPassword = initialCassandraAdminPassword;
        return this;
    }

    /**
     * Get the hoursBetweenBackups property: Number of hours to wait between taking a backup of the cluster. To disable
     * backups, set this property to 0.
     *
     * @return the hoursBetweenBackups value.
     */
    public Integer hoursBetweenBackups() {
        return this.hoursBetweenBackups;
    }

    /**
     * Set the hoursBetweenBackups property: Number of hours to wait between taking a backup of the cluster. To disable
     * backups, set this property to 0.
     *
     * @param hoursBetweenBackups the hoursBetweenBackups value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withHoursBetweenBackups(Integer hoursBetweenBackups) {
        this.hoursBetweenBackups = hoursBetweenBackups;
        return this;
    }

    /**
     * Get the prometheusEndpoint property: Hostname or IP address where the Prometheus endpoint containing data about
     * the managed Cassandra nodes can be reached.
     *
     * @return the prometheusEndpoint value.
     */
    public SeedNode prometheusEndpoint() {
        return this.prometheusEndpoint;
    }

    /**
     * Set the prometheusEndpoint property: Hostname or IP address where the Prometheus endpoint containing data about
     * the managed Cassandra nodes can be reached.
     *
     * @param prometheusEndpoint the prometheusEndpoint value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withPrometheusEndpoint(SeedNode prometheusEndpoint) {
        this.prometheusEndpoint = prometheusEndpoint;
        return this;
    }

    /**
     * Get the repairEnabled property: Should automatic repairs run on this cluster? If omitted, this is true, and
     * should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     *
     * @return the repairEnabled value.
     */
    public Boolean repairEnabled() {
        return this.repairEnabled;
    }

    /**
     * Set the repairEnabled property: Should automatic repairs run on this cluster? If omitted, this is true, and
     * should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     *
     * @param repairEnabled the repairEnabled value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withRepairEnabled(Boolean repairEnabled) {
        this.repairEnabled = repairEnabled;
        return this;
    }

    /**
     * Get the clientCertificates property: List of TLS certificates used to authorize clients connecting to the
     * cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is
     * set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be
     * validated from one or more of the public certificates in this property.
     *
     * @return the clientCertificates value.
     */
    public List<Certificate> clientCertificates() {
        return this.clientCertificates;
    }

    /**
     * Set the clientCertificates property: List of TLS certificates used to authorize clients connecting to the
     * cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is
     * set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be
     * validated from one or more of the public certificates in this property.
     *
     * @param clientCertificates the clientCertificates value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClientCertificates(List<Certificate> clientCertificates) {
        this.clientCertificates = clientCertificates;
        return this;
    }

    /**
     * Get the externalGossipCertificates property: List of TLS certificates used to authorize gossip from unmanaged
     * data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the
     * certificates provided in this property.
     *
     * @return the externalGossipCertificates value.
     */
    public List<Certificate> externalGossipCertificates() {
        return this.externalGossipCertificates;
    }

    /**
     * Set the externalGossipCertificates property: List of TLS certificates used to authorize gossip from unmanaged
     * data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the
     * certificates provided in this property.
     *
     * @param externalGossipCertificates the externalGossipCertificates value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withExternalGossipCertificates(List<Certificate> externalGossipCertificates) {
        this.externalGossipCertificates = externalGossipCertificates;
        return this;
    }

    /**
     * Get the gossipCertificates property: List of TLS certificates that unmanaged nodes must trust for gossip with
     * managed nodes. All managed nodes will present TLS client certificates that are verifiable using one of the
     * certificates provided in this property.
     *
     * @return the gossipCertificates value.
     */
    public List<Certificate> gossipCertificates() {
        return this.gossipCertificates;
    }

    /**
     * Get the externalSeedNodes property: List of IP addresses of seed nodes in unmanaged data centers. These will be
     * added to the seed node lists of all managed nodes.
     *
     * @return the externalSeedNodes value.
     */
    public List<SeedNode> externalSeedNodes() {
        return this.externalSeedNodes;
    }

    /**
     * Set the externalSeedNodes property: List of IP addresses of seed nodes in unmanaged data centers. These will be
     * added to the seed node lists of all managed nodes.
     *
     * @param externalSeedNodes the externalSeedNodes value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withExternalSeedNodes(List<SeedNode> externalSeedNodes) {
        this.externalSeedNodes = externalSeedNodes;
        return this;
    }

    /**
     * Get the seedNodes property: List of IP addresses of seed nodes in the managed data centers. These should be added
     * to the seed node lists of all unmanaged nodes.
     *
     * @return the seedNodes value.
     */
    public List<SeedNode> seedNodes() {
        return this.seedNodes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (prometheusEndpoint() != null) {
            prometheusEndpoint().validate();
        }
        if (clientCertificates() != null) {
            clientCertificates().forEach(e -> e.validate());
        }
        if (externalGossipCertificates() != null) {
            externalGossipCertificates().forEach(e -> e.validate());
        }
        if (gossipCertificates() != null) {
            gossipCertificates().forEach(e -> e.validate());
        }
        if (externalSeedNodes() != null) {
            externalSeedNodes().forEach(e -> e.validate());
        }
        if (seedNodes() != null) {
            seedNodes().forEach(e -> e.validate());
        }
    }
}
