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

/**
 * Mutable implementation of the {@link Mat3x3d}-interface.
 * 
 * @author Emil Forslund
 * @since  1.1.0
 */
public final class Mat3x3dImpl extends AbstractMat3x3d {
    
    private double el0_0, el0_1, el0_2,
                  el1_0, el1_1, el1_2,
                  el2_0, el2_1, el2_2;

    public Mat3x3dImpl(double e0_0, double e0_1, double e0_2, 
                       double e1_0, double e1_1, double e1_2, 
                       double e2_0, double e2_1, double e2_2) {
        
        this.el0_0 = e0_0;
        this.el0_1 = e0_1;
        this.el0_2 = e0_2;
        this.el1_0 = e1_0;
        this.el1_1 = e1_1;
        this.el1_2 = e1_2;
        this.el2_0 = e2_0;
        this.el2_1 = e2_1;
        this.el2_2 = e2_2;
    }
    
    public Mat3x3dImpl(Mat3x3d prototype) {
        this.el0_0 = prototype.get0_0();
        this.el0_1 = prototype.get0_1();
        this.el0_2 = prototype.get0_2();
        this.el1_0 = prototype.get1_0();
        this.el1_1 = prototype.get1_1();
        this.el1_2 = prototype.get1_2();
        this.el2_0 = prototype.get2_0();
        this.el2_1 = prototype.get2_1();
        this.el2_2 = prototype.get2_2();
    }
    
    @Override
    public double get0_0() {
        return el0_0;
    }

    @Override
    public Mat3x3d set0_0(double value) {
        el0_0 = value;
        return this;
    }

    @Override
    public double get0_1() {
        return el0_1;
    }

    @Override
    public Mat3x3d set0_1(double value) {
        el0_1 = value;
        return this;
    }

    @Override
    public double get0_2() {
        return el0_2;
    }

    @Override
    public Mat3x3d set0_2(double value) {
        el0_2 = value;
        return this;
    }

    @Override
    public double get1_0() {
        return el1_0;
    }

    @Override
    public Mat3x3d set1_0(double value) {
        el1_0 = value;
        return this;
    }

    @Override
    public double get1_1() {
        return el1_1;
    }

    @Override
    public Mat3x3d set1_1(double value) {
        el1_1 = value;
        return this;
    }

    @Override
    public double get1_2() {
        return el1_2;
    }

    @Override
    public Mat3x3d set1_2(double value) {
        el1_2 = value;
        return this;
    }

    @Override
    public double get2_0() {
        return el2_0;
    }

    @Override
    public Mat3x3d set2_0(double value) {
        el2_0 = value;
        return this;
    }

    @Override
    public double get2_1() {
        return el2_1;
    }

    @Override
    public Mat3x3d set2_1(double value) {
        el2_1 = value;
        return this;
    }

    @Override
    public double get2_2() {
        return el2_2;
    }

    @Override
    public Mat3x3d set2_2(double value) {
        el2_2 = value;
        return this;
    }

    @Override
    public Mat3x3d set(double e0_0, double e0_1, double e0_2, 
                       double e1_0, double e1_1, double e1_2, 
                       double e2_0, double e2_1, double e2_2) {
        
        el0_0 = e0_0; el0_1 = e0_1; el0_2 = e0_2;
        el1_0 = e1_0; el1_1 = e1_1; el1_2 = e1_2;
        el2_0 = e2_0; el2_1 = e2_1; el2_2 = e2_2;
        
        return this;
    }
}