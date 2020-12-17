// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.VolumeInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Volume. */
public interface Volume {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the fileSystemId property: Unique FileSystem Identifier.
     *
     * @return the fileSystemId value.
     */
    String fileSystemId();

    /**
     * Gets the creationToken property: A unique file path for the volume. Used when creating mount targets.
     *
     * @return the creationToken value.
     */
    String creationToken();

    /**
     * Gets the serviceLevel property: The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    ServiceLevel serviceLevel();

    /**
     * Gets the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is a soft quota
     * used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    long usageThreshold();

    /**
     * Gets the exportPolicy property: Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    VolumePropertiesExportPolicy exportPolicy();

    /**
     * Gets the protocolTypes property: Set of protocol types.
     *
     * @return the protocolTypes value.
     */
    List<String> protocolTypes();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the snapshotId property: UUID v4 or resource identifier used to identify the Snapshot.
     *
     * @return the snapshotId value.
     */
    String snapshotId();

    /**
     * Gets the backupId property: UUID v4 or resource identifier used to identify the Backup.
     *
     * @return the backupId value.
     */
    String backupId();

    /**
     * Gets the baremetalTenantId property: Unique Baremetal Tenant Identifier.
     *
     * @return the baremetalTenantId value.
     */
    String baremetalTenantId();

    /**
     * Gets the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the mountTargets property: List of mount targets.
     *
     * @return the mountTargets value.
     */
    List<MountTargetProperties> mountTargets();

    /**
     * Gets the volumeType property: What type of volume is this.
     *
     * @return the volumeType value.
     */
    String volumeType();

    /**
     * Gets the dataProtection property: DataProtection type volumes include an object containing details of the
     * replication.
     *
     * @return the dataProtection value.
     */
    VolumePropertiesDataProtection dataProtection();

    /**
     * Gets the isRestoring property: Restoring.
     *
     * @return the isRestoring value.
     */
    Boolean isRestoring();

    /**
     * Gets the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only .snapshot
     * directory which provides access to each of the volume's snapshots (default to true).
     *
     * @return the snapshotDirectoryVisible value.
     */
    Boolean snapshotDirectoryVisible();

    /**
     * Gets the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     *
     * @return the kerberosEnabled value.
     */
    Boolean kerberosEnabled();

    /**
     * Gets the securityStyle property: The security style of volume.
     *
     * @return the securityStyle value.
     */
    SecurityStyle securityStyle();

    /**
     * Gets the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
     * volume. To be used with swagger version 2020-08-01 or later.
     *
     * @return the smbEncryption value.
     */
    Boolean smbEncryption();

    /**
     * Gets the smbContinuouslyAvailable property: Enables continuously available share property for smb volume. Only
     * applicable for SMB volume.
     *
     * @return the smbContinuouslyAvailable value.
     */
    Boolean smbContinuouslyAvailable();

    /**
     * Gets the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @return the throughputMibps value.
     */
    Float throughputMibps();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.VolumeInner object.
     *
     * @return the inner object.
     */
    VolumeInner innerModel();

