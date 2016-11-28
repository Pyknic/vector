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

import com.github.pyknic.vector.vec.Vec3d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec3d implements Vec3d {
    
    AbstractVec3d() {}
    
    @Override
    public final Vec3d setX(double x) {
        return set(x, getY(), getZ());
    }
    
    @Override
    public final Vec3d setY(double y) {
        return set(getX(), y, getZ());
    }
    
    @Override
    public final Vec3d setZ(double z) {
        return set(getX(), getY(), z);
    }
    
    @Override
    public final Vec3d set(Vec3d vector) {
        return set(
            vector.getX(), 
            vector.getY(),
            vector.getZ()
        );
    }

    @Override
    public final Vec3d plus(double x, double y, double z) {
        return set(getX() + x, getY() + y, getZ() + z);
    }

    @Override
    public final Vec3d plus(Vec3d vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY(),
            getZ() + vector.getZ()
        );
    }

    @Override
    public final Vec3d minus(double x, double y, double z) {
        return set(
            getX() - x, 
            getY() - y,
            getZ() - z
        );
    }

    @Override
    public final Vec3d minus(Vec3d vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY(),
            getZ() - vector.getZ()
        );
    }

    @Override
    public final Vec3d scale(double factor) {
        return scale(factor, factor, factor);
    }

    @Override
    public final Vec3d scale(double x, double y, double z) {
        return set(
            getX() * x,
            getY() * y,
            getZ() * z
        );
    }

    @Override
    public final Vec3d scale(Vec3d vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY(),
            getZ() * vector.getZ()
        );
    }

    @Override
    public final double dot(Vec3d vector) {
        return getX() * vector.getX()
             + getY() * vector.getY()
             + getZ() * vector.getZ();
    }

    @Override
    public final double magn2() {
        return  getX() * getX()
             +  getY() * getY()
             +  getZ() * getZ();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec3d normalize() {
        if (getX() == 0 && getY() == 0 && getZ() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                 (getX() / magn),
                 (getY() / magn),
                 (getZ() / magn)
            );
        }
    }
    
    @Override
    public final int hashCode() {
        int hash = 3;
        hash += hash * 97 + Float.floatToIntBits((float) getX());
        hash += hash * 97 + Float.floatToIntBits((float) getY());
        hash += hash * 97 + Float.floatToIntBits((float) getZ());
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec3d)) return false;
        
        final Vec3d o = (Vec3d) obj;
        return Float.floatToIntBits((float) getX()) == Float.floatToIntBits((float) o.getX())
            && Float.floatToIntBits((float) getY()) == Float.floatToIntBits((float) o.getY())
            && Float.floatToIntBits((float) getZ()) == Float.floatToIntBits((float) o.getZ());
    }

    @Override
    public final String toString() {
        return String.format("(%.3f,%.3f,%.3f)", getX(), getY(), getZ());
    }
}