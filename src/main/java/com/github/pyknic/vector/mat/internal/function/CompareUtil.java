/**
 *
 * Copyright (c) 2016-2016, Emil Forslund. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.pyknic.vector.mat.internal.function;

import com.github.pyknic.vector.mat.Mat3x3d;
import com.github.pyknic.vector.mat.Mat3x3f;
import com.github.pyknic.vector.mat.Mat3x3i;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 * Utility class for comparing the inner elements in a matrix.
 * 
 * @author Emil Forslund
 * @since  1.1.0
 */
public final class CompareUtil {
    
    /**
     * Compares the value returned by applying the specified getter on both of
     * the specified matrices.
     * 
     * @param a       the first matrix
     * @param b       the second matrix
     * @param getter  the getter
     * @return        if they were equal
     */
    public static boolean compareFloat(
            Mat3x3f a, 
            Mat3x3f b, 
            ToFloatFunction<Mat3x3f> getter) {
        
        return Float.floatToIntBits(getter.applyAsFloat(a))
            == Float.floatToIntBits(getter.applyAsFloat(b));
    }
    
    /**
     * Compares the value returned by applying the specified getter on both of
     * the specified matrices.
     * 
     * @param a       the first matrix
     * @param b       the second matrix
     * @param getter  the getter
     * @return        if they were equal
     */
    public static boolean compareDouble(
            Mat3x3d a, 
            Mat3x3d b, 
            ToDoubleFunction<Mat3x3d> getter) {
        
        return Double.doubleToLongBits(getter.applyAsDouble(a))
            == Double.doubleToLongBits(getter.applyAsDouble(b));
    }
    
    /**
     * Compares the value returned by applying the specified getter on both of
     * the specified matrices.
     * 
     * @param a       the first matrix
     * @param b       the second matrix
     * @param getter  the getter
     * @return        if they were equal
     */
    public static boolean compareInt(
            Mat3x3i a, 
            Mat3x3i b, 
            ToIntFunction<Mat3x3i> getter) {
        
        return getter.applyAsInt(a) == getter.applyAsInt(b);
    }

    /**
     * Functional interface describing a method with the following signature:
     * {@code 
     *     float applyAsFloat(T param)
     * }
     */
    @FunctionalInterface
    public interface ToFloatFunction<T> {

        /**
         * Returns the float value for the specified parameter.
         * 
         * @param param  the parameter
         * @return       the float value
         */
        float applyAsFloat(T param);

    }
    
    /**
     * Utility classes should never be instantiated.
     */
    private CompareUtil() {}
}