/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabaseEdition.
 */
public final class DatabaseEdition extends ExpandableStringEnum<DatabaseEdition> {
    /** Static value Web for DatabaseEdition. */
    public static final DatabaseEdition WEB = fromString("Web");

    /** Static value Business for DatabaseEdition. */
    public static final DatabaseEdition BUSINESS = fromString("Business");

    /** Static value Basic for DatabaseEdition. */
    public static final DatabaseEdition BASIC = fromString("Basic");

    /** Static value Standard for DatabaseEdition. */
    public static final DatabaseEdition STANDARD = fromString("Standard");

    /** Static value Premium for DatabaseEdition. */
    public static final DatabaseEdition PREMIUM = fromString("Premium");

    /** Static value PremiumRS for DatabaseEdition. */
    public static final DatabaseEdition PREMIUM_RS = fromString("PremiumRS");

    /** Static value Free for DatabaseEdition. */
    public static final DatabaseEdition FREE = fromString("Free");

    /** Static value Stretch for DatabaseEdition. */
    public static final DatabaseEdition STRETCH = fromString("Stretch");

    /** Static value DataWarehouse for DatabaseEdition. */
    public static final DatabaseEdition DATA_WAREHOUSE = fromString("DataWarehouse");

    /** Static value System for DatabaseEdition. */
    public static final DatabaseEdition SYSTEM = fromString("System");

    /** Static value System2 for DatabaseEdition. */
    public static final DatabaseEdition SYSTEM2 = fromString("System2");

    /** Static value GeneralPurpose for DatabaseEdition. */
    public static final DatabaseEdition GENERAL_PURPOSE = fromString("GeneralPurpose");

    /** Static value BusinessCritical for DatabaseEdition. */
    public static final DatabaseEdition BUSINESS_CRITICAL = fromString("BusinessCritical");

    /** Static value Hyperscale for DatabaseEdition. */
    public static final DatabaseEdition HYPERSCALE = fromString("Hyperscale");

    /**
     * Creates or finds a DatabaseEdition from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabaseEdition
     */
    @JsonCreator
    public static DatabaseEdition fromString(String name) {
        return fromString(name, DatabaseEdition.class);
    }

    /**
     * @return known DatabaseEdition values
     */
    public static Collection<DatabaseEdition> values() {
        return values(DatabaseEdition.class);
    }
}
