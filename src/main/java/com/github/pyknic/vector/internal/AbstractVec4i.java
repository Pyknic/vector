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
package com.github.pyknic.vector.internal;

import com.github.pyknic.vector.Vec4i;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec4i implements Vec4i {
    
    AbstractVec4i() {}
    
    @Override
    public final Vec4i setX(int x) {
        return set(x, getY(), getZ(), getW());
    }
    
    @Override
    public final Vec4i setY(int y) {
        return set(getX(), y, getZ(), getW());
    }
    
    @Override
    public final Vec4i setZ(int z) {
        return set(getX(), getY(), z, getW());
    }
    
    @Override
    public final Vec4i setW(int w) {
        return set(getX(), getY(), getZ(), w);
    }
    
    @Override
    public final Vec4i set(Vec4i vector) {
        return set(
            vector.getX(), 
            vector.getY(),
            vector.getZ(),
            vector.getW()
        );
    }

    @Override
    public final Vec4i plus(int x, int y, int z, int w) {
        return set(getX() + x, getY() + y, getZ() + z, getW() + w);
    }

    @Override
    public final Vec4i plus(Vec4i vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY(),
            getZ() + vector.getZ(),
            getW() + vector.getW()
        );
    }

    @Override
    public final Vec4i minus(int x, int y, int z, int w) {
        return set(
            getX() - x, 
            getY() - y,
            getZ() - z,
            getW() - w
        );
    }

    @Override
    public final Vec4i minus(Vec4i vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY(),
            getZ() - vector.getZ(),
            getW() - vector.getW()
        );
    }

    @Override
    public final Vec4i scale(int factor) {
        return scale(factor, factor, factor, factor);
    }

    @Override
    public final Vec4i scale(int x, int y, int z, int w) {
        return set(
            getX() * x,
            getY() * y,
            getZ() * z,
            getW() * w
        );
    }

    @Override
    public final Vec4i scale(Vec4i vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY(),
            getZ() * vector.getZ(),
            getW() * vector.getW()
        );
    }

    @Override
    public final int dot(Vec4i vector) {
        return getX() * vector.getX()
             + getY() * vector.getY()
             + getZ() * vector.getZ()
             + getW() * vector.getW();
    }

    @Override
    public final double magn2() {
        return (double) getX() * getX()
             + (double) getY() * getY()
             + (double) getZ() * getZ()
             + (double) getW() * getW();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec4i normalize() {
        if (getX() == 0 && getY() == 0 && getZ() == 0 && getW() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                (int) (getX() / magn),
                (int) (getY() / magn),
                (int) (getZ() / magn),
                (int) (getW() / magn)
            );
        }
    }
    
    @Override
    public final int hashCode() {
        int hash = 3;
        hash += hash * 97 + getX();
        hash += hash * 97 + getY();
        hash += hash * 97 + getZ();
        hash += hash * 97 + getW();
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec4i)) return false;
        
        final Vec4i o = (Vec4i) obj;
        return getX() == o.getX()
            && getY() == o.getY()
            && getZ() == o.getZ()
            && getW() == o.getW();
    }

    @Override
    public final String toString() {
        return String.format(
            "(%d,%d,%d,%d)", 
            getX(), getY(), getZ(), getW()
        );
    }
}