// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Auxiliary mode of Network Interface resource. */
public final class NetworkInterfaceAuxiliaryMode extends ExpandableStringEnum<NetworkInterfaceAuxiliaryMode> {
    /** Static value None for NetworkInterfaceAuxiliaryMode. */
    public static final NetworkInterfaceAuxiliaryMode NONE = fromString("None");

    /** Static value MaxConnections for NetworkInterfaceAuxiliaryMode. */
    public static final NetworkInterfaceAuxiliaryMode MAX_CONNECTIONS = fromString("MaxConnections");

    /** Static value Floating for NetworkInterfaceAuxiliaryMode. */
    public static final NetworkInterfaceAuxiliaryMode FLOATING = fromString("Floating");

    /** Static value AcceleratedConnections for NetworkInterfaceAuxiliaryMode. */
    public static final NetworkInterfaceAuxiliaryMode ACCELERATED_CONNECTIONS = fromString("AcceleratedConnections");

    /**
     * Creates a new instance of NetworkInterfaceAuxiliaryMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkInterfaceAuxiliaryMode() {
    }

    /**
     * Creates or finds a NetworkInterfaceAuxiliaryMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkInterfaceAuxiliaryMode.
     */
    @JsonCreator
    public static NetworkInterfaceAuxiliaryMode fromString(String name) {
        return fromString(name, NetworkInterfaceAuxiliaryMode.class);
    }

    /**
     * Gets known NetworkInterfaceAuxiliaryMode values.
     *
     * @return known NetworkInterfaceAuxiliaryMode values.
     */
    public static Collection<NetworkInterfaceAuxiliaryMode> values() {
        return values(NetworkInterfaceAuxiliaryMode.class);
    }
}
