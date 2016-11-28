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

import com.github.pyknic.vector.vec.internal.Vec3dConst;
import com.github.pyknic.vector.vec.internal.Vec3dImpl;

/**
 * A three-dimensional {@code float}-based vector.
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec3d extends Vecd<Vec3d> {

    Vec3d X     = constant( 1d,  0d,  0d),
          Y     = constant( 0d,  1d,  0d),
          Z     = constant( 0d,  0d,  1d),
          NEG_X = constant(-1d,  0d,  0d),
          NEG_Y = constant( 0d, -1d,  0d),
          NEG_Z = constant( 0d,  0d, -1d),
          ZERO  = constant( 0d,  0d,  0d);
    
    /**
     * Returns a copy of the specified vector.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Vec3d copy(Vec3d prototype) {
        return new Vec3dImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @return   the new mutable vector
     */
    static Vec3d of(double x, double y, double z) {
        return new Vec3dImpl(x, y, z);
    }
    
    /**
     * Returns a new (immutable) vector with the specified elements.
     * 
     * @param x  the first element
     * @param y  the second element
     * @param z  the third element
     * @return   the new immutable vector
     */
    static Vec3d constant(double x, double y, double z) {
        return new Vec3dConst(x, y, z);
    }
    
    /**
     * Returns the first element (the x-coordinate).
     * 
     * @return  the x element
     */
    double getX();
    
    /**
     * Returns the second element (the y-coordinate).
     * 
     * @return  the y element
     */
    double getY();
    
    /**
     * Returns the third element (the z-coordinate).
     * 
     * @return  the z element
     */
    double getZ();
    
    /**
     * Sets the first element (the x-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param x  the new x-value
     * @return   either this or a new instance
     */
    Vec3d setX(double x);
    
    /**
     * Sets the second element (the y-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param y  the new y-value
     * @return   either this or a new instance
     */
    Vec3d setY(double y);
    
    /**
     * Sets the third element (the z-coordinate). If this implementation of the
     * {@link Vec}-interface is immutable, a new immutable vector will be 
     * returned with the element set. If this implementation is mutable, it will
     * be modified and a reference to this instance will be returned.
     * 
     * @param z  the new z-value
     * @return   either this or a new instance
     */
    Vec3d setZ(double z);
    
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
    Vec3d set(double x, double y, double z);
    
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
    Vec3d plus(double x, double y, double z);
    
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
    Vec3d minus(double x, double y, double z);
    
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
    Vec3d scale(double x, double y, double z);
    
}