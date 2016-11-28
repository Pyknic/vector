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
package com.github.pyknic.vector.mat.internal;

import com.github.pyknic.vector.mat.Mat3x3d;
import static com.github.pyknic.vector.mat.internal.function.CompareUtil.compareDouble;
import com.github.pyknic.vector.vec.Vec3d;

/**
 * Abstract base implementation of the {@link Mat3x3d}-interface.
 *
 * @author Emil Forslund
 * @since  1.1.0
 */
abstract class AbstractMat3x3d implements Mat3x3d {

    AbstractMat3x3d() {}

    @Override
    public final Mat3x3d set(Mat3x3d m) {
        return set(
            m.get0_0(), m.get0_1(), m.get0_2(),
            m.get1_0(), m.get1_1(), m.get1_2(),
            m.get2_0(), m.get2_1(), m.get2_2()
        );
    }

    @Override
    public final Mat3x3d plus(Mat3x3d m) {
        return set(
            get0_0() + m.get0_0(), get0_1() + m.get0_1(), get0_2() + m.get0_2(),
            get1_0() + m.get1_0(), get1_1() + m.get1_1(), get1_2() + m.get1_2(),
            get2_0() + m.get2_0(), get2_1() + m.get2_1(), get2_2() + m.get2_2()
        );
    }

    @Override
    public final Mat3x3d minus(Mat3x3d m) {
        return set(
            get0_0() - m.get0_0(), get0_1() - m.get0_1(), get0_2() - m.get0_2(),
            get1_0() - m.get1_0(), get1_1() - m.get1_1(), get1_2() - m.get1_2(),
            get2_0() - m.get2_0(), get2_1() - m.get2_1(), get2_2() - m.get2_2()
        );
    }

    @Override
    public final Mat3x3d multiply(Mat3x3d m) {
        return set(
            get0_0() * m.get0_0(), get0_1() * m.get0_1(), get0_2() * m.get0_2(),
            get1_0() * m.get1_0(), get1_1() * m.get1_1(), get1_2() * m.get1_2(),
            get2_0() * m.get2_0(), get2_1() * m.get2_1(), get2_2() * m.get2_2()
        );
    }

    @Override
    public final Mat3x3d multiply(double scalar) {
        return set(
            get0_0() * scalar, get0_1() * scalar, get0_2() * scalar,
            get1_0() * scalar, get1_1() * scalar, get1_2() * scalar,
            get2_0() * scalar, get2_1() * scalar, get2_2() * scalar
        );
    }

    @Override
    public final Vec3d dot(Vec3d v) {
        return Vec3d.of(
            get0_0() * v.getX() + get0_1() * v.getY() + get0_2() * v.getZ(),
            get1_0() * v.getX() + get1_1() * v.getY() + get1_2() * v.getZ(),
            get2_0() * v.getX() + get2_1() * v.getY() + get2_2() * v.getZ()
        );
    }
    
    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 29 * hash + Float.floatToIntBits((float) get0_0());
        hash = 29 * hash + Float.floatToIntBits((float) get0_1());
        hash = 29 * hash + Float.floatToIntBits((float) get0_2());
        hash = 29 * hash + Float.floatToIntBits((float) get1_0());
        hash = 29 * hash + Float.floatToIntBits((float) get1_1());
        hash = 29 * hash + Float.floatToIntBits((float) get1_2());
        hash = 29 * hash + Float.floatToIntBits((float) get2_0());
        hash = 29 * hash + Float.floatToIntBits((float) get2_1());
        hash = 29 * hash + Float.floatToIntBits((float) get2_2());
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj) return true;
        else if (obj == null) return false;
        else if (!(obj instanceof Mat3x3d)) return false;
        
        final Mat3x3d other = (Mat3x3d) obj;
        return compareDouble(this, other, Mat3x3d::get0_0)
            && compareDouble(this, other, Mat3x3d::get0_1)
            && compareDouble(this, other, Mat3x3d::get0_2)
            && compareDouble(this, other, Mat3x3d::get1_0)
            && compareDouble(this, other, Mat3x3d::get1_1)
            && compareDouble(this, other, Mat3x3d::get1_2)
            && compareDouble(this, other, Mat3x3d::get2_0)
            && compareDouble(this, other, Mat3x3d::get2_1)
            && compareDouble(this, other, Mat3x3d::get2_2);
    }

    @Override
    public String toString() {
        return String.format(
            "|%.3f,%.3f,%.3f|\n|%.3f,%.3f,%.3f|\n|%.3f,%.3f,%.3f|", 
            get0_0(), get0_1(), get0_2(),
            get1_0(), get1_1(), get1_2(),
            get2_0(), get2_1(), get2_2()
        );
    }
}