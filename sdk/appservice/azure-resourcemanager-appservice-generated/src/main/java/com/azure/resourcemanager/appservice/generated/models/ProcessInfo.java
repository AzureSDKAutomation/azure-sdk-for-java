// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.ProcessInfoInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ProcessInfo. */
public interface ProcessInfo {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the identifier property: ARM Identifier for deployment.
     *
     * @return the identifier value.
     */
    Integer identifier();

    /**
     * Gets the deploymentName property: Deployment name.
     *
     * @return the deploymentName value.
     */
    String deploymentName();

    /**
     * Gets the href property: HRef URI.
     *
     * @return the href value.
     */
    String href();

    /**
     * Gets the minidump property: Minidump URI.
     *
     * @return the minidump value.
     */
    String minidump();

    /**
     * Gets the isProfileRunning property: Is profile running?.
     *
     * @return the isProfileRunning value.
     */
    Boolean isProfileRunning();

    /**
     * Gets the isIisProfileRunning property: Is the IIS Profile running?.
     *
     * @return the isIisProfileRunning value.
     */
    Boolean isIisProfileRunning();

    /**
     * Gets the iisProfileTimeoutInSeconds property: IIS Profile timeout (seconds).
     *
     * @return the iisProfileTimeoutInSeconds value.
     */
    Double iisProfileTimeoutInSeconds();

    /**
     * Gets the parent property: Parent process.
     *
     * @return the parent value.
     */
    String parent();

    /**
     * Gets the children property: Child process list.
     *
     * @return the children value.
     */
    List<String> children();

    /**
     * Gets the threads property: Thread list.
     *
     * @return the threads value.
     */
    List<ProcessThreadInfo> threads();

    /**
     * Gets the openFileHandles property: List of open files.
     *
     * @return the openFileHandles value.
     */
    List<String> openFileHandles();

    /**
     * Gets the modules property: List of modules.
     *
     * @return the modules value.
     */
    List<ProcessModuleInfo> modules();

    /**
     * Gets the fileName property: File name of this process.
     *
     * @return the fileName value.
     */
    String fileName();

    /**
     * Gets the commandLine property: Command line.
     *
     * @return the commandLine value.
     */
    String commandLine();

    /**
     * Gets the username property: User name.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the handleCount property: Handle count.
     *
     * @return the handleCount value.
     */
    Integer handleCount();

    /**
     * Gets the moduleCount property: Module count.
     *
     * @return the moduleCount value.
     */
    Integer moduleCount();

    /**
     * Gets the threadCount property: Thread count.
     *
     * @return the threadCount value.
     */
    Integer threadCount();

    /**
     * Gets the startTime property: Start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the totalCpuTime property: Total CPU time.
     *
     * @return the totalCpuTime value.
     */
    String totalCpuTime();

    /**
     * Gets the userCpuTime property: User CPU time.
     *
     * @return the userCpuTime value.
     */
    String userCpuTime();

    /**
     * Gets the privilegedCpuTime property: Privileged CPU time.
     *
     * @return the privilegedCpuTime value.
     */
    String privilegedCpuTime();

    /**
     * Gets the workingSet property: Working set.
     *
     * @return the workingSet value.
     */
    Long workingSet();

    /**
     * Gets the peakWorkingSet property: Peak working set.
     *
     * @return the peakWorkingSet value.
     */
    Long peakWorkingSet();

    /**
     * Gets the privateMemory property: Private memory size.
     *
     * @return the privateMemory value.
     */
    Long privateMemory();

    /**
     * Gets the virtualMemory property: Virtual memory size.
     *
     * @return the virtualMemory value.
     */
    Long virtualMemory();

    /**
     * Gets the peakVirtualMemory property: Peak virtual memory usage.
     *
     * @return the peakVirtualMemory value.
     */
    Long peakVirtualMemory();

    /**
     * Gets the pagedSystemMemory property: Paged system memory.
     *
     * @return the pagedSystemMemory value.
     */
    Long pagedSystemMemory();

    /**
     * Gets the nonPagedSystemMemory property: Non-paged system memory.
     *
     * @return the nonPagedSystemMemory value.
     */
    Long nonPagedSystemMemory();

    /**
     * Gets the pagedMemory property: Paged memory.
     *
     * @return the pagedMemory value.
     */
    Long pagedMemory();

    /**
     * Gets the peakPagedMemory property: Peak paged memory.
     *
     * @return the peakPagedMemory value.
     */
    Long peakPagedMemory();

    /**
     * Gets the timestamp property: Time stamp.
     *
     * @return the timestamp value.
     */
    OffsetDateTime timestamp();

    /**
     * Gets the environmentVariables property: List of environment variables.
     *
     * @return the environmentVariables value.
     */
    Map<String, String> environmentVariables();

    /**
     * Gets the isScmSite property: Is this the SCM site?.
     *
     * @return the isScmSite value.
     */
    Boolean isScmSite();

    /**
     * Gets the isWebjob property: Is this a Web Job?.
     *
     * @return the isWebjob value.
     */
    Boolean isWebjob();

    /**
     * Gets the description property: Description of process.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ProcessInfoInner object.
     *
     * @return the inner object.
     */
    ProcessInfoInner innerModel();
}
