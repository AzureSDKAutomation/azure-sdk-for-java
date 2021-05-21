// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageAccountTypes. */
public final class StorageAccountTypes extends ExpandableStringEnum<StorageAccountTypes> {
    /** Static value Standard_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value StandardSSD_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes STANDARD_SSD_LRS = fromString("StandardSSD_LRS");

    /** Static value UltraSSD_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes ULTRA_SSD_LRS = fromString("UltraSSD_LRS");

    /** Static value Premium_ZRS for StorageAccountTypes. */
    public static final StorageAccountTypes PREMIUM_ZRS = fromString("Premium_ZRS");

    /** Static value StandardSSD_ZRS for StorageAccountTypes. */
    public static final StorageAccountTypes STANDARD_SSD_ZRS = fromString("StandardSSD_ZRS");

    /**
     * Creates or finds a StorageAccountTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageAccountTypes.
     */
    @JsonCreator
    public static StorageAccountTypes fromString(String name) {
        return fromString(name, StorageAccountTypes.class);
    }

    /** @return known StorageAccountTypes values. */
    public static Collection<StorageAccountTypes> values() {
        return values(StorageAccountTypes.class);
    }
}
