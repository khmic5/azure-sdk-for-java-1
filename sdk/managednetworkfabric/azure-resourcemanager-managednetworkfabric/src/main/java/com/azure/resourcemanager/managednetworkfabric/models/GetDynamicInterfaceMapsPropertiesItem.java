// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.resourcemanager.managednetworkfabric.fluent.models.GetDynamicInterfaceMapsPropertiesItemInner;

/** An immutable client-side representation of GetDynamicInterfaceMapsPropertiesItem. */
public interface GetDynamicInterfaceMapsPropertiesItem {
    /**
     * Gets the administrativeState property: The interface administrative state.
     *
     * @return the administrativeState value.
     */
    EnabledDisabledState administrativeState();

    /**
     * Gets the operationalStatus property: The interface operational status.
     *
     * @return the operationalStatus value.
     */
    String operationalStatus();

    /**
     * Gets the phyStatus property: The physical status.
     *
     * @return the phyStatus value.
     */
    String phyStatus();

    /**
     * Gets the transceiverStatus property: The interface transceiver type. Example: up or down.
     *
     * @return the transceiverStatus value.
     */
    String transceiverStatus();

    /**
     * Gets the connectedTo property: Connected to ARM resource or external interface.
     *
     * @return the connectedTo value.
     */
    String connectedTo();

    /**
     * Gets the name property: The interface name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the inner
     * com.azure.resourcemanager.managednetworkfabric.fluent.models.GetDynamicInterfaceMapsPropertiesItemInner object.
     *
     * @return the inner object.
     */
    GetDynamicInterfaceMapsPropertiesItemInner innerModel();
}
