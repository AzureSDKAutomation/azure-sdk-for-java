// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ColumnDataType. */
public final class ColumnDataType extends ExpandableStringEnum<ColumnDataType> {
    /** Static value image for ColumnDataType. */
    public static final ColumnDataType IMAGE = fromString("image");

    /** Static value text for ColumnDataType. */
    public static final ColumnDataType TEXT = fromString("text");

    /** Static value uniqueidentifier for ColumnDataType. */
    public static final ColumnDataType UNIQUEIDENTIFIER = fromString("uniqueidentifier");

    /** Static value date for ColumnDataType. */
    public static final ColumnDataType DATE = fromString("date");

    /** Static value time for ColumnDataType. */
    public static final ColumnDataType TIME = fromString("time");

    /** Static value datetime2 for ColumnDataType. */
    public static final ColumnDataType DATETIME2 = fromString("datetime2");

    /** Static value datetimeoffset for ColumnDataType. */
    public static final ColumnDataType DATETIMEOFFSET = fromString("datetimeoffset");

    /** Static value tinyint for ColumnDataType. */
    public static final ColumnDataType TINYINT = fromString("tinyint");

    /** Static value smallint for ColumnDataType. */
    public static final ColumnDataType SMALLINT = fromString("smallint");

    /** Static value int for ColumnDataType. */
    public static final ColumnDataType INT = fromString("int");

    /** Static value smalldatetime for ColumnDataType. */
    public static final ColumnDataType SMALLDATETIME = fromString("smalldatetime");

    /** Static value real for ColumnDataType. */
    public static final ColumnDataType REAL = fromString("real");

    /** Static value money for ColumnDataType. */
    public static final ColumnDataType MONEY = fromString("money");

    /** Static value datetime for ColumnDataType. */
    public static final ColumnDataType DATETIME = fromString("datetime");

    /** Static value float for ColumnDataType. */
    public static final ColumnDataType FLOAT = fromString("float");

    /** Static value sql_variant for ColumnDataType. */
    public static final ColumnDataType SQL_VARIANT = fromString("sql_variant");

    /** Static value ntext for ColumnDataType. */
    public static final ColumnDataType NTEXT = fromString("ntext");

    /** Static value bit for ColumnDataType. */
    public static final ColumnDataType BIT = fromString("bit");

    /** Static value decimal for ColumnDataType. */
    public static final ColumnDataType DECIMAL = fromString("decimal");

    /** Static value numeric for ColumnDataType. */
    public static final ColumnDataType NUMERIC = fromString("numeric");

    /** Static value smallmoney for ColumnDataType. */
    public static final ColumnDataType SMALLMONEY = fromString("smallmoney");

    /** Static value bigint for ColumnDataType. */
    public static final ColumnDataType BIGINT = fromString("bigint");

    /** Static value hierarchyid for ColumnDataType. */
    public static final ColumnDataType HIERARCHYID = fromString("hierarchyid");

    /** Static value geometry for ColumnDataType. */
    public static final ColumnDataType GEOMETRY = fromString("geometry");

    /** Static value geography for ColumnDataType. */
    public static final ColumnDataType GEOGRAPHY = fromString("geography");

    /** Static value varbinary for ColumnDataType. */
    public static final ColumnDataType VARBINARY = fromString("varbinary");

    /** Static value varchar for ColumnDataType. */
    public static final ColumnDataType VARCHAR = fromString("varchar");

    /** Static value binary for ColumnDataType. */
    public static final ColumnDataType BINARY = fromString("binary");

    /** Static value char for ColumnDataType. */
    public static final ColumnDataType CHAR = fromString("char");

    /** Static value timestamp for ColumnDataType. */
    public static final ColumnDataType TIMESTAMP = fromString("timestamp");

    /** Static value nvarchar for ColumnDataType. */
    public static final ColumnDataType NVARCHAR = fromString("nvarchar");

    /** Static value nchar for ColumnDataType. */
    public static final ColumnDataType NCHAR = fromString("nchar");

    /** Static value xml for ColumnDataType. */
    public static final ColumnDataType XML = fromString("xml");

    /** Static value sysname for ColumnDataType. */
    public static final ColumnDataType SYSNAME = fromString("sysname");

    /**
     * Creates or finds a ColumnDataType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ColumnDataType.
     */
    @JsonCreator
    public static ColumnDataType fromString(String name) {
        return fromString(name, ColumnDataType.class);
    }

    /** @return known ColumnDataType values. */
    public static Collection<ColumnDataType> values() {
        return values(ColumnDataType.class);
    }
}
