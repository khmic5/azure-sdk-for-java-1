// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackSkuProperties;

public final class RackSkuPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RackSkuProperties model =
            BinaryData
                .fromString(
                    "{\"computeMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":5181960327839918003,\"cpuSockets\":1894052422151510800,\"disks\":[],\"generation\":\"zwpcnpwzcjaesg\",\"hardwareVersion\":\"sccyajguqf\",\"memoryCapacityGB\":2530317037833496160,\"model\":\"lvdnkfx\",\"networkInterfaces\":[],\"totalThreads\":8965793800354203729,\"vendor\":\"zrmuhapfcqdps\"},\"rackSlot\":1717467823158981449},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":4078181760513982280,\"cpuSockets\":1865454913950469056,\"disks\":[],\"generation\":\"lvez\",\"hardwareVersion\":\"pqlmfe\",\"memoryCapacityGB\":5076002706235027340,\"model\":\"wkyhkobopgxe\",\"networkInterfaces\":[],\"totalThreads\":2322232448264030784,\"vendor\":\"bqpc\"},\"rackSlot\":5665011521917563692},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":2412566794920993195,\"cpuSockets\":7634037595777671249,\"disks\":[],\"generation\":\"lpqekf\",\"hardwareVersion\":\"khtj\",\"memoryCapacityGB\":362076039986657077,\"model\":\"wfqatmtd\",\"networkInterfaces\":[],\"totalThreads\":3045847085816228826,\"vendor\":\"pgikdgszywkb\"},\"rackSlot\":5547027356471635379}],\"controllerMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":2717141106438874007,\"cpuSockets\":8435715286199726839,\"disks\":[],\"generation\":\"aatjinrvgoupmfi\",\"hardwareVersion\":\"fggjioolvr\",\"memoryCapacityGB\":6372304417284094836,\"model\":\"kkgll\",\"networkInterfaces\":[],\"totalThreads\":2690325533480524289,\"vendor\":\"jayvblmhv\"},\"rackSlot\":7916052702792318292}],\"description\":\"xvvy\",\"maxClusterSlots\":446367325585574216,\"provisioningState\":\"Succeeded\",\"rackType\":\"Compute\",\"storageAppliances\":[{\"properties\":{\"capacityGB\":754056912237486709,\"model\":\"vwz\"},\"rackSlot\":3007330955006974455}],\"supportedRackSkuIds\":[\"ctlpdngitvgb\",\"hrixkwmy\",\"jejveg\"]}")
                .toObject(RackSkuProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RackSkuProperties model = new RackSkuProperties();
        model = BinaryData.fromObject(model).toObject(RackSkuProperties.class);
    }
}
