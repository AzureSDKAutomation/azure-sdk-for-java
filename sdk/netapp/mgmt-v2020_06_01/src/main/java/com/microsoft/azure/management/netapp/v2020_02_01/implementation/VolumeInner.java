/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01.implementation;

import com.microsoft.azure.management.netapp.v2020_02_01.ServiceLevel;
import com.microsoft.azure.management.netapp.v2020_02_01.VolumePropertiesExportPolicy;
import java.util.List;
import com.microsoft.azure.management.netapp.v2020_02_01.MountTargetProperties;
import com.microsoft.azure.management.netapp.v2020_02_01.VolumePropertiesDataProtection;
import com.microsoft.azure.management.netapp.v2020_02_01.SecurityStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Volume resource.
 */
@JsonFlatten
public class VolumeInner extends Resource {
    /**
     * FileSystem ID.
     * Unique FileSystem Identifier.
     */
    @JsonProperty(value = "properties.fileSystemId", access = JsonProperty.Access.WRITE_ONLY)
    private String fileSystemId;

    /**
     * Creation Token or File Path.
     * A unique file path for the volume. Used when creating mount targets.
     */
    @JsonProperty(value = "properties.creationToken", required = true)
    private String creationToken;

    /**
     * serviceLevel.
     * The service level of the file system. Possible values include:
     * 'Standard', 'Premium', 'Ultra'.
     */
    @JsonProperty(value = "properties.serviceLevel")
    private ServiceLevel serviceLevel;

    /**
     * usageThreshold.
     * Maximum storage quota allowed for a file system in bytes. This is a soft
     * quota used for alerting only. Minimum size is 100 GiB. Upper limit is
     * 100TiB. Specified in bytes.
     */
    @JsonProperty(value = "properties.usageThreshold", required = true)
    private long usageThreshold;

    /**
     * exportPolicy.
     * Set of export policy rules.
     */
    @JsonProperty(value = "properties.exportPolicy")
    private VolumePropertiesExportPolicy exportPolicy;

    /**
     * protocolTypes.
     * Set of protocol types.
     */
    @JsonProperty(value = "properties.protocolTypes")
    private List<String> protocolTypes;

    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Snapshot ID.
     * UUID v4 or resource identifier used to identify the Snapshot.
     */
    @JsonProperty(value = "properties.snapshotId")
    private String snapshotId;

    /**
     * Backup ID.
     * UUID v4 or resource identifier used to identify the Backup.
     */
    @JsonProperty(value = "properties.backupId")
    private String backupId;

