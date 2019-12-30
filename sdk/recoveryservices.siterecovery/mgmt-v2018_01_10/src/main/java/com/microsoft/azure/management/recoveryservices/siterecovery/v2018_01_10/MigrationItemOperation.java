/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MigrationItemOperation.
 */
public final class MigrationItemOperation extends ExpandableStringEnum<MigrationItemOperation> {
    /** Static value DisableMigration for MigrationItemOperation. */
    public static final MigrationItemOperation DISABLE_MIGRATION = fromString("DisableMigration");

    /** Static value TestMigrate for MigrationItemOperation. */
    public static final MigrationItemOperation TEST_MIGRATE = fromString("TestMigrate");

    /** Static value TestMigrateCleanup for MigrationItemOperation. */
    public static final MigrationItemOperation TEST_MIGRATE_CLEANUP = fromString("TestMigrateCleanup");

    /** Static value Migrate for MigrationItemOperation. */
    public static final MigrationItemOperation MIGRATE = fromString("Migrate");

    /** Static value StartResync for MigrationItemOperation. */
    public static final MigrationItemOperation START_RESYNC = fromString("StartResync");

    /**
     * Creates or finds a MigrationItemOperation from its string representation.
     * @param name a name to look for
     * @return the corresponding MigrationItemOperation
     */
    @JsonCreator
    public static MigrationItemOperation fromString(String name) {
        return fromString(name, MigrationItemOperation.class);
    }

    /**
     * @return known MigrationItemOperation values
     */
    public static Collection<MigrationItemOperation> values() {
        return values(MigrationItemOperation.class);
    }
}
