/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2015_11_01_preview.DataSourceKind;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Datasources under OMS Workspace.
 */
public class DataSourceInner extends ProxyResource {
    /**
     * The data source properties in raw json format, each kind of data source
     * have it's own schema.
     */
    @JsonProperty(value = "properties", required = true)
    private Object properties;

    /**
     * The ETag of the data source.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Possible values include: 'AzureActivityLog', 'ChangeTrackingPath',
     * 'ChangeTrackingDefaultPath', 'ChangeTrackingDefaultRegistry',
     * 'ChangeTrackingCustomRegistry', 'CustomLog', 'CustomLogCollection',
     * 'GenericDataSource', 'IISLogs', 'LinuxPerformanceObject',
     * 'LinuxPerformanceCollection', 'LinuxSyslog', 'LinuxSyslogCollection',
     * 'WindowsEvent', 'WindowsPerformanceCounter'.
     */
    @JsonProperty(value = "kind", required = true)
    private DataSourceKind kind;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the data source properties in raw json format, each kind of data source have it's own schema.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the data source properties in raw json format, each kind of data source have it's own schema.
     *
     * @param properties the properties value to set
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the ETag of the data source.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the data source.
     *
     * @param eTag the eTag value to set
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get possible values include: 'AzureActivityLog', 'ChangeTrackingPath', 'ChangeTrackingDefaultPath', 'ChangeTrackingDefaultRegistry', 'ChangeTrackingCustomRegistry', 'CustomLog', 'CustomLogCollection', 'GenericDataSource', 'IISLogs', 'LinuxPerformanceObject', 'LinuxPerformanceCollection', 'LinuxSyslog', 'LinuxSyslogCollection', 'WindowsEvent', 'WindowsPerformanceCounter'.
     *
     * @return the kind value
     */
    public DataSourceKind kind() {
        return this.kind;
    }

    /**
     * Set possible values include: 'AzureActivityLog', 'ChangeTrackingPath', 'ChangeTrackingDefaultPath', 'ChangeTrackingDefaultRegistry', 'ChangeTrackingCustomRegistry', 'CustomLog', 'CustomLogCollection', 'GenericDataSource', 'IISLogs', 'LinuxPerformanceObject', 'LinuxPerformanceCollection', 'LinuxSyslog', 'LinuxSyslogCollection', 'WindowsEvent', 'WindowsPerformanceCounter'.
     *
     * @param kind the kind value to set
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withKind(DataSourceKind kind) {
        this.kind = kind;
        return this;
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
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
