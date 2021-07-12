// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration for compute nodes in a pool based on the Azure Virtual Machines infrastructure. */
@Fluent
public final class VirtualMachineConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineConfiguration.class);

    /*
     * A reference to an Azure Virtual Machines Marketplace image or the Azure
     * Image resource of a custom Virtual Machine. To get the list of all
     * imageReferences verified by Azure Batch, see the 'List supported node
     * agent SKUs' operation.
     */
    @JsonProperty(value = "imageReference", required = true)
    private ImageReference imageReference;

    /*
     * The Batch node agent is a program that runs on each node in the pool,
     * and provides the command-and-control interface between the node and the
     * Batch service. There are different implementations of the node agent,
     * known as SKUs, for different operating systems. You must specify a node
     * agent SKU which matches the selected image reference. To get the list of
     * supported node agent SKUs along with their list of verified image
     * references, see the 'List supported node agent SKUs' operation.
     */
    @JsonProperty(value = "nodeAgentSkuId", required = true)
    private String nodeAgentSkuId;

    /*
     * This property must not be specified if the imageReference specifies a
     * Linux OS image.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /*
     * This property must be specified if the compute nodes in the pool need to
     * have empty data disks attached to them.
     */
    @JsonProperty(value = "dataDisks")
    private List<DataDisk> dataDisks;

    /*
     * This only applies to images that contain the Windows operating system,
     * and should only be used when you hold valid on-premises licenses for the
     * nodes which will be deployed. If omitted, no on-premises licensing
     * discount is applied. Values are:
     *
     * Windows_Server - The on-premises license is for Windows Server.
     * Windows_Client - The on-premises license is for Windows Client.
     *
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * If specified, setup is performed on each node in the pool to allow tasks
     * to run in containers. All regular tasks and job manager tasks run on
     * this pool must specify the containerSettings property, and all other
     * tasks may specify it.
     */
    @JsonProperty(value = "containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    /*
     * If specified, encryption is performed on each node in the pool during
     * node provisioning.
     */
    @JsonProperty(value = "diskEncryptionConfiguration")
    private DiskEncryptionConfiguration diskEncryptionConfiguration;

    /*
     * This configuration will specify rules on how nodes in the pool will be
     * physically allocated.
     */
    @JsonProperty(value = "nodePlacementConfiguration")
    private NodePlacementConfiguration nodePlacementConfiguration;

    /*
     * If specified, the extensions mentioned in this configuration will be
     * installed on each node.
     */
    @JsonProperty(value = "extensions")
    private List<VMExtension> extensions;

    /*
     * Contains configuration for ephemeral OSDisk settings.
     */
    @JsonProperty(value = "osDisk")
    private OSDisk osDisk;

    /**
     * Get the imageReference property: A reference to an Azure Virtual Machines Marketplace image or the Azure Image
     * resource of a custom Virtual Machine. To get the list of all imageReferences verified by Azure Batch, see the
     * 'List supported node agent SKUs' operation.
     *
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: A reference to an Azure Virtual Machines Marketplace image or the Azure Image
     * resource of a custom Virtual Machine. To get the list of all imageReferences verified by Azure Batch, see the
     * 'List supported node agent SKUs' operation.
     *
     * @param imageReference the imageReference value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the nodeAgentSkuId property: The Batch node agent is a program that runs on each node in the pool, and
     * provides the command-and-control interface between the node and the Batch service. There are different
     * implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent
     * SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their
     * list of verified image references, see the 'List supported node agent SKUs' operation.
     *
     * @return the nodeAgentSkuId value.
     */
    public String nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * Set the nodeAgentSkuId property: The Batch node agent is a program that runs on each node in the pool, and
     * provides the command-and-control interface between the node and the Batch service. There are different
     * implementations of the node agent, known as SKUs, for different operating systems. You must specify a node agent
     * SKU which matches the selected image reference. To get the list of supported node agent SKUs along with their
     * list of verified image references, see the 'List supported node agent SKUs' operation.
     *
     * @param nodeAgentSkuId the nodeAgentSkuId value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withNodeAgentSkuId(String nodeAgentSkuId) {
        this.nodeAgentSkuId = nodeAgentSkuId;
        return this;
    }

    /**
     * Get the windowsConfiguration property: This property must not be specified if the imageReference specifies a
     * Linux OS image.
     *
     * @return the windowsConfiguration value.
     */
    public WindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: This property must not be specified if the imageReference specifies a
     * Linux OS image.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the dataDisks property: This property must be specified if the compute nodes in the pool need to have empty
     * data disks attached to them.
     *
     * @return the dataDisks value.
     */
    public List<DataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: This property must be specified if the compute nodes in the pool need to have empty
     * data disks attached to them.
     *
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the licenseType property: This only applies to images that contain the Windows operating system, and should
     * only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no
     * on-premises licensing discount is applied. Values are:
     *
     * <p>Windows_Server - The on-premises license is for Windows Server. Windows_Client - The on-premises license is
     * for Windows Client.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: This only applies to images that contain the Windows operating system, and should
     * only be used when you hold valid on-premises licenses for the nodes which will be deployed. If omitted, no
     * on-premises licensing discount is applied. Values are:
     *
     * <p>Windows_Server - The on-premises license is for Windows Server. Windows_Client - The on-premises license is
     * for Windows Client.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the containerConfiguration property: If specified, setup is performed on each node in the pool to allow tasks
     * to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings
     * property, and all other tasks may specify it.
     *
     * @return the containerConfiguration value.
     */
    public ContainerConfiguration containerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * Set the containerConfiguration property: If specified, setup is performed on each node in the pool to allow tasks
     * to run in containers. All regular tasks and job manager tasks run on this pool must specify the containerSettings
     * property, and all other tasks may specify it.
     *
     * @param containerConfiguration the containerConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }

    /**
     * Get the diskEncryptionConfiguration property: If specified, encryption is performed on each node in the pool
     * during node provisioning.
     *
     * @return the diskEncryptionConfiguration value.
     */
    public DiskEncryptionConfiguration diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }

    /**
     * Set the diskEncryptionConfiguration property: If specified, encryption is performed on each node in the pool
     * during node provisioning.
     *
     * @param diskEncryptionConfiguration the diskEncryptionConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withDiskEncryptionConfiguration(
        DiskEncryptionConfiguration diskEncryptionConfiguration) {
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        return this;
    }

    /**
     * Get the nodePlacementConfiguration property: This configuration will specify rules on how nodes in the pool will
     * be physically allocated.
     *
     * @return the nodePlacementConfiguration value.
     */
    public NodePlacementConfiguration nodePlacementConfiguration() {
        return this.nodePlacementConfiguration;
    }

    /**
     * Set the nodePlacementConfiguration property: This configuration will specify rules on how nodes in the pool will
     * be physically allocated.
     *
     * @param nodePlacementConfiguration the nodePlacementConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withNodePlacementConfiguration(
        NodePlacementConfiguration nodePlacementConfiguration) {
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        return this;
    }

    /**
     * Get the extensions property: If specified, the extensions mentioned in this configuration will be installed on
     * each node.
     *
     * @return the extensions value.
     */
    public List<VMExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: If specified, the extensions mentioned in this configuration will be installed on
     * each node.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withExtensions(List<VMExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the osDisk property: Contains configuration for ephemeral OSDisk settings.
     *
     * @return the osDisk value.
     */
    public OSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Contains configuration for ephemeral OSDisk settings.
     *
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property imageReference in model VirtualMachineConfiguration"));
        } else {
            imageReference().validate();
        }
        if (nodeAgentSkuId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property nodeAgentSkuId in model VirtualMachineConfiguration"));
        }
        if (windowsConfiguration() != null) {
            windowsConfiguration().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
        if (containerConfiguration() != null) {
            containerConfiguration().validate();
        }
        if (diskEncryptionConfiguration() != null) {
            diskEncryptionConfiguration().validate();
        }
        if (nodePlacementConfiguration() != null) {
            nodePlacementConfiguration().validate();
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
        if (osDisk() != null) {
            osDisk().validate();
        }
    }
}
