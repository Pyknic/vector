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
package com.github.pyknic.vector;

import com.github.pyknic.vector.internal.Vec1iConst;
import com.github.pyknic.vector.internal.Vec1iImpl;

/**
 * A one-dimensional {@code int}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec1i extends Veci<Vec1i> {
    
    Vec1i ONE     = constant(1),
          ZERO    = constant(0),
          NEG_ONE = constant(-1);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec1i copy(Vec1i prototype) {
        return new Vec1iImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new mutable vector
     */
    static Vec1i of(int x) {
        return new Vec1iImpl(x);
    }
    
    /**
     * Returns a new (immutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new immutable vector
     */
    static Vec1i constant(int x) {
        return new Vec1iConst(x);
    }
    
    /**
     * Returns the first element (the x-coordinate).
     * 
     * @return  the x element
     */
    int getX();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1i setX(int x);
    
    /**
     * Sets the elements of this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1i set(int x);
    
    /**
     * Adds the specified value to this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to add
     * @return        either this or a new instance
     */
    Vec1i plus(int scalar);
    
    /**
     * Subtracts the specified value from this vector. If this implementation of 
     * the {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to subtract
     * @return        either this or a new instance
     */
    Vec1i minus(int scalar);
    
}