// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner;
import java.util.Map;

/** An immutable client-side representation of Application. */
public interface Application {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the description property: Description of Application.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the friendlyName property: Friendly name of Application.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the filePath property: Specifies a path for the executable file for the application.
     *
     * @return the filePath value.
     */
    String filePath();

    /**
     * Gets the msixPackageFamilyName property: Specifies the package family name for MSIX applications.
     *
     * @return the msixPackageFamilyName value.
     */
    String msixPackageFamilyName();

    /**
     * Gets the msixPackageApplicationId property: Specifies the package application Id for MSIX applications.
     *
     * @return the msixPackageApplicationId value.
     */
    String msixPackageApplicationId();

    /**
     * Gets the applicationType property: Resource Type of Application.
     *
     * @return the applicationType value.
     */
    RemoteApplicationType applicationType();

    /**
     * Gets the commandLineSetting property: Specifies whether this published application can be launched with command
     * line arguments provided by the client, command line arguments specified at publish time, or no command line
     * arguments at all.
     *
     * @return the commandLineSetting value.
     */
    CommandLineSetting commandLineSetting();

    /**
     * Gets the commandLineArguments property: Command Line Arguments for Application.
     *
     * @return the commandLineArguments value.
     */
    String commandLineArguments();

    /**
     * Gets the showInPortal property: Specifies whether to show the RemoteApp program in the RD Web Access server.
     *
     * @return the showInPortal value.
     */
    Boolean showInPortal();

    /**
     * Gets the iconPath property: Path to icon.
     *
     * @return the iconPath value.
     */
    String iconPath();

    /**
     * Gets the iconIndex property: Index of the icon.
     *
     * @return the iconIndex value.
     */
    Integer iconIndex();

    /**
     * Gets the iconHash property: Hash of the icon.
     *
     * @return the iconHash value.
     */
    String iconHash();

    /**
     * Gets the iconContent property: the icon a 64 bit string as a byte array.
     *
     * @return the iconContent value.
     */
    byte[] iconContent();

    /**
     * Gets the inner com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner object.
     *
     * @return the inner object.
     */
    ApplicationInner innerModel();

