package com.opacheco.ejemploultrafinal;

    public class Jugador {

        private String nombre;
        private String equipo;
        private int edad;

        public Jugador(String nombre, String equipo, int edad) {
            this.nombre = nombre;
            this.equipo = equipo;
            this.edad = edad;
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEquipo() {
            return equipo;
        }

        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }



