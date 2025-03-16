package com.jme3.opencl.utils;

import java.nio.ByteBuffer;

public class ImageUtils {
    public static void validateAndProcessImage(long[] origin, long[] region) {
        if (origin.length != 3 || region.length != 3) {
            throw new IllegalArgumentException("origin and region must both be arrays of length 3");
        }
        Utils.pointerBuffers[1].rewind();
        Utils.pointerBuffers[2].rewind();
        Utils.pointerBuffers[1].put(origin).position(0);
        Utils.pointerBuffers[2].put(region).position(0);
    }
}