    /** The entirety of the Application definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCommandLineSetting,
            DefinitionStages.WithCreate {
    }
    /** The Application definition stages. */
    interface DefinitionStages {
        /** The first stage of the Application definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Application definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, applicationGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param applicationGroupName The name of the application group.
             * @return the next definition stage.
             */
            WithCommandLineSetting withExistingApplicationGroup(String resourceGroupName, String applicationGroupName);
        }
        /** The stage of the Application definition allowing to specify commandLineSetting. */
        interface WithCommandLineSetting {
            /**
             * Specifies the commandLineSetting property: Specifies whether this published application can be launched
             * with command line arguments provided by the client, command line arguments specified at publish time, or
             * no command line arguments at all..
             *
             * @param commandLineSetting Specifies whether this published application can be launched with command line
             *     arguments provided by the client, command line arguments specified at publish time, or no command
             *     line arguments at all.
             * @return the next definition stage.
             */
            WithCreate withCommandLineSetting(CommandLineSetting commandLineSetting);
        }
        /**
         * The stage of the Application definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDescription,
                DefinitionStages.WithFriendlyName,
                DefinitionStages.WithFilePath,
                DefinitionStages.WithMsixPackageFamilyName,
                DefinitionStages.WithMsixPackageApplicationId,
                DefinitionStages.WithApplicationType,
                DefinitionStages.WithCommandLineArguments,
                DefinitionStages.WithShowInPortal,
                DefinitionStages.WithIconPath,
                DefinitionStages.WithIconIndex {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Application create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Application create(Context context);
        }
        /** The stage of the Application definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of Application..
             *
             * @param description Description of Application.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Application definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly name of Application..
             *
             * @param friendlyName Friendly name of Application.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
        /** The stage of the Application definition allowing to specify filePath. */
        interface WithFilePath {
            /**
             * Specifies the filePath property: Specifies a path for the executable file for the application..
             *
             * @param filePath Specifies a path for the executable file for the application.
             * @return the next definition stage.
             */
            WithCreate withFilePath(String filePath);
        }
        /** The stage of the Application definition allowing to specify msixPackageFamilyName. */
        interface WithMsixPackageFamilyName {
            /**
             * Specifies the msixPackageFamilyName property: Specifies the package family name for MSIX applications.
             *
             * @param msixPackageFamilyName Specifies the package family name for MSIX applications.
             * @return the next definition stage.
             */
            WithCreate withMsixPackageFamilyName(String msixPackageFamilyName);
        }
        /** The stage of the Application definition allowing to specify msixPackageApplicationId. */
        interface WithMsixPackageApplicationId {
            /**
             * Specifies the msixPackageApplicationId property: Specifies the package application Id for MSIX
             * applications.
             *
             * @param msixPackageApplicationId Specifies the package application Id for MSIX applications.
             * @return the next definition stage.
             */
            WithCreate withMsixPackageApplicationId(String msixPackageApplicationId);
        }
        /** The stage of the Application definition allowing to specify applicationType. */
        interface WithApplicationType {
            /**
             * Specifies the applicationType property: Resource Type of Application..
             *
             * @param applicationType Resource Type of Application.
             * @return the next definition stage.
             */
            WithCreate withApplicationType(RemoteApplicationType applicationType);
        }
        /** The stage of the Application definition allowing to specify commandLineArguments. */
        interface WithCommandLineArguments {
            /**
             * Specifies the commandLineArguments property: Command Line Arguments for Application..
             *
             * @param commandLineArguments Command Line Arguments for Application.
             * @return the next definition stage.
             */
            WithCreate withCommandLineArguments(String commandLineArguments);
        }
        /** The stage of the Application definition allowing to specify showInPortal. */
        interface WithShowInPortal {
            /**
             * Specifies the showInPortal property: Specifies whether to show the RemoteApp program in the RD Web Access
             * server..
             *
             * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server.
             * @return the next definition stage.
             */
            WithCreate withShowInPortal(Boolean showInPortal);
        }
        /** The stage of the Application definition allowing to specify iconPath. */
        interface WithIconPath {
            /**
             * Specifies the iconPath property: Path to icon..
             *
             * @param iconPath Path to icon.
             * @return the next definition stage.
             */
            WithCreate withIconPath(String iconPath);
        }
        /** The stage of the Application definition allowing to specify iconIndex. */
        interface WithIconIndex {
            /**
             * Specifies the iconIndex property: Index of the icon..
             *
             * @param iconIndex Index of the icon.
             * @return the next definition stage.
             */
            WithCreate withIconIndex(Integer iconIndex);
        }
    }
    /**
     * Begins update for the Application resource.
     *
     * @return the stage of resource update.
     */
    Application.Update update();

    /** The template for Application update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithFriendlyName,
            UpdateStages.WithFilePath,
            UpdateStages.WithCommandLineSetting,
            UpdateStages.WithCommandLineArguments,
            UpdateStages.WithShowInPortal,
            UpdateStages.WithIconPath,
            UpdateStages.WithIconIndex,
            UpdateStages.WithMsixPackageFamilyName,
            UpdateStages.WithMsixPackageApplicationId,
            UpdateStages.WithApplicationType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Application apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Application apply(Context context);
    }
    /** The Application update stages. */
    interface UpdateStages {
        /** The stage of the Application update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: tags to be updated.
             *
             * @param tags tags to be updated.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Application update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Description of Application..
             *
             * @param description Description of Application.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Application update allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly name of Application..
             *
             * @param friendlyName Friendly name of Application.
             * @return the next definition stage.
             */
            Update withFriendlyName(String friendlyName);
        }
        /** The stage of the Application update allowing to specify filePath. */
        interface WithFilePath {
            /**
             * Specifies the filePath property: Specifies a path for the executable file for the application..
             *
             * @param filePath Specifies a path for the executable file for the application.
             * @return the next definition stage.
             */
            Update withFilePath(String filePath);
        }
        /** The stage of the Application update allowing to specify commandLineSetting. */
        interface WithCommandLineSetting {
            /**
             * Specifies the commandLineSetting property: Specifies whether this published application can be launched
             * with command line arguments provided by the client, command line arguments specified at publish time, or
             * no command line arguments at all..
             *
             * @param commandLineSetting Specifies whether this published application can be launched with command line
             *     arguments provided by the client, command line arguments specified at publish time, or no command
             *     line arguments at all.
             * @return the next definition stage.
             */
            Update withCommandLineSetting(CommandLineSetting commandLineSetting);
        }
        /** The stage of the Application update allowing to specify commandLineArguments. */
        interface WithCommandLineArguments {
            /**
             * Specifies the commandLineArguments property: Command Line Arguments for Application..
             *
             * @param commandLineArguments Command Line Arguments for Application.
             * @return the next definition stage.
             */
            Update withCommandLineArguments(String commandLineArguments);
        }
        /** The stage of the Application update allowing to specify showInPortal. */
        interface WithShowInPortal {
            /**
             * Specifies the showInPortal property: Specifies whether to show the RemoteApp program in the RD Web Access
             * server..
             *
             * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server.
             * @return the next definition stage.
             */
            Update withShowInPortal(Boolean showInPortal);
        }
        /** The stage of the Application update allowing to specify iconPath. */
        interface WithIconPath {
            /**
             * Specifies the iconPath property: Path to icon..
             *
             * @param iconPath Path to icon.
             * @return the next definition stage.
             */
            Update withIconPath(String iconPath);
        }
        /** The stage of the Application update allowing to specify iconIndex. */
        interface WithIconIndex {
            /**
             * Specifies the iconIndex property: Index of the icon..
             *
             * @param iconIndex Index of the icon.
             * @return the next definition stage.
             */
            Update withIconIndex(Integer iconIndex);
        }
        /** The stage of the Application update allowing to specify msixPackageFamilyName. */
        interface WithMsixPackageFamilyName {
            /**
             * Specifies the msixPackageFamilyName property: Specifies the package family name for MSIX applications.
             *
             * @param msixPackageFamilyName Specifies the package family name for MSIX applications.
             * @return the next definition stage.
             */
            Update withMsixPackageFamilyName(String msixPackageFamilyName);
        }
        /** The stage of the Application update allowing to specify msixPackageApplicationId. */
        interface WithMsixPackageApplicationId {
            /**
             * Specifies the msixPackageApplicationId property: Specifies the package application Id for MSIX
             * applications.
             *
             * @param msixPackageApplicationId Specifies the package application Id for MSIX applications.
             * @return the next definition stage.
             */
            Update withMsixPackageApplicationId(String msixPackageApplicationId);
        }
        /** The stage of the Application update allowing to specify applicationType. */
        interface WithApplicationType {
            /**
             * Specifies the applicationType property: Resource Type of Application..
             *
             * @param applicationType Resource Type of Application.
             * @return the next definition stage.
             */
            Update withApplicationType(RemoteApplicationType applicationType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Application refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Application refresh(Context context);
}
