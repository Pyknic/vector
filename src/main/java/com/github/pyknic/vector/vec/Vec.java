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

/**
 * The common interface for all vectors with a specified length.
 * 
 * @param <V>  the specific vector interface
 * 
 * @author Emil Forslund
 * @since  1.0.0
 */
public interface Vec<V extends Vec<? super V>> {
    
    /**
     * Returns a new (mutable) one-dimensional vector with the specified value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1f vec1f(float x) { 
        return Vec1f.of(x); 
    }
    
    /**
     * Returns a new (mutable) two-dimensional vector with the specified values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2f vec2f(float x, float y) { 
        return Vec2f.of(x, y); 
    }
    
    /**
     * Returns a new (mutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3f vec3f(float x, float y, float z) { 
        return Vec3f.of(x, y, z); 
    }
    
    /**
     * Returns a new (mutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4f vec4f(float x, float y, float z, float w) { 
        return Vec4f.of(x, y, z, w); 
    }
    
    /**
     * Returns a new (mutable) one-dimensional vector with the specified value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1i vec1i(int x) { 
        return Vec1i.of(x); 
    }
    
    /**
     * Returns a new (mutable) two-dimensional vector with the specified values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2i vec2i(int x, int y) { 
        return Vec2i.of(x, y); 
    }
    
    /**
     * Returns a new (mutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3i vec3i(int x, int y, int z) { 
        return Vec3i.of(x, y, z); 
    }
    
    /**
     * Returns a new (mutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4i vec4i(int x, int y, int z, int w) { 
        return Vec4i.of(x, y, z, w); 
    }
    
    /**
     * Returns a new (mutable) one-dimensional vector with the specified value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1d vec1d(double x) { 
        return Vec1d.of(x); 
    }
    
    /**
     * Returns a new (mutable) two-dimensional vector with the specified values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2d vec2d(double x, double y) { 
        return Vec2d.of(x, y); 
    }
    
    /**
     * Returns a new (mutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3d vec3d(double x, double y, double z) { 
        return Vec3d.of(x, y, z); 
    }
    
    /**
     * Returns a new (mutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4d vec4d(double x, double y, double z, double w) { 
        return Vec4d.of(x, y, z, w); 
    }
    
    /**
     * Returns a new (immutable) one-dimensional vector with the specified 
     * value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1f const1f(float x) { 
        return Vec1f.constant(x); 
    }
    
    /**
     * Returns a new (immutable) two-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2f const2f(float x, float y) { 
        return Vec2f.constant(x, y); 
    }
    
    /**
     * Returns a new (immutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3f const3f(float x, float y, float z) { 
        return Vec3f.constant(x, y, z); 
    }
    
    /**
     * Returns a new (immutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4f const4f(float x, float y, float z, float w) { 
        return Vec4f.constant(x, y, z, w); 
    }
    /**
     * Returns a new (immutable) one-dimensional vector with the specified 
     * value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1i const1i(int x) { 
        return Vec1i.constant(x); 
    }
    
    /**
     * Returns a new (immutable) two-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2i const2i(int x, int y) { 
        return Vec2i.constant(x, y); 
    }
    
    /**
     * Returns a new (immutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3i const3i(int x, int y, int z) { 
        return Vec3i.constant(x, y, z); 
    }
    
    /**
     * Returns a new (immutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4i const4i(int x, int y, int z, int w) { 
        return Vec4i.constant(x, y, z, w); 
    }
    /**
     * Returns a new (immutable) one-dimensional vector with the specified 
     * value.
     * 
     * @param x  the x-element
     * @return   the new instance
     */
    static Vec1d const1d(double x) { 
        return Vec1d.constant(x); 
    }
    
    /**
     * Returns a new (immutable) two-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @return   the new instance
     */
    static Vec2d const2d(double x, double y) { 
        return Vec2d.constant(x, y); 
    }
    
    /**
     * Returns a new (immutable) three-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @return   the new instance
     */
    static Vec3d const3d(double x, double y, double z) { 
        return Vec3d.constant(x, y, z); 
    }
    
    /**
     * Returns a new (immutable) four-dimensional vector with the specified 
     * values.
     * 
     * @param x  the x-element
     * @param y  the y-element
     * @param z  the z-element
     * @param w  the w-element
     * @return   the new instance
     */
    static Vec4d const4d(double x, double y, double z, double w) { 
        return Vec4d.constant(x, y, z, w); 
    }

    /**
     * Calculates the vector addition of this and another vector. Depending on
     * the implementation, the returned value could be either this, the other or
     * a completely new instance.
     * 
     * @param vector  the vector to add with
     * @return        the vector sum (either this instance or another)
     */
    V plus(V vector);
    
    /**
     * Calculates the vector subtraction of this and another vector. Depending 
     * on the implementation, the returned value could be either this, the other 
     * or a completely new instance.
     * 
     * @param vector  the vector to subtract with
     * @return        the vector difference (either this instance or another)
     */
    V minus(V vector);
    
    /**
     * Calculates the element-wise multiplication of this and another vector. 
     * Depending on the implementation, the returned value could be either this, 
     * the other or a completely new instance.
     * 
     * @param vector  the vector to multiply with
     * @return        the element-wise product (either this instance or another)
     */
    V scale(V vector);
    
    /**
     * Set all the elements in this vector to the value they had in the
     * specified vector.
     * <p>
     * Depending on the implementation, the returned value could be either this, 
     * the other or a completely new instance.
     * 
     * @param vector  the vector to copy
     * @return        either this instance or a new one
     */
    V set(V vector);
    
    /**
     * Calculates the magnitude (the length) of this vector. This can sometimes
     * be an quite expensive operation.
     * 
     * @return  the magnitude of this vector
     */
    double magn();
    
    /**
     * Calculates a normalized vector based on this. The normalized vector will
     * point in the same direction as this but have a magnitude of either 
     * {@code 1} or {@code 0}. Depending on the implementation, the returned 
     * value could be either this, the other or a completely new instance.
     * 
     * @return  the normalized vector
     */
    V normalize();
    
}