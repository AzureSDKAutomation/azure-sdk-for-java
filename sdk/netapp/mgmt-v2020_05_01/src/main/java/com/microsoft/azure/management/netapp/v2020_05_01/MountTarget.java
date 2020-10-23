/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Mount Target.
 */
@JsonFlatten
public class MountTarget {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * mountTargetId.
     * UUID v4 used to identify the MountTarget.
     */
    @JsonProperty(value = "properties.mountTargetId", access = JsonProperty.Access.WRITE_ONLY)
    private String mountTargetId;

    /**
     * fileSystemId.
     * UUID v4 used to identify the MountTarget.
     */
    @JsonProperty(value = "properties.fileSystemId", required = true)
    private String fileSystemId;

    /**
     * ipAddress.
     * The mount target's IPv4 address.
     */
    @JsonProperty(value = "properties.ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * smbServerFQDN.
     * The SMB server's Fully Qualified Domain Name, FQDN.
     */
    @JsonProperty(value = "properties.smbServerFqdn")
    private String smbServerFqdn;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the MountTarget object itself.
     */
    public MountTarget withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the MountTarget object itself.
     */
    public MountTarget withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get uUID v4 used to identify the MountTarget.
     *
     * @return the mountTargetId value
     */
    public String mountTargetId() {
        return this.mountTargetId;
    }

    /**
     * Get uUID v4 used to identify the MountTarget.
     *
     * @return the fileSystemId value
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Set uUID v4 used to identify the MountTarget.
     *
     * @param fileSystemId the fileSystemId value to set
     * @return the MountTarget object itself.
     */
    public MountTarget withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * Get the mount target's IPv4 address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @return the smbServerFqdn value
     */
    public String smbServerFqdn() {
        return this.smbServerFqdn;
    }

    /**
     * Set the SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @param smbServerFqdn the smbServerFqdn value to set
     * @return the MountTarget object itself.
     */
    public MountTarget withSmbServerFqdn(String smbServerFqdn) {
        this.smbServerFqdn = smbServerFqdn;
        return this;
    }

}
