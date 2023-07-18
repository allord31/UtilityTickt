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

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale localeztion = new Locale("en","US");
        ResourceBundle langugeResources =  ResourceBundle.getBundle("lang",localeztion);
        Scanner input = new Scanner(System.in);
        System.out.print(langugeResources.getString("seiteLangA")+ ": ");
        double a = input.nextDouble();
        System.out.print(langugeResources.getString("seiteLangB") + ": ");
        double b = input.nextDouble();
        System.out.print(langugeResources.getString("seiteLangC") + ": ");
        double c = input.nextDouble();
        double cosinusAlpha = ((b*b) + (c*c) - (a*a)) /(2 * b * c);
        double cosinusBeta = ((a*a) + (c*c) - (b*b)) / (2 * a * c);
        double cosinusGama = ((a*a) + (b*b) - (c*c)) / (2 * a * b);
        System.out.println(cosinusAlpha + " ;" + cosinusBeta + " ;" + cosinusGama);
        System.out.println(langugeResources.getString("WinkelAlpha") + "="
            + Math.toDegrees(Math.acos(cosinusAlpha)));
        System.out.println(langugeResources.getString("WinkelBeta") + "="
            + Math.toDegrees(Math.acos(cosinusBeta)));
        System.out.println(langugeResources.getString("WinkelGama") + "="
            + Math.toDegrees(Math.acos(cosinusGama)));
    }
}