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

import com.github.pyknic.vector.internal.Vec4iConst;
import com.github.pyknic.vector.internal.Vec4iImpl;

/**
 * A four-dimensional {@code int}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec4i extends Veci<Vec4i> {

    Vec4i X     = constant( 1,  0,  0,  0),
          Y     = constant( 0,  1,  0,  0),
          Z     = constant( 0,  0,  1,  0),
          W     = constant( 0,  0,  0,  1),
          NEG_X = constant(-1,  0,  0,  0),
          NEG_Y = constant( 0, -1,  0,  0),
          NEG_Z = constant( 0,  0, -1,  0),
          NEG_W = constant( 0,  0,  0, -1),
          ZERO  = constant( 0,  0,  0,  0);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec4i copy(Vec4i prototype) {
        return new Vec4iImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @param w  the fourth element
     * @return   the new mutable vector
     */
    static Vec4i of(int x, int y, int z, int w) {
        return new Vec4iImpl(x, y, z, w);
    }
    
    /**
     * Returns a new (immutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @param w  the fourth element
     * @return   the new immutable vector
     */
    static Vec4i constant(int x, int y, int z, int w) {
        return new Vec4iConst(x, y, z, w);
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
     * Returns the fourth element (the w-coordinate).
     * 
     * @return  the w element
     */
    int getW();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec4i setX(int x);
    
    /**
     * Sets the second element (the y-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param y  the new y-value
     * @return   either this or a new instance
     */
    Vec4i setY(int y);
    
    /**
     * Sets the third element (the z-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param z  the new z-value
     * @return   either this or a new instance
     */
    Vec4i setZ(int z);
    
    /**
     * Sets the fourth element (the w-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param w  the new w-value
     * @return   either this or a new instance
     */
    Vec4i setW(int w);
    
    /**
     * Sets the elements of this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @param y  the new y-value
     * @param z  the new z-value
     * @param w  the new w-value
     * @return   either this or a new instance
     */
    Vec4i set(int x, int y, int z, int w);
    
    /**
     * Adds the specified values to this vector. If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the value to add to the x element
     * @param y  the value to add to the y element
     * @param z  the value to add to the z element
     * @param w  the value to add to the w element
     * @return   either this or a new instance
     */
    Vec4i plus(int x, int y, int z, int w);
    
    /**
     * Subtracts the specified values from this vector. If this implementation 
     * of the {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the modifications. If this implementation is mutable, it 
     * will be modified and a reference to this instance will be returned.
     * 
     * @param x  the value to subtract from the x element
     * @param y  the value to subtract from the y element
     * @param z  the value to subtract from the z element
     * @param w  the value to subtract from the w element
     * @return   either this or a new instance
     */
    Vec4i minus(int x, int y, int z, int w);
    
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
     * @param w  the value to multiply with the w element
     * @return   either this or a new instance
     */
    Vec4i scale(int x, int y, int z, int w);
    
}