    /**
     * Baremetal Tenant ID.
     * Unique Baremetal Tenant Identifier.
     */
    @JsonProperty(value = "properties.baremetalTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String baremetalTenantId;

    /**
     * The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     */
    @JsonProperty(value = "properties.subnetId", required = true)
    private String subnetId;

    /**
     * mountTargets.
     * List of mount targets.
     */
    @JsonProperty(value = "properties.mountTargets")
    private List<MountTargetProperties> mountTargets;

    /**
     * What type of volume is this.
     */
    @JsonProperty(value = "properties.volumeType")
    private String volumeType;

    /**
     * DataProtection.
     * DataProtection type volumes include an object containing details of the
     * replication.
     */
    @JsonProperty(value = "properties.dataProtection")
    private VolumePropertiesDataProtection dataProtection;

    /**
     * Restoring.
     */
    @JsonProperty(value = "properties.isRestoring")
    private Boolean isRestoring;

    /**
     * If enabled (true) the volume will contain a read-only .snapshot
     * directory which provides access to each of the volume's snapshots
     * (default to true).
     */
    @JsonProperty(value = "properties.snapshotDirectoryVisible")
    private Boolean snapshotDirectoryVisible;

    /**
     * Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     */
    @JsonProperty(value = "properties.kerberosEnabled")
    private Boolean kerberosEnabled;

    /**
     * The security style of volume. Possible values include: 'ntfs', 'unix'.
     */
    @JsonProperty(value = "properties.securityStyle")
    private SecurityStyle securityStyle;

    /**
     * Maximum throughput in Mibps that can be achieved by this volume.
     */
    @JsonProperty(value = "properties.throughputMibps")
    private Double throughputMibps;

    /**
     * Get unique FileSystem Identifier.
     *
     * @return the fileSystemId value
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Get a unique file path for the volume. Used when creating mount targets.
     *
     * @return the creationToken value
     */
    public String creationToken() {
        return this.creationToken;
    }

    /**
     * Set a unique file path for the volume. Used when creating mount targets.
     *
     * @param creationToken the creationToken value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * Get the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @return the serviceLevel value
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @param serviceLevel the serviceLevel value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value
     */
    public long usageThreshold() {
        return this.usageThreshold;
    }

    /**
     * Set maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withUsageThreshold(long usageThreshold) {
        this.usageThreshold = usageThreshold;
        return this;
    }

    /**
     * Get set of export policy rules.
     *
     * @return the exportPolicy value
     */
    public VolumePropertiesExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withExportPolicy(VolumePropertiesExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

    /**
     * Get set of protocol types.
     *
     * @return the protocolTypes value
     */
    public List<String> protocolTypes() {
        return this.protocolTypes;
    }

    /**
     * Set set of protocol types.
     *
     * @param protocolTypes the protocolTypes value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withProtocolTypes(List<String> protocolTypes) {
        this.protocolTypes = protocolTypes;
        return this;
    }

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get uUID v4 or resource identifier used to identify the Snapshot.
     *
     * @return the snapshotId value
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Set uUID v4 or resource identifier used to identify the Snapshot.
     *
     * @param snapshotId the snapshotId value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Get uUID v4 or resource identifier used to identify the Backup.
     *
     * @return the backupId value
     */
    public String backupId() {
        return this.backupId;
    }

    /**
     * Set uUID v4 or resource identifier used to identify the Backup.
     *
     * @param backupId the backupId value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get unique Baremetal Tenant Identifier.
     *
     * @return the baremetalTenantId value
     */
    public String baremetalTenantId() {
        return this.baremetalTenantId;
    }

    /**
     * Get the Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes.
     *
     * @param subnetId the subnetId value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get list of mount targets.
     *
     * @return the mountTargets value
     */
    public List<MountTargetProperties> mountTargets() {
        return this.mountTargets;
    }

    /**
     * Set list of mount targets.
     *
     * @param mountTargets the mountTargets value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withMountTargets(List<MountTargetProperties> mountTargets) {
        this.mountTargets = mountTargets;
        return this;
    }

    /**
     * Get what type of volume is this.
     *
     * @return the volumeType value
     */
    public String volumeType() {
        return this.volumeType;
    }

    /**
     * Set what type of volume is this.
     *
     * @param volumeType the volumeType value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Get dataProtection type volumes include an object containing details of the replication.
     *
     * @return the dataProtection value
     */
    public VolumePropertiesDataProtection dataProtection() {
        return this.dataProtection;
    }

    /**
     * Set dataProtection type volumes include an object containing details of the replication.
     *
     * @param dataProtection the dataProtection value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withDataProtection(VolumePropertiesDataProtection dataProtection) {
        this.dataProtection = dataProtection;
        return this;
    }

    /**
     * Get restoring.
     *
     * @return the isRestoring value
     */
    public Boolean isRestoring() {
        return this.isRestoring;
    }

    /**
     * Set restoring.
     *
     * @param isRestoring the isRestoring value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withIsRestoring(Boolean isRestoring) {
        this.isRestoring = isRestoring;
        return this;
    }

    /**
     * Get if enabled (true) the volume will contain a read-only .snapshot directory which provides access to each of the volume's snapshots (default to true).
     *
     * @return the snapshotDirectoryVisible value
     */
    public Boolean snapshotDirectoryVisible() {
        return this.snapshotDirectoryVisible;
    }

    /**
     * Set if enabled (true) the volume will contain a read-only .snapshot directory which provides access to each of the volume's snapshots (default to true).
     *
     * @param snapshotDirectoryVisible the snapshotDirectoryVisible value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        return this;
    }

    /**
     * Get describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later.
     *
     * @return the kerberosEnabled value
     */
    public Boolean kerberosEnabled() {
        return this.kerberosEnabled;
    }

    /**
     * Set describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later.
     *
     * @param kerberosEnabled the kerberosEnabled value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withKerberosEnabled(Boolean kerberosEnabled) {
        this.kerberosEnabled = kerberosEnabled;
        return this;
    }

    /**
     * Get the security style of volume. Possible values include: 'ntfs', 'unix'.
     *
     * @return the securityStyle value
     */
    public SecurityStyle securityStyle() {
        return this.securityStyle;
    }

    /**
     * Set the security style of volume. Possible values include: 'ntfs', 'unix'.
     *
     * @param securityStyle the securityStyle value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle;
        return this;
    }

    /**
     * Get the throughputMibps value.
     *
     * @return the throughputMibps value
     */
    public Double throughputMibps() {
        return this.throughputMibps;
    }

    /**
     * Set the throughputMibps value.
     *
     * @param throughputMibps the throughputMibps value to set
     * @return the VolumeInner object itself.
     */
    public VolumeInner withThroughputMibps(Double throughputMibps) {
        this.throughputMibps = throughputMibps;
        return this;
    }

}
