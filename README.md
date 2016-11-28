# Vector
A simple but efficient vector library for java.

## Features
* Interface oriented
* Both mutable and immutable implementations

## Example
To keep your code short, this library is intended to be imported statically.
```java
import static com.github.pyknic.vector.vec.Vec.*;
import static com.github.pyknic.vector.mat.Mat.*;
```

Create a new vector:
```java
Vec3f position = vec3f(3, 3, 0);       // Mutable
Vec3f velocity = vec3f(0, 0, 0);       // Mutable
Vec3f gravity  = const3f(0, 9.82f, 0); // Immutable
```

Modify a vector:
```java
while (falling) {
    velocity.minus(gravity); // Since velocity and position are mutable,
    position.plus(velocity); // no new instances are created.
}
```

Create a copy:
```java
Vec3f marsGravity = gravity.scale(0.38f); // Gravity is not modified
```

Create a new matrix:
```java
Mat3x3f flip = constMat3x3f(  // Create a matrix that flips the x- and
    0f, 1f, 0f,               // y-coordinates of a vector, preserving
    1f, 0f, 0f,               // the z-element.
    0f, 0f, 1f
);
```

Calculate the dot-product of a matrix and a vector:
```java
Vec3x3f flipped = flip.dot(position);
```

## Download
To use this in your project, add the following code to your `pom.xml`-file:
```xml
<dependency>
    <groupId>com.github.pyknic</groupId>
    <artifactId>vector</artifactId>
    <version>1.1.0</version>
</dependency>
```

## License
Copyright 2016 Emil Forslund

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

[http://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
