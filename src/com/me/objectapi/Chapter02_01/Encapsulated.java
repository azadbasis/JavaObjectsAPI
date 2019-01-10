package com.me.objectapi.Chapter02_01;

public class Encapsulated {
    public static void main(String[] args) {
        Olive[] olives = {new Olive(), new Olive()};
        OliveOil oil = new OliveOil();
        OlivePress press = new OlivePress();
        for (Olive olive :
                olives) {
            olive.crush();
            oil.add(olive);

        }
    }

    static class OliveOil {

        public void add(Olive olive) {
        }
    }

    static class OlivePress {

    }

    static class Olive {

        public void crush() {
        }
    }
}