    /** The entirety of the Volume definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreationToken,
            DefinitionStages.WithUsageThreshold,
            DefinitionStages.WithSubnetId,
            DefinitionStages.WithCreate {
    }
    /** The Volume definition stages. */
    interface DefinitionStages {
        /** The first stage of the Volume definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Volume definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Volume definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, poolName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param accountName The name of the NetApp account.
             * @param poolName The name of the capacity pool.
             * @return the next definition stage.
             */
            WithCreationToken withExistingCapacityPool(String resourceGroupName, String accountName, String poolName);
        }
        /** The stage of the Volume definition allowing to specify creationToken. */
        interface WithCreationToken {
            /**
             * Specifies the creationToken property: A unique file path for the volume. Used when creating mount
             * targets.
             *
             * @param creationToken A unique file path for the volume. Used when creating mount targets.
             * @return the next definition stage.
             */
            WithUsageThreshold withCreationToken(String creationToken);
        }
        /** The stage of the Volume definition allowing to specify usageThreshold. */
        interface WithUsageThreshold {
            /**
             * Specifies the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is
             * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes..
             *
             * @param usageThreshold Maximum storage quota allowed for a file system in bytes. This is a soft quota used
             *     for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
             * @return the next definition stage.
             */
            WithSubnetId withUsageThreshold(long usageThreshold);
        }
        /** The stage of the Volume definition allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
             * Microsoft.NetApp/volumes.
             *
             * @param subnetId The Azure Resource URI for a delegated subnet. Must have the delegation
             *     Microsoft.NetApp/volumes.
             * @return the next definition stage.
             */
            WithCreate withSubnetId(String subnetId);
        }
        /**
         * The stage of the Volume definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithServiceLevel,
                DefinitionStages.WithExportPolicy,
                DefinitionStages.WithProtocolTypes,
                DefinitionStages.WithSnapshotId,
                DefinitionStages.WithBackupId,
                DefinitionStages.WithMountTargets,
                DefinitionStages.WithVolumeType,
                DefinitionStages.WithDataProtection,
                DefinitionStages.WithIsRestoring,
                DefinitionStages.WithSnapshotDirectoryVisible,
                DefinitionStages.WithKerberosEnabled,
                DefinitionStages.WithSecurityStyle,
                DefinitionStages.WithSmbEncryption,
                DefinitionStages.WithSmbContinuouslyAvailable,
                DefinitionStages.WithThroughputMibps {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Volume create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Volume create(Context context);
        }
        /** The stage of the Volume definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Volume definition allowing to specify serviceLevel. */
        interface WithServiceLevel {
            /**
             * Specifies the serviceLevel property: The service level of the file system.
             *
             * @param serviceLevel The service level of the file system.
             * @return the next definition stage.
             */
            WithCreate withServiceLevel(ServiceLevel serviceLevel);
        }
        /** The stage of the Volume definition allowing to specify exportPolicy. */
        interface WithExportPolicy {
            /**
             * Specifies the exportPolicy property: Set of export policy rules.
             *
             * @param exportPolicy Set of export policy rules.
             * @return the next definition stage.
             */
            WithCreate withExportPolicy(VolumePropertiesExportPolicy exportPolicy);
        }
        /** The stage of the Volume definition allowing to specify protocolTypes. */
        interface WithProtocolTypes {
            /**
             * Specifies the protocolTypes property: Set of protocol types.
             *
             * @param protocolTypes Set of protocol types.
             * @return the next definition stage.
             */
            WithCreate withProtocolTypes(List<String> protocolTypes);
        }
        /** The stage of the Volume definition allowing to specify snapshotId. */
        interface WithSnapshotId {
            /**
             * Specifies the snapshotId property: UUID v4 or resource identifier used to identify the Snapshot..
             *
             * @param snapshotId UUID v4 or resource identifier used to identify the Snapshot.
             * @return the next definition stage.
             */
            WithCreate withSnapshotId(String snapshotId);
        }
        /** The stage of the Volume definition allowing to specify backupId. */
        interface WithBackupId {
            /**
             * Specifies the backupId property: UUID v4 or resource identifier used to identify the Backup..
             *
             * @param backupId UUID v4 or resource identifier used to identify the Backup.
             * @return the next definition stage.
             */
            WithCreate withBackupId(String backupId);
        }
        /** The stage of the Volume definition allowing to specify mountTargets. */
        interface WithMountTargets {
            /**
             * Specifies the mountTargets property: List of mount targets.
             *
             * @param mountTargets List of mount targets.
             * @return the next definition stage.
             */
            WithCreate withMountTargets(List<MountTargetProperties> mountTargets);
        }
        /** The stage of the Volume definition allowing to specify volumeType. */
        interface WithVolumeType {
            /**
             * Specifies the volumeType property: What type of volume is this.
             *
             * @param volumeType What type of volume is this.
             * @return the next definition stage.
             */
            WithCreate withVolumeType(String volumeType);
        }
        /** The stage of the Volume definition allowing to specify dataProtection. */
        interface WithDataProtection {
            /**
             * Specifies the dataProtection property: DataProtection type volumes include an object containing details
             * of the replication.
             *
             * @param dataProtection DataProtection type volumes include an object containing details of the
             *     replication.
             * @return the next definition stage.
             */
            WithCreate withDataProtection(VolumePropertiesDataProtection dataProtection);
        }
        /** The stage of the Volume definition allowing to specify isRestoring. */
        interface WithIsRestoring {
            /**
             * Specifies the isRestoring property: Restoring.
             *
             * @param isRestoring Restoring.
             * @return the next definition stage.
             */
            WithCreate withIsRestoring(Boolean isRestoring);
        }
        /** The stage of the Volume definition allowing to specify snapshotDirectoryVisible. */
        interface WithSnapshotDirectoryVisible {
            /**
             * Specifies the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only
             * .snapshot directory which provides access to each of the volume's snapshots (default to true)..
             *
             * @param snapshotDirectoryVisible If enabled (true) the volume will contain a read-only .snapshot directory
             *     which provides access to each of the volume's snapshots (default to true).
             * @return the next definition stage.
             */
            WithCreate withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible);
        }
        /** The stage of the Volume definition allowing to specify kerberosEnabled. */
        interface WithKerberosEnabled {
            /**
             * Specifies the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger
             * version 2020-05-01 or later.
             *
             * @param kerberosEnabled Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01
             *     or later.
             * @return the next definition stage.
             */
            WithCreate withKerberosEnabled(Boolean kerberosEnabled);
        }
        /** The stage of the Volume definition allowing to specify securityStyle. */
        interface WithSecurityStyle {
            /**
             * Specifies the securityStyle property: The security style of volume.
             *
             * @param securityStyle The security style of volume.
             * @return the next definition stage.
             */
            WithCreate withSecurityStyle(SecurityStyle securityStyle);
        }
        /** The stage of the Volume definition allowing to specify smbEncryption. */
        interface WithSmbEncryption {
            /**
             * Specifies the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for
             * SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later.
             *
             * @param smbEncryption Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
             *     volume. To be used with swagger version 2020-08-01 or later.
             * @return the next definition stage.
             */
            WithCreate withSmbEncryption(Boolean smbEncryption);
        }
        /** The stage of the Volume definition allowing to specify smbContinuouslyAvailable. */
        interface WithSmbContinuouslyAvailable {
            /**
             * Specifies the smbContinuouslyAvailable property: Enables continuously available share property for smb
             * volume. Only applicable for SMB volume.
             *
             * @param smbContinuouslyAvailable Enables continuously available share property for smb volume. Only
             *     applicable for SMB volume.
             * @return the next definition stage.
             */
            WithCreate withSmbContinuouslyAvailable(Boolean smbContinuouslyAvailable);
        }
        /** The stage of the Volume definition allowing to specify throughputMibps. */
        interface WithThroughputMibps {
            /**
             * Specifies the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
             *
             * @param throughputMibps Maximum throughput in Mibps that can be achieved by this volume.
             * @return the next definition stage.
             */
            WithCreate withThroughputMibps(Float throughputMibps);
        }
    }
    /**
     * Begins update for the Volume resource.
     *
     * @return the stage of resource update.
     */
    Volume.Update update();

    /** The template for Volume update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithServiceLevel,
            UpdateStages.WithUsageThreshold,
            UpdateStages.WithExportPolicy,
            UpdateStages.WithThroughputMibps,
            UpdateStages.WithDataProtection {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Volume apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Volume apply(Context context);
    }
    /** The Volume update stages. */
    interface UpdateStages {
        /** The stage of the Volume update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Volume update allowing to specify serviceLevel. */
        interface WithServiceLevel {
            /**
             * Specifies the serviceLevel property: The service level of the file system.
             *
             * @param serviceLevel The service level of the file system.
             * @return the next definition stage.
             */
            Update withServiceLevel(ServiceLevel serviceLevel);
        }
        /** The stage of the Volume update allowing to specify usageThreshold. */
        interface WithUsageThreshold {
            /**
             * Specifies the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is
             * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes..
             *
             * @param usageThreshold Maximum storage quota allowed for a file system in bytes. This is a soft quota used
             *     for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
             * @return the next definition stage.
             */
            Update withUsageThreshold(Long usageThreshold);
        }
        /** The stage of the Volume update allowing to specify exportPolicy. */
        interface WithExportPolicy {
            /**
             * Specifies the exportPolicy property: Set of export policy rules.
             *
             * @param exportPolicy Set of export policy rules.
             * @return the next definition stage.
             */
            Update withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy);
        }
        /** The stage of the Volume update allowing to specify throughputMibps. */
        interface WithThroughputMibps {
            /**
             * Specifies the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
             *
             * @param throughputMibps Maximum throughput in Mibps that can be achieved by this volume.
             * @return the next definition stage.
             */
            Update withThroughputMibps(Float throughputMibps);
        }
        /** The stage of the Volume update allowing to specify dataProtection. */
        interface WithDataProtection {
            /**
             * Specifies the dataProtection property: DataProtection type volumes include an object containing details
             * of the replication.
             *
             * @param dataProtection DataProtection type volumes include an object containing details of the
             *     replication.
             * @return the next definition stage.
             */
            Update withDataProtection(VolumePatchPropertiesDataProtection dataProtection);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Volume refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Volume refresh(Context context);
}
