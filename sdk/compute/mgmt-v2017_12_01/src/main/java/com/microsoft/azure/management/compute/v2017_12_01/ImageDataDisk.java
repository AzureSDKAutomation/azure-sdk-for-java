/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a data disk.
 */
public class ImageDataDisk {
    /**
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * The snapshot.
     */
    @JsonProperty(value = "snapshot")
    private SubResource snapshot;

    /**
     * The managedDisk.
     */
    @JsonProperty(value = "managedDisk")
    private SubResource managedDisk;

    /**
     * The Virtual Hard Disk.
     */
    @JsonProperty(value = "blobUri")
    private String blobUri;

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly**
     * &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None
     * for Standard storage. ReadOnly for Premium storage**. Possible values
     * include: 'None', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be
     * used to overwrite the name of the disk in a virtual machine image.
     * &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /**
     * Specifies the storage account type for the managed disk. Possible values
     * are: Standard_LRS or Premium_LRS. Possible values include:
     * 'Standard_LRS', 'Premium_LRS'.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Get specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @param lun the lun value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the snapshot.
     *
     * @return the snapshot value
     */
    public SubResource snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot.
     *
     * @param snapshot the snapshot value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withSnapshot(SubResource snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the managedDisk.
     *
     * @return the managedDisk value
     */
    public SubResource managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk.
     *
     * @param managedDisk the managedDisk value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withManagedDisk(SubResource managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the Virtual Hard Disk.
     *
     * @return the blobUri value
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the Virtual Hard Disk.
     *
     * @param blobUri the blobUri value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @return the caching value
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**. Possible values include: 'None', 'ReadOnly', 'ReadWrite'.
     *
     * @param caching the caching value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get specifies the storage account type for the managed disk. Possible values are: Standard_LRS or Premium_LRS. Possible values include: 'Standard_LRS', 'Premium_LRS'.
     *
     * @return the storageAccountType value
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set specifies the storage account type for the managed disk. Possible values are: Standard_LRS or Premium_LRS. Possible values include: 'Standard_LRS', 'Premium_LRS'.
     *
     * @param storageAccountType the storageAccountType value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

}
