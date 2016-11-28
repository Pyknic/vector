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
package com.github.pyknic.vector.vec;

import com.github.pyknic.vector.vec.Vec;
import com.github.pyknic.vector.vec.Vecd;

/**
 * Common interface for all vectors of {@code float} type.
 * 
 * @param <V>  the specific vector interface
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vecd<V extends Vecd<? super V>> extends Vec<V> {

    /**
     * Multiplies every element in the vector with the specified factor and
     * returns the new vector. The returned instance can either be this or a 
     * new instance, depending on the implementation.
     * 
     * @param factor  the factor to multiply with
     * @return        the element-wise product (this instance or a new)
     */
    V scale(double factor);
    
    /**
     * Calculates the vector dot-product of this and another vector.
     * 
     * @param vector  the other vector 
     * @return        the dot-product
     */
    double dot(V vector);
    
    /**
     * Calculates the power-of-two of the magnitude of this vector. This 
     * calculation is often faster than the {@link #magn()}-operation if the
     * actual length is only used as a relative value between vectors.
     * 
     * @return  the magnitude of this vector to the power of two
     */
    double magn2();
    
}