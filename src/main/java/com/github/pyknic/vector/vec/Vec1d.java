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

import com.github.pyknic.vector.vec.internal.Vec1dConst;
import com.github.pyknic.vector.vec.internal.Vec1dImpl;

/**
 * A one-dimensional {@code float}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec1d extends Vecd<Vec1d> {
    
    Vec1d ONE     = constant(1d),
          ZERO    = constant(0d),
          NEG_ONE = constant(-1d);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec1d copy(Vec1d prototype) {
        return new Vec1dImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new mutable vector
     */
    static Vec1d of(double x) {
        return new Vec1dImpl(x);
    }
    
    /**
     * Returns a new (immutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new immutable vector
     */
    static Vec1d constant(double x) {
        return new Vec1dConst(x);
    }
    
    /**
     * Returns the first element (the x-coordinate).
     * 
     * @return  the x element
     */
    double getX();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1d setX(double x);
    
    /**
     * Sets the elements of this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1d set(double x);
    
    /**
     * Adds the specified value to this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to add
     * @return        either this or a new instance
     */
    Vec1d plus(double scalar);
    
    /**
     * Subtracts the specified value from this vector. If this implementation of 
     * the {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to subtract
     * @return        either this or a new instance
     */
    Vec1d minus(double scalar);
    
}