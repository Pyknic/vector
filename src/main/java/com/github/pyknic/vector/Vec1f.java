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
package com.github.pyknic.game.core;

import com.github.pyknic.game.core.internal.Vec1fConst;
import com.github.pyknic.game.core.internal.Vec1fImpl;

/**
 * A one-dimensional {@code float}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec1f extends Vecf<Vec1f> {
    
    Vec1f ONE     = constant(1f),
          ZERO    = constant(0f),
          NEG_ONE = constant(-1f);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec1f copy(Vec1f prototype) {
        return new Vec1fImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new mutable vector
     */
    static Vec1f of(float x) {
        return new Vec1fImpl(x);
    }
    
    /**
     * Returns a new (immutable) vector with the specified element.
     * 
     * @param x  the first element
     * @return   the new immutable vector
     */
    static Vec1f constant(float x) {
        return new Vec1fConst(x);
    }
    
    /**
     * Returns the first element (the x-coordinate).
     * 
     * @return  the x element
     */
    float getX();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1f setX(float x);
    
    /**
     * Sets the elements of this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec1f set(float x);
    
    /**
     * Adds the specified value to this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to add
     * @return        either this or a new instance
     */
    Vec1f plus(float scalar);
    
    /**
     * Subtracts the specified value from this vector. If this implementation of 
     * the {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param scalar  the value to subtract
     * @return        either this or a new instance
     */
    Vec1f minus(float scalar);
    
}