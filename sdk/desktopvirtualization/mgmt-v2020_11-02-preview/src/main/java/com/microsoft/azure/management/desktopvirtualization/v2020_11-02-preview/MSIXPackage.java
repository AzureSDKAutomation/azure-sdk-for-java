/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.MSIXPackageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.DesktopVirtualizationManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing MSIXPackage.
 */
public interface MSIXPackage extends HasInner<MSIXPackageInner>, Indexable, Refreshable<MSIXPackage>, Updatable<MSIXPackage.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the imagePath value.
     */
    String imagePath();

    /**
     * @return the isActive value.
     */
    boolean isActive();

    /**
     * @return the isRegularRegistration value.
     */
    boolean isRegularRegistration();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the packageApplications value.
     */
    List<MsixPackageApplications> packageApplications();

    /**
     * @return the packageDependencies value.
     */
    List<MsixPackageDependencies> packageDependencies();

    /**
     * @return the packageFamilyName value.
     */
    String packageFamilyName();

    /**
     * @return the packageName value.
     */
    String packageName();

    /**
     * @return the packageRelativePath value.
     */
    String packageRelativePath();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the MSIXPackage definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithHostPool, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MSIXPackage definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MSIXPackage definition.
         */
        interface Blank extends WithHostPool {
        }

        /**
         * The stage of the msixpackage definition allowing to specify HostPool.
         */
        interface WithHostPool {
           /**
            * Specifies resourceGroupName, hostPoolName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param hostPoolName The name of the host pool within the specified resource group
            * @return the next definition stage
            */
            WithCreate withExistingHostPool(String resourceGroupName, String hostPoolName);
        }

        /**
         * The stage of the msixpackage definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName User friendly Name to be displayed in the portal
             * @return the next definition stage
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the msixpackage definition allowing to specify ImagePath.
         */
        interface WithImagePath {
            /**
             * Specifies imagePath.
             * @param imagePath VHD/CIM image path on Network Share
             * @return the next definition stage
             */
            WithCreate withImagePath(String imagePath);
        }

        /**
         * The stage of the msixpackage definition allowing to specify IsActive.
         */
        interface WithIsActive {
            /**
             * Specifies isActive.
             * @param isActive Make this version of the package the active one across the hostpool
             * @return the next definition stage
             */
            WithCreate withIsActive(boolean isActive);
        }

        /**
         * The stage of the msixpackage definition allowing to specify IsRegularRegistration.
         */
        interface WithIsRegularRegistration {
            /**
             * Specifies isRegularRegistration.
             * @param isRegularRegistration Specifies how to register Package in feed
             * @return the next definition stage
             */
            WithCreate withIsRegularRegistration(boolean isRegularRegistration);
        }

        /**
         * The stage of the msixpackage definition allowing to specify LastUpdated.
         */
        interface WithLastUpdated {
            /**
             * Specifies lastUpdated.
             * @param lastUpdated Date Package was last updated, found in the appxmanifest.xml
             * @return the next definition stage
             */
            WithCreate withLastUpdated(DateTime lastUpdated);
        }

        /**
         * The stage of the msixpackage definition allowing to specify PackageApplications.
         */
        interface WithPackageApplications {
            /**
             * Specifies packageApplications.
             * @param packageApplications List of package applications
             * @return the next definition stage
             */
            WithCreate withPackageApplications(List<MsixPackageApplications> packageApplications);
        }

        /**
         * The stage of the msixpackage definition allowing to specify PackageDependencies.
         */
        interface WithPackageDependencies {
            /**
             * Specifies packageDependencies.
             * @param packageDependencies List of package dependencies
             * @return the next definition stage
             */
            WithCreate withPackageDependencies(List<MsixPackageDependencies> packageDependencies);
        }

        /**
         * The stage of the msixpackage definition allowing to specify PackageFamilyName.
         */
        interface WithPackageFamilyName {
            /**
             * Specifies packageFamilyName.
             * @param packageFamilyName Package Family Name from appxmanifest.xml. Contains Package Name and Publisher name
             * @return the next definition stage
             */
            WithCreate withPackageFamilyName(String packageFamilyName);
        }

        /**
         * The stage of the msixpackage definition allowing to specify PackageName.
         */
        interface WithPackageName {
            /**
             * Specifies packageName.
             * @param packageName Package Name from appxmanifest.xml
             * @return the next definition stage
             */
            WithCreate withPackageName(String packageName);
        }

        /**
         * The stage of the msixpackage definition allowing to specify PackageRelativePath.
         */
        interface WithPackageRelativePath {
            /**
             * Specifies packageRelativePath.
             * @param packageRelativePath Relative Path to the package inside the image
             * @return the next definition stage
             */
            WithCreate withPackageRelativePath(String packageRelativePath);
        }

        /**
         * The stage of the msixpackage definition allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             * @param version Package Version found in the appxmanifest.xml
             * @return the next definition stage
             */
            WithCreate withVersion(String version);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<MSIXPackage>, DefinitionStages.WithDisplayName, DefinitionStages.WithImagePath, DefinitionStages.WithIsActive, DefinitionStages.WithIsRegularRegistration, DefinitionStages.WithLastUpdated, DefinitionStages.WithPackageApplications, DefinitionStages.WithPackageDependencies, DefinitionStages.WithPackageFamilyName, DefinitionStages.WithPackageName, DefinitionStages.WithPackageRelativePath, DefinitionStages.WithVersion {
        }
    }
    /**
     * The template for a MSIXPackage update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MSIXPackage>, UpdateStages.WithDisplayName, UpdateStages.WithIsActive, UpdateStages.WithIsRegularRegistration {
    }

    /**
     * Grouping of MSIXPackage update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the msixpackage update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName Display name for MSIX Package
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the msixpackage update allowing to specify IsActive.
         */
        interface WithIsActive {
            /**
             * Specifies isActive.
             * @param isActive Set a version of the package to be active across hostpool
             * @return the next update stage
             */
            Update withIsActive(Boolean isActive);
        }

        /**
         * The stage of the msixpackage update allowing to specify IsRegularRegistration.
         */
        interface WithIsRegularRegistration {
            /**
             * Specifies isRegularRegistration.
             * @param isRegularRegistration Set Registration mode. Regular or Delayed
             * @return the next update stage
             */
            Update withIsRegularRegistration(Boolean isRegularRegistration);
        }

    }
}
