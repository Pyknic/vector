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

import com.github.pyknic.vector.internal.Vec3iConst;
import com.github.pyknic.vector.internal.Vec3iImpl;

/**
 * A three-dimensional {@code int}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec3i extends Veci<Vec3i> {

    Vec3i X     = constant( 1,  0,  0),
          Y     = constant( 0,  1,  0),
          Z     = constant( 0,  0,  1),
          NEG_X = constant(-1,  0,  0),
          NEG_Y = constant( 0, -1,  0),
          NEG_Z = constant( 0,  0, -1),
          ZERO  = constant( 0,  0,  0);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec3i copy(Vec3i prototype) {
        return new Vec3iImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @return   the new mutable vector
     */
    static Vec3i of(int x, int y, int z) {
        return new Vec3iImpl(x, y, z);
    }
    
    /**
     * Returns a new (immutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @return   the new immutable vector
     */
    static Vec3i constant(int x, int y, int z) {
        return new Vec3iConst(x, y, z);
    }
    
    /**
     * Returns the first element (the x-coordinate).
     * 
     * @return  the x element
     */
    int getX();
    
    /**
     * Returns the second element (the y-coordinate).
     * 
     * @return  the y element
     */
    int getY();
    
    /**
     * Returns the third element (the z-coordinate).
     * 
     * @return  the z element
     */
    int getZ();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec3i setX(int x);
    
    /**
     * Sets the second element (the y-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param y  the new y-value
     * @return   either this or a new instance
     */
    Vec3i setY(int y);
    
    /**
     * Sets the third element (the z-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param z  the new z-value
     * @return   either this or a new instance
     */
    Vec3i setZ(int z);
    
    /**
     * Sets the elements of this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @param y  the new y-value
     * @param z  the new z-value
     * @return   either this or a new instance
     */
    Vec3i set(int x, int y, int z);
    
    /**
     * Adds the specified values to this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the value to add to the x element
     * @param y  the value to add to the y element
     * @param z  the value to add to the z element
     * @return   either this or a new instance
     */
    Vec3i plus(int x, int y, int z);
    
    /**
     * Subtracts the specified values from this vector. If this implementation 
     * of the {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the value to subtract from the x element
     * @param y  the value to subtract from the y element
     * @param z  the value to subtract from the z element
     * @return   either this or a new instance
     */
    Vec3i minus(int x, int y, int z);
    
    /**
     * Calculates the element-wise product of this vector and the specified 
     * values. If this implementation of the {@link Vec}-interface is immutable, 
     * a new immutable vector will be returned with the modifications. If this 
     * implementation is mutable, it will be modified and a reference to this 
     * instance will be returned.
     * 
     * @param x  the value to multiply with the x element
     * @param y  the value to multiply with the y element
     * @param z  the value to multiply with the z element
     * @return   either this or a new instance
     */
    Vec3i scale(int x, int y, int z);
    
}