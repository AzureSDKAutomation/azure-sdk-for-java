// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Volume patch resource. */
@JsonFlatten
@Fluent
public class VolumePatch extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumePatch.class);

    /*
     * The service level of the file system
     */
    @JsonProperty(value = "properties.serviceLevel")
    private ServiceLevel serviceLevel;

    /*
     * Maximum storage quota allowed for a file system in bytes. This is a soft
     * quota used for alerting only. Minimum size is 100 GiB. Upper limit is
     * 100TiB. Specified in bytes.
     */
    @JsonProperty(value = "properties.usageThreshold")
    private Long usageThreshold;

    /*
     * Set of export policy rules
     */
    @JsonProperty(value = "properties.exportPolicy")
    private VolumePatchPropertiesExportPolicy exportPolicy;

    /*
     * Maximum throughput in Mibps that can be achieved by this volume
     */
    @JsonProperty(value = "properties.throughputMibps")
    private Float throughputMibps;

    /*
     * DataProtection type volumes include an object containing details of the
     * replication
     */
    @JsonProperty(value = "properties.dataProtection")
    private VolumePatchPropertiesDataProtection dataProtection;

    /**
     * Get the serviceLevel property: The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the serviceLevel property: The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is a soft quota
     * used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    public Long usageThreshold() {
        return this.usageThreshold;
    }

    /**
     * Set the usageThreshold property: Maximum storage quota allowed for a file system in bytes. This is a soft quota
     * used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withUsageThreshold(Long usageThreshold) {
        this.usageThreshold = usageThreshold;
        return this;
    }

    /**
     * Get the exportPolicy property: Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    public VolumePatchPropertiesExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set the exportPolicy property: Set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

    /**
     * Get the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @return the throughputMibps value.
     */
    public Float throughputMibps() {
        return this.throughputMibps;
    }

    /**
     * Set the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @param throughputMibps the throughputMibps value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withThroughputMibps(Float throughputMibps) {
        this.throughputMibps = throughputMibps;
        return this;
    }

    /**
     * Get the dataProtection property: DataProtection type volumes include an object containing details of the
     * replication.
     *
     * @return the dataProtection value.
     */
    public VolumePatchPropertiesDataProtection dataProtection() {
        return this.dataProtection;
    }

    /**
     * Set the dataProtection property: DataProtection type volumes include an object containing details of the
     * replication.
     *
     * @param dataProtection the dataProtection value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withDataProtection(VolumePatchPropertiesDataProtection dataProtection) {
        this.dataProtection = dataProtection;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumePatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumePatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exportPolicy() != null) {
            exportPolicy().validate();
        }
        if (dataProtection() != null) {
            dataProtection().validate();
        }
    }
}