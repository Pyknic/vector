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
package com.github.pyknic.vector.vec.internal;

import com.github.pyknic.vector.vec.Vec3i;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec3i implements Vec3i {
    
    AbstractVec3i() {}
    
    @Override
    public final Vec3i setX(int x) {
        return set(x, getY(), getZ());
    }
    
    @Override
    public final Vec3i setY(int y) {
        return set(getX(), y, getZ());
    }
    
    @Override
    public final Vec3i setZ(int z) {
        return set(getX(), getY(), z);
    }
    
    @Override
    public final Vec3i set(Vec3i vector) {
        return set(
            vector.getX(), 
            vector.getY(),
            vector.getZ()
        );
    }

    @Override
    public final Vec3i plus(int x, int y, int z) {
        return set(getX() + x, getY() + y, getZ() + z);
    }

    @Override
    public final Vec3i plus(Vec3i vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY(),
            getZ() + vector.getZ()
        );
    }

    @Override
    public final Vec3i minus(int x, int y, int z) {
        return set(
            getX() - x, 
            getY() - y,
            getZ() - z
        );
    }

    @Override
    public final Vec3i minus(Vec3i vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY(),
            getZ() - vector.getZ()
        );
    }

    @Override
    public final Vec3i scale(int factor) {
        return scale(factor, factor, factor);
    }

    @Override
    public final Vec3i scale(int x, int y, int z) {
        return set(
            getX() * x,
            getY() * y,
            getZ() * z
        );
    }

    @Override
    public final Vec3i scale(Vec3i vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY(),
            getZ() * vector.getZ()
        );
    }

    @Override
    public final int dot(Vec3i vector) {
        return getX() * vector.getX()
             + getY() * vector.getY()
             + getZ() * vector.getZ();
    }

    @Override
    public final double magn2() {
        return (double) getX() * getX()
             + (double) getY() * getY()
             + (double) getZ() * getZ();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec3i normalize() {
        if (getX() == 0 && getY() == 0 && getZ() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                (int) (getX() / magn),
                (int) (getY() / magn),
                (int) (getZ() / magn)
            );
        }
    }
    
    @Override
    public final int hashCode() {
        int hash = 3;
        hash += hash * 97 + getX();
        hash += hash * 97 + getY();
        hash += hash * 97 + getZ();
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec3i)) return false;
        
        final Vec3i o = (Vec3i) obj;
        return getX() == o.getX()
            && getY() == o.getY()
            && getZ() == o.getZ();
    }

    @Override
    public final String toString() {
        return String.format("(%d,%d,%d)", getX(), getY(), getZ());
    }
}