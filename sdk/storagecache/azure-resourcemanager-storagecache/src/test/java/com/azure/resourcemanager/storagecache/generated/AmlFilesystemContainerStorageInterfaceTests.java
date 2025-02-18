// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemContainerStorageInterface;

public final class AmlFilesystemContainerStorageInterfaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemContainerStorageInterface model =
            BinaryData
                .fromString(
                    "{\"persistentVolumeClaim\":\"akeqs\",\"persistentVolume\":\"yb\",\"storageClass\":\"qedqytbciqfoufl\"}")
                .toObject(AmlFilesystemContainerStorageInterface.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemContainerStorageInterface model = new AmlFilesystemContainerStorageInterface();
        model = BinaryData.fromObject(model).toObject(AmlFilesystemContainerStorageInterface.class);
    }
}
