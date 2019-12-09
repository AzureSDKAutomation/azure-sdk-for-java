/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL server sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SqlServerSink.class)
@JsonTypeName("SqlServerSink")
public class SqlServerSink extends CopySink {
    /**
     * SQL writer stored procedure name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "sqlWriterStoredProcedureName")
    private Object sqlWriterStoredProcedureName;

    /**
     * SQL writer table type. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "sqlWriterTableType")
    private Object sqlWriterTableType;

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * SQL stored procedure parameters.
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * The stored procedure parameter name of the table type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "storedProcedureTableTypeParameterName")
    private Object storedProcedureTableTypeParameterName;

    /**
     * The option to handle sink table, such as autoCreate. For now only
     * 'autoCreate' value is supported. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "tableOption")
    private Object tableOption;

    /**
     * Get sQL writer stored procedure name. Type: string (or Expression with resultType string).
     *
     * @return the sqlWriterStoredProcedureName value
     */
    public Object sqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName;
    }

    /**
     * Set sQL writer stored procedure name. Type: string (or Expression with resultType string).
     *
     * @param sqlWriterStoredProcedureName the sqlWriterStoredProcedureName value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withSqlWriterStoredProcedureName(Object sqlWriterStoredProcedureName) {
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        return this;
    }

    /**
     * Get sQL writer table type. Type: string (or Expression with resultType string).
     *
     * @return the sqlWriterTableType value
     */
    public Object sqlWriterTableType() {
        return this.sqlWriterTableType;
    }

    /**
     * Set sQL writer table type. Type: string (or Expression with resultType string).
     *
     * @param sqlWriterTableType the sqlWriterTableType value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withSqlWriterTableType(Object sqlWriterTableType) {
        this.sqlWriterTableType = sqlWriterTableType;
        return this;
    }

    /**
     * Get sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get sQL stored procedure parameters.
     *
     * @return the storedProcedureParameters value
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set sQL stored procedure parameters.
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withStoredProcedureParameters(Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     *
     * @return the storedProcedureTableTypeParameterName value
     */
    public Object storedProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName;
    }

    /**
     * Set the stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     *
     * @param storedProcedureTableTypeParameterName the storedProcedureTableTypeParameterName value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withStoredProcedureTableTypeParameterName(Object storedProcedureTableTypeParameterName) {
        this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
        return this;
    }

    /**
     * Get the option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     *
     * @return the tableOption value
     */
    public Object tableOption() {
        return this.tableOption;
    }

    /**
     * Set the option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     *
     * @param tableOption the tableOption value to set
     * @return the SqlServerSink object itself.
     */
    public SqlServerSink withTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

}
