/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataSource filter. Right now, only filter by kind is supported.
 */
public class DataSourceFilter {
    /**
     * Possible values include: 'AzureActivityLog', 'ChangeTrackingPath',
     * 'ChangeTrackingDefaultPath', 'ChangeTrackingDefaultRegistry',
     * 'ChangeTrackingCustomRegistry', 'CustomLog', 'CustomLogCollection',
     * 'GenericDataSource', 'IISLogs', 'LinuxPerformanceObject',
     * 'LinuxPerformanceCollection', 'LinuxSyslog', 'LinuxSyslogCollection',
     * 'WindowsEvent', 'WindowsPerformanceCounter'.
     */
    @JsonProperty(value = "kind")
    private DataSourceKind kind;

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
     * @return the DataSourceFilter object itself.
     */
    public DataSourceFilter withKind(DataSourceKind kind) {
        this.kind = kind;
        return this;
    }

}
