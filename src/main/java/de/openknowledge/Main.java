/*
 * Copyright (C) open knowledge GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.openknowledge;

import java.util.ArrayList;
import java.util.Random;

import domain.Wurfel;
import domain.ZweiteWuerfel;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wuerfel = new Wurfel().getWuerfel();
        int randomWurf = new Random().nextInt(1, 7);
        System.out.println(wuerfel.get(randomWurf));
        randomWurf = new Random().nextInt(1,7);
        System.out.println(new ZweiteWuerfel().getZweitewuerfel().get(randomWurf)) ;
        System.out.println("some Changes 1");
        System.out.println("replacing hier");
        System.out.println("adding some more Changes");
    }
}