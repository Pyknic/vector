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

import com.github.pyknic.vector.vec.Vec2d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec2d implements Vec2d {
    
    AbstractVec2d() {}
    
    @Override
    public final Vec2d setX(double x) {
        return set(x, getY());
    }
    
    @Override
    public final Vec2d setY(double y) {
        return set(getX(), y);
    }
    
    @Override
    public final Vec2d set(Vec2d vector) {
        return set(
            vector.getX(), 
            vector.getY()
        );
    }

    @Override
    public final Vec2d plus(double x, double y) {
        return set(getX() + x, getY() + y);
    }

    @Override
    public final Vec2d plus(Vec2d vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY()
        );
    }

    @Override
    public final Vec2d minus(double x, double y) {
        return set(
            getX() - x, 
            getY() - y
        );
    }

    @Override
    public final Vec2d minus(Vec2d vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY()
        );
    }

    @Override
    public final Vec2d scale(double factor) {
        return scale(factor, factor);
    }

    @Override
    public final Vec2d scale(double x, double y) {
        return set(
            getX() * x,
            getY() * y
        );
    }

    @Override
    public final Vec2d scale(Vec2d vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY()
        );
    }

    @Override
    public final double dot(Vec2d vector) {
        return getX() * vector.getX()
             + getY() * vector.getY();
    }

    @Override
    public final double magn2() {
        return  getX() * getX()
             +  getY() * getY();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec2d normalize() {
        if (getX() == 0 && getY() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                 (getX() / magn),
                 (getY() / magn)
            );
        }
    }
    
    private int hashCode = 0;
    
    @Override
    public final int hashCode() {
        if (hashCode == 0) {
            int hash = 3;
            hash += hash * 97 + Float.floatToIntBits((float) getX());
            hash += hash * 97 + Float.floatToIntBits((float) getY());
            hashCode = hash;
        }
        
        return hashCode;
    }
    
    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec2d)) return false;
        
        final Vec2d o = (Vec2d) obj;
        return Float.floatToIntBits((float) getX()) == Float.floatToIntBits((float) o.getX())
            && Float.floatToIntBits((float) getY()) == Float.floatToIntBits((float) o.getY());
    }

    @Override
    public final String toString() {
        return String.format("(%.3f,%.3f)", getX(), getY());
    }
}