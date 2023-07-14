package domain;/*
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

import java.util.ArrayList;

public class Wurfel {
    private final ArrayList<String> wuerfel = new ArrayList<>();
    public Wurfel(){
        wuerfel.add("Würfel Seite Eins: 1");
        wuerfel.add("Würfel Seite Zwei: 2");
        wuerfel.add("Würfel Seite Drei: 3");
        wuerfel.add("Würfel Seite Vier: 4");
        wuerfel.add("Würfel Seite Fünf: 5");
        wuerfel.add("Würfel Seite Sechs: 6");
    }
    public ArrayList<String> getWuerfel() {
        return wuerfel;
    }
    public void forSchleife(){
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

}
