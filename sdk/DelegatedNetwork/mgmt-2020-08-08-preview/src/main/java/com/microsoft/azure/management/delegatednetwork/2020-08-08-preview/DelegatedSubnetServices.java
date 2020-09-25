/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.delegatednetwork.2020-08-08-preview.implementation.DelegatedSubnetServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DelegatedSubnetServices.
 */
public interface DelegatedSubnetServices extends SupportsCreating<DelegatedSubnet.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DelegatedSubnet>, SupportsListingByResourceGroup<DelegatedSubnet>, SupportsListing<DelegatedSubnet>, HasInner<DelegatedSubnetServicesInner> {
}
