// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
import java.util.Map;

/**
 * An Azure Storage blob.
 */
@JacksonXmlRootElement(localName = "Blob")
@Fluent
public final class BlobItem {

    /*
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The deleted property.
     */
    @JsonProperty(value = "Deleted", required = true)
    private boolean deleted;

    /*
     * The snapshot property.
     */
    @JsonProperty(value = "Snapshot", required = true)
    private String snapshot;

    /*
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobItemProperties properties;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    private Map<String, String> tags;

    /*
     * The versionId property.
     */
    @JsonProperty(value = "VersionId", required = true)
    private String versionId;

    private Boolean isCurrentVersion;

    /*
     * The objectReplicationRuleStatus property.
     */
    @JsonProperty(value = "BlobObjectReplicationRuleStatus")
    private List<ObjectReplicationPolicy> objectReplicationSourcePolicies;

    /*
     * The isPrefix property. If blobs are named to mimic a directory hierarchy (i.e. path elements separated by a
     * delimiter), this property may be used to determine if the {@code BlobItem} is a virtual directory.
     */
    @JsonProperty(value = "IsPrefix")
    private Boolean isPrefix;

    /*
     * The HasVersionsOnly property.
     */
    @JsonProperty(value = "HasVersionsOnly")
    private Boolean hasVersionsOnly;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The deleted property.
     *
     * @return the deleted value.
     */
    public boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the snapshot property: The snapshot property.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public BlobItemProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setProperties(BlobItemProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the tags property: The tags property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags property.
     *
     * @param tags the tags value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the versionId property: The versionId property.
     *
     * @return the versionId value.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * Set the versionId property: The versionId property.
     *
     * @param versionId the versionId value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Get the isCurrentVersion property: The isCurrentVersion property.
     *
     * @return the isCurrentVersion value.
     */
    public Boolean isCurrentVersion() {
        return this.isCurrentVersion;
    }

    /**
     *  Set the isCurrentVersion property: The isCurrentVersion property.
     *
     * @param isCurrentVersion the isCurrentVersion value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setCurrentVersion(Boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
        return this;
    }

    /**
     * Get the objectReplicationSourcePolicies  property: The
     * objectReplicationSourcePolicies  property.
     *
     * @return the objectReplicationSourcePolicies  value.
     */
    public List<ObjectReplicationPolicy> getObjectReplicationSourcePolicies() {
        return this.objectReplicationSourcePolicies;
    }

    /**
     * Set the objectReplicationSourcePolicies  property: The
     * objectReplicationSourcePolicies  property.
     *
     * @param objectReplicationSourcePolicies the objectReplicationSourcePolicies  value
     * to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setObjectReplicationSourcePolicies(List<ObjectReplicationPolicy> objectReplicationSourcePolicies) {
        this.objectReplicationSourcePolicies = objectReplicationSourcePolicies;
        return this;
    }

    /**
     * Get the hasVersionsOnly property: The HasVersionsOnly property.
     *
     * @return the hasVersionsOnly value.
     */
    public Boolean hasVersionsOnly() {
        return this.hasVersionsOnly;
    }

    /**
     * Set the hasVersionsOnly property: The HasVersionsOnly property.
     *
     * @param hasVersionsOnly the hasVersionsOnly value to set.
     * @return the BlobItemInternal object itself.
     */
    public BlobItem setHasVersionsOnly(Boolean hasVersionsOnly) {
        this.hasVersionsOnly = hasVersionsOnly;
        return this;
    }

    /**
     * Get the isPrefix property: If blobs are named to mimic a directory hierarchy (i.e. path elements separated by a
     * delimiter), this property may be used to determine if the {@code BlobItem} is a virtual directory.
     *
     * @return the isPrefix value.
     */
    public Boolean isPrefix() {
        return this.isPrefix;
    }

    /**
     * Set the isPrefix property: The isPrefix property.
     *
     * @param isPrefix the isPrefix value to set.
     * @return the BlobItem object itself.
     */
    public BlobItem setIsPrefix(Boolean isPrefix) {
        this.isPrefix = isPrefix;
        return this;
    }
}
