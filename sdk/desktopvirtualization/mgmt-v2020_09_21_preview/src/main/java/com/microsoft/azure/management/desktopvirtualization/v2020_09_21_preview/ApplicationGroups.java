/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation.ApplicationGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationGroups.
 */
public interface ApplicationGroups extends SupportsCreating<ApplicationGroup.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ApplicationGroup>, SupportsListingByResourceGroup<ApplicationGroup>, SupportsListing<ApplicationGroup>, HasInner<ApplicationGroupsInner> {
}
