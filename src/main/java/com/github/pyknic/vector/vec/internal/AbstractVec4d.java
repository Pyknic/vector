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

import com.github.pyknic.vector.vec.Vec4d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec4d implements Vec4d {
    
    AbstractVec4d() {}
    
    @Override
    public final Vec4d setX(double x) {
        return set(x, getY(), getZ(), getW());
    }
    
    @Override
    public final Vec4d setY(double y) {
        return set(getX(), y, getZ(), getW());
    }
    
    @Override
    public final Vec4d setZ(double z) {
        return set(getX(), getY(), z, getW());
    }
    
    @Override
    public final Vec4d setW(double w) {
        return set(getX(), getY(), getZ(), w);
    }
    
    @Override
    public final Vec4d set(Vec4d vector) {
        return set(
            vector.getX(), 
            vector.getY(),
            vector.getZ(),
            vector.getW()
        );
    }

    @Override
    public final Vec4d plus(double x, double y, double z, double w) {
        return set(getX() + x, getY() + y, getZ() + z, getW() + w);
    }

    @Override
    public final Vec4d plus(Vec4d vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY(),
            getZ() + vector.getZ(),
            getW() + vector.getW()
        );
    }

    @Override
    public final Vec4d minus(double x, double y, double z, double w) {
        return set(
            getX() - x, 
            getY() - y,
            getZ() - z,
            getW() - w
        );
    }

    @Override
    public final Vec4d minus(Vec4d vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY(),
            getZ() - vector.getZ(),
            getW() - vector.getW()
        );
    }

    @Override
    public final Vec4d scale(double factor) {
        return scale(factor, factor, factor, factor);
    }

    @Override
    public final Vec4d scale(double x, double y, double z, double w) {
        return set(
            getX() * x,
            getY() * y,
            getZ() * z,
            getW() * w
        );
    }

    @Override
    public final Vec4d scale(Vec4d vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY(),
            getZ() * vector.getZ(),
            getW() * vector.getW()
        );
    }

    @Override
    public final double dot(Vec4d vector) {
        return getX() * vector.getX()
             + getY() * vector.getY()
             + getZ() * vector.getZ()
             + getW() * vector.getW();
    }

    @Override
    public final double magn2() {
        return  getX() * getX()
             +  getY() * getY()
             +  getZ() * getZ()
             +  getW() * getW();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec4d normalize() {
        if (getX() == 0 && getY() == 0 && getZ() == 0 && getW() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                 (getX() / magn),
                 (getY() / magn),
                 (getZ() / magn),
                 (getW() / magn)
            );
        }
    }
    
    @Override
    public final int hashCode() {
        int hash = 3;
        hash += hash * 97 + Float.floatToIntBits((float) getX());
        hash += hash * 97 + Float.floatToIntBits((float) getY());
        hash += hash * 97 + Float.floatToIntBits((float) getZ());
        hash += hash * 97 + Float.floatToIntBits((float) getW());
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec4d)) return false;
        
        final Vec4d o = (Vec4d) obj;
        return Float.floatToIntBits((float) getX()) == Float.floatToIntBits((float) o.getX())
            && Float.floatToIntBits((float) getY()) == Float.floatToIntBits((float) o.getY())
            && Float.floatToIntBits((float) getZ()) == Float.floatToIntBits((float) o.getZ())
            && Float.floatToIntBits((float) getW()) == Float.floatToIntBits((float) o.getW());
    }

    @Override
    public final String toString() {
        return String.format(
            "(%.3f,%.3f,%.3f,%.3f)", 
            getX(), getY(), getZ(), getW()
        );
    }
}